package com.example.marsphotos.fake

import com.example.marsphotos.model.MarsPhoto
import data.MarsPhotosRepository

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
