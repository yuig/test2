package fn0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.os.HandlerThread;
import android.view.Surface;
import ao2.i1;
import do2.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public c f62664a;

    /* renamed from: b, reason: collision with root package name */
    public e f62665b;

    /* renamed from: c, reason: collision with root package name */
    public in0.f f62666c;

    /* renamed from: d, reason: collision with root package name */
    public e f62667d;

    /* renamed from: e, reason: collision with root package name */
    public hn0.e f62668e;

    /* renamed from: f, reason: collision with root package name */
    public hn0.h f62669f;

    /* renamed from: h, reason: collision with root package name */
    public long f62671h;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f62670g = kotlin.jvm.internal.r.c0("Decoder-worker");

    /* renamed from: i, reason: collision with root package name */
    public long f62672i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f62673j = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r16, java.lang.String r17, fn0.g r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.t.a(java.lang.String, java.lang.String, fn0.g, bl2.c):java.lang.Object");
    }

    public final void b() {
        e eVar = this.f62667d;
        if (eVar != null) {
            eVar.f62614a.release();
        }
        hn0.e eVar2 = this.f62668e;
        if (eVar2 != null) {
            eVar2.f69620c.release();
        }
        e eVar3 = this.f62665b;
        if (eVar3 != null) {
            eVar3.f62614a.release();
        }
        in0.f fVar = this.f62666c;
        if (fVar != null) {
            e eVar4 = fVar.f72809a;
            if (eVar4 == null) {
                Intrinsics.r("mediaExtractor");
                throw null;
            }
            eVar4.f62614a.release();
            MediaCodec mediaCodec = fVar.f72810b;
            if (mediaCodec == null) {
                Intrinsics.r("decoder");
                throw null;
            }
            mediaCodec.release();
            in0.h hVar = fVar.f72812d;
            if (hVar == null) {
                Intrinsics.r("renderer");
                throw null;
            }
            hVar.c().a();
            gn0.b a13 = hVar.a();
            a13.f65805d.release();
            SurfaceTexture surfaceTexture = a13.f65804c;
            surfaceTexture.setOnFrameAvailableListener(null);
            surfaceTexture.release();
            HandlerThread handlerThread = a13.f65802a;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            bh.b bVar = hVar.f72825f;
            if (bVar != null) {
                bVar.v();
            }
            hVar.f72824e.b();
            SurfaceTexture surfaceTexture2 = fVar.f72813e;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
            }
            fVar.f72814f.close();
        }
        c cVar = this.f62664a;
        if (cVar != null) {
            cVar.f62608b.release();
            cVar.f62609c.close();
            Surface surface = cVar.f62611e;
            if (surface != null) {
                surface.release();
            }
        }
        hn0.h hVar2 = this.f62669f;
        if (hVar2 != null) {
            hVar2.f69631c.a();
            dn0.b bVar2 = hVar2.f69636h;
            if (bVar2 != null) {
                bVar2.a();
            }
            hVar2.f69636h = null;
            gn0.b a14 = hVar2.a();
            a14.f65805d.release();
            SurfaceTexture surfaceTexture3 = a14.f65804c;
            surfaceTexture3.setOnFrameAvailableListener(null);
            surfaceTexture3.release();
            HandlerThread handlerThread2 = a14.f65802a;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            bh.b bVar3 = hVar2.f69635g;
            if (bVar3 != null) {
                bVar3.v();
            }
            hVar2.f69634f.b();
        }
        this.f62670g.close();
    }

    public final j0 c() {
        return new j0(new do2.e(new s(this, null), kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND), new cn0.t(1, null));
    }
}
