package com.example.flightmobileapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ServersDao {
    // https://localhost:44383/

    @Query("select url from servers_table limit 5")
    fun getLastFive(): LiveData<List<DatabaseEntities.Server>>

    @Insert
    fun addServer(server: DatabaseEntities.Server)
}