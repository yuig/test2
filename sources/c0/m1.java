package c0;

import a.ig;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import androidx.appcompat.widget.c2;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import com.google.android.gms.internal.measurement.q4;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m1 implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24286c;

    public /* synthetic */ m1(int i13, Object obj, Object obj2) {
        this.f24284a = i13;
        this.f24286c = obj;
        this.f24285b = obj2;
    }

    public final void a() {
        int i13 = this.f24284a;
        Object obj = this.f24286c;
        Object obj2 = this.f24285b;
        switch (i13) {
            case 0:
                ((Runnable) obj2).run();
                break;
            case 1:
                break;
            case 2:
                ((d0.a0) obj).f53486b.P();
                break;
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                ((y0.a0) obj).f136258k.f136290n.remove((y0.i) obj2);
                break;
            case 6:
                ((r4.i) obj2).b((w) obj);
                break;
            case 8:
                kh2.m0.p("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(((u0.e) obj2).hashCode())));
                break;
        }
    }

    public final void b(f1 f1Var) {
        int i13 = this.f24284a;
        Object obj = this.f24286c;
        switch (i13) {
            case 4:
                f1Var.getClass();
                try {
                    ((l0.u) ((m.h) obj).f85197b).b(f1Var);
                    break;
                } catch (ProcessingException e13) {
                    kh2.m0.t("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e13);
                    return;
                }
            default:
                f1Var.getClass();
                try {
                    ((l0.u) ((androidx.camera.core.impl.j) obj).f16875b).b(f1Var);
                    break;
                } catch (ProcessingException e14) {
                    kh2.m0.t("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e14);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:20:0x009e, B:21:0x00a4, B:24:0x0118, B:39:0x00a9, B:40:0x00b5, B:43:0x00bb, B:44:0x00c2, B:46:0x00c6, B:48:0x00d4, B:49:0x00e7, B:51:0x00eb, B:54:0x00f3, B:56:0x00f9, B:57:0x0104, B:59:0x010f), top: B:19:0x009e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(y0.m r9) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.m1.c(y0.m):void");
    }

    @Override // g0.c
    public final void onFailure(Throwable t13) {
        r0.i iVar = null;
        switch (this.f24284a) {
            case 0:
                return;
            case 1:
                f0.h.s();
                d0.s sVar = (d0.s) this.f24285b;
                c2 c2Var = (c2) this.f24286c;
                if (sVar == ((d0.s) c2Var.f16531b)) {
                    kh2.m0.X0("CaptureNode", "request aborted, id=" + ((d0.s) c2Var.f16531b).f53554a);
                    sp2.i iVar2 = (sp2.i) c2Var.f16536g;
                    if (iVar2 != null) {
                        iVar2.f114929c = null;
                    }
                    c2Var.f16531b = null;
                    return;
                }
                return;
            case 2:
                d0.k kVar = (d0.k) this.f24285b;
                if (((d0.u) kVar.f53525b).f53573g) {
                    return;
                }
                int a13 = ((androidx.camera.core.impl.s0) kVar.f53524a.get(0)).a();
                boolean z13 = t13 instanceof ImageCaptureException;
                Object obj = this.f24286c;
                if (z13) {
                    d0.n nVar = ((d0.a0) obj).f53487c;
                    d0.g gVar = new d0.g(a13, (ImageCaptureException) t13);
                    nVar.getClass();
                    f0.h.s();
                    nVar.f53535e.f53501k.accept(gVar);
                } else {
                    d0.n nVar2 = ((d0.a0) obj).f53487c;
                    d0.g gVar2 = new d0.g(a13, new ImageCaptureException("Failed to submit capture request", t13));
                    nVar2.getClass();
                    f0.h.s();
                    nVar2.f53535e.f53501k.accept(gVar2);
                }
                ((d0.a0) obj).f53486b.P();
                return;
            case 3:
                ((r4.i) this.f24285b).d(t13);
                return;
            case 4:
                l0.s sVar2 = (l0.s) this.f24285b;
                if (sVar2.f81272f == 2 && (t13 instanceof CancellationException)) {
                    kh2.m0.p("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                kh2.m0.Y0("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + kh2.d.D(sVar2.f81272f), t13);
                return;
            case 5:
                l0.s sVar3 = (l0.s) this.f24285b;
                if (sVar3.f81272f == 2 && (t13 instanceof CancellationException)) {
                    kh2.m0.p("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                kh2.m0.Y0("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + kh2.d.D(sVar3.f81272f), t13);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(t13, "t");
                ((r4.i) this.f24285b).d(t13);
                return;
            case 7:
                kh2.m0.p("Recorder", "Error in ReadyToReleaseFuture: " + t13);
                return;
            case 8:
                kh2.m0.p("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(((u0.e) this.f24285b).hashCode())));
                return;
            case 9:
                kh2.m0.Y0("Recorder", "VideoEncoder Setup error: " + t13, t13);
                r0.h0 h0Var = (r0.h0) this.f24286c;
                int i13 = h0Var.f105525e;
                if (i13 < h0Var.f105523c) {
                    h0Var.f105525e = i13 + 1;
                    ig igVar = new ig(this, 26);
                    h0Var.f105526f = l3.c.H0().schedule(new l0.e(6, h0Var.f105527g.f105561d, igVar), r0.j0.f105553n0, TimeUnit.MILLISECONDS);
                    return;
                }
                r0.j0 j0Var = h0Var.f105527g;
                synchronized (j0Var.f105566g) {
                    try {
                        switch (j0Var.f105569j.ordinal()) {
                            case 1:
                            case 2:
                                r0.i iVar3 = j0Var.f105573n;
                                j0Var.f105573n = null;
                                iVar = iVar3;
                            case 0:
                                j0Var.D(-1);
                                j0Var.C(r0.i0.ERROR);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + j0Var.f105569j + ": " + t13);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (iVar != null) {
                    j0Var.j(iVar, 7, t13);
                    return;
                }
                return;
            case 10:
                u0.e eVar = (u0.e) this.f24286c;
                if (eVar.f119743l != ((y0.j) this.f24285b)) {
                    return;
                }
                kh2.m0.p("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                if (t13 instanceof IllegalStateException) {
                    return;
                }
                Executor executor = eVar.f119741j;
                q4 q4Var = eVar.f119742k;
                if (executor == null || q4Var == null) {
                    return;
                }
                executor.execute(new l0.e(15, q4Var, t13));
                return;
            case 11:
                y0.a0 a0Var = (y0.a0) this.f24286c;
                a0Var.f136258k.f136290n.remove((y0.i) this.f24285b);
                if (!(t13 instanceof MediaCodec.CodecException)) {
                    a0Var.f136258k.b(0, t13.getMessage(), t13);
                    return;
                }
                y0.c0 c0Var = a0Var.f136258k;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) t13;
                c0Var.getClass();
                c0Var.b(1, codecException.getMessage(), codecException);
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", t13);
        }
    }

    @Override // g0.c
    public final void onSuccess(Object obj) {
        int i13 = this.f24284a;
        Object obj2 = this.f24286c;
        Object obj3 = this.f24285b;
        switch (i13) {
            case 0:
                a();
                return;
            case 1:
                a();
                return;
            case 2:
                a();
                return;
            case 3:
                try {
                    ((r4.i) obj3).b(((q.a) obj2).apply(obj));
                    return;
                } catch (Throwable th3) {
                    ((r4.i) obj3).d(th3);
                    return;
                }
            case 4:
                b((f1) obj);
                return;
            case 5:
                b((f1) obj);
                return;
            case 6:
                a();
                return;
            case 7:
                c((y0.m) obj);
                return;
            case 8:
                a();
                return;
            case 9:
                c((y0.m) obj);
                return;
            case 10:
                y0.d0 d0Var = (y0.d0) obj;
                u0.e eVar = (u0.e) obj2;
                if (!eVar.f119740i || eVar.f119743l != ((y0.j) obj3)) {
                    d0Var.a();
                    return;
                }
                boolean z13 = eVar.f119746o;
                u0.f fVar = eVar.f119736e;
                u0.f fVar2 = eVar.f119735d;
                if (z13) {
                    com.bumptech.glide.d.v(null, eVar.f119747p > 0);
                    if (System.nanoTime() - eVar.f119747p >= eVar.f119737f) {
                        com.bumptech.glide.d.v(null, eVar.f119746o);
                        try {
                            fVar2.start();
                            kh2.m0.p("AudioSource", "Retry start AudioStream succeed");
                            fVar.stop();
                            eVar.f119746o = false;
                        } catch (AudioStream$AudioStreamException e13) {
                            kh2.m0.Y0("AudioSource", "Retry start AudioStream failed", e13);
                            eVar.f119747p = System.nanoTime();
                        }
                    }
                }
                if (!eVar.f119746o) {
                    fVar = fVar2;
                }
                if (d0Var.f136317f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                ByteBuffer byteBuffer = d0Var.f136314c;
                u0.j read = fVar.read(byteBuffer);
                int i14 = read.f119774a;
                if (i14 > 0) {
                    if (eVar.f119749r) {
                        byte[] bArr = eVar.f119750s;
                        if (bArr == null || bArr.length < i14) {
                            eVar.f119750s = new byte[i14];
                        }
                        int position = byteBuffer.position();
                        byteBuffer.put(eVar.f119750s, 0, i14);
                        byteBuffer.limit(byteBuffer.position()).position(position);
                    }
                    Executor executor = eVar.f119741j;
                    long j13 = read.f119775b;
                    if (executor != null && j13 - eVar.f119752u >= 200) {
                        eVar.f119752u = j13;
                        q4 q4Var = eVar.f119742k;
                        if (eVar.f119753v == 2) {
                            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                            double d2 = 0.0d;
                            while (asShortBuffer.hasRemaining()) {
                                d2 = Math.max(d2, Math.abs((int) asShortBuffer.get()));
                            }
                            eVar.f119751t = d2 / 32767.0d;
                            if (q4Var != null) {
                                executor.execute(new l0.e(14, eVar, q4Var));
                            }
                        }
                    }
                    byteBuffer.limit(byteBuffer.position() + i14);
                    long micros = TimeUnit.NANOSECONDS.toMicros(j13);
                    if (d0Var.f136317f.get()) {
                        throw new IllegalStateException("The buffer is submitted or canceled.");
                    }
                    com.bumptech.glide.d.h(micros >= 0);
                    d0Var.f136318g = micros;
                    d0Var.b();
                } else {
                    kh2.m0.X0("AudioSource", "Unable to read data from AudioStream.");
                    d0Var.a();
                }
                eVar.c();
                return;
            case 11:
                a();
                return;
            default:
                com.bumptech.glide.d.v("Unexpected result from SurfaceRequest. Surface was provided twice.", ((j) obj).f24266a != 3);
                kh2.m0.p("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) obj3).release();
                b1.v vVar = (b1.v) ((b1.u) obj2).f20831b;
                if (vVar.f20837j != null) {
                    vVar.f20837j = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ m1(r4.i iVar, Object obj, int i13) {
        this.f24284a = i13;
        this.f24285b = iVar;
        this.f24286c = obj;
    }
}
