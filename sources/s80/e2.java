package s80;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.navigation.Navigation;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls80/e2;", "Lnl1/d;", "<init>", "()V", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e2 extends x6 {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f111509k0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public n72.b f111510c0;

    /* renamed from: d0, reason: collision with root package name */
    public n72.m f111511d0;

    /* renamed from: e0, reason: collision with root package name */
    public t62.b f111512e0;

    /* renamed from: f0, reason: collision with root package name */
    public final androidx.lifecycle.m1 f111513f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f111514g0;

    /* renamed from: h0, reason: collision with root package name */
    public zy.a0 f111515h0;

    /* renamed from: i0, reason: collision with root package name */
    public final ArrayList f111516i0;

    /* renamed from: j0, reason: collision with root package name */
    public final h32.d4 f111517j0;

    public e2() {
        xk2.k q13 = jq.b.q(15, new androidx.fragment.app.q1(this, 15), xk2.n.NONE);
        int i13 = 14;
        this.f111513f0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(p6.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.f111514g0 = bs1.c.u1(new j(null, null, null, null, false, 131071), i2.y3.f71400a);
        this.f111515h0 = new zy.a0();
        this.f111516i0 = new ArrayList();
        this.f111517j0 = h32.d4.COLLAGE_COMPOSER;
    }

    public static final void Y7(e2 e2Var, i2.o oVar, int i13) {
        e2Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(638109733);
        j jVar = (j) e2Var.f111514g0.getValue();
        n72.b bVar = e2Var.f111510c0;
        if (bVar == null) {
            Intrinsics.r("fontManager");
            throw null;
        }
        n72.m mVar = e2Var.f111511d0;
        if (mVar == null) {
            Intrinsics.r("logger");
            throw null;
        }
        t62.b bVar2 = e2Var.f111512e0;
        if (bVar2 == null) {
            Intrinsics.r("rendererUtility");
            throw null;
        }
        kh2.b0.e(jVar, bVar, mVar, bVar2, null, new mz.c(e2Var, 17), sVar, 4680, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(e2Var, i13, 9);
        }
    }

    @Override // nl1.d
    public final void K7() {
        super.K7();
        ArrayList arrayList = this.f111516i0;
        Z7(new g1(arrayList));
        arrayList.clear();
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "CutoutPickerExtras.CUTOUT_SELECTION_RESULT_CODE") && result.containsKey("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_KEY")) {
            CutoutModel cutoutModel = (CutoutModel) kg.t.C("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_KEY", result);
            if (cutoutModel == null) {
                return;
            }
            sa0.c0 c0Var = sa0.d0.Companion;
            Integer valueOf = Integer.valueOf(kg.t.B(result));
            c0Var.getClass();
            sa0.d0 a13 = sa0.c0.a(valueOf);
            CutoutPickerOrigin cutoutPickerOrigin = (CutoutPickerOrigin) kg.t.C("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_ORIGIN_KEY", result);
            if (cutoutPickerOrigin == null) {
                cutoutPickerOrigin = CutoutPickerOrigin.None;
            }
            Z7(new m0(cutoutModel, a13, cutoutPickerOrigin));
            return;
        }
        if (Intrinsics.d(code, "CutoutPickerExtras.CUTOUT_REPLACE_SELECTION_CODE") && result.containsKey("CutoutPickerExtras.CUTOUT_REPLACE_SELECTION_KEY")) {
            this.f111516i0.add(new t1(kg.t.D("CutoutPickerExtras.CUTOUT_REPLACE_SELECTION_KEY", result)));
            return;
        }
        if (Intrinsics.d(code, "CollageComposerExtras.COLLAGE_SAVED_RESULT_CODE") && result.containsKey("CollageComposerExtras.COLLAGE_SAVED_RESULT_KEY")) {
            if (kg.t.A("CollageComposerExtras.COLLAGE_SAVED_RESULT_KEY", result)) {
                Z7(d0.f111491a);
                return;
            }
            return;
        }
        if (Intrinsics.d(code, "CollageComposerExtras.COLLAGE_PUBLISHED_RESULT_CODE") && result.containsKey("CollageComposerExtras.COLLAGE_PUBLISHED_RESULT_KEY")) {
            if (kg.t.A("CollageComposerExtras.COLLAGE_PUBLISHED_RESULT_KEY", result)) {
                Z7(u1.f111809a);
                return;
            }
            return;
        }
        if (Intrinsics.d(code, "268") && result.containsKey("com.pinterest.EXTRA_CREATE_MEDIA_URI")) {
            String D = kg.t.D("com.pinterest.EXTRA_CREATE_MEDIA_URI", result);
            if (!kotlin.text.z.j(D)) {
                Z7(new e1(D, sa0.d0.Camera));
                return;
            }
            return;
        }
        if (Intrinsics.d(code, "DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_CODE") && result.containsKey("DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_KEY")) {
            String D2 = kg.t.D("DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_KEY", result);
            if (!kotlin.text.z.j(D2)) {
                Z7(new o0(D2));
                return;
            }
            return;
        }
        if (!Intrinsics.d(code, "RemixPinSelection.REMIX_PIN__SELECTION_RESULT_CODE") || !result.containsKey("RemixPinSelection.REMIX_PIN_SELECTION_RESULT_KEY")) {
            if (Intrinsics.d(code, "CutoutPickerExtras.CUTOUT_PICKER_ONBOARDING_COMPLETE")) {
                Z7(j1.f111615a);
            }
        } else {
            String D3 = kg.t.D("RemixPinSelection.REMIX_PIN_SELECTION_RESULT_KEY", result);
            if (!kotlin.text.z.j(D3)) {
                Z7(new s1(D3));
            }
        }
    }

    @Override // nl1.d
    public final ll1.a T6() {
        return new ll1.a(n7(), String.valueOf(q7()), null, kh2.d.j(com.bumptech.glide.d.Z(this, "CutoutComposerExtras.EXTRA_DRAFT_COLLAGE_ID", ""), null), 4);
    }

    public final void Z7(a2 a2Var) {
        kh2.j.x2((p6) this.f111513f0.getValue(), a2Var);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        Z7(k.f111632a);
        return true;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f111515h0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f111515h0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final h32.d4 getF49892c0() {
        return this.f111517j0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(((p6) this.f111513f0.getValue()).c(), 17);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = j7.fragment_collage_composer;
        p6 p6Var = (p6) this.f111513f0.getValue();
        String Z = com.bumptech.glide.d.Z(this, "CutoutComposerExtras.EXTRA_DRAFT_COLLAGE_ID", "");
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", "");
        String Z3 = com.bumptech.glide.d.Z(this, "CutoutComposerExtras.EXTRA_REMIX_PIN_ID", "");
        boolean G = com.bumptech.glide.d.G(this, "CutoutComposerExtras.EXTRA_NAVIGATED_FROM_ADDING", false);
        h32.i0 i03 = com.bumptech.glide.d.i0(null, null, this.f111517j0, "");
        String f13 = this.f111515h0.f();
        d32.a aVar = d32.c.Companion;
        int O = com.bumptech.glide.d.O(this, "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE", d32.c.UNKNOWN.getValue());
        aVar.getClass();
        p6Var.h(Z, Z2, Z3, G, i03, f13, d32.a.a(O));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(i7.collage_composer_view);
        b2 b2Var = new b2(this, 1);
        Object obj = q2.i.f102113a;
        ((ComposeView) findViewById).o(new q2.h(b2Var, true, -128453035));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Z7(i1.f111576a);
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new d2(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        h32.x3 x3Var = this.f111515h0.e().f67083c;
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
