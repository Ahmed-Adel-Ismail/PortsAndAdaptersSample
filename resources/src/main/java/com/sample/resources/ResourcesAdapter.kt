package com.sample.resources

import android.content.Context
import com.sample.core.IntegrationDsl
import com.sample.core.ports.ResourcesPort
import com.sample.core.ports.StringResources

class ResourcesAdapter @IntegrationDsl constructor(val context: Context) : ResourcesPort {

    override suspend fun localizedString(stringResources: StringResources): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}