pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'echo user is $USER'
                sh 'whoami'
                sh 'export USER=jenkins'
                sh 'docker build -t jojal/spring-example:latest .'

            }
        }
    }
}