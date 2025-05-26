package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class l3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51085i;

    /* renamed from: j, reason: collision with root package name */
    public static final l3 f51068j = new l3(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l3 f51069k = new l3(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l3 f51070l = new l3(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l3 f51071m = new l3(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l3 f51072n = new l3(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l3 f51073o = new l3(5);

    /* renamed from: p, reason: collision with root package name */
    public static final l3 f51074p = new l3(6);

    /* renamed from: q, reason: collision with root package name */
    public static final l3 f51075q = new l3(7);

    /* renamed from: r, reason: collision with root package name */
    public static final l3 f51076r = new l3(8);

    /* renamed from: s, reason: collision with root package name */
    public static final l3 f51077s = new l3(9);

    /* renamed from: t, reason: collision with root package name */
    public static final l3 f51078t = new l3(10);

    /* renamed from: u, reason: collision with root package name */
    public static final l3 f51079u = new l3(11);

    /* renamed from: v, reason: collision with root package name */
    public static final l3 f51080v = new l3(12);

    /* renamed from: w, reason: collision with root package name */
    public static final l3 f51081w = new l3(13);

    /* renamed from: x, reason: collision with root package name */
    public static final l3 f51082x = new l3(14);

    /* renamed from: y, reason: collision with root package name */
    public static final l3 f51083y = new l3(15);

    /* renamed from: z, reason: collision with root package name */
    public static final l3 f51084z = new l3(16);
    public static final l3 A = new l3(17);
    public static final l3 B = new l3(18);
    public static final l3 C = new l3(19);
    public static final l3 D = new l3(20);
    public static final l3 E = new l3(21);
    public static final l3 F = new l3(22);
    public static final l3 G = new l3(23);
    public static final l3 H = new l3(24);
    public static final l3 I = new l3(25);

    /* renamed from: J, reason: collision with root package name */
    public static final l3 f51067J = new l3(26);
    public static final l3 K = new l3(27);
    public static final l3 L = new l3(28);
    public static final l3 M = new l3(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(int i13) {
        super(0);
        this.f51085i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51085i) {
            case 0:
                return df.j1.u0("com.pinterest.feature.board.create.BoardCreateFeatureLocation", "BOARD_CREATE_FRAGMENT");
            case 1:
                return df.j1.u0("com.pinterest.feature.board.create.BoardCreateFeatureLocation", "BOARD_CREATE_SHEET_FRAGMENT");
            case 2:
                return df.j1.u0("com.pinterest.feature.board.edit.BoardEditFeatureLocation", "BOARD_EDIT_FRAGMENT");
            case 3:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "BOARD_PICKER");
            case 4:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION");
            case 5:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION_CREATE");
            case 6:
                return df.j1.u0("com.pinterest.collage.draftpicker.screens.CollageDraftPickerLocation", "COLLAGE_DRAFT_PICKER");
            case 7:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "MOVE_PINS_SECTION_PICKER");
            case 8:
                return df.j1.u0("com.pinterest.screens.PinItFeatureLocation", "PIN_MARKLET");
            case 9:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "PROFILE_UNORGANIZED_PINS_BOARD_CREATE");
            case 10:
                return df.j1.u0("com.pinterest.autoOrganize.screens.AutoOrganizeLocation", "REFINE_YOUR_BOARD");
            case 11:
                return df.j1.u0("com.pinterest.feature.shopping.ShoppingFeatureLocation", "RELATED_MODULE_FEED");
            case 12:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "REPIN_SECTION_PICKER");
            case 13:
                return df.j1.u0("com.pinterest.feature.scheduledpins.screen.ScheduledPinsLocation", "SCHEDULED_PIN_FEED");
            case 14:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_CLAIM_REDESIGN");
            case 15:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
            case 16:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 17:
                return df.j1.u0("com.pinterest.feature.board.create.BoardCreateFeatureLocation", "BOARD_CREATE_FRAGMENT");
            case 18:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "BOARD_PICKER");
            case 19:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 20:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_PRIMARY_REASONS");
            case 21:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_INBOX");
            case 22:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NOTIFICATIONS");
            case 23:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_REPORT_PIN");
            case 24:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_SECONDARY_REASONS");
            case 25:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_SENSITIVITY_NOTICE");
            case 26:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "SETTINGS_REPORTS_AND_VIOLATIONS");
            case 27:
                return df.j1.u0("com.pinterest.feature.pin.PinFeatureModuleLocation", "PIN_EDIT_PIN");
            case 28:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "CAMERA_SEARCH");
            default:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN_PAGER");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51085i) {
        }
        return b();
    }
}
