package p90;

import a.sc;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.x3;
import i2.f2;
import i2.y3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import so.n5;
import so.s6;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp90/w;", "Lo82/v2;", "<init>", "()V", "cutoutPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w extends a1 {
    public static final /* synthetic */ int Y0 = 0;
    public n5 L0;
    public s6 M0;
    public ComposeView N0;
    public final m1 O0;
    public final xk2.v P0;
    public final LinkedHashMap Q0;
    public final ParcelableSnapshotMutableState R0;
    public zy.a0 S0;
    public final int T0;
    public final xk2.k U0;
    public final d4 V0;
    public final a4 W0;
    public final h32.g0 X0;

    public w() {
        q1 q1Var = new q1(this, 19);
        xk2.n nVar = xk2.n.NONE;
        xk2.k q13 = jq.b.q(20, q1Var, nVar);
        int i13 = 18;
        this.O0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(v0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.P0 = xk2.m.b(new o(this, 5));
        this.Q0 = new LinkedHashMap();
        this.R0 = bs1.c.u1(z.f99250a, y3.f71400a);
        this.S0 = new zy.a0();
        this.T0 = 2;
        this.U0 = xk2.m.a(nVar, new o(this, 4));
        this.V0 = d4.PIN;
        this.W0 = a4.PIN_CLOSEUP;
        this.X0 = h32.g0.COLLAGE_COMPOSER_CUTOUT_PICKER_PIN_CLOSEUP;
    }

    public static final void k9(w wVar, i2.o oVar, int i13) {
        wVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1642337453);
        int i14 = 0;
        fc0.n.a(false, null, false, false, q2.i.c(-1428828723, new p(wVar, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q(wVar, i13, i14);
        }
    }

    public static final void l9(w wVar, i2.o oVar, int i13) {
        wVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1192153764);
        int i14 = 1;
        fc0.n.a(false, null, false, false, q2.i.c(1894545020, new p(wVar, i14), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q(wVar, i13, i14);
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(m9().a(), 12);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(m9().c(), 23);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int i13 = 0;
        adapter.I(1000, new o(this, 6), new m(i13), new n(this, i13));
        b3.G(adapter, 1001, new o(this, 7), x0.f99245a, new ns.i(2), new sc(27), m9(), 32);
        adapter.H(1002, new o(this, 8));
        c0.d.A2(adapter, y.b(), v.f99235i, (o82.y) this.U0.getValue());
    }

    @Override // o82.v2
    public final int a9() {
        return 0;
    }

    @Override // o82.v2
    public final int d9() {
        return 0;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.S0.e();
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final h32.g0 getF50450e() {
        return this.X0;
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns, reason: from getter */
    public final int getZ0() {
        return this.T0;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.S0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getC0() {
        return this.W0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.V0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(m9().c(), 24);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(l90.b.fragment_collage_content_closeup, l90.a.collage_content_closeup_content);
        eVar.f979c = l90.a.collage_content_closeup_empty_state_container;
        return eVar;
    }

    public final v0 m9() {
        return (v0) this.O0.getValue();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v0 m93 = m9();
        String Z = com.bumptech.glide.d.Z(this, "SOURCE_PIN_ID", "");
        if (!(!kotlin.text.z.j(Z))) {
            throw new IllegalArgumentException("Source ID is required".toString());
        }
        Parcelable R = com.bumptech.glide.d.R(this, "CutoutPickerCloseupExtras.CUTOUT_PICKER_CLOSEUP_KEY_ORIGIN");
        CutoutPickerOrigin cutoutPickerOrigin = R instanceof CutoutPickerOrigin ? (CutoutPickerOrigin) R : null;
        if (cutoutPickerOrigin == null) {
            cutoutPickerOrigin = CutoutPickerOrigin.None;
        }
        m93.h(Z, cutoutPickerOrigin, (h32.i0) this.P0.getValue(), this.S0.f());
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l90.a.collage_content_closeup_toolbar);
        p pVar = new p(this, 2);
        Object obj = q2.i.f102113a;
        ((ComposeView) findViewById).o(new q2.h(pVar, true, -158990041));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = onCreateView.findViewById(l90.a.collage_content_closeup_close_button);
        ComposeView composeView = (ComposeView) findViewById2;
        composeView.o(new q2.h(new p(this, 3), true, 1610516598));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.N0 = composeView;
        return onCreateView;
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        RecyclerView g83;
        e5.d c13;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g9(bs1.c.X(this, eo1.c.bottom_nav_height));
        List j13 = kotlin.collections.f0.j(1000, 1001);
        RecyclerView g84 = g8();
        if (g84 != null && (c13 = g84.f19220c.c()) != null) {
            Iterator it = j13.iterator();
            while (it.hasNext()) {
                c13.h(((Number) it.next()).intValue());
            }
        }
        if (!j13.isEmpty() && (g83 = g8()) != null) {
            g83.f19220c.f19609h = new r(0, this, j13);
        }
        kh2.b0.D1(this, new u(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.S0.e().f67083c;
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
