package f40;

import bz.h;
import c50.p7;
import c50.q1;
import c50.q7;
import c50.r;
import c50.r1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.m0;
import pc.n;
import pc.v0;
import pc.w;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f61052a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f61053b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f61054c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f61055d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f61056e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f61057f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f61058g;

    static {
        h hVar = q1.f26239a;
        w u13 = ep.b.u(hVar, "messages", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new m("messages", u13, null, q0Var, q0Var, q0Var), new m("newsHub", ep.b.u(hVar, "newsHub", "name", "type"), null, q0Var, q0Var, q0Var));
        f61052a = selections;
        a10.e eVar = r1.f26261a;
        m mVar = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar2 = new m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type = r.f26257a.d();
        Intrinsics.checkNotNullParameter("badgeCounts", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, mVar2, new m("badgeCounts", type, null, q0Var, q0Var, selections));
        f61053b = selections2;
        m mVar3 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar3, new n("User", q13, q0Var, selections2));
        f61054c = selections3;
        m mVar4 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        v0 type2 = p7.f26229a.b();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar4, new m("data", type2, null, q0Var, q0Var, selections3));
        f61055d = selections4;
        m mVar5 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        List selections5 = a50.c.f718b;
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar5, new n("Error", possibleTypes, q0Var, selections5));
        f61056e = selections6;
        m mVar6 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("V3GetCurrentUserHandler", "V3GetCurrentUserHandler", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        n nVar = new n("V3GetCurrentUserHandler", q14, q0Var, selections4);
        List possibleTypes2 = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes2, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar6, nVar, new n("Error", possibleTypes2, q0Var, selections6));
        f61057f = selections7;
        v0 type3 = q7.f26251a.A();
        Intrinsics.checkNotNullParameter("v3GetCurrentUserHandlerQuery", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        f61058g = e0.b(new m("v3GetCurrentUserHandlerQuery", type3, null, q0Var, q0Var, selections7));
    }
}
