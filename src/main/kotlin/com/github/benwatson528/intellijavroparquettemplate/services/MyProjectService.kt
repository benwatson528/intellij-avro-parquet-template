package com.github.benwatson528.intellijavroparquettemplate.services

import com.intellij.openapi.project.Project
import com.github.benwatson528.intellijavroparquettemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
