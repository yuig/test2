package za;

import ac2.m;
import ac2.o1;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.o;
import rf1.p0;
import sf1.e1;
import sf1.j1;
import sf1.k1;
import sf1.s;
import u50.r;

/* loaded from: classes3.dex */
public final class d extends androidx.viewpager2.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141455a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f141456b;

    public d() {
        this.f141455a = 1;
        this.f141456b = new ArrayList(3);
    }

    @Override // androidx.viewpager2.widget.k
    public final void a(int i13) {
        int i14 = this.f141455a;
        Object obj = this.f141456b;
        switch (i14) {
            case 0:
                ((f) obj).b(false);
                return;
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((androidx.viewpager2.widget.k) it.next()).a(i13);
                    }
                    return;
                } catch (ConcurrentModificationException e13) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e13);
                }
            default:
                return;
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void b(int i13, float f13, int i14) {
        PinterestVideoView o13;
        int i15 = this.f141455a;
        Object obj = this.f141456b;
        switch (i15) {
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((androidx.viewpager2.widget.k) it.next()).b(i13, f13, i14);
                    }
                    return;
                } catch (ConcurrentModificationException e13) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e13);
                }
            case 2:
                e1 e1Var = (e1) obj;
                m mVar = e1Var.f112549h;
                if (mVar == null) {
                    Intrinsics.r("videoManager");
                    throw null;
                }
                ((o1) mVar).w();
                Long l13 = e1Var.R;
                if (l13 != null) {
                    long longValue = l13.longValue();
                    s C = e1Var.F.C(e1Var.f112558q.f19924d);
                    if (C != null && (o13 = C.o()) != null) {
                        o13.j(longValue, true);
                    }
                }
                e1Var.R = null;
                return;
            case 3:
                ((r) obj).a(new h42.b(i13, f13, i14));
                return;
            default:
                return;
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void c(int i13) {
        k1 x33;
        k1 x34;
        int i14 = this.f141455a;
        boolean z13 = false;
        Object obj = this.f141456b;
        switch (i14) {
            case 0:
                ((f) obj).b(false);
                return;
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((androidx.viewpager2.widget.k) it.next()).c(i13);
                    }
                    return;
                } catch (ConcurrentModificationException e13) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e13);
                }
            case 2:
                j1 j1Var = ((e1) obj).G;
                if (j1Var != null) {
                    p0 p0Var = (p0) j1Var;
                    if (p0Var.f107842h0 != i13) {
                        p0Var.a4();
                        o oVar = p0Var.f107846j0;
                        if (oVar != null && (x34 = p0Var.x3()) != null) {
                            ((e1) x34).G0(oVar, i13);
                        }
                    }
                    p0Var.f107842h0 = i13;
                    p0Var.C4(i13);
                    p0Var.f107834d0.size();
                    p0Var.x3();
                    p0Var.X3(i13);
                    if (p0Var.j4()) {
                        p0Var.n4();
                    }
                    if (p0Var.f107856o0) {
                        if (p0Var.isBound() && (x33 = p0Var.x3()) != null) {
                            boolean s43 = p0.s4(p0Var);
                            p0Var.t4();
                            e1 e1Var = (e1) x33;
                            e1Var.I0(e1Var.f112558q.f19924d, 0.0f);
                            if (s43) {
                                e1Var.f112559r.Z();
                            }
                        }
                        k1 x35 = p0Var.x3();
                        if (x35 != null) {
                            if (p0Var.t4() && !p0Var.x4(i13)) {
                                z13 = true;
                            }
                            ((e1) x35).t0(z13, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((r) obj).a(new h42.c(i13));
                return;
        }
    }

    public d(Object obj, int i13) {
        this.f141455a = i13;
        this.f141456b = obj;
    }
}
