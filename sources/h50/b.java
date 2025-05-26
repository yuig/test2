package h50;

import a10.e;
import a50.k;
import bz.h;
import c50.aa;
import c50.b4;
import c50.ba;
import c50.c3;
import c50.c4;
import c50.ca;
import c50.f4;
import c50.n1;
import c50.o1;
import c50.q1;
import c50.r1;
import c50.r3;
import c50.s3;
import c50.t2;
import c50.u3;
import c50.v2;
import c50.x2;
import c50.x9;
import c50.y0;
import c50.y9;
import g50.c;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.j;
import pc.m;
import pc.m0;
import pc.n;
import pc.p;
import pc.r;
import pc.v0;
import t3.s1;
import zy.b0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f67675a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f67676b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f67677c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f67678d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f67679e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f67680f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f67681g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f67682h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f67683i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f67684j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f67685k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f67686l;

    /* renamed from: m, reason: collision with root package name */
    public static final List f67687m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f67688n;

    /* renamed from: o, reason: collision with root package name */
    public static final List f67689o;

    /* renamed from: p, reason: collision with root package name */
    public static final List f67690p;

    /* renamed from: q, reason: collision with root package name */
    public static final List f67691q;

    /* renamed from: r, reason: collision with root package name */
    public static final List f67692r;

    /* renamed from: s, reason: collision with root package name */
    public static final List f67693s;

    /* renamed from: t, reason: collision with root package name */
    public static final List f67694t;

    /* renamed from: u, reason: collision with root package name */
    public static final List f67695u;

    /* renamed from: v, reason: collision with root package name */
    public static final List f67696v;

    static {
        e eVar = r1.f26261a;
        r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections = k.f746d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new n("User", q13, q0Var, selections));
        f67675a = selections2;
        h hVar = q1.f26239a;
        List selections3 = f0.j(new m("headerSize", ep.b.u(hVar, "headerSize", "name", "type"), null, q0Var, q0Var, q0Var), new m("subtitleAlignment", ep.b.u(hVar, "subtitleAlignment", "name", "type"), null, q0Var, q0Var, q0Var), new m("subtitleStyle", ep.b.u(hVar, "subtitleStyle", "name", "type"), null, q0Var, q0Var, q0Var));
        f67676b = selections3;
        m mVar2 = new m("cornerRadius", ep.b.u(o1.f26193a, "cornerRadius", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type = c4.f25923a.c();
        Intrinsics.checkNotNullParameter("headerDisplay", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new m("headerDisplay", type, null, q0Var, q0Var, selections3));
        f67677c = selections4;
        List selections5 = e0.b(new m("format", o.l(eVar, "format", "name", "type"), null, q0Var, q0Var, q0Var));
        f67678d = selections5;
        m mVar3 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("Story", "Story", "typeCondition", "possibleTypes");
        List selections6 = o50.b.a();
        Intrinsics.checkNotNullParameter(selections6, "selections");
        n nVar = new n("Story", q14, q0Var, selections6);
        m0 type2 = b4.f25900a.c();
        Intrinsics.checkNotNullParameter("displayOptions", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        m mVar4 = new m("displayOptions", type2, null, q0Var, q0Var, selections4);
        m0 type3 = f4.f25994a.c();
        Intrinsics.checkNotNullParameter("title", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections7 = f0.j(mVar3, nVar, mVar4, new m("title", type3, null, q0Var, q0Var, selections5));
        f67679e = selections7;
        m mVar5 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        n nVar2 = new n("User", q15, q0Var, selections2);
        List q16 = ep.b.q("Story", "Story", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        List selections8 = f0.j(mVar5, nVar2, new n("Story", q16, q0Var, selections7));
        f67680f = selections8;
        v0 type4 = x9.f26453a.c();
        Intrinsics.checkNotNullParameter("node", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        List selections9 = e0.b(new m("node", type4, null, q0Var, q0Var, selections8));
        f67681g = selections9;
        p type5 = pc.o.a(eVar.y());
        Intrinsics.checkNotNullParameter("backgroundColorHex", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        List selections10 = f0.j(new m("backgroundColorHex", type5, null, q0Var, q0Var, q0Var), new m("iconType", ep.b.u(hVar, "iconType", "name", "type"), null, q0Var, q0Var, q0Var));
        f67682h = selections10;
        m mVar6 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q17 = ep.b.q("OneBarModule", "OneBarModule", "typeCondition", "possibleTypes");
        List selections11 = g50.b.a();
        Intrinsics.checkNotNullParameter(selections11, "selections");
        List selections12 = f0.j(mVar6, new n("OneBarModule", q17, q0Var, selections11));
        f67683i = selections12;
        m mVar7 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q18 = ep.b.q("OneBarFilter", "OneBarFilter", "typeCondition", "possibleTypes");
        List selections13 = g50.a.a();
        Intrinsics.checkNotNullParameter(selections13, "selections");
        List selections14 = f0.j(mVar7, new n("OneBarFilter", q18, q0Var, selections13));
        f67684j = selections14;
        b0 b0Var = n1.f26170a;
        m mVar8 = new m("hasNextPage", s1.g(b0Var, "hasNextPage", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar9 = new m("hasPreviousPage", o.m(b0Var, "hasPreviousPage", "name", "type"), null, q0Var, q0Var, q0Var);
        h hVar2 = y0.f26457a;
        List selections15 = f0.j(mVar8, mVar9, new m("startCursor", ep.b.u(hVar2, "startCursor", "name", "type"), null, q0Var, q0Var, q0Var), new m("endCursor", ep.b.u(hVar2, "endCursor", "name", "type"), null, q0Var, q0Var, q0Var));
        f67685k = selections15;
        List selections16 = f0.j(new m("name", o.l(eVar, "name", "name", "type"), null, q0Var, q0Var, q0Var), new m("tabType", o.l(eVar, "tabType", "name", "type"), null, q0Var, q0Var, q0Var));
        f67686l = selections16;
        p type6 = pc.o.a(r3.f26265a.c());
        Intrinsics.checkNotNullParameter("tabs", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        Intrinsics.checkNotNullParameter(selections16, "selections");
        List selections17 = e0.b(new m("tabs", type6, null, q0Var, q0Var, selections16));
        f67687m = selections17;
        m mVar10 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q19 = ep.b.q("Sensitivity", "Sensitivity", "typeCondition", "possibleTypes");
        List selections18 = c.a();
        Intrinsics.checkNotNullParameter(selections18, "selections");
        List selections19 = f0.j(mVar10, new n("Sensitivity", q19, q0Var, selections18));
        f67688n = selections19;
        m mVar11 = new m("clientTrackingParams", o.l(eVar, "clientTrackingParams", "name", "type"), null, q0Var, q0Var, q0Var);
        p type7 = pc.o.a(ba.f25912a.b());
        Intrinsics.checkNotNullParameter("edges", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        m mVar12 = new m("edges", type7, null, q0Var, q0Var, selections9);
        m0 type8 = v2.f26396a.n();
        Intrinsics.checkNotNullParameter("modeIcon", "name");
        Intrinsics.checkNotNullParameter(type8, "type");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        m mVar13 = new m("modeIcon", type8, null, q0Var, q0Var, selections10);
        p type9 = pc.o.a(x2.f26439a.c());
        Intrinsics.checkNotNullParameter("oneBarModules", "name");
        Intrinsics.checkNotNullParameter(type9, "type");
        Intrinsics.checkNotNullParameter(selections12, "selections");
        m mVar14 = new m("oneBarModules", type9, null, q0Var, q0Var, selections12);
        p type10 = pc.o.a(t2.f26305a.n());
        Intrinsics.checkNotNullParameter("oneBarFilters", "name");
        Intrinsics.checkNotNullParameter(type10, "type");
        Intrinsics.checkNotNullParameter(selections14, "selections");
        m mVar15 = new m("oneBarFilters", type10, null, q0Var, q0Var, selections14);
        r type11 = pc.o.b(c3.f25921a.z());
        Intrinsics.checkNotNullParameter("pageInfo", "name");
        Intrinsics.checkNotNullParameter(type11, "type");
        Intrinsics.checkNotNullParameter(selections15, "selections");
        m mVar16 = new m("pageInfo", type11, null, q0Var, q0Var, selections15);
        m0 type12 = s3.f26286a.c();
        Intrinsics.checkNotNullParameter("searchfeedTabs", "name");
        Intrinsics.checkNotNullParameter(type12, "type");
        Intrinsics.checkNotNullParameter(selections17, "selections");
        m mVar17 = new m("searchfeedTabs", type12, null, q0Var, q0Var, selections17);
        m0 type13 = u3.f26376a.c();
        Intrinsics.checkNotNullParameter("sensitivity", "name");
        Intrinsics.checkNotNullParameter(type13, "type");
        Intrinsics.checkNotNullParameter(selections19, "selections");
        List selections20 = f0.j(mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, new m("sensitivity", type13, null, q0Var, q0Var, selections19));
        f67689o = selections20;
        m mVar18 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type14 = y9.f26475a.b();
        Intrinsics.checkNotNullParameter("connection", "name");
        Intrinsics.checkNotNullParameter(type14, "type");
        List arguments = f0.j(new j("after", ep.b.t("after", "after", "name"), false), new j("first", ep.b.t("first", "first", "name"), false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections20, "selections");
        List selections21 = f0.j(mVar18, new m("connection", type14, null, q0Var, arguments, selections20));
        f67690p = selections21;
        m mVar19 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        List selections22 = a50.c.a();
        Intrinsics.checkNotNullParameter(selections22, "selections");
        List selections23 = f0.j(mVar19, new n("Error", possibleTypes, q0Var, selections22));
        f67691q = selections23;
        m mVar20 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q23 = ep.b.q("V3SearchUsersWithStoriesDataConnectionContainer", "V3SearchUsersWithStoriesDataConnectionContainer", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections21, "selections");
        n nVar3 = new n("V3SearchUsersWithStoriesDataConnectionContainer", q23, q0Var, selections21);
        List possibleTypes2 = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes2, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections23, "selections");
        List selections24 = f0.j(mVar20, nVar3, new n("Error", possibleTypes2, q0Var, selections23));
        f67692r = selections24;
        m mVar21 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        v0 type15 = aa.f25888a.c();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type15, "type");
        Intrinsics.checkNotNullParameter(selections24, "selections");
        List selections25 = f0.j(mVar21, new m("data", type15, null, q0Var, q0Var, selections24));
        f67693s = selections25;
        m mVar22 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes3 = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes3, "possibleTypes");
        List selections26 = a50.c.a();
        Intrinsics.checkNotNullParameter(selections26, "selections");
        List selections27 = f0.j(mVar22, new n("Error", possibleTypes3, q0Var, selections26));
        f67694t = selections27;
        m mVar23 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q24 = ep.b.q("V3SearchUsersWithStories", "V3SearchUsersWithStories", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections25, "selections");
        n nVar4 = new n("V3SearchUsersWithStories", q24, q0Var, selections25);
        List possibleTypes4 = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes4, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections27, "selections");
        List selections28 = f0.j(mVar23, nVar4, new n("Error", possibleTypes4, q0Var, selections27));
        f67695u = selections28;
        v0 type16 = ca.f25935a.c();
        Intrinsics.checkNotNullParameter("v3SearchUsersWithStoriesQuery", "name");
        Intrinsics.checkNotNullParameter(type16, "type");
        List arguments2 = f0.j(new j("query", ep.b.t("query", "query", "name"), false), new j("rs", ep.b.t("referrerSource", "rs", "name"), false));
        Intrinsics.checkNotNullParameter(arguments2, "arguments");
        Intrinsics.checkNotNullParameter(selections28, "selections");
        f67696v = e0.b(new m("v3SearchUsersWithStoriesQuery", type16, null, q0Var, arguments2, selections28));
    }
}
