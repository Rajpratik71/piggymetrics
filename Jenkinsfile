pipeline {
  agent any
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