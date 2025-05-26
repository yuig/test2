package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51538i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f51521j = new x(0);

    /* renamed from: k, reason: collision with root package name */
    public static final x f51522k = new x(1);

    /* renamed from: l, reason: collision with root package name */
    public static final x f51523l = new x(2);

    /* renamed from: m, reason: collision with root package name */
    public static final x f51524m = new x(3);

    /* renamed from: n, reason: collision with root package name */
    public static final x f51525n = new x(4);

    /* renamed from: o, reason: collision with root package name */
    public static final x f51526o = new x(5);

    /* renamed from: p, reason: collision with root package name */
    public static final x f51527p = new x(6);

    /* renamed from: q, reason: collision with root package name */
    public static final x f51528q = new x(7);

    /* renamed from: r, reason: collision with root package name */
    public static final x f51529r = new x(8);

    /* renamed from: s, reason: collision with root package name */
    public static final x f51530s = new x(9);

    /* renamed from: t, reason: collision with root package name */
    public static final x f51531t = new x(10);

    /* renamed from: u, reason: collision with root package name */
    public static final x f51532u = new x(11);

    /* renamed from: v, reason: collision with root package name */
    public static final x f51533v = new x(12);

    /* renamed from: w, reason: collision with root package name */
    public static final x f51534w = new x(13);

    /* renamed from: x, reason: collision with root package name */
    public static final x f51535x = new x(14);

    /* renamed from: y, reason: collision with root package name */
    public static final x f51536y = new x(15);

    /* renamed from: z, reason: collision with root package name */
    public static final x f51537z = new x(16);
    public static final x A = new x(17);
    public static final x B = new x(18);
    public static final x C = new x(19);
    public static final x D = new x(20);
    public static final x E = new x(21);
    public static final x F = new x(22);
    public static final x G = new x(23);
    public static final x H = new x(24);
    public static final x I = new x(25);

    /* renamed from: J, reason: collision with root package name */
    public static final x f51520J = new x(26);
    public static final x K = new x(27);
    public static final x L = new x(28);
    public static final x M = new x(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i13) {
        super(0);
        this.f51538i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51538i) {
            case 0:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "BOARD_PICKER");
            case 1:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION");
            case 2:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION_CREATE");
            case 3:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION_EDIT");
            case 4:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "BOARD_SECTION_MERGE_SECTION_PICKER");
            case 5:
                return df.j1.u0("com.pinterest.feature.board.BoardFeatureLocation", "BOARD_SECTION_MORE_IDEAS_TOOL");
            case 6:
                return df.j1.u0("com.pinterest.feature.boardsection.BoardSectionFeatureLocation", "CREATE_BOARD_SECTION_SELECT_PINS");
            case 7:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 8:
                return df.j1.u0("com.pinterest.feature.pin.RepinFeatureLocation", "REPIN_SECTION_PICKER");
            case 9:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 10:
                return df.j1.u0("com.pinterest.feature.bubbles.screen.BubbleFeatureLocation", "BUBBLE_CONTENT");
            case 11:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 12:
                return df.j1.u0("com.pinterest.feature.bubbles.screen.BubbleFeatureLocation", "BUBBLE_CONTENT");
            case 13:
                return df.j1.u0("com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation", "SEARCH_RESULTS");
            case 14:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "ALL_PINS");
            case 15:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 16:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "COMMENTS_MODAL");
            case 17:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "NEW_COMMENT_HALF_SHEET");
            case 18:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_REWARD");
            case 19:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_SELECTION");
            case 20:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
            case 21:
                return df.j1.u0("com.pinterest.collage.cutouttool.screens.CollageCutoutLocation", "COLLAGE_CUTOUT_TOOL");
            case 22:
                return df.j1.u0("com.pinterest.collage.cutouttool.screens.CollageCutoutLocation", "COLLAGE_CUTOUT_TOOL_V2");
            case 23:
                return df.j1.u0("com.pinterest.canvas.screen.CanvasLocation", "IMAGE_VISUALIZATION");
            case 24:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "PINCH_TO_ZOOM_FLASHLIGHT");
            case 25:
                return df.j1.u0("com.pinterest.ads.screen.AdsLocation", "ADS_SHOPPING");
            case 26:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 27:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "COMMENTS_MODAL");
            case 28:
                return df.j1.u0("com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation", "IDEA_PIN_LIST_BOTTOM_SHEET");
            default:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "NEW_COMMENT_HALF_SHEET");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51538i) {
        }
        return b();
    }
}
