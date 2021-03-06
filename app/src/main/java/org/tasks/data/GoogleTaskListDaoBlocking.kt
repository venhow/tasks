package org.tasks.data

import androidx.lifecycle.LiveData
import javax.inject.Inject

@Deprecated("use coroutines")
class GoogleTaskListDaoBlocking @Inject constructor(private val dao: GoogleTaskListDao) {
    fun getAccounts(): List<GoogleTaskAccount> = runBlocking {
        dao.getAccounts()
    }

    fun getAccount(account: String): GoogleTaskAccount? = runBlocking {
        dao.getAccount(account)
    }

    fun getById(id: Long): GoogleTaskList? = runBlocking {
        dao.getById(id)
    }

    fun getLists(account: String): List<GoogleTaskList> = runBlocking {
        dao.getLists(account)
    }

    fun getByRemoteId(remoteId: String): GoogleTaskList? = runBlocking {
        dao.getByRemoteId(remoteId)
    }

    fun subscribeToLists(): LiveData<List<GoogleTaskList>> {
        return dao.subscribeToLists()
    }

    fun findExistingList(remoteId: String): GoogleTaskList? = runBlocking {
        dao.findExistingList(remoteId)
    }

    fun getAllLists(): List<GoogleTaskList> = runBlocking {
        dao.getAllLists()
    }

    fun resetLastSync(account: String) = runBlocking {
        dao.resetLastSync(account)
    }

    fun insertOrReplace(googleTaskList: GoogleTaskList): Long = runBlocking {
        dao.insertOrReplace(googleTaskList)
    }

    fun insert(googleTaskAccount: GoogleTaskAccount) = runBlocking {
        dao.insert(googleTaskAccount)
    }

    fun update(account: GoogleTaskAccount) = runBlocking {
        dao.update(account)
    }
}