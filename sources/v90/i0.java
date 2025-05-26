package v90;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.q1;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import com.pinterest.feature.ideaPinCreation.closeup.view.w2;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import com.pinterest.shuffles.cutout.editor.ui.select.CropRectContainer;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import com.pinterest.shuffles.cutout.editor.ui.widget.ShimmerView;
import h32.d4;
import h32.x3;
import i2.f2;
import i2.y3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv90/i0;", "Lnl1/d;", "<init>", "()V", "cutoutTool_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i0 extends m1 {

    /* renamed from: q0, reason: collision with root package name */
    public static final IntRange f124904q0 = new IntRange(8, 64, 1);

    /* renamed from: c0, reason: collision with root package name */
    public final androidx.lifecycle.m1 f124905c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f124906d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f124907e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f124908f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f124909g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltSpinner f124910h0;

    /* renamed from: i0, reason: collision with root package name */
    public CropRectContainer f124911i0;

    /* renamed from: j0, reason: collision with root package name */
    public MaskedImageView f124912j0;

    /* renamed from: k0, reason: collision with root package name */
    public ShimmerView f124913k0;

    /* renamed from: l0, reason: collision with root package name */
    public ViewGroup f124914l0;

    /* renamed from: m0, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.x f124915m0;

    /* renamed from: n0, reason: collision with root package name */
    public dv0.q f124916n0;

    /* renamed from: o0, reason: collision with root package name */
    public zy.a0 f124917o0;

    /* renamed from: p0, reason: collision with root package name */
    public final d4 f124918p0;

    public i0() {
        xk2.k q13 = jq.b.q(22, new q1(this, 21), xk2.n.NONE);
        int i13 = 20;
        this.f124905c0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(l1.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        t90.o c13 = t90.f.c();
        y3 y3Var = y3.f71400a;
        this.f124906d0 = bs1.c.u1(c13, y3Var);
        this.f124907e0 = bs1.c.u1(new s90.t0(0, 7), y3Var);
        this.f124908f0 = bs1.c.u1(new s90.r0(), y3Var);
        this.f124917o0 = new zy.a0();
        this.f124918p0 = d4.CUTOUT_TOOL;
    }

    public static final void Y7(i0 i0Var, i2.o oVar, int i13) {
        i0Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(2056838616);
        int i14 = 0;
        fc0.n.a(false, null, false, false, q2.i.c(718276792, new c0(i0Var, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d0(i0Var, i13, i14);
        }
    }

    public static final void Z7(i0 i0Var, i2.o oVar, int i13) {
        i0Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1627685569);
        int i14 = 1;
        fc0.n.a(false, null, false, false, q2.i.c(1328719903, new c0(i0Var, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d0(i0Var, i13, i14);
        }
    }

    public static final void a8(i0 i0Var, i2.o oVar, int i13) {
        i0Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1199931841);
        int i14 = 2;
        fc0.n.a(false, null, false, false, q2.i.c(-1887073119, new c0(i0Var, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d0(i0Var, i13, i14);
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        int hashCode = code.hashCode();
        e eVar = e.f124881a;
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
                b8(d.f124874a);
            }
        }
    }

    public final void b8(z zVar) {
        kh2.j.x2((l1) this.f124905c0.getValue(), zVar);
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f124917o0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f124917o0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.f124918p0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(((l1) this.f124905c0.getValue()).c(), 26);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String v03;
        sa0.b0 zVar;
        String v04;
        super.onCreate(bundle);
        this.E = s90.c1.fragment_collage_cutout_v2;
        l1 l1Var = (l1) this.f124905c0.getValue();
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
        s90.u0 u0Var = s90.v0.Companion;
        Navigation navigation4 = this.I;
        int J1 = navigation4 != null ? navigation4.J1("com.pinterest.EXTRA_CUTOUT_EDIT_SOURCE") : 0;
        u0Var.getClass();
        s90.v0 a14 = s90.u0.a(J1);
        d32.a aVar = d32.c.Companion;
        d32.c cVar = d32.c.UNKNOWN;
        int O = com.bumptech.glide.d.O(this, "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE", cVar.getValue());
        aVar.getClass();
        d32.c a15 = d32.a.a(O);
        if (a15 == null) {
            a15 = cVar;
        }
        Navigation navigation5 = this.I;
        Parcelable b23 = navigation5 != null ? navigation5.b2("com.pinterest.EXTRA_CUTOUT_MASK") : null;
        MaskModel maskModel = b23 instanceof MaskModel ? (MaskModel) b23 : null;
        l1Var.h(zVar, a14, a15, maskModel != null ? maskModel.a() : null, com.bumptech.glide.d.i0(null, null, this.f124918p0, ""), this.f124917o0.f());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(s90.b1.bottom_action_bar);
        c0 c0Var = new c0(this, 3);
        Object obj = q2.i.f102113a;
        ((ComposeView) findViewById).o(new q2.h(c0Var, true, -839050977));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = onCreateView.findViewById(s90.b1.select_mask_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f124911i0 = (CropRectContainer) findViewById2;
        float W = bs1.c.W(onCreateView, qa0.b.cutout_editor_mask_stroke_width);
        float W2 = bs1.c.W(onCreateView, qa0.b.cutout_editor_mask_stroke_dash_pattern);
        v62.b bVar = new v62.b(W, 2 * bs1.c.W(onCreateView, qa0.b.cutout_editor_mask_stroke_width), new float[]{W2, W2});
        View findViewById3 = onCreateView.findViewById(s90.b1.select_mask_view);
        MaskedImageView maskedImageView = (MaskedImageView) findViewById3;
        maskedImageView.i2(bVar);
        maskedImageView.g2(bs1.c.B(maskedImageView, qa0.a.cutout_editor_mask_fill));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f124912j0 = maskedImageView;
        View findViewById4 = onCreateView.findViewById(s90.b1.crop_rect);
        ShimmerView shimmerView = (ShimmerView) findViewById4;
        shimmerView.setEnabled(false);
        w2 w2Var = new w2();
        w2Var.b(shimmerView.getResources().getDimensionPixelSize(s90.a1.mask_crop_rect_stroke_width));
        w2Var.a(shimmerView.getResources().getDimensionPixelSize(s90.a1.mask_crop_corner_stroke_width));
        shimmerView.setForeground(w2Var);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f124913k0 = shimmerView;
        CropRectContainer cropRectContainer = this.f124911i0;
        if (cropRectContainer == null) {
            Intrinsics.r("selectMaskContainer");
            throw null;
        }
        MaskedImageView maskedImageView2 = this.f124912j0;
        if (maskedImageView2 == null) {
            Intrinsics.r("selectMaskView");
            throw null;
        }
        this.f124915m0 = new com.google.android.gms.internal.measurement.x(cropRectContainer, maskedImageView2, new e0(this, 0));
        View findViewById5 = onCreateView.findViewById(s90.b1.refine_mask_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f124914l0 = (ViewGroup) findViewById5;
        View findViewById6 = onCreateView.findViewById(s90.b1.refine_mask_view);
        EditMaskImageView editMaskImageView = (EditMaskImageView) findViewById6;
        editMaskImageView.l2(bVar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        View findViewById7 = onCreateView.findViewById(s90.b1.brush_size_slider);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        dv0.q qVar = new dv0.q(editMaskImageView, new va0.o((EffectSliderView) findViewById7, true), new e0(this, 1));
        IntRange intRange = f124904q0;
        Integer valueOf = Integer.valueOf(intRange.f80453a);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        float g03 = kg.a.g0(valueOf, requireContext);
        Integer valueOf2 = Integer.valueOf(intRange.f80454b);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        float g04 = kg.a.g0(valueOf2, requireContext2);
        qVar.n(g04, new ql2.g(g03, g04));
        qVar.o(bs1.c.B(onCreateView, qa0.a.cutout_editor_mask_fill));
        this.f124916n0 = qVar;
        View findViewById8 = onCreateView.findViewById(s90.b1.cutout_editor_toolbar);
        ((ComposeView) findViewById8).o(new q2.h(new c0(this, 4), true, 2052326358));
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        View findViewById9 = onCreateView.findViewById(s90.b1.cutout_saving_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f124909g0 = findViewById9;
        View findViewById10 = onCreateView.findViewById(s90.b1.saving_overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f124910h0 = (GestaltSpinner) findViewById10;
        View findViewById11 = onCreateView.findViewById(s90.b1.cutout_editor_search_status_bar);
        ((ComposeView) findViewById11).o(new q2.h(new c0(this, 5), true, -482369768));
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new h0(this, null), 3);
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f124917o0.e().f67083c;
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
