package com.raywenderlich.podplay.repository

import com.raywenderlich.podplay.model.Podcast
import com.raywenderlich.podplay.service.RssFeedService

class PodcastRepo {
    fun getPodcast(feedUrl: String): Podcast? {
        return Podcast(feedUrl, "No Name","No description", "No image")
    }
}