package x40;

/* loaded from: classes5.dex */
public final class pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133040a;

    public /* synthetic */ pc(int i13) {
        this.f133040a = i13;
    }

    public final String a() {
        switch (this.f133040a) {
            case 3:
                return "query GetUsersConversationQuery($conversationId: String!) { v3GetConversationQuery(conversation: $conversationId) { __typename ... on ConversationResponse { data { users { __typename ... on UserUsersConnectionContainer { __typename connection { edges { node { __typename ...UserAvatarFields } } } } } } } ... on Error { __typename ...CommonError } } }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 5:
                return "mutation HideConversationMutation($conversationId: String!) { v3HideConversationMutation(input: { conversation: $conversationId } ) { __typename ... on V3HideConversation { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 6:
                return "mutation InviteBoardCollaboratorEmailMutation($emails: [String]!, $boardId: String!, $message: String) { v3InviteBoardCollaboratorEmailMutation(input: { emails: $emails board: $boardId message: $message } ) { __typename ... on V3InviteBoardCollaboratorEmail { __typename data { entityId type } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 7:
                return "mutation InviteBoardCollaboratorsMutation($collaboratorIds: [String]!, $boardId: String!, $message: String!) { v3InviteBoardCollaboratorsMutation(input: { collaboratorIds: $collaboratorIds board: $boardId message: $message } ) { __typename ... on V3InviteBoardCollaborators { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 8:
                return "mutation LogDeviceScreenStateMutation($screenState: String!, $deviceId: String!, $osVersion: String!) { v3LogDeviceScreenStateMutation(input: { screenState: $screenState deviceId: $deviceId osVersion: $osVersion } ) { __typename ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 9:
                return "mutation LogPushNotificationMutation($deviceId: String!, $eventType: String!, $pushId: String, $body: String, $link: String, $displayMode: String) { v3LogPushNotificationMutation(input: { eventType: $eventType body: $body deviceId: $deviceId displayMode: $displayMode link: $link pushId: $pushId } ) { __typename ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 10:
                return "mutation MarkContactRequestReadMutation($contactRequestId: String!) { v3MarkContactRequestReadMutation(input: { contactRequest: $contactRequestId } ) { __typename ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 13:
                return "query RelatedPinsQuery($conversationId: String!, $numberOfPinsToUse: Int!, $after: Cursor, $imageMediumSizeSpec: ImageSpec! = \"200x\" , $imageLargeSizeSpec: ImageSpec! = \"736x\" ) { v3RelatedPinsForConversationQuery(conversation: $conversationId, numPinsToUse: $numberOfPinsToUse) { __typename ... on V3RelatedPinsForConversation { __typename data { __typename ... on V3RelatedPinsForConversationDataConnectionContainer { __typename connection(first: $numberOfPinsToUse, after: $after) { edges { node { __typename ...RelatedPinFields ...PinImagesOnDemandFields } } pageInfo { endCursor hasPreviousPage hasNextPage startCursor } } } ... on Error { __typename ...CommonError } } } ... on Error { __typename ...CommonError } } }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment PinFields on Pin { __typename id title entityId pinnedToBoard { __typename } storyPinData { pageCount metadata { compatibleVersion } isDeleted } pinner { __typename ...UserAvatarFields } storyPinDataId embed { __typename type src } richSummary { products { itemId } typeName displayName } richMetadata { products { itemId } } imageMediumSizePixels { __typename width height } imageLargeSizePixels { __typename width height } imageSignature commentCount imageMediumUrl imageLargeUrl }  fragment StoryPinDataFields on StoryPinData { __typename totalVideoDuration staticPageCount }  fragment RelatedPinFields on Pin { __typename ...PinFields storyPinData { __typename ...StoryPinDataFields } nativeCreator { __typename ...UserAvatarFields } thirdPartyPinOwner { __typename ...UserAvatarFields } linkUserWebsite { officialUser { __typename ...UserAvatarFields } } linkDomain { officialUser { __typename ...UserAvatarFields } } }  fragment ImageDetailsFields on ImageDetails { __typename type dominantColor width height url }  fragment PinImagesOnDemandFields on Pin { imageMediumDetails: images(spec: $imageMediumSizeSpec) { __typename ...ImageDetailsFields } imageLargeDetails: images(spec: $imageLargeSizeSpec) { __typename ...ImageDetailsFields } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 23:
                return "mutation RemoveCollaboratorMutation($boardId: String!, $userIds: [String]!) { v3RemoveBoardCollaboratorsMutationv2(input: { board: $boardId collaboratorIds: $userIds } ) { __typename ... on BoardResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            default:
                return "mutation ReportContactRequestMutation($contactRequestId: String!, $reason: ContactRequestReportReasons!) { v3ReportContactRequestsMutation(input: { reason: $reason contactRequest: $contactRequestId } ) { __typename ... on ContactRequestResponse { __typename data { __typename entityId id } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(int i13, int i14) {
        this(0);
        this.f133040a = i13;
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
