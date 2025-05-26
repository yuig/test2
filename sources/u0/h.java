package u0;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m0;
import v.e1;
import v.s;

/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: m, reason: collision with root package name */
    public static final long f119755m = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f119756n = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f119757a;

    /* renamed from: b, reason: collision with root package name */
    public final i f119758b;

    /* renamed from: f, reason: collision with root package name */
    public final int f119762f;

    /* renamed from: g, reason: collision with root package name */
    public final int f119763g;

    /* renamed from: h, reason: collision with root package name */
    public gc.c f119764h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f119765i;

    /* renamed from: j, reason: collision with root package name */
    public long f119766j;

    /* renamed from: k, reason: collision with root package name */
    public g f119767k;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f119759c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f119760d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f119761e = new AtomicReference(null);

    /* renamed from: l, reason: collision with root package name */
    public boolean f119768l = false;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(u0.i r10, android.content.Context r11) {
        /*
            r9 = this;
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r9.f119759c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r9.f119760d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r0.<init>(r2)
            r9.f119761e = r0
            r9.f119768l = r1
            int r0 = r10.f119771b
            r3 = 12
            r4 = 16
            r5 = 1
            int r6 = r10.f119772c
            int r7 = r10.f119773d
            if (r0 <= 0) goto L39
            if (r6 > 0) goto L2c
            goto L39
        L2c:
            if (r6 != r5) goto L30
            r8 = r4
            goto L31
        L30:
            r8 = r3
        L31:
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r8, r7)
            if (r0 <= 0) goto L39
            r0 = r5
            goto L3a
        L39:
            r0 = r1
        L3a:
            int r8 = r10.f119771b
            if (r0 == 0) goto L6f
            r9.f119758b = r10
            int r0 = r10.a()
            r9.f119763g = r0
            if (r6 != r5) goto L49
            r3 = r4
        L49:
            int r0 = android.media.AudioRecord.getMinBufferSize(r8, r3, r7)
            if (r0 <= 0) goto L50
            r1 = r5
        L50:
            com.bumptech.glide.d.v(r2, r1)
            int r0 = r0 * 2
            r9.f119762f = r0
            android.media.AudioRecord r10 = d(r0, r10, r11)
            r9.f119757a = r10
            int r11 = r10.getState()
            if (r11 != r5) goto L64
            return
        L64:
            r10.release()
            androidx.camera.video.internal.audio.AudioStream$AudioStreamException r10 = new androidx.camera.video.internal.audio.AudioStream$AudioStreamException
            java.lang.String r11 = "Unable to initialize AudioRecord"
            r10.<init>(r11)
            throw r10
        L6f:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r1}
            java.lang.String r0 = "The combination of sample rate %d, channel count %d and audio format %d is not supported."
            java.lang.String r11 = java.lang.String.format(r0, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.h.<init>(u0.i, android.content.Context):void");
    }

    public static AudioRecord d(int i13, i iVar, Context context) {
        int i14 = Build.VERSION.SDK_INT;
        AudioFormat build = new AudioFormat.Builder().setSampleRate(iVar.f119771b).setChannelMask(iVar.f119772c == 1 ? 16 : 12).setEncoding(iVar.f119773d).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i14 >= 31 && context != null) {
            e1.e(builder, context);
        }
        builder.setAudioSource(iVar.f119770a);
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i13);
        return builder.build();
    }

    @Override // u0.f
    public final void a() {
        g gVar;
        if (this.f119759c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (gVar = this.f119767k) != null) {
            v0.a.k(this.f119757a, gVar);
        }
        this.f119757a.release();
    }

    @Override // u0.f
    public final void b(gc.c cVar, Executor executor) {
        boolean z13 = true;
        com.bumptech.glide.d.v("AudioStream can not be started when setCallback.", !this.f119760d.get());
        c();
        if (cVar != null && executor == null) {
            z13 = false;
        }
        com.bumptech.glide.d.g("executor can't be null with non-null callback.", z13);
        this.f119764h = cVar;
        this.f119765i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            g gVar = this.f119767k;
            if (gVar != null) {
                v0.a.k(this.f119757a, gVar);
            }
            if (cVar == null) {
                return;
            }
            if (this.f119767k == null) {
                this.f119767k = new g(this);
            }
            v0.a.f(this.f119757a, executor, this.f119767k);
        }
    }

    public final void c() {
        com.bumptech.glide.d.v("AudioStream has been released.", !this.f119759c.get());
    }

    public final void e(boolean z13) {
        Executor executor = this.f119765i;
        gc.c cVar = this.f119764h;
        if (executor == null || cVar == null || Objects.equals(this.f119761e.getAndSet(Boolean.valueOf(z13)), Boolean.valueOf(z13))) {
            return;
        }
        executor.execute(new s(cVar, z13, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    @Override // u0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u0.j read(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.c()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.f119760d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            com.bumptech.glide.d.v(r1, r0)
            android.media.AudioRecord r0 = r13.f119757a
            int r1 = r13.f119762f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L8f
            r14.limit(r0)
            boolean r14 = r13.f119768l
            r3 = -1
            if (r14 != 0) goto L7a
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.f119757a
            r6 = 0
            int r5 = r5.getTimestamp(r14, r6)
            if (r5 != 0) goto L73
            u0.i r5 = r13.f119758b
            int r5 = r5.f119771b
            long r7 = r13.f119766j
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L3f
            r9 = r10
            goto L40
        L3f:
            r9 = r6
        L40:
            java.lang.String r11 = "sampleRate must be greater than 0."
            com.bumptech.glide.d.g(r11, r9)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L4b
            r6 = r10
        L4b:
            java.lang.String r9 = "framePosition must be no less than 0."
            com.bumptech.glide.d.g(r9, r6)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = kh2.m2.I0(r5, r7)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L5f
            goto L60
        L5f:
            r1 = r7
        L60:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = u0.h.f119755m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L7b
            r13.f119768l = r10
            goto L7a
        L73:
            java.lang.String r14 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            kh2.m0.X0(r14, r1)
        L7a:
            r1 = r3
        L7b:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L83
            long r1 = java.lang.System.nanoTime()
        L83:
            long r3 = r13.f119766j
            long r5 = (long) r0
            int r14 = r13.f119763g
            long r5 = kh2.m2.N1(r14, r5)
            long r5 = r5 + r3
            r13.f119766j = r5
        L8f:
            u0.j r14 = new u0.j
            r14.<init>(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.h.read(java.nio.ByteBuffer):u0.j");
    }

    @Override // u0.f
    public final void start() {
        c();
        AtomicBoolean atomicBoolean = this.f119760d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (w0.a.f126951a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.f119757a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.f119757a.startRecording();
        boolean z13 = false;
        if (this.f119757a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException("Unable to start AudioRecord with state: " + this.f119757a.getRecordingState());
        }
        this.f119766j = 0L;
        this.f119768l = false;
        this.f119761e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration a13 = v0.a.a(this.f119757a);
            z13 = a13 != null && v0.a.c(a13);
        }
        e(z13);
    }

    @Override // u0.f
    public final void stop() {
        c();
        if (this.f119760d.getAndSet(false)) {
            this.f119757a.stop();
            if (this.f119757a.getRecordingState() != 1) {
                m0.X0("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f119757a.getRecordingState());
            }
            if (w0.a.f126951a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                this.f119757a.release();
                this.f119757a = d(this.f119762f, this.f119758b, null);
            }
        }
    }
}
