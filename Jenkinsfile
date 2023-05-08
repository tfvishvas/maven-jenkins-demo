pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        git(url: 'https://github.com/tfvishvas/maven-jenkins-demo.git', branch: 'main', changelog: true)
      }
    }

  }
}