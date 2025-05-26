package n00;

import df.j1;
import kotlin.jvm.internal.Intrinsics;
import lh0.g2;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88798a;

    public /* synthetic */ z(int i13) {
        this.f88798a = i13;
    }

    public final void a(x92.b apiFieldsMap) {
        switch (this.f88798a) {
            case 0:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.e("pin.story_pin_data()");
                b0.f88766a.b(apiFieldsMap);
                apiFieldsMap.e("pin.id");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pk.a0.c(apiFieldsMap);
                apiFieldsMap.e("pin.rich_summary()");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                com.bumptech.glide.d.e(apiFieldsMap);
                apiFieldsMap.e("user.recent_story_pin_images");
                apiFieldsMap.e("user.implicitly_followed_by_me");
                apiFieldsMap.e("user.explicitly_followed_by_me");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                j1.i(apiFieldsMap);
                apiFieldsMap.e("user.has_quick_create_board");
                break;
            case 4:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "userreaction.id", "userreaction.type", "userreaction.reaction_type");
                apiFieldsMap.e("userreaction.user()");
                int i13 = f0.f88773a;
                bz.h.c(apiFieldsMap, false);
                break;
            default:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pk.a0.c(apiFieldsMap);
                apiFieldsMap.e("pin.tracking_params");
                apiFieldsMap.e("pin.pinner()");
                apiFieldsMap.e("pin.rich_summary()");
                dl2.b.o(apiFieldsMap, g2.f83370b.d());
                apiFieldsMap.e("pin.virtual_try_on_data");
                break;
        }
    }

    public final String b() {
        switch (this.f88798a) {
            case 8:
                return "mutation RemoveDeviceTokenMutation($token: String!) { v3RemoveDeviceTokenMutation(input: { deviceId: $token } ) { __typename ... on UserResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 9:
                return "mutation ResendUserEmailMutation { v3ResendUserEmailMutation { __typename ... on UserResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 10:
                return "query BoardTitleSuggestionsQuery($pinId: String!) { v3GetPinQuery(pin: $pinId) { __typename ... on V3GetPin { __typename data { boardTitleSuggestions { title metadata } } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 11:
                return "mutation EmailClickMutation($od: String!, $targetUrl: String!, $viewingUser: String!) { v3EmailClickMutation(input: { od: $od targetUrl: $targetUrl viewingUser: $viewingUser } ) { __typename ... on EmailClickResultResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 12:
                return "mutation EmailFollowUserMutation($followee: String!) { v3EmailFollowUserMutation(input: { followee: $followee } ) { __typename ... on UserResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 13:
                return "mutation RedeemInviteMutation($inviteCode: String!) { v3RedeemInviteMutation(input: { inviteCode: $inviteCode } ) { __typename ... on InviteCodeResponse { __typename data { __typename entityId type isAccepted } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 14:
                return "query AndroidCubesSignInQuery { v3AndroidCubesSignInQuery { __typename ... on AndroidCubesSignInCardResponse { __typename data { image { height uri width } actionText actionUri subtitle title } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 15:
                return "query GoogleEngage { v3AndroidCubesClustersQuery { __typename ... on AndroidCubesClustersResponse { __typename data { clusters { actionUri entities { actionUri image { height uri width } } title } publishStatus } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 16:
                return "mutation FollowUserMutation($followeeEntityId: String!) { v3FollowUserMethodMutation(input: { followee: $followeeEntityId } ) { __typename ... on V3FollowUserMethod { __typename data { __typename id entityId explicitlyFollowedByMe followerCount } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 17:
                return "mutation UnfollowUserMutation($followeeEntityId: String!) { v3UnfollowUserMethodMutation(input: { followee: $followeeEntityId } ) { __typename ... on V3UnfollowUserMethod { __typename data { __typename id entityId explicitlyFollowedByMe followerCount } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 18:
                return "query GetRecommendedTodayArticlesQuery { v3RecommendedTodayArticlesQuery { __typename ... on V3RecommendedTodayArticles { __typename data { __typename ... on V3RecommendedTodayArticlesDataConnectionContainer { __typename connection { edges { node { __typename ... on TodayArticle { id imageUrls title subtitle entityId feedSource isProductPinFeed } } cursor } pageInfo { endCursor hasNextPage hasPreviousPage startCursor } } } } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 19:
                return "mutation DeleteNewsHubBadgeMutation { v3DeleteNewsHubBadgeMutation { __typename ... on UserResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 20:
                return "query GetNewsSummaryQuery($newsId: String!) { v3GetNewsSummaryQuery(newsId: $newsId) { __typename ... on NewsResponse { __typename data { __typename ...NewsHubItemFields } } ... on Error { __typename ...CommonError } } }  fragment NewsHubPin on Pin { __typename id entityId }  fragment NewsHubUser on User { __typename id entityId }  fragment NewsHubInterest on Interest { __typename id entityId }  fragment NewsHubUserDidItData on UserDidItData { __typename id entityId }  fragment NewsHubBoard on Board { __typename id entityId }  fragment TextMappingFields on NewsTextMapping { text url key }  fragment NewsHubItemFields on News { __typename id entityId displayMode encodedDisplayMode detailHeader headerText headerIconObjectIds objectMap { pins { __typename ...NewsHubPin } users { __typename ...NewsHubUser } interests { __typename ...NewsHubInterest } usersDidItData { __typename ...NewsHubUserDidItData } boards { __typename ...NewsHubBoard } } textMapping { __typename ...TextMappingFields } newsType }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                return "mutation UpdateObjectSubscriptionsForNotificationsGraphqlMutation($objectIdsToUnsubscribe: [String] = \"\" , $objectIdsToResubscribe: [String] = \"\" ) { v3UpdateObjectSubscriptionsForNotificationsGraphqlMutation(input: { objectIdsToResubscribe: $objectIdsToResubscribe objectIdsToUnsubscribe: $objectIdsToUnsubscribe } ) { __typename ... on V3UpdateObjectSubscriptionsForNotificationsGraphql { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 28:
                return "mutation HideNewsHubPinMutation($newsId: String!, $pin: String!) { v3HideNewsHubPinMutation(input: { newsId: $newsId pin: $pin } ) { __typename ... on NewsResponse { __typename data { id } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i13, int i14) {
        this(0);
        this.f88798a = i13;
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
