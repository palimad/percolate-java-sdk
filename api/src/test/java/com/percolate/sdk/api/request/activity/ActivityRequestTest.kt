package com.percolate.sdk.api.request.activity

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class ActivityRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val activityStream = percolateApi
                .activity()
                .get(ActivityParams())
                .execute()
                .body();

        Assert.assertNotNull(activityStream)
        Assert.assertNotNull(activityStream.data)
        Assert.assertEquals(18, activityStream.data.size.toLong())
    }
}