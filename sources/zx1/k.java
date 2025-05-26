package zx1;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import ay1.z;
import ea1.t0;
import ea1.u0;
import h32.d4;
import hw1.v;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzx1/k;", "Lvx1/c;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class k extends a {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f143044x0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public final m1 f143045u0;

    /* renamed from: v0, reason: collision with root package name */
    public final m1 f143046v0;

    /* renamed from: w0, reason: collision with root package name */
    public final d4 f143047w0;

    public k() {
        t0 t0Var = new t0(this, 26);
        n nVar = n.NONE;
        xk2.k a13 = m.a(nVar, new ax1.a(3, t0Var));
        l0 l0Var = k0.f80436a;
        int i13 = 24;
        int i14 = 25;
        this.f143045u0 = a1.s(this, l0Var.b(z.class), new u0(a13, 23), new ca1.m(a13, i13), new ca1.n(this, a13, i14));
        xk2.k a14 = m.a(nVar, new ax1.a(4, new t0(this, 27)));
        this.f143046v0 = a1.s(this, l0Var.b(v.class), new u0(a14, i13), new ca1.m(a14, i14), new ca1.n(this, a14, i13));
        this.f143047w0 = d4.PIN_ANALYTICS;
    }

    @Override // vx1.c
    public final void V7(cy1.a type, ww1.c cVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = b.f143029a[type.ordinal()];
        if (i13 == 1) {
            ((l82.c) f8().c()).a(ay1.k.f20678a);
            return;
        }
        if (i13 == 2) {
            ((l82.c) f8().c()).a(new ay1.h(String.valueOf(getPinId())));
        } else if (i13 == 3) {
            ((l82.c) f8().c()).a(ay1.i.f20674a);
        } else {
            if (i13 != 4) {
                return;
            }
            ((l82.c) f8().c()).a(new ay1.j(cVar));
        }
    }

    @Override // vx1.c
    public final void a8(cy1.f type, ww1.c cVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = b.f143030b[type.ordinal()];
        m1 m1Var = this.f143046v0;
        if (i13 == 1) {
            ((l82.c) ((v) m1Var.getValue()).c()).a(new hw1.k(String.valueOf(getPinId())));
        } else if (i13 == 2) {
            ((l82.c) ((v) m1Var.getValue()).c()).a(new hw1.g(String.valueOf(getPinId())));
        } else {
            if (i13 != 3) {
                return;
            }
            ((l82.c) ((v) m1Var.getValue()).c()).a(new hw1.h(cVar));
        }
    }

    @Override // vx1.c
    public final void b8(ww1.c metricTypes) {
        Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
        ((l82.c) ((v) this.f143046v0.getValue()).c()).a(new hw1.l(metricTypes, String.valueOf(getPinId())));
    }

    public final z f8() {
        return (z) this.f143045u0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF56507z0() {
        return this.f143047w0;
    }

    @Override // vx1.c, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String pinId = getPinId();
        if (pinId != null) {
            ((l82.c) f8().c()).a(new ay1.h(pinId));
        }
    }

    @Override // vx1.c, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new h(this, null), 3);
        androidx.lifecycle.z viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner2), null, null, new e(this, null), 3);
    }
}
