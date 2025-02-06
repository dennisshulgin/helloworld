pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/dennisshulgin/helloworld.git'
            }
        }
        stage('Build and Test') {
            steps {
                sh 'sh scripts/build_and_test.sh'
            }
        }
        stage('Deploy') {
            steps {
                sh 'sh scripts/deploy.sh'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}