package j30;

import c50.l3;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.m0;
import pc.u0;
import pc.v;

/* loaded from: classes.dex */
public final class h implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final bz.h f74553b = new bz.h(10, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f74554a;

    public h(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f74554a = userId;
    }

    @Override // pc.o0
    public final String a() {
        return "af20b7e77d208e88abeb34d34f8d195ea9442e6c8c117acec3ede988ef07199c";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(k30.g.f78233a);
    }

    @Override // pc.o0
    public final String c() {
        switch (f74553b.f24181a) {
            case 10:
                return "query GetConversationBadgeCountQuery($userId: String!) { v3GetUserHandlerQuery(user: $userId) { __typename ... on V3GetUserHandler { data { __typename conversationBadgeCount } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 11:
                return "query GetNewsHubBadgeQuery { v3GetCurrentUserHandlerQuery { __typename ... on V3GetCurrentUserHandler { __typename data { __typename ... on User { __typename entityId badgeCounts { messages newsHub } } } } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            default:
                return "query GetConversationsQuery($first: Int, $after: Cursor, $imageSpec: ImageSpec! = \"236x\" , $shouldRequestPinsubTopicId: Boolean = false ) { v3GetConversationsQuery { __typename ... on V3GetConversations { __typename data { __typename ... on V3GetConversationsDataConnectionContainer { __typename connection(first: $first, after: $after) { edges { node { __typename ...ConversationFields } } pageInfo { endCursor hasPreviousPage hasNextPage startCursor } } } ... on Error { __typename ...CommonError } } } ... on Error { __typename ...CommonError } } }  fragment ConversationMinimalisticFields on Conversation { __typename id entityId }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }  fragment PinFields on Pin { __typename id title entityId pinnedToBoard { __typename } storyPinData { pageCount metadata { compatibleVersion } isDeleted } pinner { __typename ...UserAvatarFields } storyPinDataId embed { __typename type src } richSummary { products { itemId } typeName displayName } richMetadata { products { itemId } } imageMediumSizePixels { __typename width height } imageLargeSizePixels { __typename width height } imageSignature commentCount imageMediumUrl imageLargeUrl }  fragment UserDidItDataFields on UserDidItData { __typename id entityId user { __typename ...UserAvatarFields } pin { __typename ...PinFields } details images(spec: $imageSpec) { url } }  fragment BoardFields on Board { __typename id entityId pinCount privacy name owner { fullName } pinThumbnailUrls imageCoverHdUrl hasCustomCover imageCoverUrl }  fragment ConversationMessageFields on ConversationMessage { __typename type id entityId text createdAt userDidItData { __typename ...UserDidItDataFields } sender { __typename ...UserAvatarFields } user { __typename id entityId } board { __typename ...BoardFields } pin { __typename ...PinFields } }  fragment ConversationFields on Conversation { __typename ...ConversationMinimalisticFields emails unread isEligibleForThreads pinsubTopicId @include(if: $shouldRequestPinsubTopicId) readTimesMs { __typename time userId } users { __typename ... on UserUsersConnectionContainer { __typename connection { edges { node { __typename ...UserAvatarFields } } } } } lastMessage { __typename ...ConversationMessageFields } }  fragment CommonError on Error { __typename error { message paramPath } }";
        }
    }

    @Override // pc.o0
    public final m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = l30.a.f81497a;
        List selections = l30.a.f81501e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("userId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f74554a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f74554a, ((h) obj).f74554a);
    }

    public final int hashCode() {
        return this.f74554a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetConversationBadgeCountQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GetConversationBadgeCountQuery(userId="), this.f74554a, ")");
    }
}
