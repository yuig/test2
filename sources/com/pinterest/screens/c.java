package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50601i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f50584j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f50585k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f50586l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f50587m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f50588n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f50589o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f50590p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f50591q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f50592r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f50593s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f50594t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f50595u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f50596v = new c(12);

    /* renamed from: w, reason: collision with root package name */
    public static final c f50597w = new c(13);

    /* renamed from: x, reason: collision with root package name */
    public static final c f50598x = new c(14);

    /* renamed from: y, reason: collision with root package name */
    public static final c f50599y = new c(15);

    /* renamed from: z, reason: collision with root package name */
    public static final c f50600z = new c(16);
    public static final c A = new c(17);
    public static final c B = new c(18);
    public static final c C = new c(19);
    public static final c D = new c(20);
    public static final c E = new c(21);
    public static final c F = new c(22);
    public static final c G = new c(23);
    public static final c H = new c(24);
    public static final c I = new c(25);

    /* renamed from: J, reason: collision with root package name */
    public static final c f50583J = new c(26);
    public static final c K = new c(27);
    public static final c L = new c(28);
    public static final c M = new c(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(0);
        this.f50601i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f50601i) {
            case 0:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 1:
                return df.j1.u0("com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation", "QCM_CLOSEUP_DRAWER_FRAGMENT");
            case 2:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 3:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 4:
                return df.j1.u0("com.pinterest.feature.video.model.VideoFeatureLocation", "FULL_SCREEN_VIDEO");
            case 5:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 6:
                return df.j1.u0("com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation", "SETTINGS_COUNTRY");
            case 7:
                return df.j1.u0("com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation", "SETTINGS_PERSONAL_INFORMATION");
            case 8:
                return df.j1.u0("com.pinterest.feature.settings.privacydata.SettingsPrivacyDataFeatureLocation", "SETTINGS_PRIVACY_DATA");
            case 9:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
            case 10:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "VIRTUAL_TRY_ON");
            case 11:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_EMOJI");
            case 12:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_FINAL_MESSAGE");
            case 13:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_LIKE");
            case 14:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_MULTIPLE");
            case 15:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_SCALE");
            case 16:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_SINGLE");
            case 17:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_START_MESSAGE");
            case 18:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_TEXT");
            case 19:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_VERTICAL_SCALE");
            case 20:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_VIEW");
            case 21:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 22:
                return df.j1.u0("com.pinterest.schoolTeenPrompt.SchoolTeenPromptLocation", "SCHOOL_TEEN_PROMPT");
            case 23:
                return df.j1.u0("com.pinterest.feature.bubbles.screen.BubbleFeatureLocation", "BUBBLE_CONTENT");
            case 24:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 25:
                return df.j1.u0("com.pinterest.feature.bubbles.screen.BubbleFeatureLocation", "BUBBLE_CONTENT");
            case 26:
                return df.j1.u0("com.pinterest.autoOrganize.screens.AutoOrganizeLocation", "REFINE_YOUR_BOARD");
            case 27:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "AUTO_ORG_MOVE_BOARD_PICKER");
            case 28:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "PROFILE_UNORGANIZED_PINS_BOARD_CREATE");
            default:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f50601i) {
        }
        return b();
    }
}
