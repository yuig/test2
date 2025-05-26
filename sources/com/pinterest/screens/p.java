package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51193i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f51176j = new p(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p f51177k = new p(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p f51178l = new p(2);

    /* renamed from: m, reason: collision with root package name */
    public static final p f51179m = new p(3);

    /* renamed from: n, reason: collision with root package name */
    public static final p f51180n = new p(4);

    /* renamed from: o, reason: collision with root package name */
    public static final p f51181o = new p(5);

    /* renamed from: p, reason: collision with root package name */
    public static final p f51182p = new p(6);

    /* renamed from: q, reason: collision with root package name */
    public static final p f51183q = new p(7);

    /* renamed from: r, reason: collision with root package name */
    public static final p f51184r = new p(8);

    /* renamed from: s, reason: collision with root package name */
    public static final p f51185s = new p(9);

    /* renamed from: t, reason: collision with root package name */
    public static final p f51186t = new p(10);

    /* renamed from: u, reason: collision with root package name */
    public static final p f51187u = new p(11);

    /* renamed from: v, reason: collision with root package name */
    public static final p f51188v = new p(12);

    /* renamed from: w, reason: collision with root package name */
    public static final p f51189w = new p(13);

    /* renamed from: x, reason: collision with root package name */
    public static final p f51190x = new p(14);

    /* renamed from: y, reason: collision with root package name */
    public static final p f51191y = new p(15);

    /* renamed from: z, reason: collision with root package name */
    public static final p f51192z = new p(16);
    public static final p A = new p(17);
    public static final p B = new p(18);
    public static final p C = new p(19);
    public static final p D = new p(20);
    public static final p E = new p(21);
    public static final p F = new p(22);
    public static final p G = new p(23);
    public static final p H = new p(24);
    public static final p I = new p(25);

    /* renamed from: J, reason: collision with root package name */
    public static final p f51175J = new p(26);
    public static final p K = new p(27);
    public static final p L = new p(28);
    public static final p M = new p(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(0);
        this.f51193i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51193i) {
            case 0:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_PRIMARY_REASONS");
            case 1:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
            case 2:
                return df.j1.u0("com.pinterest.feature.board.edit.BoardEditFeatureLocation", "BOARD_EDIT_FRAGMENT");
            case 3:
                return df.j1.u0("com.pinterest.feature.board.edit.BoardEditFeatureLocation", "BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT");
            case 4:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 5:
                return df.j1.u0("com.pinterest.feature.board.edit.BoardEditFeatureLocation", "BOARD_EDIT_FRAGMENT");
            case 6:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "AUTOMAGICAL_BOARD");
            case 7:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 8:
                return df.j1.u0("com.pinterest.boardAutoCollages.BoardAutoCollagesLocation", "BOARD_AUTO_COLLAGES");
            case 9:
                return df.j1.u0("com.pinterest.feature.board.create.BoardCreateFeatureLocation", "BOARD_CREATE_FRAGMENT");
            case 10:
                return df.j1.u0("com.pinterest.feature.board.edit.BoardEditFeatureLocation", "BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT");
            case 11:
                return df.j1.u0("com.pinterest.feature.board.BoardFeatureLocation", "BOARD_MORE_IDEAS_BOTTOM_SHEET");
            case 12:
                return df.j1.u0("com.pinterest.feature.board.BoardFeatureLocation", "BOARD_MORE_IDEAS_TAB");
            case 13:
                return df.j1.u0("com.pinterest.feature.board.BoardFeatureLocation", "BOARD_MORE_IDEAS_TOOL");
            case 14:
                return df.j1.u0("com.pinterest.feature.board.organize.BoardOrganizeFeatureLocation", "BOARD_ORGANIZE_FRAGMENT");
            case 15:
                return df.j1.u0("com.pinterest.feature.board.permissions.BoardPermissionsFeatureLocation", "BOARD_PERMISSIONS_SETTING");
            case 16:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION");
            case 17:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION_CREATE");
            case 18:
                return df.j1.u0("com.pinterest.feature.board.BoardFeatureLocation", "BOARD_SECTION_MORE_IDEAS_TOOL");
            case 19:
                return df.j1.u0("com.pinterest.boardShopTool.BoardShopToolLocation", "BOARD_SHOP_TOOL");
            case 20:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "CAMERA_SEARCH");
            case 21:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "MOVE_PINS_SECTION_PICKER");
            case 22:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "AUTOMAGICAL_BOARD");
            case 23:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 24:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD_LANDING");
            case 25:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 26:
                return df.j1.u0("com.pinterest.feature.board.organize.BoardOrganizeFeatureLocation", "BOARD_ORGANIZE_FRAGMENT");
            case 27:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION_CREATE");
            case 28:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            default:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51193i) {
        }
        return b();
    }
}
