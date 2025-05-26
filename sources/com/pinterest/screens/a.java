package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50489i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f50472j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f50473k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f50474l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f50475m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f50476n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f50477o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f50478p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f50479q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f50480r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f50481s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f50482t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f50483u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f50484v = new a(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a f50485w = new a(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a f50486x = new a(14);

    /* renamed from: y, reason: collision with root package name */
    public static final a f50487y = new a(15);

    /* renamed from: z, reason: collision with root package name */
    public static final a f50488z = new a(16);
    public static final a A = new a(17);
    public static final a B = new a(18);
    public static final a C = new a(19);
    public static final a D = new a(20);
    public static final a E = new a(21);
    public static final a F = new a(22);
    public static final a G = new a(23);
    public static final a H = new a(24);
    public static final a I = new a(25);

    /* renamed from: J, reason: collision with root package name */
    public static final a f50471J = new a(26);
    public static final a K = new a(27);
    public static final a L = new a(28);
    public static final a M = new a(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f50489i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f50489i) {
            case 0:
                return df.j1.u0("com.pinterest.ads.screen.AdsLocation", "ADS_CORE");
            case 1:
                return df.j1.u0("com.pinterest.partnerAnalytics.PartnerAnalyticsLocation", "ANALYTICS_OVERVIEW");
            case 2:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 3:
                return df.j1.u0("com.pinterest.feature.board.edit.BoardEditFeatureLocation", "BOARD_EDIT_FRAGMENT");
            case 4:
                return df.j1.u0("com.pinterest.feature.board.organize.BoardOrganizeFeatureLocation", "BOARD_ORGANIZE_FRAGMENT");
            case 5:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "BOARD_PICKER");
            case 6:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 7:
                return df.j1.u0("com.pinterest.feature.creator.model.CreatorFeatureLocation", "BUSINESS_ONBOARDING");
            case 8:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "CAMERA_SEARCH");
            case 9:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "COMMENTS_MODAL");
            case 10:
                return df.j1.u0("com.pinterest.feature.homefeed.navigation.HomeFeedLocation", "HOME");
            case 11:
                return df.j1.u0("com.pinterest.partnerAnalytics.PartnerAnalyticsLocation", "HOME_ANALYTICS");
            case 12:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "NEW_COMMENT_HALF_SHEET");
            case 13:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 14:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_REWARD");
            case 15:
                return df.j1.u0("com.pinterest.recoveryv2p.RecoveryScreenLocation", "RECOVERY_FB_ACCOUNT");
            case 16:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 17:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "SEARCH_TYPEAHEAD_TOP");
            case 18:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ACCOUNT_MANAGEMENT");
            case 19:
                return df.j1.u0("com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation", "SETTINGS_BIRTHDAY");
            case 20:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_CLAIM_REDESIGN");
            case 21:
                return df.j1.u0("com.pinterest.feature.settings.SettingsProfileFeatureLocation", "SETTINGS_EDIT_PROFILE");
            case 22:
                return df.j1.u0("com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation", "SETTINGS_MAIN");
            case 23:
                return df.j1.u0("com.pinterest.feature.settings.privacydata.SettingsPrivacyDataFeatureLocation", "SETTINGS_PRIVACY_DATA");
            case 24:
                return df.j1.u0("com.pinterest.identity.account.AccountLocation", "UNLINK_ACCOUNT_CONFIRMATION");
            case 25:
                return df.j1.u0("com.pinterest.feature.settings.SettingsUnlinkBAFeatureLocation", "UNLINK_BA_EXPIRED_LINK_MODAL");
            case 26:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
            case 27:
                return df.j1.u0("com.pinterest.feature.homefeed.navigation.HomeFeedLocation", "HOME");
            case 28:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NOTIFICATIONS_HOST");
            default:
                return df.j1.u0("com.pinterest.searchLanding.framework.screens.SearchLandingFeatureLocation", "SEARCH_LANDING");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f50489i) {
        }
        return b();
    }
}
