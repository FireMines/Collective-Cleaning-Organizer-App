package com.example.collectivecleaningorganizer.ui.utilities


import java.lang.Exception

interface OnDataChange {
    fun collectiveMemberRolesChanged(updatedMembersMap: MutableMap<String, String>)

}
interface ResultListener {
    fun onSuccess()
    fun onFailure(error :Exception)
}

interface FriendListListener {
    fun onSuccess(friendList : ArrayList<String>)
    fun onFailure(error :Exception)
}
interface UniqueUsernameListener {
    fun onSuccess(unique : Boolean)
    fun onFailure(error :Exception)
}

interface StringListener{
    fun onSuccess(uId : String)
    fun onFailure(error :Exception)
}
interface DatabaseRequestListener {
    fun onSuccess(data : MutableMap<String,Any?>?)
    fun onFailure(error :Exception)
}