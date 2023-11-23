pipeline{
    
    environment {
        registry = "sagar21999/swe645assignment3"
        registryCredential = 'dockerhub'
        def dateTag = new Date().format("yyyyMMdd-HHmmss")
	}
agent any
    tools{
        maven 'Maven 3.9.4'
    }
    stages{
     stage('Installing Maven'){
        steps{
            script{
                sh 'mvn clean install -DskipTests'
                
            }
        }
     }
     stage('Build and Push Docker Image'){
        steps{
            script {
                  docker.withRegistry('',registryCredential) {
                        def image = docker.build('sagar21999/swe645assignment3:'+ dateTag, '. --no-cache')
                        docker.withRegistry('',registryCredential) {
                            image.push()
                        }
                    }
            }
        }
     }
      stage('Deploying to Nodeport in Rancher '){
        steps{
            script {
                  sh 'kubectl set image deployment/deploy1 container-0=sagar21999/swe645assignment3:'+dateTag
            }
        }
     }
     }
 
  post {
	  always {
			sh 'docker logout'
		}
	}    
}
