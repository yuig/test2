package a40;

import a10.e;
import a50.c;
import bz.h;
import c50.c3;
import c50.d9;
import c50.e9;
import c50.g9;
import c50.i9;
import c50.j9;
import c50.m4;
import c50.n1;
import c50.p1;
import c50.r1;
import c50.y0;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.m0;
import pc.n;
import pc.o;
import pc.p;
import pc.r;
import pc.v0;
import pc.w;
import t3.s1;
import zy.b0;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f527a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f528b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f529c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f530d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f531e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f532f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f533g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f534h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f535i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f536j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f537k;

    static {
        r g13 = s1.g(p1.f26217a, "id", "name", "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("id", g13, null, q0Var, q0Var, q0Var);
        e eVar = r1.f26261a;
        p type = o.a(o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("imageUrls", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        m mVar2 = new m("imageUrls", type, null, q0Var, q0Var, q0Var);
        m mVar3 = new m("title", n60.o.l(eVar, "title", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar4 = new m("subtitle", n60.o.l(eVar, "subtitle", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar5 = new m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        w type2 = m4.f26153a.b();
        Intrinsics.checkNotNullParameter("feedSource", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        m mVar6 = new m("feedSource", type2, null, q0Var, q0Var, q0Var);
        b0 b0Var = n1.f26170a;
        List selections = f0.j(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("isProductPinFeed", n60.o.m(b0Var, "isProductPinFeed", "name", "type"), null, q0Var, q0Var, q0Var));
        f527a = selections;
        m mVar7 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("TodayArticle", "TodayArticle", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar7, new n("TodayArticle", q13, q0Var, selections));
        f528b = selections2;
        v0 type3 = d9.f25956a.c();
        Intrinsics.checkNotNullParameter("node", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        m mVar8 = new m("node", type3, null, q0Var, q0Var, selections2);
        h hVar = y0.f26457a;
        List selections3 = f0.j(mVar8, new m("cursor", ep.b.u(hVar, "cursor", "name", "type"), null, q0Var, q0Var, q0Var));
        f529c = selections3;
        w type4 = hVar.i();
        Intrinsics.checkNotNullParameter("endCursor", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        List selections4 = f0.j(new m("endCursor", type4, null, q0Var, q0Var, q0Var), new m("hasNextPage", s1.g(b0Var, "hasNextPage", "name", "type"), null, q0Var, q0Var, q0Var), new m("hasPreviousPage", n60.o.m(b0Var, "hasPreviousPage", "name", "type"), null, q0Var, q0Var, q0Var), new m("startCursor", ep.b.u(hVar, "startCursor", "name", "type"), null, q0Var, q0Var, q0Var));
        f530d = selections4;
        p type5 = o.a(i9.f26073a.b());
        Intrinsics.checkNotNullParameter("edges", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        m mVar9 = new m("edges", type5, null, q0Var, q0Var, selections3);
        r type6 = o.b(c3.f25921a.z());
        Intrinsics.checkNotNullParameter("pageInfo", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        List selections5 = f0.j(mVar9, new m("pageInfo", type6, null, q0Var, q0Var, selections4));
        f531e = selections5;
        m mVar10 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type7 = e9.f25980a.b();
        Intrinsics.checkNotNullParameter("connection", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar10, new m("connection", type7, null, q0Var, q0Var, selections5));
        f532f = selections6;
        m mVar11 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("V3RecommendedTodayArticlesDataConnectionContainer", "V3RecommendedTodayArticlesDataConnectionContainer", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar11, new n("V3RecommendedTodayArticlesDataConnectionContainer", q14, q0Var, selections6));
        f533g = selections7;
        m mVar12 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        v0 type8 = g9.f26027a.c();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type8, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        List selections8 = f0.j(mVar12, new m("data", type8, null, q0Var, q0Var, selections7));
        f534h = selections8;
        m mVar13 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        List selections9 = c.f718b;
        Intrinsics.checkNotNullParameter(selections9, "selections");
        List selections10 = f0.j(mVar13, new n("Error", possibleTypes, q0Var, selections9));
        f535i = selections10;
        m mVar14 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("V3RecommendedTodayArticles", "V3RecommendedTodayArticles", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        n nVar = new n("V3RecommendedTodayArticles", q15, q0Var, selections8);
        List possibleTypes2 = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes2, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        List selections11 = f0.j(mVar14, nVar, new n("Error", possibleTypes2, q0Var, selections10));
        f536j = selections11;
        v0 type9 = j9.f26097a.c();
        Intrinsics.checkNotNullParameter("v3RecommendedTodayArticlesQuery", "name");
        Intrinsics.checkNotNullParameter(type9, "type");
        Intrinsics.checkNotNullParameter(selections11, "selections");
        f537k = e0.b(new m("v3RecommendedTodayArticlesQuery", type9, null, q0Var, q0Var, selections11));
    }
}
