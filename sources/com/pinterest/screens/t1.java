package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51391i;

    /* renamed from: j, reason: collision with root package name */
    public static final t1 f51374j = new t1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t1 f51375k = new t1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final t1 f51376l = new t1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final t1 f51377m = new t1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final t1 f51378n = new t1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final t1 f51379o = new t1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final t1 f51380p = new t1(6);

    /* renamed from: q, reason: collision with root package name */
    public static final t1 f51381q = new t1(7);

    /* renamed from: r, reason: collision with root package name */
    public static final t1 f51382r = new t1(8);

    /* renamed from: s, reason: collision with root package name */
    public static final t1 f51383s = new t1(9);

    /* renamed from: t, reason: collision with root package name */
    public static final t1 f51384t = new t1(10);

    /* renamed from: u, reason: collision with root package name */
    public static final t1 f51385u = new t1(11);

    /* renamed from: v, reason: collision with root package name */
    public static final t1 f51386v = new t1(12);

    /* renamed from: w, reason: collision with root package name */
    public static final t1 f51387w = new t1(13);

    /* renamed from: x, reason: collision with root package name */
    public static final t1 f51388x = new t1(14);

    /* renamed from: y, reason: collision with root package name */
    public static final t1 f51389y = new t1(15);

    /* renamed from: z, reason: collision with root package name */
    public static final t1 f51390z = new t1(16);
    public static final t1 A = new t1(17);
    public static final t1 B = new t1(18);
    public static final t1 C = new t1(19);
    public static final t1 D = new t1(20);
    public static final t1 E = new t1(21);
    public static final t1 F = new t1(22);
    public static final t1 G = new t1(23);
    public static final t1 H = new t1(24);
    public static final t1 I = new t1(25);

    /* renamed from: J, reason: collision with root package name */
    public static final t1 f51373J = new t1(26);
    public static final t1 K = new t1(27);
    public static final t1 L = new t1(28);
    public static final t1 M = new t1(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i13) {
        super(0);
        this.f51391i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51391i) {
            case 0:
                return df.j1.u0("com.pinterest.feature.bubbles.screen.BubbleFeatureLocation", "BUBBLE_CONTENT");
            case 1:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "CAMERA_SEARCH");
            case 2:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "COLLAGE_TYPEAHEAD");
            case 3:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "COMMENTS_MODAL");
            case 4:
                return df.j1.u0("com.pinterest.pinalyticsPlayground.screens.PinalyticsPlaygroundLocation", "CONTEXT_LOG_DETAILS");
            case 5:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION");
            case 6:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_SEND_A_PIN_TAB_HOST");
            case 7:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_SETTINGS");
            case 8:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_THREAD");
            case 9:
                return df.j1.u0("com.pinterest.feature.announcementmodal.location.AnnouncementModalFeatureLocation", "CREATOR_ANNOUNCEMENT_MODAL");
            case 10:
                return df.j1.u0("com.pinterest.creatorHub.feature.screen.CreatorHubHubLocation", "CREATOR_HUB_PAGER");
            case 11:
                return df.j1.u0("com.pinterest.feature.creator.savedboards.CreatorHubSavedBoardsLocation", "CREATOR_SAVED_BOARDS");
            case 12:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "DEFAULT_BROWSER");
            case 13:
                return df.j1.u0("com.pinterest.feature.homefeed.navigation.HomeFeedLocation", "HOME");
            case 14:
                return df.j1.u0("com.pinterest.feature.homefeed.navigation.HomeFeedLocation", "HOME_TAB");
            case 15:
                return df.j1.u0("com.pinterest.activity.interest.model.InterestFeatureLocation", "INTEREST");
            case 16:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NEWS_HUB");
            case 17:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NOTIFICATIONS");
            case 18:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NOTIFICATIONS_HOST");
            case 19:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 20:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_REWARD");
            case 21:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN_PAGER");
            case 22:
                return df.j1.u0("com.pinterest.adPreview.screen.AdPreviewLocation", "PROMOTED_PIN_PREVIEW");
            case 23:
                return df.j1.u0("com.pinterest.recoveryv2p.RecoveryScreenLocation", "RECOVERY_FB_ACCOUNT");
            case 24:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_PRIMARY_REASONS");
            case 25:
                return df.j1.u0("com.pinterest.searchLanding.framework.screens.SearchLandingFeatureLocation", "SEARCH_LANDING");
            case 26:
                return df.j1.u0("com.pinterest.adPreview.screen.AdPreviewLocation", "SEARCH_LANDING_AD_PREVIEW");
            case 27:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 28:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "SEARCH_TYPEAHEAD_PRODUCTS");
            default:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "SEARCH_TYPEAHEAD_TOP");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51391i) {
        }
        return b();
    }
}
