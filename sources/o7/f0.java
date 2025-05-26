package o7;

import a7.o0;
import a7.p0;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import d7.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n7.q0;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes.dex */
public final class f0 implements n {

    /* renamed from: k0, reason: collision with root package name */
    public static final Object f93049k0 = new Object();

    /* renamed from: l0, reason: collision with root package name */
    public static ScheduledExecutorService f93050l0;

    /* renamed from: m0, reason: collision with root package name */
    public static int f93051m0;
    public a7.f A;
    public z B;
    public z C;
    public p0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f93052J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public a7.g Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f93053a;

    /* renamed from: a0, reason: collision with root package name */
    public h1.b f93054a0;

    /* renamed from: b, reason: collision with root package name */
    public final x92.b f93055b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f93056b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f93057c;

    /* renamed from: c0, reason: collision with root package name */
    public long f93058c0;

    /* renamed from: d, reason: collision with root package name */
    public final r f93059d;

    /* renamed from: d0, reason: collision with root package name */
    public long f93060d0;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f93061e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f93062e0;

    /* renamed from: f, reason: collision with root package name */
    public final v2 f93063f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f93064f0;

    /* renamed from: g, reason: collision with root package name */
    public final v2 f93065g;

    /* renamed from: g0, reason: collision with root package name */
    public Looper f93066g0;

    /* renamed from: h, reason: collision with root package name */
    public final q f93067h;

    /* renamed from: h0, reason: collision with root package name */
    public long f93068h0;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f93069i;

    /* renamed from: i0, reason: collision with root package name */
    public long f93070i0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f93071j;

    /* renamed from: j0, reason: collision with root package name */
    public Handler f93072j0;

    /* renamed from: k, reason: collision with root package name */
    public int f93073k;

    /* renamed from: l, reason: collision with root package name */
    public e0 f93074l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f93075m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f93076n;

    /* renamed from: o, reason: collision with root package name */
    public final g0 f93077o;

    /* renamed from: p, reason: collision with root package name */
    public final s f93078p;

    /* renamed from: q, reason: collision with root package name */
    public final bk.f f93079q;

    /* renamed from: r, reason: collision with root package name */
    public q0 f93080r;

    /* renamed from: s, reason: collision with root package name */
    public h1.b f93081s;

    /* renamed from: t, reason: collision with root package name */
    public y f93082t;

    /* renamed from: u, reason: collision with root package name */
    public y f93083u;

    /* renamed from: v, reason: collision with root package name */
    public b7.d f93084v;

    /* renamed from: w, reason: collision with root package name */
    public AudioTrack f93085w;

    /* renamed from: x, reason: collision with root package name */
    public b f93086x;

    /* renamed from: y, reason: collision with root package name */
    public e f93087y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.appcompat.app.d f93088z;

    public f0(x xVar) {
        Context context = xVar.f93198a;
        this.f93053a = context;
        this.A = a7.f.f987g;
        this.f93086x = context != null ? null : xVar.f93199b;
        this.f93055b = xVar.f93200c;
        this.f93057c = xVar.f93201d;
        this.f93071j = n0.f53866a >= 23 && xVar.f93202e;
        this.f93073k = 0;
        this.f93077o = xVar.f93204g;
        s sVar = xVar.f93206i;
        sVar.getClass();
        this.f93078p = sVar;
        this.f93067h = new q(new c0(this));
        r rVar = new r();
        this.f93059d = rVar;
        l0 l0Var = new l0();
        l0Var.f93141m = n0.f53868c;
        this.f93061e = l0Var;
        this.f93063f = c1.x(new b7.j(), rVar, l0Var);
        this.f93065g = c1.x(new k0(), rVar, l0Var);
        this.P = 1.0f;
        this.Y = 0;
        this.Z = new a7.g();
        p0 p0Var = p0.f1163d;
        this.C = new z(p0Var, 0L, 0L);
        this.D = p0Var;
        this.E = false;
        this.f93069i = new ArrayDeque();
        this.f93075m = new b0();
        this.f93076n = new b0();
        this.f93079q = xVar.f93205h;
    }

    public static boolean p(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (n0.f53866a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r1 != 4) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r17) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.f0.a(long):void");
    }

    public final AudioTrack b(m mVar, a7.f fVar, int i13, androidx.media3.common.b bVar) {
        try {
            AudioTrack N = this.f93079q.N(mVar, fVar, i13);
            int state = N.getState();
            if (state == 1) {
                return N;
            }
            try {
                N.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, mVar.f93146c, mVar.f93148e, mVar.f93145b, bVar, mVar.f93147d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e13) {
            throw new AudioSink$InitializationException(0, mVar.f93146c, mVar.f93148e, mVar.f93145b, bVar, mVar.f93147d, e13);
        }
    }

    public final AudioTrack c(y yVar) {
        try {
            return b(yVar.a(), this.A, this.Y, yVar.f93207a);
        } catch (AudioSink$InitializationException e13) {
            h1.b bVar = this.f93081s;
            if (bVar != null) {
                bVar.e(e13);
            }
            throw e13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.media3.common.b r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.f0.d(androidx.media3.common.b, int[]):void");
    }

    public final void e(long j13) {
        int write;
        h1.b bVar;
        m7.p0 p0Var;
        boolean z13;
        if (this.S == null) {
            return;
        }
        b0 b0Var = this.f93076n;
        if (((Exception) b0Var.f93026c) != null) {
            synchronized (f93049k0) {
                z13 = f93051m0 > 0;
            }
            if (z13 || SystemClock.elapsedRealtime() < b0Var.f93025b) {
                return;
            }
        }
        int remaining = this.S.remaining();
        if (this.f93056b0) {
            bf.b.t(j13 != -9223372036854775807L);
            if (j13 == Long.MIN_VALUE) {
                j13 = this.f93058c0;
            } else {
                this.f93058c0 = j13;
            }
            AudioTrack audioTrack = this.f93085w;
            ByteBuffer byteBuffer = this.S;
            if (n0.f53866a >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j13);
            } else {
                if (this.F == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.F = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.F.putInt(1431633921);
                }
                if (this.G == 0) {
                    this.F.putInt(4, remaining);
                    this.F.putLong(8, j13 * 1000);
                    this.F.position(0);
                    this.G = remaining;
                }
                int remaining2 = this.F.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.F, remaining2, 1);
                    if (write2 < 0) {
                        this.G = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.G = 0;
                } else {
                    this.G -= write;
                }
            }
        } else {
            write = this.f93085w.write(this.S, remaining, 1);
        }
        this.f93060d0 = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((n0.f53866a >= 24 && write == -6) || write == -32) {
                if (k() <= 0) {
                    if (p(this.f93085w)) {
                        if (this.f93083u.f()) {
                            this.f93062e0 = true;
                        }
                    }
                }
                r2 = true;
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(write, this.f93083u.f93207a, r2);
            h1.b bVar2 = this.f93081s;
            if (bVar2 != null) {
                bVar2.e(audioSink$WriteException);
            }
            if (!audioSink$WriteException.f18797b || this.f93053a == null) {
                b0Var.a(audioSink$WriteException);
                return;
            } else {
                this.f93086x = b.f93019c;
                throw audioSink$WriteException;
            }
        }
        b0Var.f93026c = null;
        b0Var.f93024a = -9223372036854775807L;
        b0Var.f93025b = -9223372036854775807L;
        if (p(this.f93085w)) {
            if (this.K > 0) {
                this.f93064f0 = false;
            }
            if (this.W && (bVar = this.f93081s) != null && write < remaining && !this.f93064f0 && (p0Var = ((h0) bVar.f66449b).G) != null) {
                p0Var.f86356a.P = true;
            }
        }
        int i13 = this.f93083u.f93209c;
        if (i13 == 0) {
            this.f93052J += write;
        }
        if (write == remaining) {
            if (i13 != 0) {
                bf.b.t(this.S == this.Q);
                this.K = (this.L * this.R) + this.K;
            }
            this.S = null;
        }
    }

    public final boolean f() {
        if (!this.f93084v.f()) {
            e(Long.MIN_VALUE);
            return this.S == null;
        }
        this.f93084v.h();
        t(Long.MIN_VALUE);
        if (!this.f93084v.e()) {
            return false;
        }
        ByteBuffer byteBuffer = this.S;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    public final void g() {
        androidx.appcompat.app.d dVar;
        if (o()) {
            v();
            if (this.f93067h.e()) {
                this.f93085w.pause();
            }
            if (p(this.f93085w)) {
                e0 e0Var = this.f93074l;
                e0Var.getClass();
                e0Var.b(this.f93085w);
            }
            m a13 = this.f93083u.a();
            y yVar = this.f93082t;
            if (yVar != null) {
                this.f93083u = yVar;
                this.f93082t = null;
            }
            this.f93067h.f();
            if (n0.f53866a >= 24 && (dVar = this.f93088z) != null) {
                dVar.L();
                this.f93088z = null;
            }
            AudioTrack audioTrack = this.f93085w;
            h1.b bVar = this.f93081s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f93049k0) {
                try {
                    if (f93050l0 == null) {
                        f93050l0 = n0.Y("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f93051m0++;
                    f93050l0.schedule(new w.b(audioTrack, bVar, handler, a13, 8), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f93085w = null;
        }
        b0 b0Var = this.f93076n;
        b0Var.f93026c = null;
        b0Var.f93024a = -9223372036854775807L;
        b0Var.f93025b = -9223372036854775807L;
        b0 b0Var2 = this.f93075m;
        b0Var2.f93026c = null;
        b0Var2.f93024a = -9223372036854775807L;
        b0Var2.f93025b = -9223372036854775807L;
        this.f93068h0 = 0L;
        this.f93070i0 = 0L;
        Handler handler2 = this.f93072j0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final g h(androidx.media3.common.b bVar) {
        int i13;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        if (this.f93062e0) {
            return g.f93089d;
        }
        a7.f fVar = this.A;
        s sVar = this.f93078p;
        sVar.getClass();
        bVar.getClass();
        fVar.getClass();
        int i14 = n0.f53866a;
        if (i14 < 29 || (i13 = bVar.F) == -1) {
            return g.f93089d;
        }
        Boolean bool = sVar.f93192b;
        boolean z13 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = sVar.f93191a;
            if (context != null) {
                String parameters = b7.c.s(context).getParameters("offloadVariableRateSupported");
                sVar.f93192b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                sVar.f93192b = Boolean.FALSE;
            }
            booleanValue = sVar.f93192b.booleanValue();
        }
        String str = bVar.f18765o;
        str.getClass();
        int e13 = o0.e(str, bVar.f18761k);
        if (e13 == 0 || i14 < n0.r(e13)) {
            return g.f93089d;
        }
        int t13 = n0.t(bVar.E);
        if (t13 == 0) {
            return g.f93089d;
        }
        try {
            AudioFormat s13 = n0.s(i13, t13, e13);
            if (i14 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(s13, (AudioAttributes) fVar.a().f66449b);
                if (!isOffloadedPlaybackSupported) {
                    return g.f93089d;
                }
                f fVar2 = new f();
                fVar2.f93046a = true;
                fVar2.f93048c = booleanValue;
                return fVar2.a();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(s13, (AudioAttributes) fVar.a().f66449b);
            if (playbackOffloadSupport == 0) {
                return g.f93089d;
            }
            f fVar3 = new f();
            if (i14 > 32 && playbackOffloadSupport == 2) {
                z13 = true;
            }
            fVar3.f93046a = true;
            fVar3.f93047b = z13;
            fVar3.f93048c = booleanValue;
            return fVar3.a();
        } catch (IllegalArgumentException unused) {
            return g.f93089d;
        }
    }

    public final int i(androidx.media3.common.b bVar) {
        q();
        if (!"audio/raw".equals(bVar.f18765o)) {
            return this.f93086x.d(this.A, bVar) != null ? 2 : 0;
        }
        int i13 = bVar.G;
        if (n0.R(i13)) {
            return (i13 == 2 || (this.f93057c && i13 == 4)) ? 2 : 1;
        }
        d7.u.g("DefaultAudioSink", "Invalid PCM encoding: " + i13);
        return 0;
    }

    public final long j() {
        return this.f93083u.f93209c == 0 ? this.H / r0.f93208b : this.I;
    }

    public final long k() {
        y yVar = this.f93083u;
        if (yVar.f93209c != 0) {
            return this.K;
        }
        long j13 = this.f93052J;
        long j14 = yVar.f93210d;
        int i13 = n0.f53866a;
        return ((j13 + j14) - 1) / j14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        if (r9.b() == 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.nio.ByteBuffer r23, final long r24, int r26) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.f0.l(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3.V != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            r3 = this;
            boolean r0 = r3.o()
            if (r0 == 0) goto L26
            int r0 = d7.n0.f53866a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.f93085w
            boolean r0 = mm1.a.u(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.V
            if (r0 != 0) goto L26
        L18:
            o7.q r0 = r3.f93067h
            long r1 = r3.k()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.f0.m():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.f0.n():boolean");
    }

    public final boolean o() {
        return this.f93085w != null;
    }

    public final void q() {
        Context context;
        b c13;
        c cVar;
        if (this.f93087y == null && (context = this.f93053a) != null) {
            this.f93066g0 = Looper.myLooper();
            e eVar = new e(context, new t(this), this.A, this.f93054a0);
            this.f93087y = eVar;
            if (eVar.f93042j) {
                c13 = eVar.f93039g;
                c13.getClass();
            } else {
                eVar.f93042j = true;
                d dVar = eVar.f93038f;
                if (dVar != null) {
                    dVar.a();
                }
                int i13 = n0.f53866a;
                Handler handler = eVar.f93035c;
                Context context2 = eVar.f93033a;
                if (i13 >= 23 && (cVar = eVar.f93036d) != null) {
                    b7.c.s(context2).registerAudioDeviceCallback(cVar, handler);
                }
                c13 = b.c(context2, context2.registerReceiver(eVar.f93037e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar.f93041i, eVar.f93040h);
                eVar.f93039g = c13;
            }
            this.f93086x = c13;
        }
        this.f93086x.getClass();
    }

    public final void r() {
        this.W = true;
        if (o()) {
            q qVar = this.f93067h;
            if (qVar.f93186x != -9223372036854775807L) {
                ((d7.g0) qVar.I).getClass();
                qVar.f93186x = n0.X(SystemClock.elapsedRealtime());
            }
            p pVar = qVar.f93167e;
            pVar.getClass();
            pVar.h();
            this.f93085w.play();
        }
    }

    public final void s() {
        if (this.U) {
            return;
        }
        this.U = true;
        long k13 = k();
        q qVar = this.f93067h;
        qVar.f93188z = qVar.b();
        ((d7.g0) qVar.I).getClass();
        qVar.f93186x = n0.X(SystemClock.elapsedRealtime());
        qVar.A = k13;
        if (p(this.f93085w)) {
            this.V = false;
        }
        this.f93085w.stop();
        this.G = 0;
    }

    public final void t(long j13) {
        e(j13);
        if (this.S != null) {
            return;
        }
        if (!this.f93084v.f()) {
            ByteBuffer byteBuffer = this.Q;
            if (byteBuffer != null) {
                y(byteBuffer);
                e(j13);
                return;
            }
            return;
        }
        while (!this.f93084v.e()) {
            do {
                ByteBuffer d2 = this.f93084v.d();
                if (d2.hasRemaining()) {
                    y(d2);
                    e(j13);
                } else {
                    ByteBuffer byteBuffer2 = this.Q;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f93084v.i(this.Q);
                    }
                }
            } while (this.S == null);
            return;
        }
    }

    public final void u() {
        g();
        y0 listIterator = this.f93063f.listIterator(0);
        while (listIterator.hasNext()) {
            ((b7.f) listIterator.next()).d();
        }
        y0 listIterator2 = this.f93065g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((b7.f) listIterator2.next()).d();
        }
        b7.d dVar = this.f93084v;
        if (dVar != null) {
            dVar.j();
        }
        this.W = false;
        this.f93062e0 = false;
    }

    public final void v() {
        this.H = 0L;
        this.I = 0L;
        this.f93052J = 0L;
        this.K = 0L;
        this.f93064f0 = false;
        this.L = 0;
        this.C = new z(this.D, 0L, 0L);
        this.O = 0L;
        this.B = null;
        this.f93069i.clear();
        this.Q = null;
        this.R = 0;
        this.S = null;
        this.U = false;
        this.T = false;
        this.V = false;
        this.F = null;
        this.G = 0;
        this.f93061e.f93143o = 0L;
        b7.d dVar = this.f93083u.f93215i;
        this.f93084v = dVar;
        dVar.b();
    }

    public final void w() {
        if (o()) {
            try {
                this.f93085w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.f1164a).setPitch(this.D.f1165b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e13) {
                d7.u.h("DefaultAudioSink", "Failed to set playback params", e13);
            }
            p0 p0Var = new p0(this.f93085w.getPlaybackParams().getSpeed(), this.f93085w.getPlaybackParams().getPitch());
            this.D = p0Var;
            q qVar = this.f93067h;
            qVar.f93171i = p0Var.f1164a;
            p pVar = qVar.f93167e;
            if (pVar != null) {
                pVar.h();
            }
            qVar.g();
        }
    }

    public final void x(a7.g gVar) {
        if (this.Z.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.f93085w != null) {
            this.Z.getClass();
        }
        this.Z = gVar;
    }

    public final void y(ByteBuffer byteBuffer) {
        bf.b.t(this.S == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f93083u.f93209c == 0) {
                int g03 = (int) n0.g0(n0.X(20L), this.f93083u.f93211e, 1000000L, RoundingMode.UP);
                long k13 = k();
                if (k13 < g03) {
                    y yVar = this.f93083u;
                    byteBuffer = kh2.w.s0(byteBuffer, yVar.f93213g, yVar.f93210d, (int) k13, g03);
                }
            }
            this.S = byteBuffer;
        }
    }

    public final boolean z() {
        y yVar = this.f93083u;
        return yVar != null && yVar.f93216j && n0.f53866a >= 23;
    }
}
