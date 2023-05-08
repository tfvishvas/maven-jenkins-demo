pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        git(url: 'https://github.com/tfvishvas/maven-jenkins-demo.git', branch: 'main', changelog: true)
      }
    }

    stage('') {
      steps {
        mail(subject: 'Build Info', body: 'Build Pipeline executed successfully', to: 'tf.vishvaspandya@gmail.com')
      }
    }

  }
}