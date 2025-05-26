package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class z4 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51707i;

    /* renamed from: j, reason: collision with root package name */
    public static final z4 f51690j = new z4(0);

    /* renamed from: k, reason: collision with root package name */
    public static final z4 f51691k = new z4(1);

    /* renamed from: l, reason: collision with root package name */
    public static final z4 f51692l = new z4(2);

    /* renamed from: m, reason: collision with root package name */
    public static final z4 f51693m = new z4(3);

    /* renamed from: n, reason: collision with root package name */
    public static final z4 f51694n = new z4(4);

    /* renamed from: o, reason: collision with root package name */
    public static final z4 f51695o = new z4(5);

    /* renamed from: p, reason: collision with root package name */
    public static final z4 f51696p = new z4(6);

    /* renamed from: q, reason: collision with root package name */
    public static final z4 f51697q = new z4(7);

    /* renamed from: r, reason: collision with root package name */
    public static final z4 f51698r = new z4(8);

    /* renamed from: s, reason: collision with root package name */
    public static final z4 f51699s = new z4(9);

    /* renamed from: t, reason: collision with root package name */
    public static final z4 f51700t = new z4(10);

    /* renamed from: u, reason: collision with root package name */
    public static final z4 f51701u = new z4(11);

    /* renamed from: v, reason: collision with root package name */
    public static final z4 f51702v = new z4(12);

    /* renamed from: w, reason: collision with root package name */
    public static final z4 f51703w = new z4(13);

    /* renamed from: x, reason: collision with root package name */
    public static final z4 f51704x = new z4(14);

    /* renamed from: y, reason: collision with root package name */
    public static final z4 f51705y = new z4(15);

    /* renamed from: z, reason: collision with root package name */
    public static final z4 f51706z = new z4(16);
    public static final z4 A = new z4(17);
    public static final z4 B = new z4(18);
    public static final z4 C = new z4(19);
    public static final z4 D = new z4(20);
    public static final z4 E = new z4(21);
    public static final z4 F = new z4(22);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(int i13) {
        super(0);
        this.f51707i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51707i) {
            case 0:
                return df.j1.u0("com.pinterest.feature.pin.PinFeatureModuleLocation", "USER_PIN_REACTIONS_LIST");
            case 1:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ACCOUNT_MANAGEMENT");
            case 2:
                return df.j1.u0("com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation", "SETTINGS_BIRTHDAY");
            case 3:
                return df.j1.u0("com.pinterest.feature.settings.SettingsProfileFeatureLocation", "SETTINGS_EDIT_PROFILE");
            case 4:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 5:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 6:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "PINCH_TO_ZOOM_FLASHLIGHT");
            case 7:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_GRID_GRAPHQL");
            case 8:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 9:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "BOARD_PICKER");
            case 10:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 11:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "CAMERA_SEARCH");
            case 12:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "COLLAGE_CANVAS_EDITOR_PAGE");
            case 13:
                return df.j1.u0("com.pinterest.collage.cutouttool.screens.CollageCutoutLocation", "COLLAGE_CUTOUT_TOOL");
            case 14:
                return df.j1.u0("com.pinterest.collage.cutouttool.screens.CollageCutoutLocation", "COLLAGE_CUTOUT_TOOL_V2");
            case 15:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "COLLAGE_TYPEAHEAD");
            case 16:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 17:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "SEARCH_TYPEAHEAD_YOURS");
            case 18:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "VIRTUAL_TRY_ON");
            case 19:
                return df.j1.u0("com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation", "WIDGET_BOARD_CONFIGURATION");
            case 20:
                return df.j1.u0("com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation", "WIDGET_BOARD_SELECTION");
            case 21:
                return df.j1.u0("com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation", "WIDGET_CONTENT_SELECTION");
            default:
                return df.j1.u0("com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation", "WIDGET_REFRESH_INTERVAL_SELECTION");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51707i) {
        }
        return b();
    }
}
