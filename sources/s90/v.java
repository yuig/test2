package s90;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.navigation.Navigation;
import com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView;
import h32.d4;
import h32.x3;
import i2.f2;
import i2.y3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls90/v;", "Lnl1/d;", "<init>", "()V", "cutoutTool_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v extends w0 {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f112028l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f112029c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f112030d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f112031e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f112032f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f112033g0;

    /* renamed from: h0, reason: collision with root package name */
    public LoadingView f112034h0;

    /* renamed from: i0, reason: collision with root package name */
    public bn0.a f112035i0;

    /* renamed from: j0, reason: collision with root package name */
    public zy.a0 f112036j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f112037k0;

    public v() {
        xk2.k q13 = jq.b.q(21, new q1(this, 20), xk2.n.NONE);
        int i13 = 19;
        this.f112029c0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(q0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        t90.o b13 = t90.f.b();
        y3 y3Var = y3.f71400a;
        this.f112030d0 = bs1.c.u1(b13, y3Var);
        this.f112031e0 = bs1.c.u1(new t0(0, 7), y3Var);
        this.f112032f0 = bs1.c.u1(new r0(), y3Var);
        this.f112036j0 = new zy.a0();
        this.f112037k0 = d4.CUTOUT_TOOL;
    }

    public static final void Y7(v vVar, i2.o oVar, int i13) {
        vVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(261602982);
        int i14 = 0;
        fc0.n.a(false, null, false, false, q2.i.c(-946270266, new o(vVar, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new p(vVar, i13, i14);
        }
    }

    public static final void Z7(v vVar, i2.o oVar, int i13) {
        vVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-597256929);
        int i14 = 1;
        fc0.n.a(false, null, false, false, q2.i.c(-1805130177, new o(vVar, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new p(vVar, i13, i14);
        }
    }

    public static final void a8(v vVar, i2.o oVar, int i13) {
        vVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(965459677);
        int i14 = 2;
        fc0.n.a(false, null, false, false, q2.i.c(-402640899, new o(vVar, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new p(vVar, i13, i14);
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        int hashCode = code.hashCode();
        e eVar = e.f111969a;
        if (hashCode == -1056262969) {
            if (code.equals("com.pinterest.EXTRA_BOARD_PICKER_RESULT_CODE") && result.getBoolean("com.pinterest.EXTRA_BOARD_PICKER_RESULT_KEY_REPINNED")) {
                b8(eVar);
                return;
            }
            return;
        }
        if (hashCode == -75229131) {
            if (code.equals("com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE")) {
                b8(eVar);
            }
        } else if (hashCode == 2134935546 && code.equals("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE")) {
            boolean z13 = result.getBoolean("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_KEY_NEW_COLLAGE");
            String string = result.getString("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_KEY_COLLAGE_ID");
            if (string != null) {
                b8(new f(string));
            } else if (z13) {
                b8(d.f111967a);
            }
        }
    }

    public final void b8(n nVar) {
        kh2.j.x2((q0) this.f112029c0.getValue(), nVar);
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f112036j0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f112036j0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF88370e1() {
        return this.f112037k0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(((q0) this.f112029c0.getValue()).c(), 25);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String v03;
        sa0.b0 zVar;
        String v04;
        super.onCreate(bundle);
        this.E = c1.fragment_collage_cutout;
        q0 q0Var = (q0) this.f112029c0.getValue();
        Navigation navigation = this.I;
        if (navigation == null || (v04 = navigation.v0("com.pinterest.EXTRA_PIN_ID")) == null) {
            Navigation navigation2 = this.I;
            if (navigation2 == null || (v03 = navigation2.v0("com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE")) == null) {
                throw new IllegalStateException("Pin ID or image URL is required");
            }
            Pair g13 = qb0.b.g(requireContext(), Uri.parse(v03));
            if (g13 == null) {
                throw new IllegalStateException("Unable to retrieve image dimensions for ".concat(v03));
            }
            Object first = g13.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            int intValue = ((Number) first).intValue();
            Object second = g13.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Size size = new Size(intValue, ((Number) second).intValue());
            sa0.c0 c0Var = sa0.d0.Companion;
            Navigation navigation3 = this.I;
            Integer valueOf = navigation3 != null ? Integer.valueOf(navigation3.J1("com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE_SOURCE")) : null;
            c0Var.getClass();
            sa0.d0 a13 = sa0.c0.a(valueOf);
            if (a13 == null) {
                a13 = sa0.d0.Gallery;
            }
            zVar = new sa0.z(v03, size, a13);
        } else {
            zVar = new sa0.a0(v04);
        }
        u0 u0Var = v0.Companion;
        Navigation navigation4 = this.I;
        int J1 = navigation4 != null ? navigation4.J1("com.pinterest.EXTRA_CUTOUT_EDIT_SOURCE") : 0;
        u0Var.getClass();
        v0 a14 = u0.a(J1);
        d32.a aVar = d32.c.Companion;
        d32.c cVar = d32.c.UNKNOWN;
        int O = com.bumptech.glide.d.O(this, "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE", cVar.getValue());
        aVar.getClass();
        d32.c a15 = d32.a.a(O);
        if (a15 == null) {
            a15 = cVar;
        }
        q0Var.h(zVar, a14, a15, com.bumptech.glide.d.i0(null, null, this.f112037k0, ""), this.f112036j0.f());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        onCreateView.setBackgroundColor(bs1.c.B(onCreateView, eo1.b.color_background_elevation_floating_added));
        View findViewById = onCreateView.findViewById(b1.bottom_action_bar);
        o oVar = new o(this, 3);
        Object obj = q2.i.f102113a;
        ((ComposeView) findViewById).o(new q2.h(oVar, true, -385182401));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        CutoutEditorView cutoutEditorView = (CutoutEditorView) onCreateView.findViewById(b1.cutout_editor_view);
        Intrinsics.f(cutoutEditorView);
        float W = bs1.c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width);
        float W2 = bs1.c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_dash_pattern);
        cutoutEditorView.c(new v62.b(W, 2 * bs1.c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width), new float[]{W2, W2}));
        cutoutEditorView.b(bs1.c.B(cutoutEditorView, qa0.a.cutout_editor_mask_fill));
        this.f112035i0 = new bn0.a(cutoutEditorView, new r(this));
        View findViewById2 = onCreateView.findViewById(b1.cutout_editor_toolbar);
        ((ComposeView) findViewById2).o(new q2.h(new o(this, 4), true, -1039123864));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = onCreateView.findViewById(b1.cutout_saving_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f112033g0 = findViewById3;
        View findViewById4 = onCreateView.findViewById(b1.saving_overlay_loading_view);
        LoadingView loadingView = (LoadingView) findViewById4;
        se0.o oVar2 = loadingView.f44866c;
        oVar2.f112405c = 0;
        oVar2.f112404b = -1;
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f112034h0 = loadingView;
        View findViewById5 = onCreateView.findViewById(b1.cutout_editor_search_status_bar);
        ((ComposeView) findViewById5).o(new q2.h(new o(this, 5), true, 66839910));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new u(this, null), 3);
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f112036j0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
