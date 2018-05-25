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
                script {
                    docker.build("jojal/spring-example:latest")
                    docker.image('jojal/spring-example:latest').withRun('-p 8081:8080') {c ->
                        sh "curl -i http://${hostIp(c)}:8080/"
                    }
                }
            }
        }
    }
}