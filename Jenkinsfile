stage('Compile') {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '303bf04f-4bc2-4057-9662-a8c05f311735', url: 'https://github.com/ilsed/devops-course-jenkinspipeline.git']]])

    node {
    echo "Compile"
  }
}

stage('Test') {
junit allowEmptyResults: true, testResults: ''

}

