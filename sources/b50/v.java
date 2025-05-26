package b50;

import c50.f7;
import c50.g5;
import c50.i5;
import c50.j5;
import c50.n0;
import c50.r1;
import c50.s4;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.v0;

/* loaded from: classes5.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21962a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f21963b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f21964c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f21965d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f21966e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f21967f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f21968g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f21969h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f21970i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f21971j;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections = a50.q.f773b;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = kotlin.collections.f0.j(mVar, new pc.n("User", q13, q0Var, selections));
        f21962a = selections2;
        m0 w13 = ep.b.w(s4.f26288a, "node", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = kotlin.collections.e0.b(new pc.m("node", w13, null, q0Var, q0Var, selections2));
        f21963b = selections3;
        pc.p type = pc.o.a(j5.f26089a.z());
        Intrinsics.checkNotNullParameter("edges", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = kotlin.collections.e0.b(new pc.m("edges", type, null, q0Var, q0Var, selections3));
        f21964c = selections4;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 w14 = ep.b.w(g5.f26019a, "connection", "name", "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        List selections5 = kotlin.collections.f0.j(mVar2, new pc.m("connection", w14, null, q0Var, q0Var, selections4));
        f21965d = selections5;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("UserUsersConnectionContainer", "UserUsersConnectionContainer", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = kotlin.collections.f0.j(mVar3, new pc.n("UserUsersConnectionContainer", q14, q0Var, selections5));
        f21966e = selections6;
        v0 type2 = i5.f26065a.b();
        Intrinsics.checkNotNullParameter("users", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = kotlin.collections.e0.b(new pc.m("users", type2, null, q0Var, q0Var, selections6));
        f21967f = selections7;
        m0 type3 = n0.f26168a.j();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        List selections8 = kotlin.collections.e0.b(new pc.m("data", type3, null, q0Var, q0Var, selections7));
        f21968g = selections8;
        pc.m mVar4 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = kotlin.collections.f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        List selections9 = a50.c.f718b;
        Intrinsics.checkNotNullParameter(selections9, "selections");
        List selections10 = kotlin.collections.f0.j(mVar4, new pc.n("Error", possibleTypes, q0Var, selections9));
        f21969h = selections10;
        pc.m mVar5 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("ConversationResponse", "ConversationResponse", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        pc.n nVar = new pc.n("ConversationResponse", q15, q0Var, selections8);
        List possibleTypes2 = kotlin.collections.f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes2, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        List selections11 = kotlin.collections.f0.j(mVar5, nVar, new pc.n("Error", possibleTypes2, q0Var, selections10));
        f21970i = selections11;
        v0 type4 = f7.f26000a.c();
        Intrinsics.checkNotNullParameter("v3GetConversationQuery", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        List r13 = ep.b.r("conversation", ep.b.t("conversationId", "conversation", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections11, "selections");
        f21971j = kotlin.collections.e0.b(new pc.m("v3GetConversationQuery", type4, null, q0Var, r13, selections11));
    }
}
