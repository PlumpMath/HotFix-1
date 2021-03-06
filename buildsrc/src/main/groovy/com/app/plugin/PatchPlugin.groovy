package com.app.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


public class PatchPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.logger.error("------------------自定义插件成功！--------------------")
        def android = project.extensions.findByType(AppExtension)
        android.registerTransform(new PreDexTransform(project))
    }
}