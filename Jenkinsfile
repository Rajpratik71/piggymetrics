pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('change dir') {
      steps {
        dir(path: 'config') {
          powershell 'mvn clean install'
        }

      }
    }
  }
}