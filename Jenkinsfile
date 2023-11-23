pipeline{
    
    environment {
        registry = "sagar21999/swe645assignment3"
        registryCredential = 'dockerhub'
        TIMESTAMP = new Date().format("yyyyMMdd_HHmmss")
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
     stage('Build Docker Image') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  def customImage = docker.build("sagar21999/swe645assignment3:${env.TIMESTAMP}")
               }
            }
         }
      }

      stage('Push Image to Dockerhub') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  sh "docker push sagar21999/swe645assignment3:${env.TIMESTAMP}"
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
