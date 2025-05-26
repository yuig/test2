package c50;

import android.content.res.Resources;
import android.graphics.Color;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class ma {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26165a;

    public /* synthetic */ ma(int i13) {
        this.f26165a = i13;
    }

    public static final void a(Resources resources, i92.k kVar, wy0 wy0Var, boolean z13) {
        int i13 = r60.h.f106328e;
        int i14 = z13 ? m60.x0.block_user_fail : m60.x0.unblock_user_fail;
        String Z2 = wy0Var.Z2();
        if (Z2 != null) {
            kVar.i(resources.getString(i14, Z2));
        }
        m60.w wVar = m60.u.f85943a;
        wVar.d(new of0.b());
        wVar.d(new jc0.q(true));
    }

    public static int b(int i13, String str) {
        List split$default;
        if (str == null) {
            return i13;
        }
        try {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
            String[] strArr = (String[]) split$default.toArray(new String[0]);
            return (strArr == null || strArr.length != 3) ? Color.parseColor(str) : Color.argb(255, Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
        } catch (Exception unused) {
            return i13;
        }
    }

    public static s80.y6 c(y80.c section, y80.d step) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(step, "step");
        String title = section.getTitle();
        String str = title == null ? "" : title;
        String title2 = step.getTitle();
        String str2 = title2 == null ? "" : title2;
        String subTitle = step.getSubTitle();
        String str3 = subTitle == null ? "" : subTitle;
        String continueButtonText = step.getContinueButtonText();
        String str4 = continueButtonText == null ? "" : continueButtonText;
        String dismissButtonText = step.getDismissButtonText();
        if (dismissButtonText == null) {
            dismissButtonText = "";
        }
        return new s80.y6(str, str2, str3, str4, dismissButtonText, section.f138031g, section.f138032h, section.f138034j, section.f138033i);
    }

    public final String e() {
        switch (this.f26165a) {
            case 1:
                return "query SearchGridUserWatcherQuery($id: ID!, $imageSpec: ImageSpec!) { node(id: $id) { __typename ... on User { __typename ...LegoUserRepFields } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment LegoUserRepFields on User { __typename id entityId explicitlyFollowedByMe followerCount fullName imageMediumUrl username isVerifiedMerchant blockedByMe isPrivateProfile verifiedIdentity { __typename ...VerifiedIdentityFragment } contextualPinImageUrls(spec: $imageSpec) { dominantColor height type url width } recentPinImages(spec: $imageSpec) { dominantColor height type url width } showCreatorProfile }";
            case 3:
                return "query SearchGridUsersQuery($query: String!, $imageSpec: ImageSpec!, $referrerSource: String!, $first: Int, $after: Cursor) { v3SearchUsersWithStoriesQuery(query: $query, rs: $referrerSource) { __typename ... on V3SearchUsersWithStories { __typename data { __typename ... on V3SearchUsersWithStoriesDataConnectionContainer { __typename connection(first: $first, after: $after) { clientTrackingParams edges { node { __typename ... on User { __typename ...LegoUserRepFields } ... on Story { __typename ...StructuredFeedStoryHeaderFields displayOptions { cornerRadius headerDisplay { headerSize subtitleAlignment subtitleStyle } } title { format } } } } modeIcon { backgroundColorHex iconType } oneBarModules { __typename ...OneBarModuleFields } oneBarFilters { __typename ...OneBarFilterFields } pageInfo { hasNextPage hasPreviousPage startCursor endCursor } searchfeedTabs { tabs { name tabType } } sensitivity { __typename ...SearchGridSensitivityFields } } } ... on Error { __typename ...CommonError } } } ... on Error { __typename ...CommonError } } }  fragment VerifiedIdentityFragment on VerifiedIdentity { __typename verified name }  fragment LegoUserRepFields on User { __typename id entityId explicitlyFollowedByMe followerCount fullName imageMediumUrl username isVerifiedMerchant blockedByMe isPrivateProfile verifiedIdentity { __typename ...VerifiedIdentityFragment } contextualPinImageUrls(spec: $imageSpec) { dominantColor height type url width } recentPinImages(spec: $imageSpec) { dominantColor height type url width } showCreatorProfile }  fragment StructuredFeedStoryFields on Story { containerType }  fragment StructuredFeedStoryHeaderFields on Story { __typename ...StructuredFeedStoryFields displayOptions { headerDisplay { textAlignment topCornerRadius } } }  fragment OneBarModuleFields on OneBarModule { action { feedUrl oneBarFilters { isSelected display { backgroundColorHex displayText icon iconUrl selectedBackgroundColorHex selectedTextColorHex textColorHex } entityId action { feedUrl } } filterType filterKeys searchParameters searchQuery title } animation display { backgroundColorHex displayText icon iconUrl selectedBackgroundColorHex selectedTextColorHex textColorHex } id moduleType }  fragment OneBarFilterFields on OneBarFilter { appliedFilterOptions { id imageUrl isSelected isVerified label numericValue rules searchType stringValue trackingParams type unit } filterComponentType label productFilterType title trackingParams requestParams { journeyDepth sourceModuleId } filterOptions { id imageUrl isSelected isVerified label numericValue rules searchType stringValue trackingParams type unit } }  fragment SearchGridSensitivityFields on Sensitivity { advisory severity notices { style title description { text textTags { length link metadata { storyPinBlockId storyPinPageId } objectId offset tagType } } footer { link text } actions { button { link text } description { text textTags { length link objectId offset tagType } } title { text textTags { length link metadata { storyPinBlockId storyPinPageId } objectId offset tagType } } } } }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 8:
                return "query DownloadIdeaPinQuery($pinId: String!) { v3DownloadIdeaPinQuery(pin: $pinId) { __typename ... on V3DownloadIdeaPin { __typename data { __typename ...DownloadVideoData } } ... on Error { __typename ...CommonError } } }  fragment DownloadVideoData on IdeaPinDownloadResponseData { videoTrackingId videoUrl }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 10:
                return "query PollDownloadIdeaPinQuery($pinId: String!, $trackingId: String!) { v3PollDownloadIdeaPinQuery(pin: $pinId, trackingId: $trackingId) { __typename ... on V3PollDownloadIdeaPin { __typename data { __typename ...DownloadVideoData } } ... on Error { __typename ...CommonError } } }  fragment DownloadVideoData on IdeaPinDownloadResponseData { videoTrackingId videoUrl }  fragment CommonError on Error { __typename error { message paramPath } }";
            case 12:
                return "query WidgetBoardPins($board: String!, $pageSize: Int!, $widgetCountForStyle: Int, $widgetStyle: String) { v3AndroidWidgetGetBoardPinsQuery(board: $board, pageSize: $pageSize, widgetCountForStyle: $widgetCountForStyle, widgetStyle: $widgetStyle) { __typename ... on V3AndroidWidgetGetBoardPins { __typename data { __typename ... on V3AndroidWidgetGetBoardPinsDataConnectionContainer { __typename connection(first: $pageSize) { edges { node { entityId imageMediumUrl } } } } } } } }";
            case 13:
                return "query WidgetHomeFeedPins($pinRequestSize: Int!, $widgetCountForStyle: Int, $widgetStyle: String) { v3AndroidWidgetGetHomefeedPinsQuery(pinRequestSize: $pinRequestSize, widgetCountForStyle: $widgetCountForStyle, widgetStyle: $widgetStyle) { __typename ... on V3AndroidWidgetGetHomefeedPins { __typename data { entityId imageMediumUrl } } } }";
            default:
                return "mutation WidgetTap($widgetContentSource: String!, $widgetName: String!, $widgetId: String) { v3WidgetTapsMutation(input: { widgetContentSource: $widgetContentSource widgetName: $widgetName widgetId: $widgetId } ) { __typename ... on BooleanResponse { data } } }";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(int i13, int i14) {
        this(0);
        this.f26165a = i13;
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
