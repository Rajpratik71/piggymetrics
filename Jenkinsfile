pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('build config') {
      steps {
        dir(path: 'config') {
          sh 'mvn -B -DskipTests clean package'
        }

      }
    }
    stage('Test ') {
      steps {
        dir(path: 'config') {
          sh 'mvn test'
        }

      }
    }
  }
}