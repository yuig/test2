package s80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class j implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final l62.a f111592a;

    /* renamed from: b, reason: collision with root package name */
    public final w80.x1 f111593b;

    /* renamed from: c, reason: collision with root package name */
    public final w80.b f111594c;

    /* renamed from: d, reason: collision with root package name */
    public final h f111595d;

    /* renamed from: e, reason: collision with root package name */
    public final t6 f111596e;

    /* renamed from: f, reason: collision with root package name */
    public final w80.d1 f111597f;

    /* renamed from: g, reason: collision with root package name */
    public final z6 f111598g;

    /* renamed from: h, reason: collision with root package name */
    public final f7 f111599h;

    /* renamed from: i, reason: collision with root package name */
    public final v6 f111600i;

    /* renamed from: j, reason: collision with root package name */
    public final w6 f111601j;

    /* renamed from: k, reason: collision with root package name */
    public final zy.a0 f111602k;

    /* renamed from: l, reason: collision with root package name */
    public final o7 f111603l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f111604m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f111605n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f111606o;

    /* renamed from: p, reason: collision with root package name */
    public final i f111607p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f111608q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f111609r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f111610s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f111611t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f111612u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f111613v;

    public j(l62.a composerModel, w80.x1 topBarState, w80.b bottomBarState, h canvasState, t6 colorPickerState, w80.d1 dragBarState, z6 onboardingState, f7 progressOverlayDisplayState, v6 drawingToolState, w6 emptyStateCarouselState, zy.a0 pinalyticsState, o7 toolbarMode, boolean z13, boolean z14, boolean z15, i clipboardPopupState, boolean z16) {
        Intrinsics.checkNotNullParameter(composerModel, "composerModel");
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(canvasState, "canvasState");
        Intrinsics.checkNotNullParameter(colorPickerState, "colorPickerState");
        Intrinsics.checkNotNullParameter(dragBarState, "dragBarState");
        Intrinsics.checkNotNullParameter(onboardingState, "onboardingState");
        Intrinsics.checkNotNullParameter(progressOverlayDisplayState, "progressOverlayDisplayState");
        Intrinsics.checkNotNullParameter(drawingToolState, "drawingToolState");
        Intrinsics.checkNotNullParameter(emptyStateCarouselState, "emptyStateCarouselState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(toolbarMode, "toolbarMode");
        Intrinsics.checkNotNullParameter(clipboardPopupState, "clipboardPopupState");
        this.f111592a = composerModel;
        this.f111593b = topBarState;
        this.f111594c = bottomBarState;
        this.f111595d = canvasState;
        this.f111596e = colorPickerState;
        this.f111597f = dragBarState;
        this.f111598g = onboardingState;
        this.f111599h = progressOverlayDisplayState;
        this.f111600i = drawingToolState;
        this.f111601j = emptyStateCarouselState;
        this.f111602k = pinalyticsState;
        this.f111603l = toolbarMode;
        this.f111604m = z13;
        this.f111605n = z14;
        this.f111606o = z15;
        this.f111607p = clipboardPopupState;
        this.f111608q = z16;
        boolean z17 = topBarState.f128426g;
        this.f111609r = z17 && bottomBarState.f128258f;
        this.f111610s = (toolbarMode instanceof n7) && z17;
        this.f111611t = (toolbarMode instanceof n7) && bottomBarState.f128258f;
        this.f111612u = (toolbarMode instanceof n7) && drawingToolState.f111833c;
        this.f111613v = toolbarMode instanceof m7;
    }

    public static j e(j jVar, l62.a aVar, w80.x1 x1Var, w80.b bVar, h hVar, t6 t6Var, w80.d1 d1Var, z6 z6Var, f7 f7Var, v6 v6Var, w6 w6Var, zy.a0 a0Var, o7 o7Var, boolean z13, boolean z14, boolean z15, i iVar, int i13) {
        l62.a composerModel = (i13 & 1) != 0 ? jVar.f111592a : aVar;
        w80.x1 topBarState = (i13 & 2) != 0 ? jVar.f111593b : x1Var;
        w80.b bottomBarState = (i13 & 4) != 0 ? jVar.f111594c : bVar;
        h canvasState = (i13 & 8) != 0 ? jVar.f111595d : hVar;
        t6 colorPickerState = (i13 & 16) != 0 ? jVar.f111596e : t6Var;
        w80.d1 dragBarState = (i13 & 32) != 0 ? jVar.f111597f : d1Var;
        z6 onboardingState = (i13 & 64) != 0 ? jVar.f111598g : z6Var;
        f7 progressOverlayDisplayState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? jVar.f111599h : f7Var;
        v6 drawingToolState = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? jVar.f111600i : v6Var;
        w6 emptyStateCarouselState = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? jVar.f111601j : w6Var;
        zy.a0 pinalyticsState = (i13 & 1024) != 0 ? jVar.f111602k : a0Var;
        o7 toolbarMode = (i13 & 2048) != 0 ? jVar.f111603l : o7Var;
        boolean z16 = (i13 & 4096) != 0 ? jVar.f111604m : z13;
        boolean z17 = (i13 & 8192) != 0 ? jVar.f111605n : z14;
        boolean z18 = (i13 & 16384) != 0 ? jVar.f111606o : z15;
        i clipboardPopupState = (i13 & 32768) != 0 ? jVar.f111607p : iVar;
        boolean z19 = z18;
        boolean z23 = jVar.f111608q;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(composerModel, "composerModel");
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(canvasState, "canvasState");
        Intrinsics.checkNotNullParameter(colorPickerState, "colorPickerState");
        Intrinsics.checkNotNullParameter(dragBarState, "dragBarState");
        Intrinsics.checkNotNullParameter(onboardingState, "onboardingState");
        Intrinsics.checkNotNullParameter(progressOverlayDisplayState, "progressOverlayDisplayState");
        Intrinsics.checkNotNullParameter(drawingToolState, "drawingToolState");
        Intrinsics.checkNotNullParameter(emptyStateCarouselState, "emptyStateCarouselState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(toolbarMode, "toolbarMode");
        Intrinsics.checkNotNullParameter(clipboardPopupState, "clipboardPopupState");
        return new j(composerModel, topBarState, bottomBarState, canvasState, colorPickerState, dragBarState, onboardingState, progressOverlayDisplayState, drawingToolState, emptyStateCarouselState, pinalyticsState, toolbarMode, z16, z17, z19, clipboardPopupState, z23);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f111592a, jVar.f111592a) && Intrinsics.d(this.f111593b, jVar.f111593b) && Intrinsics.d(this.f111594c, jVar.f111594c) && Intrinsics.d(this.f111595d, jVar.f111595d) && Intrinsics.d(this.f111596e, jVar.f111596e) && Intrinsics.d(this.f111597f, jVar.f111597f) && Intrinsics.d(this.f111598g, jVar.f111598g) && Intrinsics.d(this.f111599h, jVar.f111599h) && Intrinsics.d(this.f111600i, jVar.f111600i) && Intrinsics.d(this.f111601j, jVar.f111601j) && Intrinsics.d(this.f111602k, jVar.f111602k) && Intrinsics.d(this.f111603l, jVar.f111603l) && this.f111604m == jVar.f111604m && this.f111605n == jVar.f111605n && this.f111606o == jVar.f111606o && Intrinsics.d(this.f111607p, jVar.f111607p) && this.f111608q == jVar.f111608q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111608q) + ((this.f111607p.hashCode() + ep.b.e(this.f111606o, ep.b.e(this.f111605n, ep.b.e(this.f111604m, (this.f111603l.hashCode() + ((this.f111602k.hashCode() + ((this.f111601j.hashCode() + ((this.f111600i.hashCode() + ((this.f111599h.hashCode() + ((this.f111598g.hashCode() + ((this.f111597f.hashCode() + ((this.f111596e.hashCode() + ((this.f111595d.hashCode() + ((this.f111594c.hashCode() + ((this.f111593b.hashCode() + (this.f111592a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageComposerDisplayState(composerModel=");
        sb3.append(this.f111592a);
        sb3.append(", topBarState=");
        sb3.append(this.f111593b);
        sb3.append(", bottomBarState=");
        sb3.append(this.f111594c);
        sb3.append(", canvasState=");
        sb3.append(this.f111595d);
        sb3.append(", colorPickerState=");
        sb3.append(this.f111596e);
        sb3.append(", dragBarState=");
        sb3.append(this.f111597f);
        sb3.append(", onboardingState=");
        sb3.append(this.f111598g);
        sb3.append(", progressOverlayDisplayState=");
        sb3.append(this.f111599h);
        sb3.append(", drawingToolState=");
        sb3.append(this.f111600i);
        sb3.append(", emptyStateCarouselState=");
        sb3.append(this.f111601j);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f111602k);
        sb3.append(", toolbarMode=");
        sb3.append(this.f111603l);
        sb3.append(", generateBitmapForDownload=");
        sb3.append(this.f111604m);
        sb3.append(", animateCollageDuplication=");
        sb3.append(this.f111605n);
        sb3.append(", displayCutoutPickerAnimation=");
        sb3.append(this.f111606o);
        sb3.append(", clipboardPopupState=");
        sb3.append(this.f111607p);
        sb3.append(", useTopNavDisplay=");
        return a.a.r(sb3, this.f111608q, ")");
    }

    public j(w80.x1 x1Var, w80.b bVar, h hVar, w6 w6Var, boolean z13, int i13) {
        this(new l62.a(g2.f111552j, 55), (i13 & 2) != 0 ? g2.f111543a : x1Var, (i13 & 4) != 0 ? g2.f111544b : bVar, (i13 & 8) != 0 ? g2.f111545c : hVar, g2.f111546d, g2.f111548f, g2.f111549g, g2.f111551i, g2.f111547e, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? g2.f111550h : w6Var, new zy.a0(), n7.f111731a, false, false, false, g2.f111553k, (i13 & 65536) != 0 ? false : z13);
    }
}
