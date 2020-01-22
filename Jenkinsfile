pipeline {
    agent any
	tools {
        maven 'Maven 3.6.3'
        jdk 'jdk8'
    }
    stages {
		stage ('Initialize') {
            steps {
                bat label: '', script: '''echo %PATH%
				echo %M2_HOME%'''
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
				dir("${env.WORKSPACE}/PresentationEjbEAR"){
					bat 'mvn -Dmaven.test.failure.ignore=true install'
				}
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
            }
        }
    }
}
