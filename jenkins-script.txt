node {
  stage('Initializing Pipeline') {
    echo 'Hello World'
  }
  stage('SCM (GIT)')
  {
      echo 'Cloning code from github'
     git branch: 'develop', url: 'https://github.com/Shadowhunder/Cloud-FoundaryTesting'
  }
   stage('Build Project')
  {
      echo 'Cloning code from github'
     bat label: '', script: 'mvn clean install'
  }
  stage('Starting Application'){
       bat label: '', script: 'mvn spring-boot:run'
        
  }
}