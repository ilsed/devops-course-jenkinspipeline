stage('Compile') {
    node {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '303bf04f-4bc2-4057-9662-a8c05f311735', url: 'https://github.com/ilsed/devops-course-jenkinspipeline.git']]])
  }
}

stage('Test') {
    node {
          sh './gradlew test'
          junit 'build/test-results/**/*.xml'

    }
}


