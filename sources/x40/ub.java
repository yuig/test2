package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ub implements pc.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final bz.h f133459e = new bz.h(12, 0);

    /* renamed from: a, reason: collision with root package name */
    public final pc.r0 f133460a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f133461b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f133462c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f133463d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pc.p0, pc.r0] */
    public ub(pc.q0 first, pc.r0 after, pc.q0 shouldRequestPinsubTopicId, int i13) {
        int i14 = i13 & 1;
        ?? imageSpec = pc.p0.f99597a;
        first = i14 != 0 ? imageSpec : first;
        after = (i13 & 2) != 0 ? imageSpec : after;
        shouldRequestPinsubTopicId = (i13 & 8) != 0 ? imageSpec : shouldRequestPinsubTopicId;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(after, "after");
        Intrinsics.checkNotNullParameter(imageSpec, "imageSpec");
        Intrinsics.checkNotNullParameter(shouldRequestPinsubTopicId, "shouldRequestPinsubTopicId");
        this.f133460a = first;
        this.f133461b = after;
        this.f133462c = imageSpec;
        this.f133463d = shouldRequestPinsubTopicId;
    }

    @Override // pc.o0
    public final String a() {
        return "26721a2fe62ea4531b11e21f6d23f375468b1b0111c1be68a490d7ef8ec2f4ab";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.za.f137690a);
    }

    @Override // pc.o0
    public final String c() {
        switch (f133459e.f24181a) {
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
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.s.f21933a;
        List selections = b50.s.f21943k;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        df.j1.U1(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return Intrinsics.d(this.f133460a, ubVar.f133460a) && Intrinsics.d(this.f133461b, ubVar.f133461b) && Intrinsics.d(this.f133462c, ubVar.f133462c) && Intrinsics.d(this.f133463d, ubVar.f133463d);
    }

    public final int hashCode() {
        return this.f133463d.hashCode() + pk2.f.a(this.f133462c, pk2.f.a(this.f133461b, this.f133460a.hashCode() * 31, 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "GetConversationsQuery";
    }

    public final String toString() {
        return "GetConversationsQuery(first=" + this.f133460a + ", after=" + this.f133461b + ", imageSpec=" + this.f133462c + ", shouldRequestPinsubTopicId=" + this.f133463d + ")";
    }
}
