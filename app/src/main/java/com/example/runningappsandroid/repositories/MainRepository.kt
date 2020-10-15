package com.example.runningappsandroid.repositories

import com.example.runningappsandroid.db.Run
import com.example.runningappsandroid.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllSortedByDate() = runDao.getAllSortedByDate()

    fun getAllSortedByDistance() = runDao.getAllSortedByDistance()

    fun getAllSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllSortedByAvgSpeed() = runDao.getAllSortedByAvgSpeed()

    fun getAllSortedByCaloriesBurned() = runDao.getAllSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistanceInMeters()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()


}