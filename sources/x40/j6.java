package x40;

/* loaded from: classes5.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132592a;

    public /* synthetic */ j6(int i13) {
        this.f132592a = i13;
    }

    public final String a() {
        switch (this.f132592a) {
            case 0:
                return "mutation DeclineContactRequestMutation($contactRequestId: String!) { v3DeclineContactRequestsMutation(input: { contactRequest: $contactRequestId } ) { __typename ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 1:
                return "mutation DeclineOrDeleteBoardCollaboratorInviteMutation($boardId: String!, $userId: String!) { v3DeclineOrDeleteBoardCollaboratorInviteMutation(input: { board: $boardId user: $userId } ) { __typename ... on CollaboratorInviteResponse { __typename data { entityId } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 2:
                return "query GetBoardCollaboratorInvitesQuery($boardId: String!) { v3GetBoardCollaboratorInvitesQuery(board: $boardId) { __typename ... on V3GetBoardCollaboratorInvites { __typename data { __typename ... on V3GetBoardCollaboratorInvitesDataConnectionContainer { __typename connection { edges { node { __typename id entityId status invitedUser { __typename ...UserAvatarFields } } } } } } } ... on Error { __typename ...CommonError } } }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 4:
                return "query GetConversationQuery($conversationId: String!, $imageSpec: ImageSpec! = \"236x\" , $shouldRequestPinsubTopicId: Boolean = false ) { v3GetConversationQuery(conversation: $conversationId) { __typename ... on ConversationResponse { data { __typename ...ConversationFields } } ... on Error { __typename ...CommonError } } }  fragment ConversationMinimalisticFields on Conversation { __typename id entityId }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment PinFields on Pin { __typename id title entityId pinnedToBoard { __typename } storyPinData { pageCount metadata { compatibleVersion } isDeleted } pinner { __typename ...UserAvatarFields } storyPinDataId embed { __typename type src } richSummary { products { itemId } typeName displayName } richMetadata { products { itemId } } imageMediumSizePixels { __typename width height } imageLargeSizePixels { __typename width height } imageSignature commentCount imageMediumUrl imageLargeUrl }  fragment UserDidItDataFields on UserDidItData { __typename id entityId user { __typename ...UserAvatarFields } pin { __typename ...PinFields } details images(spec: $imageSpec) { url } }  fragment BoardFields on Board { __typename id entityId pinCount privacy name owner { fullName } pinThumbnailUrls imageCoverHdUrl hasCustomCover imageCoverUrl }  fragment ConversationMessageFields on ConversationMessage { __typename type id entityId text createdAt userDidItData { __typename ...UserDidItDataFields } sender { __typename ...UserAvatarFields } user { __typename id entityId } board { __typename ...BoardFields } pin { __typename ...PinFields } }  fragment ConversationFields on Conversation { __typename ...ConversationMinimalisticFields emails unread isEligibleForThreads pinsubTopicId @include(if: $shouldRequestPinsubTopicId) readTimesMs { __typename time userId } users { __typename ... on UserUsersConnectionContainer { __typename connection { edges { node { __typename ...UserAvatarFields } } } } } lastMessage { __typename ...ConversationMessageFields } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 27:
                return "query GetUserBoardInviteQuery($boardId: String!, $userId: String!) { v3GetUserBoardInviteQuery(board: $boardId, user: $userId) { __typename ... on V3GetUserBoardInvite { __typename data { __typename id entityId status type isAcceptable message createdAt invitedByUser { __typename id entityId fullName imageMediumUrl } board { __typename id entityId } } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            default:
                return "query GetUserContactRequestsByUserQuery($first: Int, $after: Cursor) { v3GetUserContactRequestsByUserQuery { __typename ... on V3GetUserContactRequestsByUser { __typename data { __typename ... on V3GetUserContactRequestsByUserDataConnectionContainer { __typename connection(first: $first, after: $after) { edges { node { __typename ...ContactRequestFields } } pageInfo { endCursor hasPreviousPage hasNextPage startCursor } } } ... on Error { __typename ...CommonError } } } ... on Error { __typename ...CommonError } } }  fragment BoardFields on Board { __typename id entityId pinCount privacy name owner { fullName } pinThumbnailUrls imageCoverHdUrl hasCustomCover imageCoverUrl }  fragment ConversationMinimalisticFields on Conversation { __typename id entityId }  fragment ContactRequestConversationFields on Conversation { __typename ...ConversationMinimalisticFields emails unread readTimesMs { __typename time userId } }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment ContactRequestFields on ContactRequest { __typename entityId id type read createdAt board { __typename ...BoardFields } conversation { __typename ...ContactRequestConversationFields } sender { __typename ...UserAvatarFields } }  fragment CommonError on Error { __typename error { message paramPath } }";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(int i13, int i14) {
        this(0);
        this.f132592a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
