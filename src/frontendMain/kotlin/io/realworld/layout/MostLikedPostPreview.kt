package io.realworld.layout

import io.kvision.core.Container
import io.kvision.html.*
import io.kvision.types.toStringF

fun Container.mostLikedPostPreview(username: String, title: String, likes: Int, createdAt: String, postSlug: String) {
    div(className = "most-liked-post-preview") {
        div(className = "post-meta") {
            span(" | ", className = "separator")
            span(" | ", className = "separator") 
        }
    }
}
