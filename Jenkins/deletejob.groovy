jenkins.model.Jenkins.theInstance.getProjects().each { job ->
    if (job.name.contains('job')) {
        println job.name
        job.delete()
    }
}
