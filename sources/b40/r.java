package b40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements pc.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bz.h f21742a = new bz.h(11, 0);

    @Override // pc.o0
    public final String a() {
        return "45b19cd7376aae3fd38626c992d7ac1f4cc1d7c7bd24820c25a57b8012f9bbed";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(c40.p.f25741a);
    }

    @Override // pc.o0
    public final String c() {
        switch (f21742a.f24181a) {
            case 10:
                return "query GetConversationBadgeCountQuery($userId: String!) { v3GetUserHandlerQuery(user: $userId) { __typename ... on V3GetUserHandler { data { __typename conversationBadgeCount } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 11:
                return "query GetNewsHubBadgeQuery { v3GetCurrentUserHandlerQuery { __typename ... on V3GetCurrentUserHandler { __typename data { __typename ... on User { __typename entityId badgeCounts { messages newsHub } } } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            default:
                return "query GetConversationsQuery($first: Int, $after: Cursor, $imageSpec: ImageSpec! = \"236x\" , $shouldRequestPinsubTopicId: Boolean = false ) { v3GetConversationsQuery { __typename ... on V3GetConversations { __typename data { __typename ... on V3GetConversationsDataConnectionContainer { __typename connection(first: $first, after: $after) { edges { node { __typename ...ConversationFields } } pageInfo { endCursor hasPreviousPage hasNextPage startCursor } } } ... on Error { __typename ...CommonError } } } ... on Error { __typename ...CommonError } } }  fragment ConversationMinimalisticFields on Conversation { __typename id entityId }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment PinFields on Pin { __typename id title entityId pinnedToBoard { __typename } storyPinData { pageCount metadata { compatibleVersion } isDeleted } pinner { __typename ...UserAvatarFields } storyPinDataId embed { __typename type src } richSummary { products { itemId } typeName displayName } richMetadata { products { itemId } } imageMediumSizePixels { __typename width height } imageLargeSizePixels { __typename width height } imageSignature commentCount imageMediumUrl imageLargeUrl }  fragment UserDidItDataFields on UserDidItData { __typename id entityId user { __typename ...UserAvatarFields } pin { __typename ...PinFields } details images(spec: $imageSpec) { url } }  fragment BoardFields on Board { __typename id entityId pinCount privacy name owner { fullName } pinThumbnailUrls imageCoverHdUrl hasCustomCover imageCoverUrl }  fragment ConversationMessageFields on ConversationMessage { __typename type id entityId text createdAt userDidItData { __typename ...UserDidItDataFields } sender { __typename ...UserAvatarFields } user { __typename id entityId } board { __typename ...BoardFields } pin { __typename ...PinFields } }  fragment ConversationFields on Conversation { __typename ...ConversationMinimalisticFields emails unread isEligibleForThreads pinsubTopicId @include(if: $shouldRequestPinsubTopicId) readTimesMs { __typename time userId } users { __typename ... on UserUsersConnectionContainer { __typename connection { edges { node { __typename ...UserAvatarFields } } } } } lastMessage { __typename ...ConversationMessageFields } }  fragment CommonError on Error { __typename error { message paramPath } }";
        }
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = f40.b.f61052a;
        List selections = f40.b.f61058g;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == r.class;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.k0.f80436a.b(r.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetNewsHubBadgeQuery";
    }
}
