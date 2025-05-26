package fp0;

import a.m2;
import a.o3;
import android.content.Context;
import android.graphics.Rect;
import androidx.camera.core.impl.e2;
import androidx.camera.view.PreviewView;
import ba.u;
import c0.e0;
import c0.i0;
import c0.s;
import c0.w;
import ja.y;
import java.io.File;
import kl2.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oi.b4;
import q0.f;
import r0.h;
import r0.l0;
import r0.r;
import r0.v0;
import r4.l;
import tt0.d0;
import tt0.k0;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: q, reason: collision with root package name */
    public static final h f62759q = r.f105630b;

    /* renamed from: a, reason: collision with root package name */
    public final nl1.d f62760a;

    /* renamed from: b, reason: collision with root package name */
    public final PreviewView f62761b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f62762c;

    /* renamed from: d, reason: collision with root package name */
    public final lb0.r f62763d;

    /* renamed from: e, reason: collision with root package name */
    public q0.b f62764e;

    /* renamed from: f, reason: collision with root package name */
    public m.h f62765f;

    /* renamed from: g, reason: collision with root package name */
    public int f62766g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f62767h;

    /* renamed from: i, reason: collision with root package name */
    public m f62768i;

    /* renamed from: j, reason: collision with root package name */
    public l0 f62769j;

    /* renamed from: k, reason: collision with root package name */
    public b4 f62770k;

    /* renamed from: l, reason: collision with root package name */
    public i0 f62771l;

    /* renamed from: m, reason: collision with root package name */
    public v0 f62772m;

    /* renamed from: n, reason: collision with root package name */
    public s f62773n;

    /* renamed from: o, reason: collision with root package name */
    public Float f62774o;

    /* renamed from: p, reason: collision with root package name */
    public Float f62775p;

    public c(nl1.d fragment, PreviewView cameraPreview, tb0.h crashReporting, lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter("PREF_IDEA_PIN_FRONT_FACING_CAMERA", "cameraFacingPrefsKey");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f62760a = fragment;
        this.f62761b = cameraPreview;
        this.f62762c = crashReporting;
        this.f62763d = prefsManagerUser;
        this.f62766g = 2;
        s sVar = prefsManagerUser.f("PREF_IDEA_PIN_FRONT_FACING_CAMERA", false) ? s.f24330b : s.f24331c;
        Intrinsics.f(sVar);
        this.f62773n = sVar;
        cameraPreview.setOnTouchListener(new m2(this, 8));
    }

    public final void a() {
        l lVar;
        Function0 function0;
        this.f62764e = null;
        m.h hVar = this.f62765f;
        if (hVar != null && (function0 = (Function0) hVar.f85197b) != null) {
            function0.invoke();
        }
        f fVar = f.f101757h;
        Context context = this.f62760a.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        context.getClass();
        f fVar2 = f.f101757h;
        synchronized (fVar2.f101758a) {
            lVar = fVar2.f101759b;
            if (lVar == null) {
                lVar = com.bumptech.glide.d.L(new o3(11, fVar2, new w(context)));
                fVar2.f101759b = lVar;
            }
        }
        final q0.d dVar = new q0.d(context, 0);
        g0.b j13 = g0.m.j(lVar, new g0.l(new q.a() { // from class: v.o2
            @Override // q.a
            public final Object apply(Object obj) {
                Function1 tmp0 = (Function1) dVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (q0.f) tmp0.invoke(obj);
            }
        }), l3.c.s());
        Intrinsics.checkNotNullExpressionValue(j13, "context: Context): Liste…tExecutor()\n            )");
        o0.b bVar = new o0.b(o0.a.f92744c, null, 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "build(...)");
        j13.d(new y(j13, this, bVar, 17), d5.a.c(this.f62760a.requireContext()));
    }

    @Override // fp0.d
    public final boolean b() {
        return this.f62769j != null;
    }

    @Override // fp0.d
    public final Rect c() {
        PreviewView previewView = this.f62761b;
        return new Rect(previewView.getLeft(), previewView.getTop(), previewView.getRight(), previewView.getBottom());
    }

    @Override // fp0.d
    public final void d(k0 onComplete, k0 onError) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        i0 i0Var = this.f62771l;
        if (i0Var == null) {
            return;
        }
        File g13 = k() ? fa2.c.g("IMG_FF_", ".jpg") : fa2.c.g("IMG_", ".jpg");
        if (g13 == null) {
            onError.invoke(new IllegalStateException("outputFile is null"));
            return;
        }
        e0 e0Var = new e0(g13, null, null, null, null, null);
        Intrinsics.checkNotNullExpressionValue(e0Var, "build(...)");
        i0Var.G(e0Var, d5.a.c(this.f62760a.requireContext()), new b(onError, onComplete, g13));
    }

    @Override // fp0.d
    public final void e(boolean z13, tt0.i0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q0.b bVar = this.f62764e;
        if (bVar == null || k()) {
            return;
        }
        h0.f fVar = bVar.f101749c;
        if (!fVar.f66397q.f16839b.f()) {
            listener.f119125b.h8().k(aq1.h.idea_pin_camera_flash_unavailable);
            return;
        }
        int i13 = this.f62766g == 1 ? 2 : 1;
        this.f62766g = i13;
        i0 i0Var = this.f62771l;
        if (i0Var != null) {
            i0Var.F(i13);
        }
        boolean z14 = this.f62766g == 1 && !z13;
        this.f62767h = z14;
        fVar.f66396p.e(z14);
        listener.a(this.f62766g == 1);
    }

    @Override // fp0.d
    public final void f(m.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f62765f = listener;
    }

    @Override // fp0.d
    public final void g(Function1 callbackHandler) {
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        if (b()) {
            return;
        }
        s sVar = this.f62773n;
        s sVar2 = s.f24330b;
        if (Intrinsics.d(sVar, sVar2)) {
            sVar2 = s.f24331c;
            Intrinsics.f(sVar2);
        } else {
            Intrinsics.f(sVar2);
        }
        this.f62773n = sVar2;
        this.f62766g = 2;
        this.f62767h = false;
        a();
        this.f62763d.i("PREF_IDEA_PIN_FRONT_FACING_CAMERA", k());
        callbackHandler.invoke(Boolean.valueOf(k()));
    }

    @Override // fp0.d
    public final boolean h() {
        return bs1.c.o1(this.f62761b);
    }

    @Override // fp0.d
    public final void i(boolean z13) {
        e2 e2Var;
        i0 i0Var = this.f62771l;
        if (i0Var != null) {
            i0Var.F(this.f62766g);
        }
        boolean z14 = this.f62766g == 1 && !z13;
        this.f62767h = z14;
        q0.b bVar = this.f62764e;
        if (bVar == null || (e2Var = bVar.f101749c.f66396p) == null) {
            return;
        }
        e2Var.e(z14);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a0  */
    @Override // fp0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(tt0.e0 r23, tt0.e0 r24) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.c.j(tt0.e0, tt0.e0):void");
    }

    @Override // fp0.d
    public final boolean k() {
        return Intrinsics.d(this.f62773n, s.f24330b);
    }

    @Override // fp0.d
    public final void l(d0 onStopping, u onStopped) {
        Intrinsics.checkNotNullParameter(onStopping, "onStopping");
        Intrinsics.checkNotNullParameter(onStopped, "onStopped");
        onStopping.invoke();
        this.f62768i = onStopped;
        l0 l0Var = this.f62769j;
        if (l0Var != null) {
            l0Var.close();
        }
        this.f62769j = null;
    }

    @Override // fp0.d
    public final void onDestroy() {
    }

    @Override // fp0.d
    public final void onPause() {
    }

    @Override // fp0.d
    public final void onResume() {
        a();
    }
}
