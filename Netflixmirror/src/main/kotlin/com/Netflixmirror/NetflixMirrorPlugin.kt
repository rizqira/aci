package com.Netflixmirrorn

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class NetflixMirrorPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(NetflixMirror())
        registerMainAPI(PrimeVideoMirror())
    }
}