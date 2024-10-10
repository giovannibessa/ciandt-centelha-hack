package io.realworld.layout

import io.realworld.ConduitState
import io.realworld.layout.shared.pagination
import io.realworld.layout.shared.tags
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.h1
import io.kvision.html.p

fun Container.mostLikedPostPage(state: ConduitState) {
    div(className = "most-liked-posts-page") {
        div(className = "container page") {
            div(className = "row") {
                div(className = "col-md-9") {
                    h1("Most Liked Posts") 
                    {{ state }}
                }
            }
        }
    }
}
