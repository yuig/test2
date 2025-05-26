package t40;

import a10.e;
import a50.c;
import a50.s;
import c50.n6;
import c50.r1;
import c50.s4;
import ep.b;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import pc.j;
import pc.m;
import pc.m0;
import pc.n;
import pc.r;
import pc.t;
import pc.v0;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f116406a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f116407b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f116408c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f116409d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f116410e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f116411f;

    static {
        e eVar = r1.f26261a;
        r s13 = b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = b.q("User", "User", "typeCondition", "possibleTypes");
        List selections = s.f780c;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new n("User", q13, q0Var, selections));
        f116406a = selections2;
        m mVar2 = new m("__typename", b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar2, new n("User", q14, q0Var, selections2));
        f116407b = selections3;
        m mVar3 = new m("__typename", b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 w13 = b.w(s4.f26288a, "data", "name", "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar3, new m("data", w13, null, q0Var, q0Var, selections3));
        f116408c = selections4;
        m mVar4 = new m("__typename", b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        List selections5 = c.f718b;
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar4, new n("Error", possibleTypes, q0Var, selections5));
        f116409d = selections6;
        m mVar5 = new m("__typename", b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = b.q("V3DeleteAddressBook", "V3DeleteAddressBook", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        n nVar = new n("V3DeleteAddressBook", q15, q0Var, selections4);
        List possibleTypes2 = f0.j("AccessDenied", "AccountCreationDisabled", "AdsOnlyProfileSearchPrivacyDeactivationAttempt", "AdvertiserEntityAuthorizationFailed", "AffiliateProgramNeedsRedirectLinkException", "AgeUpdateRequiresVerification", "AggregatedCommentNotFound", "AggregatedPinDataNotFound", "AnalyticsTopPinsRetentionPeriodError", "ApiRateLimitExceeded", "AppealAlreadySubmitted", "AudioTagNotFound", "AuthorizationFailed", "BlockedForSpam", "BoardActionBlockedByDeleteError", "BoardActionBlockedByMoveError", "BoardActionBlockedByOtherError", "BoardContentNotViewableByUserError", "BoardFollowFailure", "BoardNotFound", "BoardSectionAddPinsError", "BoardSectionConflictError", "BoardSectionCreateError", "BoardSectionNotFound", "BoardSectionsPerBoardLimitReachedError", "BoardSectionTitleExistsError", "BoardSlugIncorrectError", "BookmarkDoesNotExist", "BookmarkPageSizeExceedsMaximum", "BotEmailVerificationError", "BulkMoveFailed", "BulkMovePinsFailure", "BulkPinLimitExceeded", "BulkRepinFailed", "BusinessHubActivationCardUpdateFailed", "BusinessInSanctionedCountry", "CameraSearchUploadFailedError", "CarouselInvalidNumberOfSlotsError", "CartingAdvertiserToCartingMapException", "CartingDecryptionError", "CartingMikMakApiError", "CartingPearApiError", "CartingPinToCartingMapException", "CartingUnsupportedCountryException", "CatalogNameAlreadyExistsError", "CatalogNotFound", "CatalogProductGroupFilterCycleError", "CatalogProductGroupMaxDepthExceededError", "CategoryNotFound", "ClientError", "CollaboratorInviteNotFound", "CommentHighlightMoreThanThreeError", "CommentHighlightPermissionError", "CommentMentionNotAllowed", "CommentReactBlocked", "ContactRequestNotFound", "ConversationMessageNotFound", "ConversationNotFound", "ConversationThreadNotFound", "CsrNotFound", "CsvFeedDomainNotClaimedError", "CsvFeedFetchFailedError", "CsvFeedNotFoundError", "CsvFeedParseFailedError", "DescriptionMentionNotAllowed", "DidItDisablePermissionError", "DomainNotFound", "DomainTaggingAccessDeniedException", "DuplicateBoardName", "DuplicateBoardNameSoftDeleted", "EmailAlreadyTaken", "EmailOTPVerificationRequired", "EmailVerificationMFANotSupported", "EtsyShopDoesNotExistError", "EUMissingAgeRegisterAttempt", "ExistingOverageUserDetected", "ExistingUnderageUserDetected", "ExploreArticleNotFound", "FacebookConnectionFailure", "FacebookLinkNotFound", "FailedGetUploadCredentials", "FailedGetUploadKey", "FeedProfileNotFound", "FeedValidationLogicError", "GplusConnectionFailure", "GplusLinkNotFound", "IdeaPinCreationNotAllowedError", "IllegalBookmarkCharacter", "InstagramFeedAlreadyExistsError", "InstagramFeedNotFoundError", "InstagramFetchFeedFailedError", "InstagramInvalidAuthFeedError", "InterestNotFound", "InternalServerError", "InvalidAgeInput", "InvalidBoardName", "InvalidBoardSectionName", "InvalidCallToCreatePin", "InvalidCameraSearchRequestInputError", "InvalidCommentSticker", "InvalidEmail", "InvalidParameters", "InvalidPhoneNumber", "InvalidUploadKeySignatureError", "InvalidUsername", "InvalidVerificationAttempt", "InviteCodeNotFound", "IsSSOFailure", "KLPInterestNotFound", "LimitExceeded", "LoginRequired", "LowQualityTextAggregatedCommentError", "MerchantApiError", "MerchantDisabledFeedProfileLimitReachedError", "MerchantDisapprovedError", "MerchantFeedProfileLimitReachedError", "MerchantHasNoFeedProfile", "MerchantNotFound", "MerchantRegionIdAlreadyExistsError", "MerchantReviewNotFound", "MerchantUnderReviewError", "MessageSendFailed", "MfaConnectionError", "MfaEmailNotMatch", "MfaEmailVerificationRequired", "MfaTokenInvalid", "MfaUserNotFound", "MistypedResponse", "NameContainReservedWord", "NameContainsEmailError", "NewsNotFound", "OverageUserRegisterAttempt", "OverlappingPinTag", "PartnerCanNotSwitchToSanctionedCountry", "PasswordLengthLessThanEightChars", "PasswordScoreBelowThreshold", "PearInsightNotFound", "PinCreateContentFilterBlockException", "PinCreationNotAllowedError", "PinImageNotFound", "PinImageTooBig", "PinImageTooLarge", "PinImageTooSmall", "PinInvalidImage", "PinNotFound", "PinPromptNotFound", "PinTagNotFound", "PlaceNotFound", "ProductGroupFiltersAlreadyExistsError", "ProductGroupNameAlreadyExistsError", "ProductGroupNotFoundError", "ProductGroupSourceIdAlreadyExistsError", "ProductGroupUnfeatureableError", "ProductGroupValidationError", "ProductNotFoundAtURLException", "QuizNotFound", "RegionDeletionValidationFailedError", "RegionNameAlreadyExistsError", "RegionNotFound", "RepinFailure", "RepinFailureBlocked", "RepinFailureBlocking", "RepinHotKeyBlockedError", "ReporterBlockedFromReportsAndAppealsError", "RssFeedAlreadyExistsError", "RssFeedDomainNotClaimedError", "RssFeedFetchFailedError", "RssFeedNotFoundError", "RssFeedUnknownFormatError", "ScheduledPinCreateIncorrectTimestamp", "ScheduledPinCreateReachMaximumNumberLimit", "ScheduledPinCreateStoryPinDataNotFoundError", "ScheduledPinCreationError", "ScheduledPinInvalidModelTypeError", "ScheduledPinNotFound", "ScheduledPinPermissionError", "ScheduledPinUpdateError", "ShuffleAssetNotFound", "ShuffleNotFound", "SocialNetworkAccountAlreadyLinked", "SocialNetworkInvalidAccessToken", "StoryPinAlreadyPublishedError", "StoryPinAspectRatioBeyondRangeError", "StoryPinCreateFeedbackError", "StoryPinCreateMaxDraftsError", "StoryPinCreationBoardPermissionError", "StoryPinCreationCreatePinPermissionError", "StoryPinCreationDataAndDraftError", "StoryPinCreationError", "StoryPinCreationLimitExceededError", "StoryPinCreationNotAllowedError", "StoryPinCTCError", "StoryPinDraftNotFoundError", "StoryPinImageMetadataError", "StoryPinLinkInvalidContentError", "StoryPinLinkInvalidDomError", "StoryPinLinkInvalidRegexError", "StoryPinLinkMaxLenExceededError", "StoryPinLinkPinterestMainSiteError", "StoryPinModelValidationError", "StoryPinNotFound", "StoryPinPopMusicNonUSUserError", "StoryPinPopularMusicHasPromotedContentError", "StoryPinV1CreationNotAllowedException", "StoryPinValidationError", "SubjectAccessRequestFailed", "SubjectAccessRequestIncorrectUser", "SubjectAccessRequestMissingEmail", "SubjectAccessRequestRequestedTooSoon", "SubjectAccessRequestUnverifiedEmail", "SupplementalFeedProfileNotFound", "SupplementalItemSegmentIdAlreadyExistsError", "SupplementalItemSegmentMaxLimitReachedError", "SupplementalItemSegmentNameAlreadyExistsError", "TiktokFeedAlreadyExistsError", "TiktokFeedNotFoundError", "TodayArticleNotFound", "UnderageUserRegisterAttempt", "UnderageUserRegisterBusinessAttempt", "UnifiedCommentFeedActionNotAllowed", "UnsafeTextAggregatedCommentError", "UnsupportedBoardTemplateError", "UpgradeRequired", "UserAlreadyExists", "UserDidItDataNotFound", "UserFollowFailure", "UserFollowFailureBlocked", "UserFollowFailureBlocking", "UserHasLinkedBusinessAccountError", "UserInSanctionedCountry", "UsernameAlreadyTaken", "UsernameSuggestionLogicFailed", "UserNotFound", "UserParentalControlPasscodeRequired", "UserParentalControlPasscodeWrong", "UserParentalControlSkipConfirmationRequired", "ValidationError", "VerificationAttemptsExceeded", "VerificationNotFoundOrExpired", "VirtualTryOnNoMetadataFoundError");
        Intrinsics.checkNotNullParameter("Error", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes2, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar5, nVar, new n("Error", possibleTypes2, q0Var, selections6));
        f116410e = selections7;
        v0 type = n6.f26180a.c();
        Intrinsics.checkNotNullParameter("v3DeleteAddressBookMutation", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Map b13 = y0.b(new Pair("deviceId", new t("deviceId")));
        Intrinsics.checkNotNullParameter("input", "name");
        List arguments = e0.b(new j("input", b13, false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        f116411f = e0.b(new m("v3DeleteAddressBookMutation", type, null, q0Var, arguments, selections7));
    }
}
