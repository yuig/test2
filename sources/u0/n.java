package u0;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import c0.x0;
import e2.i0;
import e2.v;
import h4.h0;
import h4.k0;
import h4.p;
import h4.q;
import h6.z;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l7.s0;
import l7.y;
import m60.f0;
import m7.s;
import n7.c0;
import y0.a0;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119795b;

    public /* synthetic */ n(Object obj, int i13) {
        this.f119794a = i13;
        this.f119795b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        int i13 = 0;
        Boolean bool2 = null;
        switch (this.f119794a) {
            case 0:
                e eVar = (e) ((gc.c) this.f119795b).f64764b;
                eVar.f119748q = true;
                if (eVar.f119738g == d.STARTED) {
                    eVar.a();
                    return;
                }
                return;
            case 1:
                ((a0) this.f119795b).a();
                return;
            case 2:
                v vVar = (v) this.f119795b;
                i0 i0Var = vVar.f56910a;
                if (i0Var != null) {
                    i0Var.setState(v.f56909g);
                }
                vVar.f56913d = null;
                return;
            case 3:
                k0 k0Var = (k0) this.f119795b;
                k0Var.f67585n = null;
                k2.e eVar2 = k0Var.f67584m;
                int i14 = eVar2.f78184c;
                if (i14 > 0) {
                    Object[] objArr = eVar2.f78182a;
                    int i15 = 0;
                    bool = null;
                    do {
                        h0 h0Var = (h0) objArr[i15];
                        int i16 = h4.i0.f67568a[h0Var.ordinal()];
                        if (i16 == 1) {
                            bool2 = Boolean.TRUE;
                        } else if (i16 != 2) {
                            if ((i16 == 3 || i16 == 4) && !Intrinsics.d(bool2, Boolean.FALSE)) {
                                bool = Boolean.valueOf(h0Var == h0.ShowKeyboard);
                            }
                            i15++;
                        } else {
                            bool2 = Boolean.FALSE;
                        }
                        bool = bool2;
                        i15++;
                    } while (i15 < i14);
                } else {
                    bool = null;
                }
                eVar2.h();
                if (Intrinsics.d(bool2, Boolean.TRUE)) {
                    q qVar = (q) k0Var.f67573b;
                    ((InputMethodManager) qVar.f67606b.getValue()).restartInput(qVar.f67605a);
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    p pVar = k0Var.f67573b;
                    if (booleanValue) {
                        ((e3.e) ((q) pVar).f67607c.f66449b).c();
                    } else {
                        ((e3.e) ((q) pVar).f67607c.f66449b).b();
                    }
                }
                if (Intrinsics.d(bool2, Boolean.FALSE)) {
                    q qVar2 = (q) k0Var.f67573b;
                    ((InputMethodManager) qVar2.f67606b.getValue()).restartInput(qVar2.f67605a);
                    return;
                }
                return;
            case 4:
            case 7:
            case 24:
            default:
                InputStream inputStream = (InputStream) this.f119795b;
                HashMap hashMap = com.airbnb.lottie.n.f28429a;
                jc.g.b(inputStream);
                return;
            case 5:
                Activity activity = (Activity) this.f119795b;
                int i17 = c5.c.f25774b;
                if (activity.isFinishing() || c5.e.a(activity)) {
                    return;
                }
                activity.recreate();
                return;
            case 6:
                ((z) this.f119795b).c();
                return;
            case 8:
                l7.a0 a0Var = (l7.a0) this.f119795b;
                int[] iArr = l7.a0.f81709w;
                a0Var.getClass();
                a0Var.f81881a.e(new y(a0Var, 6), true);
                return;
            case 9:
                ((s0) ((x0) this.f119795b).f24392b).f81859d.getClass();
                return;
            case 10:
                m7.b bVar = (m7.b) this.f119795b;
                if (bVar.f86095c.f86115b) {
                    bVar.f86093a.f86205a.I0(3, false);
                    return;
                }
                return;
            case 11:
                ((f0) this.f119795b).getClass();
                return;
            case 12:
                ((s) this.f119795b).getClass();
                throw null;
            case 13:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(((androidx.appcompat.app.i0) this.f119795b).f16053b);
                throw null;
            case 14:
                c0 c0Var = (c0) this.f119795b;
                n7.b r13 = c0Var.r();
                c0Var.x(r13, 1028, new n7.j(r13, i13));
                c0Var.f89399f.k();
                return;
            case 15:
                o7.f0 f0Var = (o7.f0) this.f119795b;
                if (f0Var.f93070i0 >= 300000) {
                    ((o7.h0) f0Var.f93081s.f66449b).Q0 = true;
                    f0Var.f93070i0 = 0L;
                    return;
                }
                return;
            case 16:
                s7.g gVar = (s7.g) this.f119795b;
                if (gVar.f111293c) {
                    return;
                }
                s7.j jVar = gVar.f111292b;
                if (jVar != null) {
                    jVar.c(gVar.f111291a);
                }
                gVar.f111294d.f111307n.remove(gVar);
                gVar.f111293c = true;
                return;
            case 17:
                ((s7.d) this.f119795b).c(null);
                return;
            case 18:
                ((HandlerThread) this.f119795b).quit();
                return;
            case 19:
                d8.f fVar = (d8.f) this.f119795b;
                int i18 = d8.f.B;
                fVar.y();
                return;
            case 20:
                ((n8.s) this.f119795b).f89887p--;
                return;
            case 21:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f119795b;
                Surface surface = sphericalGLSurfaceView.f18865h;
                if (surface != null) {
                    Iterator it = sphericalGLSurfaceView.f18858a.iterator();
                    while (it.hasNext()) {
                        ((m7.i0) it.next()).f86205a.D0(null);
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f18864g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f18864g = null;
                sphericalGLSurfaceView.f18865h = null;
                return;
            case 22:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.f119795b;
                int i19 = DefaultTimeBar.P;
                defaultTimeBar.m(false);
                return;
            case 23:
                PlayerControlView playerControlView = (PlayerControlView) this.f119795b;
                float[] fArr = PlayerControlView.U;
                playerControlView.g();
                return;
            case 25:
                ja.s sVar = (ja.s) this.f119795b;
                synchronized (sVar.f75274m) {
                    sVar.f75268g = false;
                    ja.o oVar = sVar.f75270i;
                    synchronized (oVar) {
                        Arrays.fill(oVar.f75250b, false);
                        oVar.f75252d = true;
                        Unit unit = Unit.f80348a;
                    }
                    oa.i iVar = sVar.f75269h;
                    if (iVar != null) {
                        iVar.close();
                    }
                }
                return;
            case 26:
                ab.d dVar = (ab.d) this.f119795b;
                int i23 = ab.e.f1688a;
                dVar.onSuccess(new ab.c());
                return;
            case 27:
                p5.a callback = (p5.a) this.f119795b;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.accept(new eb.p(q0.f80391a));
                return;
            case 28:
                ((AtomicBoolean) this.f119795b).set(true);
                return;
        }
    }
}
