stage('This is a stage') {
    node {
    echo "This is a stage"
  }
}

stage('Another stage') {
}

stage('Proceed?') {
  input "Are you sure you want to proceed?"
  milestone()
  node {
    echo "Proceed?"
  }
 milestone()

}

stage('Finished'){
    echo "finished"
}