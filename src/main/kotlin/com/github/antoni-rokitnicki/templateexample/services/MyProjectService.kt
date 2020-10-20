package com.github.antoni-rokitnicki.templateexample.services

import com.intellij.openapi.project.Project
import com.github.antoni-rokitnicki.templateexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
