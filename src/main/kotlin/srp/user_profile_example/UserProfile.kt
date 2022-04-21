package srp.user_profile_example

class UserProfile {
    // We need to:
    //  1. Show user posts -- possible impacts: UX/UI OR new type (Videos os Gifs)
    //  2. report -- possible impacts: compliance
    //  3. block -- possible impacts: compliance
    //  4. send message -- possible impacts: new type of message (Slowfies)
    //  5. view conversation -- possible impacts: UX/UI OR new type of message (Slowfies)
    //  6. show friends list -- possible impacts: UX/UI
    //  7. show friend request -- possible impacts: no apparent reasons
    //  8. unfriend -- possible impacts: no apparent reasons
    //  9. unblock -- possible impacts: compliance
}

class UserPost {
    fun createPost(json: String){}
}

//Models
class Message {
    fun createMessage(json: String){}
}

//Views
class UserPostsView {
    fun showPostsOfUser(user: UserProfile) {}
}

class ConversationsView {
    fun showConversationWithUser(user: UserProfile) {}
}

class FriendsView {
    fun showFriendsOfUser(user: UserProfile) {}
}

//Helpers, Managers, Utilities
class MessageSender {
    fun sendMessageToUser(message: Message, user: UserProfile){}
}

class ProfileRestrictionsManager {
    fun report(user: UserProfile) {}
    fun block(user: UserProfile) {}
    fun unblock(user: UserProfile) {}
}

class FriendMaker {
    fun sendFriendRequest(user: UserProfile) {}
    fun unfriend(user: UserProfile) {}
}