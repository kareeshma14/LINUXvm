pipeline {
  agent any
  stages {
    stage ('Build&Test') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage ('Build Image') {
      steps {
       sh 'sudo docker build  -t kareeshma14/passenger .'
      }
    }
   stage ('Login') {
     steps {
       sh 'sudo docker login  -u kareeshma14  -p Chockiee@03'
     }
   }
   stage ('Push image') {
     steps {
      sh 'sudo docker push kareeshma14/passenger'
     }
   }
  }
}