package x7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import d7.n0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f134004a;

    /* renamed from: b, reason: collision with root package name */
    public final f f134005b;

    /* renamed from: c, reason: collision with root package name */
    public final m f134006c;

    /* renamed from: d, reason: collision with root package name */
    public final j f134007d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134008e;

    /* renamed from: f, reason: collision with root package name */
    public int f134009f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f134004a = mediaCodec;
        this.f134005b = new f(handlerThread);
        this.f134006c = mVar;
        this.f134007d = jVar;
    }

    public static void q(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i13) {
        j jVar;
        f fVar = cVar.f134005b;
        bf.b.t(fVar.f134026c == null);
        HandlerThread handlerThread = fVar.f134025b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.f134004a;
        mediaCodec.setCallback(fVar, handler);
        fVar.f134026c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i13);
        Trace.endSection();
        cVar.f134006c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (n0.f53866a >= 35 && (jVar = cVar.f134007d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f134009f = 1;
    }

    public static String r(int i13, String str) {
        StringBuilder sb3 = new StringBuilder(str);
        if (i13 == 1) {
            sb3.append("Audio");
        } else if (i13 == 2) {
            sb3.append("Video");
        } else {
            sb3.append("Unknown(");
            sb3.append(i13);
            sb3.append(")");
        }
        return sb3.toString();
    }

    @Override // x7.l
    public final void a() {
        j jVar;
        j jVar2;
        try {
            if (this.f134009f == 1) {
                this.f134006c.shutdown();
                f fVar = this.f134005b;
                synchronized (fVar.f134024a) {
                    fVar.f134036m = true;
                    fVar.f134025b.quit();
                    fVar.a();
                }
            }
            this.f134009f = 2;
            if (this.f134008e) {
                return;
            }
            try {
                int i13 = n0.f53866a;
                if (i13 >= 30 && i13 < 33) {
                    this.f134004a.stop();
                }
                if (i13 >= 35 && (jVar2 = this.f134007d) != null) {
                    jVar2.c(this.f134004a);
                }
                this.f134004a.release();
                this.f134008e = true;
            } finally {
            }
        } catch (Throwable th3) {
            if (!this.f134008e) {
                try {
                    int i14 = n0.f53866a;
                    if (i14 >= 30 && i14 < 33) {
                        this.f134004a.stop();
                    }
                    if (i14 >= 35 && (jVar = this.f134007d) != null) {
                        jVar.c(this.f134004a);
                    }
                    this.f134004a.release();
                    this.f134008e = true;
                } finally {
                }
            }
            throw th3;
        }
    }

    @Override // x7.l
    public final void b(int i13, k7.c cVar, long j13, int i14) {
        this.f134006c.b(i13, cVar, j13, i14);
    }

    @Override // x7.l
    public final void c(Bundle bundle) {
        this.f134006c.c(bundle);
    }

    @Override // x7.l
    public final void d(int i13, int i14, int i15, long j13) {
        this.f134006c.d(i13, i14, i15, j13);
    }

    @Override // x7.l
    public final void e(n8.h hVar, Handler handler) {
        this.f134004a.setOnFrameRenderedListener(new a(this, hVar, 0), handler);
    }

    @Override // x7.l
    public final MediaFormat f() {
        MediaFormat mediaFormat;
        f fVar = this.f134005b;
        synchronized (fVar.f134024a) {
            try {
                mediaFormat = fVar.f134031h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mediaFormat;
    }

    @Override // x7.l
    public final void flush() {
        this.f134006c.flush();
        this.f134004a.flush();
        f fVar = this.f134005b;
        synchronized (fVar.f134024a) {
            fVar.f134035l++;
            Handler handler = fVar.f134026c;
            int i13 = n0.f53866a;
            handler.post(new androidx.activity.d(fVar, 11));
        }
        this.f134004a.start();
    }

    @Override // x7.l
    public final void g() {
        this.f134004a.detachOutputSurface();
    }

    @Override // x7.l
    public final void h(int i13) {
        this.f134004a.setVideoScalingMode(i13);
    }

    @Override // x7.l
    public final ByteBuffer i(int i13) {
        return this.f134004a.getInputBuffer(i13);
    }

    @Override // x7.l
    public final void j(Surface surface) {
        this.f134004a.setOutputSurface(surface);
    }

    @Override // x7.l
    public final boolean k(h1.b bVar) {
        f fVar = this.f134005b;
        synchronized (fVar.f134024a) {
            fVar.f134038o = bVar;
        }
        return true;
    }

    @Override // x7.l
    public final void l(int i13) {
        this.f134004a.releaseOutputBuffer(i13, false);
    }

    @Override // x7.l
    public final void m(int i13, long j13) {
        this.f134004a.releaseOutputBuffer(i13, j13);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: all -> 0x002d, DONT_GENERATE, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0020, B:18:0x002b, B:22:0x002f, B:25:0x0044, B:27:0x003a, B:28:0x0046, B:29:0x004b, B:31:0x004c, B:32:0x004e, B:33:0x004f, B:34:0x0051, B:35:0x0052, B:36:0x0054), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0020, B:18:0x002b, B:22:0x002f, B:25:0x0044, B:27:0x003a, B:28:0x0046, B:29:0x004b, B:31:0x004c, B:32:0x004e, B:33:0x004f, B:34:0x0051, B:35:0x0052, B:36:0x0054), top: B:3:0x000a }] */
    @Override // x7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n() {
        /*
            r6 = this;
            x7.m r0 = r6.f134006c
            r0.h()
            x7.f r0 = r6.f134005b
            java.lang.Object r1 = r0.f134024a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f134037n     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 != 0) goto L52
            android.media.MediaCodec$CodecException r2 = r0.f134033j     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L4f
            android.media.MediaCodec$CryptoException r2 = r0.f134034k     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L4c
            long r2 = r0.f134035l     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L27
            boolean r2 = r0.f134036m     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L25
            goto L27
        L25:
            r2 = 0
            goto L28
        L27:
            r2 = r3
        L28:
            r4 = -1
            if (r2 == 0) goto L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r0 = move-exception
            goto L55
        L2f:
            g1.i r0 = r0.f134027d     // Catch: java.lang.Throwable -> L2d
            int r2 = r0.f63271a     // Catch: java.lang.Throwable -> L2d
            int r5 = r0.f63272b     // Catch: java.lang.Throwable -> L2d
            if (r2 != r5) goto L38
            goto L44
        L38:
            if (r2 == r5) goto L46
            int[] r4 = r0.f63273c     // Catch: java.lang.Throwable -> L2d
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L2d
            int r2 = r2 + r3
            int r3 = r0.f63274d     // Catch: java.lang.Throwable -> L2d
            r2 = r2 & r3
            r0.f63271a = r2     // Catch: java.lang.Throwable -> L2d
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
        L45:
            return r4
        L46:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            throw r0     // Catch: java.lang.Throwable -> L2d
        L4c:
            r0.f134034k = r3     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L4f:
            r0.f134033j = r3     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L52:
            r0.f134037n = r3     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.c.n():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: all -> 0x002d, DONT_GENERATE, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0020, B:18:0x002b, B:22:0x002f, B:24:0x0037, B:27:0x003b, B:29:0x0047, B:30:0x006e, B:33:0x0064, B:34:0x0070, B:35:0x0075, B:37:0x0076, B:38:0x0078, B:39:0x0079, B:40:0x007b, B:41:0x007c, B:42:0x007e), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0020, B:18:0x002b, B:22:0x002f, B:24:0x0037, B:27:0x003b, B:29:0x0047, B:30:0x006e, B:33:0x0064, B:34:0x0070, B:35:0x0075, B:37:0x0076, B:38:0x0078, B:39:0x0079, B:40:0x007b, B:41:0x007c, B:42:0x007e), top: B:3:0x000a }] */
    @Override // x7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(android.media.MediaCodec.BufferInfo r12) {
        /*
            r11 = this;
            x7.m r0 = r11.f134006c
            r0.h()
            x7.f r0 = r11.f134005b
            java.lang.Object r1 = r0.f134024a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f134037n     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 != 0) goto L7c
            android.media.MediaCodec$CodecException r2 = r0.f134033j     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L79
            android.media.MediaCodec$CryptoException r2 = r0.f134034k     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L76
            long r2 = r0.f134035l     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L27
            boolean r2 = r0.f134036m     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L25
            goto L27
        L25:
            r2 = 0
            goto L28
        L27:
            r2 = r3
        L28:
            r4 = -1
            if (r2 == 0) goto L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L2d:
            r12 = move-exception
            goto L7f
        L2f:
            g1.i r2 = r0.f134028e     // Catch: java.lang.Throwable -> L2d
            int r5 = r2.f63271a     // Catch: java.lang.Throwable -> L2d
            int r6 = r2.f63272b     // Catch: java.lang.Throwable -> L2d
            if (r5 != r6) goto L39
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L39:
            if (r5 == r6) goto L70
            int[] r4 = r2.f63273c     // Catch: java.lang.Throwable -> L2d
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L2d
            int r5 = r5 + r3
            int r3 = r2.f63274d     // Catch: java.lang.Throwable -> L2d
            r3 = r3 & r5
            r2.f63271a = r3     // Catch: java.lang.Throwable -> L2d
            if (r4 < 0) goto L61
            android.media.MediaFormat r2 = r0.f134031h     // Catch: java.lang.Throwable -> L2d
            bf.b.w(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayDeque r0 = r0.f134029f     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L2d
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L2d
            int r6 = r0.offset     // Catch: java.lang.Throwable -> L2d
            int r7 = r0.size     // Catch: java.lang.Throwable -> L2d
            long r8 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L2d
            int r10 = r0.flags     // Catch: java.lang.Throwable -> L2d
            r5 = r12
            r5.set(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L2d
            goto L6e
        L61:
            r12 = -2
            if (r4 != r12) goto L6e
            java.util.ArrayDeque r12 = r0.f134030g     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r12.remove()     // Catch: java.lang.Throwable -> L2d
            android.media.MediaFormat r12 = (android.media.MediaFormat) r12     // Catch: java.lang.Throwable -> L2d
            r0.f134031h = r12     // Catch: java.lang.Throwable -> L2d
        L6e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
        L6f:
            return r4
        L70:
            java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L2d
            r12.<init>()     // Catch: java.lang.Throwable -> L2d
            throw r12     // Catch: java.lang.Throwable -> L2d
        L76:
            r0.f134034k = r3     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L79:
            r0.f134033j = r3     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L7c:
            r0.f134037n = r3     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        L7f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.c.o(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // x7.l
    public final ByteBuffer p(int i13) {
        return this.f134004a.getOutputBuffer(i13);
    }
}
