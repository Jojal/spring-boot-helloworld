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
                node('docker') {
                    echo 'Deploying....'

                    sh 'docker build -t jojal/spring-example:latest .'
                    sh 'docker run -d -p 8081:8080 jojal/spring-example:latest'
                }
            }
        }
    }
}