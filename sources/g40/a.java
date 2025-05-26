package g40;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63488a;

    public /* synthetic */ a(int i13) {
        this.f63488a = i13;
    }

    public final String a() {
        switch (this.f63488a) {
            case 0:
                return "mutation RemoveFatigueForInterestAfterFeedbackMutation($interestId: String!) { v3RemoveFatigueForInterestAfterFeedbackMutation(input: { interestId: $interestId } ) { __typename ... on InterestResponse { __typename data { __typename id } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 1:
                return "mutation NUXFollowInterestsMutation($redoHomeFeed: Boolean!, $interests: [String]!) { v3OrientationSignalsMutation(input: { redoHomefeed: $redoHomeFeed interests: $interests } ) { __typename ... on V3OrientationSignals { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 2:
                return "query NuxInterestsQuery($pageSize: Int! = 150 , $imageSpec: ImageSpec! = \"236x\" ) { v3OrientationTopicsQuery { __typename ... on V3OrientationTopics { __typename data { __typename ... on V3OrientationTopicsDataConnectionContainer { __typename connection(first: $pageSize) { pageInfo { hasNextPage } edges { node { __typename ...InterestTopicPickerItem } } } } ... on Error { __typename ...CommonError } } } ... on Error { __typename ...CommonError } } }  fragment InterestTopicPickerItem on Interest { __typename id entityId isFollowed backgroundColor name images(spec: $imageSpec) { url } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 21:
            case 23:
            case 24:
            default:
                return "mutation AddThreadMessageMutation($conversationId: String!, $threadId: String!, $message: String, $pinId: String, $source: String!, $clientTrackingParams: String) { v3AddThreadMessageMutation(input: { conversation: $conversationId thread: $threadId text: $message pin: $pinId source: $source clientTrackingParams: $clientTrackingParams } ) { __typename ... on ConversationMessageResponse { __typename data { __typename entityId text thread { entityId } } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 4:
                return "query OrientationStatusQuery($redoHomeFeed: Boolean!) { v3OrientationStatusQuery(redoHomefeed: $redoHomeFeed) { __typename ... on V3OrientationStatus { data } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 5:
                return "query GetCountriesQuery { v3GetCountriesListQuery { __typename ... on V3GetCountriesList { data { countryCode countryName } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 6:
                return "mutation DeleteAddressBookMutation($deviceId: String!) { v3DeleteAddressBookMutation(input: { deviceId: $deviceId } ) { __typename ... on V3DeleteAddressBook { __typename data { __typename ... on User { __typename ...UserSettingsFields } } } ... on Error { __typename ...CommonError } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment PhoneCountryCodeFragment on PhoneCountryCode { __typename code phoneCode }  fragment BizPartnerFragment on BizPartner { __typename id enableProfileMessage entityId businessName contactPhone contactEmail contactPhoneCountry { __typename ...PhoneCountryCodeFragment } }  fragment UserSettingsFields on User { __typename id entityId firstName lastName fullName username ageInYears email imageLargeUrl isPartner isVerifiedMerchant websiteUrl about pronouns verifiedIdentity { __typename ...VerifiedIdentityFragment } country bizPartner { __typename ...BizPartnerFragment } showAllPins }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 11:
                return "mutation EditSettingsMutation($input: V3EditSettingsHandlerInput) { v3EditSettingsHandlerMutation(input: $input) { v3UsersMeViewerResponse { __typename ... on V3UsersMeViewer { commerceEnvConfig data { __typename ... on User { __typename ...UserSettingsFields } } } } v3EditSettingsHandlerResponse { __typename ... on Error { __typename ...CommonError } } clientMutationId } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment PhoneCountryCodeFragment on PhoneCountryCode { __typename code phoneCode }  fragment BizPartnerFragment on BizPartner { __typename id enableProfileMessage entityId businessName contactPhone contactEmail contactPhoneCountry { __typename ...PhoneCountryCodeFragment } }  fragment UserSettingsFields on User { __typename id entityId firstName lastName fullName username ageInYears email imageLargeUrl isPartner isVerifiedMerchant websiteUrl about pronouns verifiedIdentity { __typename ...VerifiedIdentityFragment } country bizPartner { __typename ...BizPartnerFragment } showAllPins }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 15:
                return "query SettingsEditProfileQueryV3 { v3GetCurrentUserHandlerQuery { __typename ... on V3GetCurrentUserHandler { __typename commerceEnvConfig data { __typename ... on User { __typename ...UserSettingsFields } } } ... on Error { __typename ...CommonError } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment PhoneCountryCodeFragment on PhoneCountryCode { __typename code phoneCode }  fragment BizPartnerFragment on BizPartner { __typename id enableProfileMessage entityId businessName contactPhone contactEmail contactPhoneCountry { __typename ...PhoneCountryCodeFragment } }  fragment UserSettingsFields on User { __typename id entityId firstName lastName fullName username ageInYears email imageLargeUrl isPartner isVerifiedMerchant websiteUrl about pronouns verifiedIdentity { __typename ...VerifiedIdentityFragment } country bizPartner { __typename ...BizPartnerFragment } showAllPins }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 19:
                return "query UserFollowerCountWatcherQuery($id: ID!) { node(id: $id) { __typename ... on User { followerCount } } }";
            case 20:
                return "query UserFollowerWatcherQuery($id: ID!, $imageSpec: ImageSpec!) { node(id: $id) { __typename ... on User { __typename ...LegoUserRepFields } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment LegoUserRepFields on User { __typename id entityId explicitlyFollowedByMe followerCount fullName imageMediumUrl username isVerifiedMerchant blockedByMe isPrivateProfile verifiedIdentity { __typename ...VerifiedIdentityFragment } contextualPinImageUrls(spec: $imageSpec) { dominantColor height type url width } recentPinImages(spec: $imageSpec) { dominantColor height type url width } showCreatorProfile }";
            case 22:
                return "query UserFollowersQuery($entityId: String!, $imageSpec: ImageSpec!, $first: Int, $after: Cursor) { v3GetUserHandlerQuery(user: $entityId) { __typename ... on V3GetUserHandler { data { followerCount followers { __typename ... on UserFollowersConnectionContainer { __typename connection(first: $first, after: $after) { pageInfo { endCursor hasNextPage hasPreviousPage startCursor } edges { cursor node { __typename ...LegoUserRepFields } } } } ... on Error { __typename ...CommonError } } } } ... on Error { __typename ...CommonError } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment LegoUserRepFields on User { __typename id entityId explicitlyFollowedByMe followerCount fullName imageMediumUrl username isVerifiedMerchant blockedByMe isPrivateProfile verifiedIdentity { __typename ...VerifiedIdentityFragment } contextualPinImageUrls(spec: $imageSpec) { dominantColor height type url width } recentPinImages(spec: $imageSpec) { dominantColor height type url width } showCreatorProfile }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 25:
                return "mutation AcceptBoardCollaboratorInviteMutation($boardId: String!) { v3AcceptBoardCollaboratorInviteMutation(input: { board: $boardId } ) { __typename ... on CollaboratorInviteResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 26:
                return "mutation AcceptContactRequestMutation($contactRequestId: String!) { v3AcceptContactRequestsMutation(input: { contactRequest: $contactRequestId } ) { __typename ... on ConversationResponse { __typename data { __typename entityId id } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 27:
                return "mutation AddConversationMessageMutation($conversationId: String!, $message: String!, $source: String!, $clientTrackingParams: String) { v3AddConversationMessageMutation(input: { conversation: $conversationId text: $message source: $source clientTrackingParams: $clientTrackingParams } ) { __typename ... on ConversationMessageResponse { __typename data { __typename entityId text } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 28:
                return "mutation AddConversationPinSeenMutation($conversationId: String!, $senderId: String!, $pinId: String!) { v3AddConversationPinSeenMutation(input: { conversation: $conversationId pin: $pinId sender: $senderId } ) { __typename ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, int i14) {
        this(0);
        this.f63488a = i13;
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
