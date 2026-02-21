pipeline {
    agent any

    stages {

        stage('clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Minny-05/calci.git'
            }
        }

        stage('compile') {
            steps {
                sh 'javac Calci.java'
            }
        }

        stage('build') {
            steps {
                sh 'java Calci 25 5'
            }
        }

        stage('test') {
            steps {
                sh 'java Calci 30 -5'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment completed'
            }
        }
    }
}
