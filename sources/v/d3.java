package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123425a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123426b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f123427c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f123428d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f123429e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f123430f;

    /* renamed from: g, reason: collision with root package name */
    public Object f123431g;

    /* renamed from: h, reason: collision with root package name */
    public Object f123432h;

    public d3(int i13) {
        this.f123425a = i13;
        if (i13 != 2) {
            this.f123427c = new LinkedHashSet();
            this.f123428d = new LinkedHashSet();
            this.f123429e = new LinkedHashSet();
            this.f123426b = true;
            this.f123432h = null;
            return;
        }
        this.f123427c = new LinkedHashSet();
        this.f123428d = new LinkedHashSet();
        this.f123429e = new LinkedHashSet();
        this.f123430f = new LinkedHashSet();
        this.f123431g = new LinkedHashSet();
        this.f123432h = new LinkedHashSet();
    }

    public static final void a(d3 d3Var, r72.i1 i1Var) {
        do2.t2 t2Var;
        Object value;
        do2.t2 t2Var2;
        Object value2;
        if (i1Var != null) {
            d3Var.getClass();
            int i13 = r72.g2.f106487b;
            String str = i1Var.f106498a;
            if (str == null || !Intrinsics.d(str, "M0 0H0Z")) {
                d3Var.f123426b = true;
                ((u62.t) d3Var.f123428d).i(i1Var, true);
                do2.y1 y1Var = (do2.y1) d3Var.f123429e;
                do {
                    t2Var2 = (do2.t2) y1Var;
                    value2 = t2Var2.getValue();
                } while (!t2Var2.h(value2, y62.g.a((y62.g) value2, null, s62.f.f111253e, y62.f.SUCCESS, null, 9)));
                return;
            }
        }
        d3Var.f123426b = true;
        ((u62.t) d3Var.f123428d).i(y62.o.f137954a, false);
        do2.y1 y1Var2 = (do2.y1) d3Var.f123429e;
        do {
            t2Var = (do2.t2) y1Var2;
            value = t2Var.getValue();
        } while (!t2Var.h(value, y62.g.a((y62.g) value, null, null, y62.f.FAILURE, null, 11)));
    }

    public static c3 b(w.l lVar) {
        Range range;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) lVar.a(key);
            } catch (AssertionError e13) {
                kh2.m0.Y0("ZoomControl", "AssertionError, fail to get camera characteristic.", e13);
                range = null;
            }
            if (range != null) {
                return new a(lVar);
            }
        }
        return new m.h(lVar);
    }

    public static void e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public final void c(ao2.j0 coroutineScope, r72.i1 i1Var, ve.h cutoutEditorInputType) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(cutoutEditorInputType, "cutoutEditorInputType");
        this.f123432h = coroutineScope;
        u62.t.g((u62.t) this.f123428d, coroutineScope, cutoutEditorInputType, null, i1Var, 4);
        lb.l0.J0(lb.l0.Q0(new y62.m(this, null), ((u62.t) this.f123428d).f120883h), coroutineScope);
    }

    public final boolean d() {
        boolean z13 = false;
        boolean z14 = (((Set) this.f123427c).size() > 0 && ((Set) this.f123428d).containsAll((Set) this.f123427c)) || ((Set) this.f123427c).isEmpty();
        boolean z15 = (((Set) this.f123429e).size() > 0 && ((Set) this.f123430f).containsAll((Set) this.f123429e)) || ((Set) this.f123429e).isEmpty();
        boolean z16 = (((Set) this.f123431g).size() > 0 && ((Set) this.f123432h).containsAll((Set) this.f123431g)) || ((Set) this.f123431g).isEmpty();
        if (!z16) {
            e("texts to render: " + ((Set) this.f123431g));
            e("texts rendered: " + ((Set) this.f123432h));
        }
        if (z14 && z15 && z16) {
            if (((Set) this.f123431g).size() + ((Set) this.f123429e).size() + ((Set) this.f123427c).size() > 0) {
                z13 = true;
            }
        }
        e("checking isPageFullyRendered [" + z13 + "] images [" + ((Set) this.f123427c).size() + "] videos [" + ((Set) this.f123429e).size() + "] texts [" + ((Set) this.f123431g).size() + "]");
        e("images status [" + ((Set) this.f123428d).containsAll((Set) this.f123427c) + "] videos status [" + ((Set) this.f123430f).containsAll((Set) this.f123429e) + "] texts status [" + ((Set) this.f123432h).containsAll((Set) this.f123431g) + "]");
        if (!z14) {
            e("images to render: " + ((Set) this.f123427c));
            e("images rendered: " + ((Set) this.f123428d));
        }
        if (!z15) {
            e("videos to render: " + ((Set) this.f123429e));
            e("videos rendered: " + ((Set) this.f123430f));
        }
        return z13;
    }

    public final void f(h0.b bVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((androidx.lifecycle.l0) this.f123430f).k(bVar);
        } else {
            ((androidx.lifecycle.l0) this.f123430f).i(bVar);
        }
    }

    public final String toString() {
        switch (this.f123425a) {
            case 2:
                int size = ((Set) this.f123428d).size();
                int size2 = ((Set) this.f123427c).size();
                int size3 = ((Set) this.f123430f).size();
                int size4 = ((Set) this.f123429e).size();
                int size5 = ((Set) this.f123432h).size();
                int size6 = ((Set) this.f123431g).size();
                StringBuilder t13 = a.a.t("images: [", size, "] rendered out of [", size2, "] videos: [");
                a.a.z(t13, size3, "] rendered out of [", size4, "] texts: [");
                t13.append(size5);
                t13.append("] rendered out of [");
                t13.append(size6);
                t13.append("]");
                return t13.toString();
            default:
                return super.toString();
        }
    }

    public d3(t72.l getSegmentedObjectsForImageUseCase, u62.t cutoutEditorViewModelDelegate) {
        this.f123425a = 3;
        Intrinsics.checkNotNullParameter(getSegmentedObjectsForImageUseCase, "getSegmentedObjectsForImageUseCase");
        Intrinsics.checkNotNullParameter(cutoutEditorViewModelDelegate, "cutoutEditorViewModelDelegate");
        this.f123427c = getSegmentedObjectsForImageUseCase;
        this.f123428d = cutoutEditorViewModelDelegate;
        do2.t2 a13 = do2.u2.a(new y62.g());
        this.f123429e = a13;
        this.f123430f = new do2.a2(a13);
    }

    public d3(n nVar, w.l lVar, f0.j jVar) {
        this.f123425a = 0;
        this.f123426b = false;
        this.f123432h = new b3(this);
        this.f123427c = nVar;
        this.f123428d = jVar;
        c3 b13 = b(lVar);
        this.f123431g = b13;
        e3 e3Var = new e3(b13.l(), ((c3) this.f123431g).f());
        this.f123429e = e3Var;
        e3Var.d();
        this.f123430f = new androidx.lifecycle.l0(h0.b.c((e3) this.f123429e));
        nVar.n((m) this.f123432h);
    }
}
