package w2;

import a.a4;
import a7.b1;
import a8.m;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.strictmode.Violation;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import c0.x0;
import com.google.android.gms.internal.measurement.q4;
import com.google.firebase.messaging.a0;
import d7.f0;
import d7.n0;
import d7.r;
import d7.u;
import g8.e0;
import g8.t0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l0.p;
import l7.c0;
import l7.s0;
import l7.w;
import l7.y0;
import l7.z0;
import m7.i0;
import m7.k0;
import m7.l0;
import m7.o1;
import m7.r0;
import m7.r1;
import m7.t1;
import m7.u0;
import n5.q;
import n7.v;
import n8.o;
import n8.s;
import ok.t;
import s7.g;
import s7.h;
import t7.l;
import t7.n;
import x4.d0;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f127604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f127605c;

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f127603a = i13;
        this.f127604b = obj;
        this.f127605c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z13;
        long j13;
        long j14;
        final int i13 = 0;
        boolean z14 = true;
        z14 = true;
        switch (this.f127603a) {
            case 0:
                d.a((f) this.f127604b, (LongSparseArray) this.f127605c);
                return;
            case 1:
                d0 d0Var = (d0) this.f127604b;
                View[] viewArr = (View[]) this.f127605c;
                if (d0Var.f131732p != -1) {
                    for (View view : viewArr) {
                        view.setTag(d0Var.f131732p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (d0Var.f131733q != -1) {
                    int length = viewArr.length;
                    while (i13 < length) {
                        viewArr[i13].setTag(d0Var.f131733q, null);
                        i13++;
                    }
                    return;
                }
                return;
            case 2:
                h1.b splashScreenViewProvider = (h1.b) this.f127604b;
                a0 finalListener = (a0) this.f127605c;
                Intrinsics.checkNotNullParameter(splashScreenViewProvider, "$splashScreenViewProvider");
                Intrinsics.checkNotNullParameter(finalListener, "$finalListener");
                ((q) splashScreenViewProvider.f66449b).c().bringToFront();
                finalListener.k(splashScreenViewProvider);
                return;
            case 3:
            case 24:
            case 25:
            default:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f127604b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f127605c;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f18864g;
                Surface surface = sphericalGLSurfaceView.f18865h;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f18864g = surfaceTexture;
                sphericalGLSurfaceView.f18865h = surface2;
                Iterator it = sphericalGLSurfaceView.f18858a.iterator();
                while (it.hasNext()) {
                    ((i0) it.next()).f86205a.D0(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 4:
                String str = (String) this.f127604b;
                Violation violation = (Violation) this.f127605c;
                m6.b bVar = m6.c.f85884a;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
                throw violation;
            case 5:
                d7.d dVar = (d7.d) this.f127604b;
                Object apply = ((t) this.f127605c).apply(dVar.f53801e);
                dVar.f53801e = apply;
                dVar.f53798b.d(new c(6, dVar, apply));
                return;
            case 6:
                d7.d dVar2 = (d7.d) this.f127604b;
                int i14 = dVar2.f53802f - 1;
                dVar2.f53802f = i14;
                if (i14 == 0) {
                    Object obj = this.f127605c;
                    Object obj2 = dVar2.f53800d;
                    dVar2.f53800d = obj;
                    if (obj2.equals(obj)) {
                        return;
                    }
                    dVar2.f53799c.j(obj2, obj);
                    return;
                }
                return;
            case 7:
                ((l7.a) this.f127604b).f81705d.b(VideoFrameProcessingException.a((Exception) this.f127605c));
                return;
            case 8:
                w wVar = (w) this.f127604b;
                InterruptedException interruptedException = (InterruptedException) this.f127605c;
                int i15 = w.f81892u;
                wVar.getClass();
                ((x0) wVar.f81899g).a(VideoFrameProcessingException.a(interruptedException));
                return;
            case 9:
                c0 c0Var = (c0) this.f127604b;
                InterruptedException interruptedException2 = (InterruptedException) this.f127605c;
                c0Var.getClass();
                ((x0) c0Var.f81749j).a(VideoFrameProcessingException.a(interruptedException2));
                return;
            case 10:
                c0 c0Var2 = (c0) this.f127604b;
                GlUtil$GlException glUtil$GlException = (GlUtil$GlException) this.f127605c;
                c0Var2.getClass();
                ((x0) c0Var2.f81749j).a(VideoFrameProcessingException.a(glUtil$GlException));
                return;
            case 11:
                c0 c0Var3 = (c0) this.f127604b;
                f0 f0Var = (f0) this.f127605c;
                c0Var3.getClass();
                int i16 = f0Var.f53821a;
                x0 x0Var = (x0) c0Var3.f81749j;
                ((s0) x0Var.f24392b).f81861f.execute(new p(x0Var, i16, f0Var.f53822b, z14 ? 1 : 0));
                return;
            case 12:
                x0 x0Var2 = (x0) this.f127604b;
                VideoFrameProcessingException videoFrameProcessingException = (VideoFrameProcessingException) this.f127605c;
                Iterator it2 = ((s) ((s0) x0Var2.f24392b).f81859d).f89881j.iterator();
                while (it2.hasNext()) {
                    o oVar = (o) it2.next();
                    oVar.f89867j.execute(new a4(oVar, oVar.f89866i, videoFrameProcessingException, 28));
                }
                return;
            case 13:
                z0 z0Var = (z0) this.f127604b;
                y0 y0Var = (y0) this.f127605c;
                z0Var.getClass();
                try {
                    y0Var.run();
                    return;
                } catch (Exception e13) {
                    z0Var.b(e13);
                    return;
                }
            case 14:
                ((m60.f0) this.f127604b).getClass();
                throw null;
            case 15:
                ((m7.s) this.f127604b).getClass();
                throw null;
            case 16:
                l0 l0Var = (l0) this.f127604b;
                r0 r0Var = (r0) this.f127605c;
                int i17 = l0Var.f86251J - r0Var.f86371c;
                l0Var.f86251J = i17;
                if (r0Var.f86372d) {
                    l0Var.K = r0Var.f86373e;
                    l0Var.L = true;
                }
                if (i17 == 0) {
                    b1 b1Var = r0Var.f86370b.f86330a;
                    if (!l0Var.f86276m0.f86330a.q() && b1Var.q()) {
                        l0Var.f86278n0 = -1;
                        l0Var.f86280o0 = 0L;
                    }
                    if (!b1Var.q()) {
                        List asList = Arrays.asList(((t1) b1Var).f86398h);
                        bf.b.t(asList.size() == l0Var.f86282q.size());
                        for (int i18 = 0; i18 < asList.size(); i18++) {
                            ((k0) l0Var.f86282q.get(i18)).f86239b = (b1) asList.get(i18);
                        }
                    }
                    if (l0Var.L) {
                        if (r0Var.f86370b.f86331b.equals(l0Var.f86276m0.f86331b) && r0Var.f86370b.f86333d == l0Var.f86276m0.f86348s) {
                            z14 = false;
                        }
                        if (z14) {
                            if (b1Var.q() || r0Var.f86370b.f86331b.b()) {
                                j14 = r0Var.f86370b.f86333d;
                            } else {
                                o1 o1Var = r0Var.f86370b;
                                e0 e0Var = o1Var.f86331b;
                                long j15 = o1Var.f86333d;
                                Object obj3 = e0Var.f64233a;
                                a7.z0 z0Var2 = l0Var.f86281p;
                                b1Var.h(obj3, z0Var2);
                                j14 = j15 + z0Var2.f1255e;
                            }
                            j13 = j14;
                            z13 = z14;
                            l0Var.L = false;
                            l0Var.J0(r0Var.f86370b, 1, z13, l0Var.K, j13, -1, false);
                            return;
                        }
                        z13 = z14;
                    } else {
                        z13 = false;
                    }
                    j13 = -9223372036854775807L;
                    l0Var.L = false;
                    l0Var.J0(r0Var.f86370b, 1, z13, l0Var.K, j13, -1, false);
                    return;
                }
                return;
            case 17:
                u0 u0Var = (u0) this.f127604b;
                r1 r1Var = (r1) this.f127605c;
                int i19 = u0.f86403g0;
                u0Var.getClass();
                try {
                    synchronized (r1Var) {
                    }
                    try {
                        r1Var.f86374a.b(r1Var.f86376c, r1Var.f86377d);
                        return;
                    } finally {
                        r1Var.a(true);
                    }
                } catch (ExoPlaybackException e14) {
                    u.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e14);
                    throw new RuntimeException(e14);
                }
            case 18:
                qq2.c cVar = (qq2.c) this.f127604b;
                final String str2 = (String) this.f127605c;
                i0 i0Var = (i0) cVar.f104884c;
                int i23 = n0.f53866a;
                n7.c0 c0Var4 = (n7.c0) i0Var.f86205a.f86285t;
                final n7.b w13 = c0Var4.w();
                c0Var4.x(w13, 1012, new r() { // from class: n7.n
                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj4) {
                        int i24 = i13;
                        String str3 = str2;
                        b bVar2 = w13;
                        c cVar2 = (c) obj4;
                        switch (i24) {
                            case 0:
                                cVar2.T(bVar2, str3);
                                break;
                            default:
                                cVar2.a(bVar2, str3);
                                break;
                        }
                    }
                });
                return;
            case 19:
                g gVar = (g) this.f127604b;
                androidx.media3.common.b bVar2 = (androidx.media3.common.b) this.f127605c;
                h hVar = gVar.f111294d;
                if (hVar.f111309p == 0 || gVar.f111293c) {
                    return;
                }
                Looper looper = hVar.f111313t;
                looper.getClass();
                gVar.f111292b = hVar.g(looper, gVar.f111291a, bVar2, false);
                hVar.f111307n.add(gVar);
                return;
            case 20:
                ((v7.b) ((v7.c) ((n) ((t7.t) this.f127604b).f116579c.f116429b).f116523b).f124248d.get(((l) this.f127605c).f116508m)).c(true);
                return;
            case 21:
                v7.b bVar3 = (v7.b) this.f127604b;
                Uri uri = (Uri) this.f127605c;
                bVar3.f124240i = false;
                bVar3.f(uri);
                return;
            case 22:
                m.a((m) this.f127604b, (List) this.f127605c);
                return;
            case 23:
                t0 t0Var = (t0) this.f127604b;
                q8.e0 e0Var2 = (q8.e0) this.f127605c;
                Map map = t0.R;
                t0Var.E(e0Var2);
                return;
            case 26:
                ((n8.c) ((q4) this.f127604b).f31595c).f89756i.e((a7.o1) this.f127605c);
                return;
            case 27:
                tb.c cVar2 = (tb.c) this.f127604b;
                Exception exc = (Exception) this.f127605c;
                n8.i0 i0Var2 = (n8.i0) cVar2.f116960b;
                int i24 = n0.f53866a;
                n7.c0 c0Var5 = (n7.c0) ((i0) i0Var2).f86205a.f86285t;
                n7.b w14 = c0Var5.w();
                c0Var5.x(w14, 1030, new v(w14, exc, i13));
                return;
            case 28:
                tb.c cVar3 = (tb.c) this.f127604b;
                final String str3 = (String) this.f127605c;
                n8.i0 i0Var3 = (n8.i0) cVar3.f116960b;
                int i25 = n0.f53866a;
                n7.c0 c0Var6 = (n7.c0) ((i0) i0Var3).f86205a.f86285t;
                final n7.b w15 = c0Var6.w();
                final int i26 = z14 ? 1 : 0;
                c0Var6.x(w15, 1019, new r() { // from class: n7.n
                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj4) {
                        int i242 = i26;
                        String str32 = str3;
                        b bVar22 = w15;
                        c cVar22 = (c) obj4;
                        switch (i242) {
                            case 0:
                                cVar22.T(bVar22, str32);
                                break;
                            default:
                                cVar22.a(bVar22, str32);
                                break;
                        }
                    }
                });
                return;
        }
    }
}
