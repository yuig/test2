package zy;

import c50.g1;
import c50.i1;
import c50.n1;
import c50.p1;
import c50.t0;
import c50.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 implements k10.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143059a;

    public /* synthetic */ b0(int i13) {
        this.f143059a = i13;
    }

    public final void a(x92.b apiFieldsMap) {
        switch (this.f143059a) {
            case 5:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                int i13 = n00.f0.f88773a;
                bz.h.c(apiFieldsMap, false);
                apiFieldsMap.e("place.id");
                apiFieldsMap.e("place.type");
                apiFieldsMap.e("place.name");
                n60.o.w(apiFieldsMap, "place.street", "place.extra_street", "place.region", "place.locality");
                n60.o.w(apiFieldsMap, "place.latitude", "place.longitude", "place.url", "place.images()");
                n60.o.w(apiFieldsMap, "partner.enable_profile_address", "partner.enable_profile_message", "partner.profile_place()", "partner.contact_phone_country()");
                apiFieldsMap.e("partner.business_name");
                apiFieldsMap.e("partner.is_linked_business");
                break;
            case 6:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "pin.should_open_in_stream", "storypindata.has_affiliate_products", "storypindata.has_product_pins");
                break;
            default:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                com.bumptech.glide.d.e(apiFieldsMap);
                apiFieldsMap.e("user.email");
                apiFieldsMap.e("user.image_medium_url");
                n60.o.w(apiFieldsMap, "user.image_large_url", "user.image_xlarge_url", "user.businesses()", "user.owners()");
                apiFieldsMap.e("user.is_sso_user");
                break;
        }
    }

    public final String b() {
        switch (this.f143059a) {
            case 10:
                return "mutation AddDeviceTokenMutation($token: String!, $allowNotifications: Boolean!, $osVersion: String!) { v3AddDeviceTokenMutation(input: { deviceId: $token osVersion: $osVersion allowsNotifications: $allowNotifications } ) { __typename ... on UserResponse { __typename } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 11:
                return "query GetUserStateQuery($state: String!) { v3GetUserStateQuery(state: $state) { __typename ... on StringResponse { __typename data } ... on Error { __typename ...CommonError } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 12:
                return "query BoardConnectionQuery($id: ID!) { node(id: $id) { __typename ... on Board { __typename id name } } }";
            case 13:
                return "query PinConnectionQuery($id: ID!) { node(id: $id) { __typename ... on Pin { __typename id title entityId pinnedToBoard { __typename } imageMediumUrl storyPinDataId storyPinData { pageCount metadata { compatibleVersion } isDeleted } embed { __typename type src } richMetadata { products { itemId } } richSummary { products { itemId } typeName displayName } imageMediumSizePixels { __typename width height } imageLargeSizePixels { __typename width height } nativeCreator { __typename ...UserAvatarFields } pinner { __typename ...UserAvatarFields } thirdPartyPinOwner { __typename ...UserAvatarFields } linkUserWebsite { officialUser { __typename ...UserAvatarFields } } linkDomain { officialUser { __typename ...UserAvatarFields } } commentCount imageSignature imageMediumUrl imageLargeUrl } } }  fragment UserAvatarFields on User { __typename id entityId verifiedIdentity { __typename verified } blockedByMe isVerifiedMerchant isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl firstName lastName fullName username followerCount followingCount explicitlyFollowedByMe isPrivateProfile avatarColorIndex }";
            default:
                return "query UserConnectionQuery($id: ID!, $imageSizeSpec: ImageSpec!, $imageSpec: ImageSpec!) { node(id: $id) { __typename ... on User { __typename entityId followerCount id isVerifiedMerchant contextualPinImageUrls(spec: $imageSizeSpec) { url width dominantColor type height } recentPinImages(spec: $imageSizeSpec) { dominantColor height type url width } username verifiedIdentity { __typename ...VerifiedIdentityFragment } blockedByMe explicitlyFollowedByMe isDefaultImage imageXlargeUrl imageLargeUrl imageMediumUrl imageSmallUrl fullName firstName lastName ageInYears email isPartner isVerifiedMerchant websiteUrl about pronouns country bizPartner { __typename ...BizPartnerFragment enableProfileAddress profilePlace { __typename id entityId extraStreet postalCode country street latitude longitude locality region } contactDetails { __typename phoneCountry phoneNumber email } } showCreatorProfile hasConfirmedEmail isAnyWebsiteVerified profileUrl gender isPrivateProfile listedWebsiteUrl location additionalWebsiteUrls verifiedUserWebsites impressumUrl followers { __typename ... on UserFollowersConnectionContainer { connection(first: 0, after: \"$after\") { __typename edges { cursor node { __typename ...LegoUserRepFields } } pageInfo { endCursor hasNextPage hasPreviousPage startCursor } } } } } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment PhoneCountryCodeFragment on PhoneCountryCode { __typename code phoneCode }  fragment BizPartnerFragment on BizPartner { __typename id enableProfileMessage entityId businessName contactPhone contactEmail contactPhoneCountry { __typename ...PhoneCountryCodeFragment } }  fragment LegoUserRepFields on User { __typename id entityId explicitlyFollowedByMe followerCount fullName imageMediumUrl username isVerifiedMerchant blockedByMe isPrivateProfile verifiedIdentity { __typename ...VerifiedIdentityFragment } contextualPinImageUrls(spec: $imageSpec) { dominantColor height type url width } recentPinImages(spec: $imageSpec) { dominantColor height type url width } showCreatorProfile }";
        }
    }

    public final pc.w c() {
        switch (this.f143059a) {
            case 20:
                return c50.v.f26391b;
            case 25:
                return z0.f26480b;
            case 28:
                return n1.f26171b;
            default:
                return p1.f26218b;
        }
    }

    public final pc.m0 d() {
        switch (this.f143059a) {
            case 17:
                return c50.p.f26214b;
            case 18:
                return c50.r.f26258b;
            case 19:
                return c50.t.f26301b;
            case 20:
            case 25:
            default:
                return i1.f26058b;
            case 21:
                return c50.z.f26478b;
            case 22:
                return c50.h0.f26034b;
            case 23:
                return c50.o0.f26192b;
            case 24:
                return t0.f26303b;
            case 26:
                return g1.f26012b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13, int i14) {
        this(0);
        this.f143059a = i13;
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
            default:
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
        }
    }
}
