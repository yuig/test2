package x7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.appcompat.widget.x;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import d7.g0;
import d7.j0;
import d7.n0;
import g8.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m7.p0;
import o7.i0;

/* loaded from: classes.dex */
public abstract class p extends m7.h {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public long A0;
    public final i0 B;
    public boolean B0;
    public androidx.media3.common.b C;
    public boolean C0;
    public androidx.media3.common.b D;
    public s7.j E;
    public s7.j F;
    public p0 G;
    public MediaCrypto H;
    public final long I;

    /* renamed from: J, reason: collision with root package name */
    public float f134065J;
    public float K;
    public l L;
    public androidx.media3.common.b M;
    public MediaFormat N;
    public boolean O;
    public float P;
    public ArrayDeque Q;
    public MediaCodecRenderer$DecoderInitializationException R;
    public n S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f134066a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f134067b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f134068c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f134069d0;

    /* renamed from: e0, reason: collision with root package name */
    public ByteBuffer f134070e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f134071f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f134072g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f134073h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f134074i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f134075j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f134076k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f134077l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f134078m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f134079n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f134080o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f134081p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f134082q0;

    /* renamed from: r, reason: collision with root package name */
    public final k f134083r;

    /* renamed from: r0, reason: collision with root package name */
    public long f134084r0;

    /* renamed from: s, reason: collision with root package name */
    public final q f134085s;

    /* renamed from: s0, reason: collision with root package name */
    public long f134086s0;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f134087t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f134088t0;

    /* renamed from: u, reason: collision with root package name */
    public final float f134089u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f134090u0;

    /* renamed from: v, reason: collision with root package name */
    public final k7.e f134091v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f134092v0;

    /* renamed from: w, reason: collision with root package name */
    public final k7.e f134093w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f134094w0;

    /* renamed from: x, reason: collision with root package name */
    public final k7.e f134095x;

    /* renamed from: x0, reason: collision with root package name */
    public ExoPlaybackException f134096x0;

    /* renamed from: y, reason: collision with root package name */
    public final g f134097y;

    /* renamed from: y0, reason: collision with root package name */
    public m7.i f134098y0;

    /* renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f134099z;

    /* renamed from: z0, reason: collision with root package name */
    public o f134100z0;

    public p(int i13, k kVar, q qVar, boolean z13, float f13) {
        super(i13);
        this.f134083r = kVar;
        qVar.getClass();
        this.f134085s = qVar;
        this.f134087t = z13;
        this.f134089u = f13;
        this.f134091v = new k7.e(0);
        this.f134093w = new k7.e(0);
        this.f134095x = new k7.e(2);
        g gVar = new g(2);
        gVar.f134041m = 32;
        this.f134097y = gVar;
        this.f134099z = new MediaCodec.BufferInfo();
        this.f134065J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.A = new ArrayDeque();
        this.f134100z0 = o.f134060e;
        gVar.p(0);
        gVar.f78454e.order(ByteOrder.nativeOrder());
        i0 i0Var = new i0();
        i0Var.f93109a = b7.f.f22042a;
        i0Var.f93111c = 0;
        i0Var.f93110b = 2;
        this.B = i0Var;
        this.P = -1.0f;
        this.T = 0;
        this.f134077l0 = 0;
        this.f134068c0 = -1;
        this.f134069d0 = -1;
        this.f134067b0 = -9223372036854775807L;
        this.f134084r0 = -9223372036854775807L;
        this.f134086s0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f134066a0 = -9223372036854775807L;
        this.f134078m0 = 0;
        this.f134079n0 = 0;
        this.f134098y0 = new m7.i();
    }

    public static boolean e0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @Override // m7.h
    public void A(long j13, long j14) {
        boolean z13 = false;
        if (this.f134094w0) {
            this.f134094w0 = false;
            s0();
        }
        ExoPlaybackException exoPlaybackException = this.f134096x0;
        if (exoPlaybackException != null) {
            this.f134096x0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f134090u0) {
                w0();
                return;
            }
            if (this.C != null || u0(2)) {
                f0();
                if (this.f134073h0) {
                    Trace.beginSection("bypassRender");
                    while (H(j13, j14)) {
                    }
                    Trace.endSection();
                } else if (this.L != null) {
                    this.f86176g.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (N(j13, j14)) {
                        long j15 = this.I;
                        if (j15 != -9223372036854775807L) {
                            this.f86176g.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j15) {
                                break;
                            }
                        }
                    }
                    while (O()) {
                        long j16 = this.I;
                        if (j16 != -9223372036854775807L) {
                            this.f86176g.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j16) {
                                break;
                            }
                        }
                    }
                    Trace.endSection();
                } else {
                    this.f134098y0.f86196d += E(j13);
                    u0(1);
                }
                synchronized (this.f134098y0) {
                }
            }
        } catch (MediaCodec.CryptoException e13) {
            throw g(n0.z(e13.getErrorCode()), this.C, e13, false);
        } catch (IllegalStateException e14) {
            if (!e0(e14)) {
                throw e14;
            }
            i0(e14);
            if ((e14 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e14).isRecoverable()) {
                z13 = true;
            }
            if (z13) {
                v0();
            }
            MediaCodecDecoderException J2 = J(e14, this.S);
            throw g(J2.f18824a == 1101 ? 4006 : 4003, this.C, J2, z13);
        }
    }

    public final void A0(o oVar) {
        this.f134100z0 = oVar;
        if (oVar.f134063c != -9223372036854775807L) {
            this.B0 = true;
            n0();
        }
    }

    public boolean B0(k7.e eVar) {
        return false;
    }

    public boolean C0(n nVar) {
        return !this.C0;
    }

    @Override // m7.h
    public void D(float f13, float f14) {
        this.f134065J = f13;
        this.K = f14;
        F0(this.M);
    }

    public boolean D0(androidx.media3.common.b bVar) {
        return false;
    }

    public abstract int E0(q qVar, androidx.media3.common.b bVar);

    @Override // m7.h
    public final int F(androidx.media3.common.b bVar) {
        try {
            return E0(this.f134085s, bVar);
        } catch (MediaCodecUtil$DecoderQueryException e13) {
            throw g(4002, bVar, e13, false);
        }
    }

    public final boolean F0(androidx.media3.common.b bVar) {
        if (n0.f53866a >= 23 && this.L != null && this.f134079n0 != 3 && this.f86177h != 0) {
            float f13 = this.K;
            bVar.getClass();
            androidx.media3.common.b[] bVarArr = this.f86179j;
            bVarArr.getClass();
            float U = U(f13, bVarArr);
            float f14 = this.P;
            if (f14 == U) {
                return true;
            }
            if (U == -1.0f) {
                L();
                return false;
            }
            if (f14 == -1.0f && U <= this.f134089u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", U);
            l lVar = this.L;
            lVar.getClass();
            lVar.c(bundle);
            this.P = U;
        }
        return true;
    }

    @Override // m7.h
    public final int G() {
        return 8;
    }

    public final void G0() {
        s7.j jVar = this.F;
        jVar.getClass();
        k7.a e13 = jVar.e();
        if (e13 instanceof s7.w) {
            try {
                MediaCrypto mediaCrypto = this.H;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((s7.w) e13).f111338b);
            } catch (MediaCryptoException e14) {
                throw g(6006, this.C, e14, false);
            }
        }
        z0(this.F);
        this.f134078m0 = 0;
        this.f134079n0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x00af, code lost:
    
        r9 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0306 A[LOOP:0: B:24:0x0095->B:118:0x0306, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0304 A[EDGE_INSN: B:119:0x0304->B:101:0x0304 BREAK  A[LOOP:0: B:24:0x0095->B:118:0x0306], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ee  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.p.H(long, long):boolean");
    }

    public final void H0(long j13) {
        androidx.media3.common.b bVar = (androidx.media3.common.b) this.f134100z0.f134064d.i(j13);
        if (bVar == null && this.B0 && this.N != null) {
            bVar = (androidx.media3.common.b) this.f134100z0.f134064d.h();
        }
        if (bVar != null) {
            this.D = bVar;
        } else if (!this.O || this.D == null) {
            return;
        }
        androidx.media3.common.b bVar2 = this.D;
        bVar2.getClass();
        m0(bVar2, this.N);
        this.O = false;
        this.B0 = false;
    }

    public abstract m7.j I(n nVar, androidx.media3.common.b bVar, androidx.media3.common.b bVar2);

    public MediaCodecDecoderException J(IllegalStateException illegalStateException, n nVar) {
        return new MediaCodecDecoderException(illegalStateException, nVar);
    }

    public final void K() {
        this.f134075j0 = false;
        this.f134097y.n();
        this.f134095x.n();
        this.f134074i0 = false;
        this.f134073h0 = false;
        this.B.a();
    }

    public final void L() {
        if (this.f134080o0) {
            this.f134078m0 = 1;
            this.f134079n0 = 3;
        } else {
            v0();
            f0();
        }
    }

    public final boolean M() {
        if (this.f134080o0) {
            this.f134078m0 = 1;
            if (this.V) {
                this.f134079n0 = 3;
                return false;
            }
            this.f134079n0 = 2;
        } else {
            G0();
        }
        return true;
    }

    public final boolean N(long j13, long j14) {
        boolean z13;
        boolean z14;
        MediaCodec.BufferInfo bufferInfo;
        boolean t03;
        int o13;
        l lVar = this.L;
        lVar.getClass();
        boolean z15 = this.f134069d0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f134099z;
        if (!z15) {
            if (this.W && this.f134081p0) {
                try {
                    o13 = lVar.o(bufferInfo2);
                } catch (IllegalStateException unused) {
                    s0();
                    if (this.f134090u0) {
                        v0();
                    }
                    return false;
                }
            } else {
                o13 = lVar.o(bufferInfo2);
            }
            if (o13 < 0) {
                if (o13 == -2) {
                    this.f134082q0 = true;
                    l lVar2 = this.L;
                    lVar2.getClass();
                    MediaFormat f13 = lVar2.f();
                    if (this.T != 0 && f13.getInteger("width") == 32 && f13.getInteger("height") == 32) {
                        this.Y = true;
                    } else {
                        this.N = f13;
                        this.O = true;
                    }
                    return true;
                }
                if (this.Z && (this.f134088t0 || this.f134078m0 == 2)) {
                    s0();
                }
                long j15 = this.f134066a0;
                if (j15 != -9223372036854775807L) {
                    long j16 = j15 + 100;
                    d7.e eVar = this.f86176g;
                    eVar.getClass();
                    if (j16 < ((g0) eVar).b()) {
                        s0();
                    }
                }
                return false;
            }
            if (this.Y) {
                this.Y = false;
                lVar.l(o13);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                s0();
                return false;
            }
            this.f134069d0 = o13;
            ByteBuffer p13 = lVar.p(o13);
            this.f134070e0 = p13;
            if (p13 != null) {
                p13.position(bufferInfo2.offset);
                this.f134070e0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j17 = bufferInfo2.presentationTimeUs;
            this.f134071f0 = j17 < this.f86181l;
            long j18 = this.f134086s0;
            this.f134072g0 = j18 != -9223372036854775807L && j18 <= j17;
            H0(j17);
        }
        if (this.W && this.f134081p0) {
            try {
                ByteBuffer byteBuffer = this.f134070e0;
                int i13 = this.f134069d0;
                int i14 = bufferInfo2.flags;
                long j19 = bufferInfo2.presentationTimeUs;
                boolean z16 = this.f134071f0;
                boolean z17 = this.f134072g0;
                androidx.media3.common.b bVar = this.D;
                bVar.getClass();
                z13 = true;
                z14 = false;
                try {
                    t03 = t0(j13, j14, lVar, byteBuffer, i13, i14, 1, j19, z16, z17, bVar);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    s0();
                    if (this.f134090u0) {
                        v0();
                    }
                    return z14;
                }
            } catch (IllegalStateException unused3) {
                z14 = false;
            }
        } else {
            z13 = true;
            z14 = false;
            ByteBuffer byteBuffer2 = this.f134070e0;
            int i15 = this.f134069d0;
            int i16 = bufferInfo2.flags;
            long j23 = bufferInfo2.presentationTimeUs;
            boolean z18 = this.f134071f0;
            boolean z19 = this.f134072g0;
            androidx.media3.common.b bVar2 = this.D;
            bVar2.getClass();
            bufferInfo = bufferInfo2;
            t03 = t0(j13, j14, lVar, byteBuffer2, i15, i16, 1, j23, z18, z19, bVar2);
        }
        if (t03) {
            o0(bufferInfo.presentationTimeUs);
            boolean z23 = (bufferInfo.flags & 4) != 0 ? z13 : z14;
            if (!z23 && this.f134081p0 && this.f134072g0) {
                d7.e eVar2 = this.f86176g;
                eVar2.getClass();
                this.f134066a0 = ((g0) eVar2).b();
            }
            this.f134069d0 = -1;
            this.f134070e0 = null;
            if (!z23) {
                return z13;
            }
            s0();
        }
        return z14;
    }

    public final boolean O() {
        l lVar = this.L;
        if (lVar == null || this.f134078m0 == 2 || this.f134088t0) {
            return false;
        }
        int i13 = this.f134068c0;
        k7.e eVar = this.f134093w;
        if (i13 < 0) {
            int n13 = lVar.n();
            this.f134068c0 = n13;
            if (n13 < 0) {
                return false;
            }
            eVar.f78454e = lVar.i(n13);
            eVar.n();
        }
        if (this.f134078m0 == 1) {
            if (!this.Z) {
                this.f134081p0 = true;
                lVar.d(this.f134068c0, 0, 4, 0L);
                this.f134068c0 = -1;
                eVar.f78454e = null;
            }
            this.f134078m0 = 2;
            return false;
        }
        if (this.X) {
            this.X = false;
            ByteBuffer byteBuffer = eVar.f78454e;
            byteBuffer.getClass();
            byteBuffer.put(D0);
            lVar.d(this.f134068c0, 38, 0, 0L);
            this.f134068c0 = -1;
            eVar.f78454e = null;
            this.f134080o0 = true;
            return true;
        }
        if (this.f134077l0 == 1) {
            int i14 = 0;
            while (true) {
                androidx.media3.common.b bVar = this.M;
                bVar.getClass();
                if (i14 >= bVar.f18768r.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.M.f18768r.get(i14);
                ByteBuffer byteBuffer2 = eVar.f78454e;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i14++;
            }
            this.f134077l0 = 2;
        }
        ByteBuffer byteBuffer3 = eVar.f78454e;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        qq2.c cVar = this.f86172c;
        cVar.c();
        try {
            int z13 = z(cVar, eVar, 0);
            if (z13 == -3) {
                if (n()) {
                    this.f134086s0 = this.f134084r0;
                }
                return false;
            }
            if (z13 == -5) {
                if (this.f134077l0 == 2) {
                    eVar.n();
                    this.f134077l0 = 1;
                }
                l0(cVar);
                return true;
            }
            if (eVar.i(4)) {
                this.f134086s0 = this.f134084r0;
                if (this.f134077l0 == 2) {
                    eVar.n();
                    this.f134077l0 = 1;
                }
                this.f134088t0 = true;
                if (!this.f134080o0) {
                    s0();
                    return false;
                }
                if (!this.Z) {
                    this.f134081p0 = true;
                    lVar.d(this.f134068c0, 0, 4, 0L);
                    this.f134068c0 = -1;
                    eVar.f78454e = null;
                }
                return false;
            }
            if (!this.f134080o0 && !eVar.i(1)) {
                eVar.n();
                if (this.f134077l0 == 2) {
                    this.f134077l0 = 1;
                }
                return true;
            }
            if (B0(eVar)) {
                return true;
            }
            boolean i15 = eVar.i(1073741824);
            if (i15) {
                eVar.f78453d.a(position);
            }
            long j13 = eVar.f78456g;
            if (this.f134092v0) {
                ArrayDeque arrayDeque = this.A;
                if (arrayDeque.isEmpty()) {
                    j0 j0Var = this.f134100z0.f134064d;
                    androidx.media3.common.b bVar2 = this.C;
                    bVar2.getClass();
                    j0Var.a(j13, bVar2);
                } else {
                    j0 j0Var2 = ((o) arrayDeque.peekLast()).f134064d;
                    androidx.media3.common.b bVar3 = this.C;
                    bVar3.getClass();
                    j0Var2.a(j13, bVar3);
                }
                this.f134092v0 = false;
            }
            this.f134084r0 = Math.max(this.f134084r0, j13);
            if (n() || eVar.i(536870912)) {
                this.f134086s0 = this.f134084r0;
            }
            eVar.q();
            if (eVar.i(268435456)) {
                Z(eVar);
            }
            q0(eVar);
            int S = S(eVar);
            if (i15) {
                lVar.b(this.f134068c0, eVar.f78453d, j13, S);
            } else {
                int i16 = this.f134068c0;
                ByteBuffer byteBuffer4 = eVar.f78454e;
                byteBuffer4.getClass();
                lVar.d(i16, byteBuffer4.limit(), S, j13);
            }
            this.f134068c0 = -1;
            eVar.f78454e = null;
            this.f134080o0 = true;
            this.f134077l0 = 0;
            this.f134098y0.f86195c++;
            return true;
        } catch (DecoderInputBuffer$InsufficientCapacityException e13) {
            i0(e13);
            u0(0);
            P();
            return true;
        }
    }

    public final void P() {
        try {
            l lVar = this.L;
            bf.b.w(lVar);
            lVar.flush();
        } finally {
            x0();
        }
    }

    public final boolean Q() {
        if (this.L == null) {
            return false;
        }
        int i13 = this.f134079n0;
        if (i13 == 3 || ((this.U && !this.f134082q0) || (this.V && this.f134081p0))) {
            v0();
            return true;
        }
        if (i13 == 2) {
            int i14 = n0.f53866a;
            bf.b.t(i14 >= 23);
            if (i14 >= 23) {
                try {
                    G0();
                } catch (ExoPlaybackException e13) {
                    d7.u.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e13);
                    v0();
                    return true;
                }
            }
        }
        P();
        return false;
    }

    public final List R(boolean z13) {
        androidx.media3.common.b bVar = this.C;
        bVar.getClass();
        q qVar = this.f134085s;
        ArrayList V = V(qVar, bVar, z13);
        if (V.isEmpty() && z13) {
            V = V(qVar, bVar, false);
            if (!V.isEmpty()) {
                d7.u.g("MediaCodecRenderer", "Drm session requires secure decoder for " + bVar.f18765o + ", but no secure decoder available. Trying to proceed with " + V + ".");
            }
        }
        return V;
    }

    public int S(k7.e eVar) {
        return 0;
    }

    public boolean T() {
        return false;
    }

    public abstract float U(float f13, androidx.media3.common.b[] bVarArr);

    public abstract ArrayList V(q qVar, androidx.media3.common.b bVar, boolean z13);

    public long W(long j13, long j14) {
        return 10000L;
    }

    public abstract x X(n nVar, androidx.media3.common.b bVar, MediaCrypto mediaCrypto, float f13);

    public final float Y() {
        return this.f134065J;
    }

    public abstract void Z(k7.e eVar);

    public final void a0(androidx.media3.common.b bVar) {
        K();
        String str = bVar.f18765o;
        boolean equals = "audio/mp4a-latm".equals(str);
        g gVar = this.f134097y;
        if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            gVar.getClass();
            gVar.f134041m = 32;
        } else {
            gVar.getClass();
            gVar.f134041m = 1;
        }
        this.f134073h0 = true;
    }

    @Override // m7.h, m7.q1
    public void b(int i13, Object obj) {
        if (i13 == 11) {
            p0 p0Var = (p0) obj;
            p0Var.getClass();
            this.G = p0Var;
            r0(p0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(x7.n r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.p.b0(x7.n, android.media.MediaCrypto):void");
    }

    public final boolean c0() {
        bf.b.t(this.H == null);
        s7.j jVar = this.E;
        k7.a e13 = jVar.e();
        if (s7.w.f111336c && (e13 instanceof s7.w)) {
            int state = jVar.getState();
            if (state == 1) {
                DrmSession$DrmSessionException a13 = jVar.a();
                a13.getClass();
                throw g(a13.f18807a, this.C, a13, false);
            }
            if (state != 4) {
                return false;
            }
        }
        if (e13 == null) {
            return jVar.a() != null;
        }
        if (e13 instanceof s7.w) {
            s7.w wVar = (s7.w) e13;
            try {
                this.H = new MediaCrypto(wVar.f111337a, wVar.f111338b);
            } catch (MediaCryptoException e14) {
                throw g(6006, this.C, e14, false);
            }
        }
        return true;
    }

    public final boolean d0(long j13, long j14) {
        androidx.media3.common.b bVar;
        return j14 < j13 && !((bVar = this.D) != null && Objects.equals(bVar.f18765o, "audio/opus") && gh0.b.i0(j13, j14));
    }

    public final void f0() {
        androidx.media3.common.b bVar;
        boolean z13;
        if (this.L != null || this.f134073h0 || (bVar = this.C) == null) {
            return;
        }
        if (this.F == null && D0(bVar)) {
            a0(bVar);
            return;
        }
        z0(this.F);
        if (this.E == null || c0()) {
            try {
                s7.j jVar = this.E;
                if (jVar != null) {
                    if (jVar.getState() != 3) {
                        if (this.E.getState() == 4) {
                        }
                    }
                    s7.j jVar2 = this.E;
                    String str = bVar.f18765o;
                    bf.b.w(str);
                    if (jVar2.g(str)) {
                        z13 = true;
                        g0(this.H, z13);
                    }
                }
                z13 = false;
                g0(this.H, z13);
            } catch (MediaCodecRenderer$DecoderInitializationException e13) {
                throw g(4001, bVar, e13, false);
            }
        }
        MediaCrypto mediaCrypto = this.H;
        if (mediaCrypto == null || this.L != null) {
            return;
        }
        mediaCrypto.release();
        this.H = null;
    }

    public final void g0(MediaCrypto mediaCrypto, boolean z13) {
        androidx.media3.common.b bVar = this.C;
        bVar.getClass();
        if (this.Q == null) {
            try {
                List R = R(z13);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.Q = arrayDeque;
                if (this.f134087t) {
                    arrayDeque.addAll(R);
                } else if (!R.isEmpty()) {
                    this.Q.add((n) R.get(0));
                }
                this.R = null;
            } catch (MediaCodecUtil$DecoderQueryException e13) {
                throw new MediaCodecRenderer$DecoderInitializationException(-49998, bVar, e13, z13);
            }
        }
        if (this.Q.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(-49999, bVar, (MediaCodecUtil$DecoderQueryException) null, z13);
        }
        ArrayDeque arrayDeque2 = this.Q;
        arrayDeque2.getClass();
        while (this.L == null) {
            n nVar = (n) arrayDeque2.peekFirst();
            nVar.getClass();
            if (!h0(bVar) || !C0(nVar)) {
                return;
            }
            try {
                b0(nVar, mediaCrypto);
            } catch (Exception e14) {
                d7.u.h("MediaCodecRenderer", "Failed to initialize decoder: " + nVar, e14);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(bVar, e14, z13, nVar);
                i0(mediaCodecRenderer$DecoderInitializationException);
                if (this.R == null) {
                    this.R = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.R = MediaCodecRenderer$DecoderInitializationException.a(this.R);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.R;
                }
            }
        }
        this.Q = null;
    }

    public boolean h0(androidx.media3.common.b bVar) {
        return true;
    }

    public abstract void i0(Exception exc);

    @Override // m7.h
    public final long j(long j13, long j14) {
        return W(j13, j14);
    }

    public abstract void j0(String str, long j13, long j14);

    public abstract void k0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0162, code lost:
    
        if (M() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r4.g(r3) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011d, code lost:
    
        if (M() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0150, code lost:
    
        if (M() == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m7.j l0(qq2.c r14) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.p.l0(qq2.c):m7.j");
    }

    public abstract void m0(androidx.media3.common.b bVar, MediaFormat mediaFormat);

    public void n0() {
    }

    public void o0(long j13) {
        this.A0 = j13;
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j13 < ((o) arrayDeque.peek()).f134061a) {
                return;
            }
            o oVar = (o) arrayDeque.poll();
            oVar.getClass();
            A0(oVar);
            p0();
        }
    }

    public abstract void p0();

    @Override // m7.h
    public boolean q() {
        boolean j13;
        if (this.C != null) {
            if (n()) {
                j13 = this.f86183n;
            } else {
                b1 b1Var = this.f86178i;
                b1Var.getClass();
                j13 = b1Var.j();
            }
            if (!j13 && this.f134069d0 < 0) {
                if (this.f134067b0 != -9223372036854775807L) {
                    this.f86176g.getClass();
                    if (SystemClock.elapsedRealtime() < this.f134067b0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void q0(k7.e eVar) {
    }

    @Override // m7.h
    public void r() {
        this.C = null;
        A0(o.f134060e);
        this.A.clear();
        Q();
    }

    public void r0(p0 p0Var) {
    }

    public final void s0() {
        int i13 = this.f134079n0;
        if (i13 == 1) {
            P();
            return;
        }
        if (i13 == 2) {
            P();
            G0();
        } else if (i13 != 3) {
            this.f134090u0 = true;
            w0();
        } else {
            v0();
            f0();
        }
    }

    @Override // m7.h
    public void t(long j13, boolean z13) {
        this.f134088t0 = false;
        this.f134090u0 = false;
        this.f134094w0 = false;
        if (this.f134073h0) {
            this.f134097y.n();
            this.f134095x.n();
            this.f134074i0 = false;
            this.B.a();
        } else if (Q()) {
            f0();
        }
        if (this.f134100z0.f134064d.k() > 0) {
            this.f134092v0 = true;
        }
        this.f134100z0.f134064d.c();
        this.A.clear();
    }

    public abstract boolean t0(long j13, long j14, l lVar, ByteBuffer byteBuffer, int i13, int i14, int i15, long j15, boolean z13, boolean z14, androidx.media3.common.b bVar);

    public final boolean u0(int i13) {
        qq2.c cVar = this.f86172c;
        cVar.c();
        k7.e eVar = this.f134091v;
        eVar.n();
        int z13 = z(cVar, eVar, i13 | 4);
        if (z13 == -5) {
            l0(cVar);
            return true;
        }
        if (z13 != -4 || !eVar.i(4)) {
            return false;
        }
        this.f134088t0 = true;
        s0();
        return false;
    }

    public final void v0() {
        try {
            l lVar = this.L;
            if (lVar != null) {
                lVar.a();
                this.f134098y0.f86194b++;
                n nVar = this.S;
                nVar.getClass();
                k0(nVar.f134049a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th3) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th3;
            } finally {
            }
        }
    }

    public abstract void w0();

    public void x0() {
        this.f134068c0 = -1;
        this.f134093w.f78454e = null;
        this.f134069d0 = -1;
        this.f134070e0 = null;
        this.f134067b0 = -9223372036854775807L;
        this.f134081p0 = false;
        this.f134066a0 = -9223372036854775807L;
        this.f134080o0 = false;
        this.X = false;
        this.Y = false;
        this.f134071f0 = false;
        this.f134072g0 = false;
        this.f134084r0 = -9223372036854775807L;
        this.f134086s0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f134078m0 = 0;
        this.f134079n0 = 0;
        this.f134077l0 = this.f134076k0 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // m7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(androidx.media3.common.b[] r13, long r14, long r16, g8.e0 r18) {
        /*
            r12 = this;
            r0 = r12
            x7.o r1 = r0.f134100z0
            long r1 = r1.f134063c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            x7.o r1 = new x7.o
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.A0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.A
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f134084r0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.A0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            x7.o r1 = new x7.o
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.A0(r1)
            x7.o r1 = r0.f134100z0
            long r1 = r1.f134063c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.p0()
            goto L63
        L55:
            x7.o r9 = new x7.o
            long r3 = r0.f134084r0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.p.y(androidx.media3.common.b[], long, long, g8.e0):void");
    }

    public final void y0() {
        x0();
        this.f134096x0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f134082q0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.Z = false;
        this.f134076k0 = false;
        this.f134077l0 = 0;
    }

    public final void z0(s7.j jVar) {
        s7.j jVar2 = this.E;
        if (jVar2 != jVar) {
            if (jVar != null) {
                jVar.f(null);
            }
            if (jVar2 != null) {
                jVar2.c(null);
            }
        }
        this.E = jVar;
    }
}
