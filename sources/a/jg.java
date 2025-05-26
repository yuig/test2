package a;

import ads_mobile_sdk.yh1;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class jg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70c;

    public /* synthetic */ jg(int i13, Object obj, Object obj2) {
        this.f68a = i13;
        this.f69b = obj;
        this.f70c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68a) {
            case 0:
                yh1.a((yh1) this.f69b, (String) this.f70c);
                return;
            case 1:
                androidx.appcompat.app.r rVar = (androidx.appcompat.app.r) this.f69b;
                Runnable runnable = (Runnable) this.f70c;
                rVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    rVar.a();
                }
            case 2:
                v.n nVar = (v.n) this.f69b;
                androidx.camera.core.impl.n nVar2 = (androidx.camera.core.impl.n) this.f70c;
                v.l lVar = nVar.f123570z;
                ((Set) lVar.f123531b).remove(nVar2);
                ((Map) lVar.f123532c).remove(nVar2);
                return;
            case 3:
                v.n nVar3 = (v.n) this.f69b;
                g0.m.g(com.bumptech.glide.d.L(new v.e(nVar3.y(), nVar3)), (r4.i) this.f70c);
                return;
            case 4:
                v.i1 i1Var = (v.i1) this.f69b;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f70c;
                int i13 = v.i1.f123508d;
                i1Var.getClass();
                HashSet hashSet = new HashSet();
                Set<v.m> set = (Set) i1Var.f123510b;
                for (v.m mVar : set) {
                    if (mVar.a(totalCaptureResult)) {
                        hashSet.add(mVar);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                set.removeAll(hashSet);
                return;
            case 5:
                Surface surface = (Surface) this.f69b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f70c;
                surface.release();
                surfaceTexture.release();
                return;
            case 6:
                v.d0 d0Var = (v.d0) this.f69b;
                r4.i iVar = (r4.i) this.f70c;
                v.m2 m2Var = d0Var.f123419x;
                if (m2Var == null) {
                    iVar.b(Boolean.FALSE);
                    return;
                } else {
                    iVar.b(Boolean.valueOf(d0Var.f123396a.e(v.d0.w(m2Var))));
                    return;
                }
            case 7:
                v.d0 d0Var2 = (v.d0) this.f69b;
                String str = (String) this.f70c;
                d0Var2.getClass();
                d0Var2.t("Use case " + str + " INACTIVE", null);
                d0Var2.f123396a.f(str);
                d0Var2.K();
                return;
            case 8:
                ((androidx.camera.core.impl.k2) this.f69b).a((androidx.camera.core.impl.o2) this.f70c, androidx.camera.core.impl.m2.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 9:
                ((Set) ((v.n) this.f69b).f123546b.f123510b).remove((v.v0) this.f70c);
                return;
            case 10:
                ((v.g2) this.f69b).c((r4.i) this.f70c);
                return;
            case 11:
            case 14:
            default:
                androidx.camera.core.impl.n1 n1Var = (androidx.camera.core.impl.n1) this.f69b;
                androidx.camera.core.impl.o1 o1Var = (androidx.camera.core.impl.o1) this.f70c;
                if (n1Var.f16921a.get()) {
                    o1Var.getClass();
                    n1Var.f16922b.a(o1Var.f16929a);
                    return;
                }
                return;
            case 12:
                v.z1 z1Var = (v.z1) this.f69b;
                androidx.camera.core.impl.k1 k1Var = (androidx.camera.core.impl.k1) this.f70c;
                z1Var.getClass();
                k1Var.b(z1Var);
                return;
            case 13:
                c0.r0 r0Var = (c0.r0) this.f69b;
                androidx.camera.core.impl.k1 k1Var2 = (androidx.camera.core.impl.k1) this.f70c;
                r0Var.getClass();
                k1Var2.b(r0Var);
                return;
            case 15:
                c0.v0 v0Var = (c0.v0) this.f69b;
                c0.p1 p1Var = (c0.p1) this.f70c;
                c0.u0 u0Var = c0.w0.f24371v;
                v0Var.c(p1Var);
                return;
            case 16:
                d0.s sVar = (d0.s) this.f69b;
                c0.n0 n0Var = (c0.n0) this.f70c;
                d0.u uVar = (d0.u) sVar.f53560g;
                uVar.getClass();
                f0.h.s();
                if (uVar.f53573g) {
                    n0Var.close();
                    return;
                }
                com.bumptech.glide.d.v("onImageCaptured() must be called before onFinalResult()", uVar.f53569c.f106128b.isDone());
                uVar.a();
                d0.h hVar = uVar.f53567a;
                hVar.getClass();
                hVar.f53515b.execute(new jg(22, hVar, n0Var));
                return;
            case 17:
                d0.s sVar2 = (d0.s) this.f69b;
                c0.f0 f0Var = (c0.f0) this.f70c;
                d0.u uVar2 = (d0.u) sVar2.f53560g;
                uVar2.getClass();
                f0.h.s();
                if (uVar2.f53573g) {
                    return;
                }
                com.bumptech.glide.d.v("onImageCaptured() must be called before onFinalResult()", uVar2.f53569c.f106128b.isDone());
                uVar2.a();
                d0.h hVar2 = uVar2.f53567a;
                hVar2.getClass();
                hVar2.f53515b.execute(new jg(24, hVar2, f0Var));
                return;
            case 18:
                d0.s sVar3 = (d0.s) this.f69b;
                Bitmap bitmap = (Bitmap) this.f70c;
                d0.u uVar3 = (d0.u) sVar3.f53560g;
                uVar3.getClass();
                f0.h.s();
                if (uVar3.f53573g) {
                    return;
                }
                d0.h hVar3 = uVar3.f53567a;
                hVar3.getClass();
                hVar3.f53515b.execute(new jg(23, hVar3, bitmap));
                return;
            case 19:
                d0.s sVar4 = (d0.s) this.f69b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.f70c;
                d0.u uVar4 = (d0.u) sVar4.f53560g;
                uVar4.getClass();
                f0.h.s();
                if (uVar4.f53573g) {
                    return;
                }
                com.bumptech.glide.d.v("onImageCaptured() must be called before onFinalResult()", uVar4.f53569c.f106128b.isDone());
                uVar4.a();
                f0.h.s();
                d0.h hVar4 = uVar4.f53567a;
                hVar4.getClass();
                hVar4.f53515b.execute(new jg(21, hVar4, imageCaptureException));
                return;
            case 20:
                ((d0.a0) this.f69b).f53489e.remove((d0.u) this.f70c);
                return;
            case 21:
                d0.h hVar5 = (d0.h) this.f69b;
                ImageCaptureException e13 = (ImageCaptureException) this.f70c;
                fp0.b bVar = hVar5.f53516c;
                if (bVar == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                Intrinsics.checkNotNullParameter(e13, "e");
                bVar.f62756a.invoke(e13);
                return;
            case 22:
                ((d0.h) this.f69b).getClass();
                throw null;
            case 23:
                ((d0.h) this.f69b).getClass();
                return;
            case 24:
                d0.h hVar6 = (d0.h) this.f69b;
                c0.f0 output = (c0.f0) this.f70c;
                fp0.b bVar2 = hVar6.f53516c;
                Objects.requireNonNull(bVar2);
                Objects.requireNonNull(output);
                Intrinsics.checkNotNullParameter(output, "output");
                bVar2.f62757b.invoke(bVar2.f62758c);
                return;
            case 25:
                androidx.camera.core.impl.w0 w0Var = (androidx.camera.core.impl.w0) this.f69b;
                androidx.camera.core.impl.t1 t1Var = (androidx.camera.core.impl.t1) this.f70c;
                androidx.camera.core.impl.w0 w0Var2 = androidx.camera.core.impl.w0.f16981b;
                w0Var.getClass();
                try {
                    t1Var.a(w0Var.f16982a.f63217a);
                    return;
                } catch (InterruptedException | ExecutionException e14) {
                    t1Var.onError(e14);
                    return;
                }
            case 26:
                androidx.camera.core.impl.z0 z0Var = (androidx.camera.core.impl.z0) this.f69b;
                String str2 = (String) this.f70c;
                Size size = androidx.camera.core.impl.z0.f17001k;
                z0Var.getClass();
                try {
                    z0Var.f17009e.get();
                    z0Var.e(androidx.camera.core.impl.z0.f17004n.decrementAndGet(), androidx.camera.core.impl.z0.f17003m.get(), "Surface terminated");
                    return;
                } catch (Exception e15) {
                    kh2.m0.s("DeferrableSurface", "Unexpected surface termination for " + z0Var + "\nStack Trace:\n" + str2);
                    synchronized (z0Var.f17005a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", z0Var, Boolean.valueOf(z0Var.f17007c), Integer.valueOf(z0Var.f17006b)), e15);
                    }
                }
            case 27:
                ((androidx.lifecycle.l0) ((com.google.android.gms.internal.measurement.q4) this.f69b).f31594b).j((androidx.camera.core.impl.n1) this.f70c);
                return;
            case 28:
                com.google.android.gms.internal.measurement.q4 q4Var = (com.google.android.gms.internal.measurement.q4) this.f69b;
                r4.i iVar2 = (r4.i) this.f70c;
                androidx.camera.core.impl.o1 o1Var2 = (androidx.camera.core.impl.o1) ((androidx.lifecycle.l0) q4Var.f31594b).d();
                if (o1Var2 == null) {
                    iVar2.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    iVar2.b(o1Var2.f16929a);
                    return;
                }
        }
    }
}
