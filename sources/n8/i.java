package n8;

import a7.b1;
import a7.o0;
import a7.o1;
import a7.z0;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import kh2.n3;
import kh2.s0;
import m7.p0;
import m7.v1;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes.dex */
public final class i extends x7.p implements w {

    /* renamed from: u1, reason: collision with root package name */
    public static final int[] f89816u1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: v1, reason: collision with root package name */
    public static boolean f89817v1;

    /* renamed from: w1, reason: collision with root package name */
    public static boolean f89818w1;
    public final Context E0;
    public final boolean F0;
    public final tb.c G0;
    public final int H0;
    public final boolean I0;
    public final x J0;
    public final h6.c0 K0;
    public final androidx.appcompat.widget.q L0;
    public final long M0;
    public final PriorityQueue N0;
    public e7.i O0;
    public boolean P0;
    public boolean Q0;
    public o R0;
    public boolean S0;
    public List T0;
    public Surface U0;
    public PlaceholderSurface V0;
    public d7.f0 W0;
    public boolean X0;
    public int Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f89819a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f89820b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f89821c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f89822d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f89823e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f89824f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f89825g1;

    /* renamed from: h1, reason: collision with root package name */
    public o1 f89826h1;

    /* renamed from: i1, reason: collision with root package name */
    public o1 f89827i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f89828j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f89829k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f89830l1;

    /* renamed from: m1, reason: collision with root package name */
    public h f89831m1;

    /* renamed from: n1, reason: collision with root package name */
    public v f89832n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f89833o1;

    /* renamed from: p1, reason: collision with root package name */
    public long f89834p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f89835q1;

    /* renamed from: r1, reason: collision with root package name */
    public final boolean f89836r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f89837s1;

    /* renamed from: t1, reason: collision with root package name */
    public int f89838t1;

    public i(g gVar) {
        super(2, gVar.f89799d, gVar.f89798c, gVar.f89801f, gVar.f89805j);
        Context applicationContext = gVar.f89796a.getApplicationContext();
        this.E0 = applicationContext;
        this.H0 = gVar.f89804i;
        this.R0 = null;
        this.C0 = gVar.f89809n;
        this.f89836r1 = gVar.f89808m;
        Handler handler = gVar.f89802g;
        i0 i0Var = gVar.f89803h;
        tb.c cVar = new tb.c();
        if (i0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        cVar.f116959a = handler;
        cVar.f116960b = i0Var;
        this.G0 = cVar;
        this.F0 = this.R0 == null;
        this.J0 = new x(applicationContext, this, gVar.f89800e);
        this.K0 = new h6.c0();
        this.I0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.W0 = d7.f0.f53820c;
        this.Y0 = 1;
        this.Z0 = 0;
        this.f89826h1 = o1.f1158d;
        this.f89830l1 = 0;
        this.f89827i1 = null;
        this.f89828j1 = -1000;
        this.f89833o1 = -9223372036854775807L;
        this.f89834p1 = -9223372036854775807L;
        this.L0 = gVar.f89806k ? new androidx.appcompat.widget.q() : null;
        this.N0 = new PriorityQueue();
        long j13 = gVar.f89807l;
        this.M0 = j13 != -9223372036854775807L ? -j13 : -9223372036854775807L;
    }

    public static boolean J0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!f89817v1) {
                    f89818w1 = L0();
                    f89817v1 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f89818w1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean L0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.i.L0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0079, code lost:
    
        if (r3.equals("video/hevc") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int N0(androidx.media3.common.b r11, x7.n r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.i.N0(androidx.media3.common.b, x7.n):int");
    }

    public static List O0(Context context, x7.q qVar, androidx.media3.common.b bVar, boolean z13, boolean z14) {
        List e13;
        String str = bVar.f18765o;
        if (str == null) {
            return v2.f100502e;
        }
        if (n0.f53866a >= 26 && "video/dolby-vision".equals(str) && !n3.r(context)) {
            String b13 = x7.v.b(bVar);
            if (b13 == null) {
                e13 = v2.f100502e;
            } else {
                ((com.google.firebase.messaging.k) qVar).getClass();
                e13 = x7.v.e(b13, z13, z14);
            }
            if (!e13.isEmpty()) {
                return e13;
            }
        }
        return x7.v.g(qVar, bVar, z13, z14);
    }

    public static int P0(androidx.media3.common.b bVar, x7.n nVar) {
        int i13 = bVar.f18766p;
        if (i13 == -1) {
            return N0(bVar, nVar);
        }
        List list = bVar.f18768r;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += ((byte[]) list.get(i15)).length;
        }
        return i13 + i14;
    }

    public static void a1(x7.l lVar, Surface surface) {
        int i13 = n0.f53866a;
        if (i13 >= 23 && surface != null) {
            lVar.j(surface);
        } else {
            if (i13 < 35) {
                throw new IllegalStateException();
            }
            lVar.g();
        }
    }

    public static boolean d1(x7.n nVar) {
        return n0.f53866a >= 35 && nVar.f134058j;
    }

    @Override // x7.p, m7.h
    public final void A(long j13, long j14) {
        o oVar = this.R0;
        if (oVar != null) {
            try {
                oVar.r(j13, j14);
            } catch (VideoSink$VideoSinkException e13) {
                throw g(7001, e13.f18856a, e13, false);
            }
        }
        super.A(j13, j14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        if ((r10 + 1) < 8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        if (r10 < 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        r3 = ((e7.s) r9.get(r10)).f57596b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
    
        r3 = r7.position();
     */
    @Override // x7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B0(k7.e r17) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.i.B0(k7.e):boolean");
    }

    @Override // x7.p
    public final boolean C0(x7.n nVar) {
        if (this.C0) {
            return false;
        }
        return R0(nVar);
    }

    @Override // x7.p, m7.h
    public final void D(float f13, float f14) {
        super.D(f13, f14);
        o oVar = this.R0;
        if (oVar != null) {
            oVar.v(f13);
        } else {
            this.J0.i(f13);
        }
    }

    @Override // x7.p
    public final int E0(x7.q qVar, androidx.media3.common.b bVar) {
        boolean z13;
        int i13 = 0;
        if (!o0.q(bVar.f18765o)) {
            return m7.h.f(0, 0, 0, 0);
        }
        boolean z14 = bVar.f18769s != null;
        Context context = this.E0;
        List O0 = O0(context, qVar, bVar, z14, false);
        if (z14 && O0.isEmpty()) {
            O0 = O0(context, qVar, bVar, false, false);
        }
        if (O0.isEmpty()) {
            return m7.h.f(1, 0, 0, 0);
        }
        int i14 = bVar.N;
        if (i14 != 0 && i14 != 2) {
            return m7.h.f(2, 0, 0, 0);
        }
        x7.n nVar = (x7.n) O0.get(0);
        boolean g13 = nVar.g(bVar);
        if (!g13) {
            for (int i15 = 1; i15 < O0.size(); i15++) {
                x7.n nVar2 = (x7.n) O0.get(i15);
                if (nVar2.g(bVar)) {
                    z13 = false;
                    g13 = true;
                    nVar = nVar2;
                    break;
                }
            }
        }
        z13 = true;
        int i16 = g13 ? 4 : 3;
        int i17 = 8;
        int i18 = nVar.h(bVar) ? 16 : 8;
        int i19 = nVar.f134055g ? 64 : 0;
        int i23 = z13 ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : 0;
        if (n0.f53866a >= 26 && "video/dolby-vision".equals(bVar.f18765o) && !n3.r(context)) {
            i23 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        if (g13) {
            List O02 = O0(context, qVar, bVar, z14, true);
            if (!O02.isEmpty()) {
                HashMap hashMap = x7.v.f134106a;
                ArrayList arrayList = new ArrayList(O02);
                Collections.sort(arrayList, new x7.r(new com.google.firebase.messaging.a0(bVar, i17)));
                x7.n nVar3 = (x7.n) arrayList.get(0);
                if (nVar3.g(bVar) && nVar3.h(bVar)) {
                    i13 = 32;
                }
            }
        }
        return i16 | i18 | i13 | i19 | i23;
    }

    @Override // x7.p
    public final m7.j I(x7.n nVar, androidx.media3.common.b bVar, androidx.media3.common.b bVar2) {
        m7.j c13 = nVar.c(bVar, bVar2);
        e7.i iVar = this.O0;
        iVar.getClass();
        int i13 = bVar2.f18772v;
        int i14 = iVar.f57538a;
        int i15 = c13.f86216e;
        if (i13 > i14 || bVar2.f18773w > iVar.f57539b) {
            i15 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        if (P0(bVar2, nVar) > iVar.f57540c) {
            i15 |= 64;
        }
        int i16 = i15;
        return new m7.j(nVar.f134049a, bVar, bVar2, i16 != 0 ? 0 : c13.f86215d, i16);
    }

    public final void I0(o oVar, androidx.media3.common.b bVar) {
        List list = this.T0;
        if (list == null) {
            y0 y0Var = c1.f100372b;
            list = v2.f100502e;
        }
        oVar.k(bVar, list);
    }

    @Override // x7.p
    public final MediaCodecDecoderException J(IllegalStateException illegalStateException, x7.n nVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, nVar, this.U0);
    }

    public final void K0(x7.l lVar, int i13) {
        Trace.beginSection("dropVideoBuffer");
        lVar.l(i13);
        Trace.endSection();
        g1(0, 1);
    }

    public final long M0() {
        return -this.f89833o1;
    }

    public final Surface Q0(x7.n nVar) {
        o oVar = this.R0;
        if (oVar != null) {
            return oVar.d();
        }
        Surface surface = this.U0;
        if (surface != null) {
            return surface;
        }
        if (d1(nVar)) {
            return null;
        }
        bf.b.t(e1(nVar));
        PlaceholderSurface placeholderSurface = this.V0;
        boolean z13 = nVar.f134054f;
        if (placeholderSurface != null && placeholderSurface.f18852a != z13) {
            X0();
        }
        if (this.V0 == null) {
            this.V0 = PlaceholderSurface.b(this.E0, z13);
        }
        return this.V0;
    }

    public final boolean R0(x7.n nVar) {
        Surface surface;
        return this.R0 != null || ((surface = this.U0) != null && surface.isValid()) || d1(nVar) || e1(nVar);
    }

    @Override // x7.p
    public final int S(k7.e eVar) {
        return (n0.f53866a < 34 || !this.f89829k1 || eVar.f78456g >= this.f86181l) ? 0 : 32;
    }

    public final boolean S0(long j13, boolean z13) {
        int E = E(j13);
        if (E == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.N0;
        if (z13) {
            m7.i iVar = this.f134098y0;
            int i13 = iVar.f86196d + E;
            iVar.f86196d = i13;
            iVar.f86198f += this.f89822d1;
            iVar.f86196d = priorityQueue.size() + i13;
        } else {
            this.f134098y0.f86202j++;
            g1(priorityQueue.size() + E, this.f89822d1);
        }
        if (Q()) {
            f0();
        }
        o oVar = this.R0;
        if (oVar != null) {
            oVar.c(false);
        }
        return true;
    }

    @Override // x7.p
    public final boolean T() {
        return this.f89829k1 && n0.f53866a < 23;
    }

    public final void T0() {
        if (this.f89820b1 > 0) {
            this.f86176g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j13 = elapsedRealtime - this.f89819a1;
            final int i13 = this.f89820b1;
            final tb.c cVar = this.G0;
            Handler handler = (Handler) cVar.f116959a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n8.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0 i0Var = (i0) cVar.f116960b;
                        int i14 = n0.f53866a;
                        n7.c0 c0Var = (n7.c0) ((m7.i0) i0Var).f86205a.f86285t;
                        n7.b u13 = c0Var.u(c0Var.f89397d.f89392e);
                        c0Var.x(u13, 1018, new n7.m(i13, j13, u13));
                    }
                });
            }
            this.f89820b1 = 0;
            this.f89819a1 = elapsedRealtime;
        }
    }

    @Override // x7.p
    public final float U(float f13, androidx.media3.common.b[] bVarArr) {
        float f14 = -1.0f;
        for (androidx.media3.common.b bVar : bVarArr) {
            float f15 = bVar.f18774x;
            if (f15 != -1.0f) {
                f14 = Math.max(f14, f15);
            }
        }
        if (f14 == -1.0f) {
            return -1.0f;
        }
        return f14 * f13;
    }

    public final void U0() {
        Surface surface = this.U0;
        if (surface == null || !this.X0) {
            return;
        }
        tb.c cVar = this.G0;
        if (((Handler) cVar.f116959a) != null) {
            ((Handler) cVar.f116959a).post(new e0(cVar, surface, SystemClock.elapsedRealtime()));
        }
    }

    @Override // x7.p
    public final ArrayList V(x7.q qVar, androidx.media3.common.b bVar, boolean z13) {
        List O0 = O0(this.E0, qVar, bVar, z13, this.f89829k1);
        HashMap hashMap = x7.v.f134106a;
        ArrayList arrayList = new ArrayList(O0);
        Collections.sort(arrayList, new x7.r(new com.google.firebase.messaging.a0(bVar, 8)));
        return arrayList;
    }

    public final void V0() {
        int i13;
        x7.l lVar;
        if (!this.f89829k1 || (i13 = n0.f53866a) < 23 || (lVar = this.L) == null) {
            return;
        }
        this.f89831m1 = new h(this, lVar);
        if (i13 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            lVar.c(bundle);
        }
    }

    public final void W0(long j13) {
        Surface surface;
        H0(j13);
        o1 o1Var = this.f89826h1;
        boolean equals = o1Var.equals(o1.f1158d);
        tb.c cVar = this.G0;
        if (!equals && !o1Var.equals(this.f89827i1)) {
            this.f89827i1 = o1Var;
            cVar.p(o1Var);
        }
        this.f134098y0.f86197e++;
        x xVar = this.J0;
        boolean z13 = xVar.f89908e != 3;
        xVar.f89908e = 3;
        ((d7.g0) xVar.f89915l).getClass();
        xVar.f89910g = n0.X(SystemClock.elapsedRealtime());
        if (z13 && (surface = this.U0) != null) {
            if (((Handler) cVar.f116959a) != null) {
                ((Handler) cVar.f116959a).post(new e0(cVar, surface, SystemClock.elapsedRealtime()));
            }
            this.X0 = true;
        }
        o0(j13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x013a, code lost:
    
        r23 = r13;
        r26 = r14;
        r14 = r4;
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0137, code lost:
    
        r1 = null;
     */
    @Override // x7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.appcompat.widget.x X(x7.n r28, androidx.media3.common.b r29, android.media.MediaCrypto r30, float r31) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.i.X(x7.n, androidx.media3.common.b, android.media.MediaCrypto, float):androidx.appcompat.widget.x");
    }

    public final void X0() {
        PlaceholderSurface placeholderSurface = this.V0;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.V0 = null;
        }
    }

    public final void Y0(x7.l lVar, int i13, long j13) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.m(i13, j13);
        Trace.endSection();
        this.f134098y0.f86197e++;
        this.f89821c1 = 0;
        if (this.R0 == null) {
            o1 o1Var = this.f89826h1;
            boolean equals = o1Var.equals(o1.f1158d);
            tb.c cVar = this.G0;
            if (!equals && !o1Var.equals(this.f89827i1)) {
                this.f89827i1 = o1Var;
                cVar.p(o1Var);
            }
            x xVar = this.J0;
            boolean z13 = xVar.f89908e != 3;
            xVar.f89908e = 3;
            ((d7.g0) xVar.f89915l).getClass();
            xVar.f89910g = n0.X(SystemClock.elapsedRealtime());
            if (!z13 || (surface = this.U0) == null) {
                return;
            }
            if (((Handler) cVar.f116959a) != null) {
                ((Handler) cVar.f116959a).post(new e0(cVar, surface, SystemClock.elapsedRealtime()));
            }
            this.X0 = true;
        }
    }

    @Override // x7.p
    public final void Z(k7.e eVar) {
        if (this.Q0) {
            ByteBuffer byteBuffer = eVar.f78457h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b13 = byteBuffer.get();
                short s13 = byteBuffer.getShort();
                short s14 = byteBuffer.getShort();
                byte b14 = byteBuffer.get();
                byte b15 = byteBuffer.get();
                byteBuffer.position(0);
                if (b13 == -75 && s13 == 60 && s14 == 1 && b14 == 4) {
                    if (b15 == 0 || b15 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        x7.l lVar = this.L;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.c(bundle);
                    }
                }
            }
        }
    }

    public final void Z0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.U0;
        tb.c cVar = this.G0;
        if (surface2 == surface) {
            if (surface != null) {
                o1 o1Var = this.f89827i1;
                if (o1Var != null) {
                    cVar.p(o1Var);
                }
                U0();
                return;
            }
            return;
        }
        this.U0 = surface;
        o oVar = this.R0;
        x xVar = this.J0;
        if (oVar == null) {
            xVar.h(surface);
        }
        this.X0 = false;
        int i13 = this.f86177h;
        x7.l lVar = this.L;
        if (lVar != null && this.R0 == null) {
            x7.n nVar = this.S;
            nVar.getClass();
            boolean R0 = R0(nVar);
            if (n0.f53866a < 23 || !R0 || this.P0) {
                v0();
                f0();
            } else {
                a1(lVar, Q0(nVar));
            }
        }
        if (surface != null) {
            o1 o1Var2 = this.f89827i1;
            if (o1Var2 != null) {
                cVar.p(o1Var2);
            }
        } else {
            this.f89827i1 = null;
            o oVar2 = this.R0;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        if (i13 == 2) {
            o oVar3 = this.R0;
            if (oVar3 != null) {
                oVar3.j(true);
            } else {
                xVar.c(true);
            }
        }
        V0();
    }

    @Override // x7.p, m7.h, m7.q1
    public final void b(int i13, Object obj) {
        if (i13 == 1) {
            Z0(obj);
            return;
        }
        if (i13 == 7) {
            obj.getClass();
            v vVar = (v) obj;
            this.f89832n1 = vVar;
            o oVar = this.R0;
            if (oVar != null) {
                oVar.y(vVar);
                return;
            }
            return;
        }
        if (i13 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f89830l1 != intValue) {
                this.f89830l1 = intValue;
                if (this.f89829k1) {
                    v0();
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.Y0 = intValue2;
            x7.l lVar = this.L;
            if (lVar != null) {
                lVar.h(intValue2);
                return;
            }
            return;
        }
        if (i13 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.Z0 = intValue3;
            o oVar2 = this.R0;
            if (oVar2 != null) {
                oVar2.s(intValue3);
                return;
            }
            a0 a0Var = this.J0.f89905b;
            if (a0Var.f89738j == intValue3) {
                return;
            }
            a0Var.f89738j = intValue3;
            a0Var.d(true);
            return;
        }
        if (i13 == 13) {
            obj.getClass();
            b1((List) obj);
            return;
        }
        if (i13 == 14) {
            obj.getClass();
            d7.f0 f0Var = (d7.f0) obj;
            if (f0Var.f53821a == 0 || f0Var.a() == 0) {
                return;
            }
            this.W0 = f0Var;
            o oVar3 = this.R0;
            if (oVar3 != null) {
                Surface surface = this.U0;
                bf.b.w(surface);
                oVar3.t(surface, f0Var);
                return;
            }
            return;
        }
        if (i13 != 16) {
            if (i13 != 17) {
                super.b(i13, obj);
                return;
            }
            Surface surface2 = this.U0;
            Z0(null);
            obj.getClass();
            ((i) obj).b(1, surface2);
            return;
        }
        obj.getClass();
        this.f89828j1 = ((Integer) obj).intValue();
        x7.l lVar2 = this.L;
        if (lVar2 != null && n0.f53866a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f89828j1));
            lVar2.c(bundle);
        }
    }

    public final void b1(List list) {
        this.T0 = list;
        o oVar = this.R0;
        if (oVar != null) {
            oVar.x(list);
        }
    }

    public final boolean c1(long j13, long j14, boolean z13, boolean z14) {
        long j15 = this.M0;
        if (j15 != -9223372036854775807L) {
            this.f89837s1 = j14 > this.f86181l + 200000 && j13 < j15;
        }
        return j13 < -500000 && !z13 && S0(j14, z14);
    }

    public final boolean e1(x7.n nVar) {
        return n0.f53866a >= 23 && !this.f89829k1 && !J0(nVar.f134049a) && (!nVar.f134054f || PlaceholderSurface.a(this.E0));
    }

    public final void f1(x7.l lVar, int i13) {
        Trace.beginSection("skipVideoBuffer");
        lVar.l(i13);
        Trace.endSection();
        this.f134098y0.f86198f++;
    }

    public final void g1(int i13, int i14) {
        m7.i iVar = this.f134098y0;
        iVar.f86200h += i13;
        int i15 = i13 + i14;
        iVar.f86199g += i15;
        this.f89820b1 += i15;
        int i16 = this.f89821c1 + i15;
        this.f89821c1 = i16;
        iVar.f86201i = Math.max(i16, iVar.f86201i);
        int i17 = this.H0;
        if (i17 <= 0 || this.f89820b1 < i17) {
            return;
        }
        T0();
    }

    @Override // m7.h
    public final void h() {
        o oVar = this.R0;
        if (oVar != null) {
            oVar.b();
            return;
        }
        x xVar = this.J0;
        if (xVar.f89908e == 0) {
            xVar.f89908e = 1;
        }
    }

    @Override // x7.p
    public final boolean h0(androidx.media3.common.b bVar) {
        o oVar = this.R0;
        if (oVar == null || oVar.h()) {
            return true;
        }
        try {
            return this.R0.f(bVar);
        } catch (VideoSink$VideoSinkException e13) {
            throw g(7000, bVar, e13, false);
        }
    }

    public final void h1(long j13) {
        m7.i iVar = this.f134098y0;
        iVar.f86203k += j13;
        iVar.f86204l++;
        this.f89823e1 += j13;
        this.f89824f1++;
    }

    @Override // x7.p
    public final void i0(Exception exc) {
        d7.u.d("MediaCodecVideoRenderer", "Video codec error", exc);
        tb.c cVar = this.G0;
        Handler handler = (Handler) cVar.f116959a;
        if (handler != null) {
            handler.post(new w2.c(27, cVar, exc));
        }
    }

    @Override // x7.p
    public final void j0(final String str, final long j13, final long j14) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final tb.c cVar = this.G0;
        Handler handler = (Handler) cVar.f116959a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n8.d0
                @Override // java.lang.Runnable
                public final void run() {
                    i0 i0Var = (i0) tb.c.this.f116960b;
                    int i13 = n0.f53866a;
                    n7.c0 c0Var = (n7.c0) ((m7.i0) i0Var).f86205a.f86285t;
                    n7.b w13 = c0Var.w();
                    c0Var.x(w13, 1016, new d7.r(str, j14, j13) { // from class: n7.f

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ String f89428b;

                        @Override // d7.r
                        /* renamed from: invoke */
                        public final void mo0invoke(Object obj) {
                            c cVar2 = (c) obj;
                            cVar2.getClass();
                            cVar2.h(b.this, this.f89428b);
                        }
                    });
                }
            });
        }
        this.P0 = J0(str);
        x7.n nVar = this.S;
        nVar.getClass();
        boolean z13 = false;
        if (n0.f53866a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f134050b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f134052d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i13].profile == 16384) {
                    z13 = true;
                    break;
                }
                i13++;
            }
        }
        this.Q0 = z13;
        V0();
    }

    @Override // x7.p
    public final void k0(String str) {
        tb.c cVar = this.G0;
        Handler handler = (Handler) cVar.f116959a;
        if (handler != null) {
            handler.post(new w2.c(28, cVar, str));
        }
    }

    @Override // x7.p
    public final m7.j l0(qq2.c cVar) {
        m7.j l03 = super.l0(cVar);
        androidx.media3.common.b bVar = (androidx.media3.common.b) cVar.f104884c;
        bVar.getClass();
        tb.c cVar2 = this.G0;
        Handler handler = (Handler) cVar2.f116959a;
        if (handler != null) {
            handler.post(new h6.o(cVar2, bVar, l03, 6));
        }
        return l03;
    }

    @Override // m7.h
    public final String m() {
        return "MediaCodecVideoRenderer";
    }

    @Override // x7.p
    public final void m0(androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        int integer;
        int i13;
        x7.l lVar = this.L;
        if (lVar != null) {
            lVar.h(this.Y0);
        }
        if (this.f89829k1) {
            i13 = bVar.f18772v;
            integer = bVar.f18773w;
        } else {
            mediaFormat.getClass();
            boolean z13 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z13 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z13 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i13 = integer2;
        }
        float f13 = bVar.f18776z;
        int i14 = bVar.f18775y;
        if (i14 == 90 || i14 == 270) {
            f13 = 1.0f / f13;
            int i15 = integer;
            integer = i13;
            i13 = i15;
        }
        this.f89826h1 = new o1(i13, f13, integer);
        o oVar = this.R0;
        if (oVar == null || !this.f89835q1) {
            this.J0.g(bVar.f18774x);
        } else {
            a7.q a13 = bVar.a();
            a13.f1188u = i13;
            a13.f1189v = integer;
            a13.f1192y = f13;
            I0(oVar, new androidx.media3.common.b(a13));
        }
        this.f89835q1 = false;
    }

    @Override // m7.h
    public final boolean o() {
        o oVar;
        return this.f134090u0 && ((oVar = this.R0) == null || oVar.g());
    }

    @Override // x7.p
    public final void o0(long j13) {
        super.o0(j13);
        if (this.f89829k1) {
            return;
        }
        this.f89822d1--;
    }

    @Override // x7.p
    public final void p0() {
        o oVar = this.R0;
        if (oVar != null) {
            oVar.z();
            this.R0.w(this.f134100z0.f134062b, M0());
        } else {
            this.J0.d(2);
        }
        this.f89835q1 = true;
        V0();
    }

    @Override // x7.p, m7.h
    public final boolean q() {
        boolean q13 = super.q();
        o oVar = this.R0;
        if (oVar != null) {
            return oVar.i(q13);
        }
        if (q13 && (this.L == null || this.f89829k1)) {
            return true;
        }
        return this.J0.b(q13);
    }

    @Override // x7.p
    public final void q0(k7.e eVar) {
        ByteBuffer byteBuffer;
        androidx.appcompat.widget.q qVar = this.L0;
        if (qVar != null) {
            x7.n nVar = this.S;
            nVar.getClass();
            if (nVar.f134050b.equals("video/av01") && (byteBuffer = eVar.f78454e) != null) {
                qVar.E(s0.S0(byteBuffer));
            }
        }
        this.f89838t1 = 0;
        boolean z13 = this.f89829k1;
        if (!z13) {
            this.f89822d1++;
        }
        if (n0.f53866a >= 23 || !z13) {
            return;
        }
        W0(eVar.f78456g);
    }

    @Override // x7.p, m7.h
    public final void r() {
        tb.c cVar = this.G0;
        this.f89827i1 = null;
        this.f89834p1 = -9223372036854775807L;
        o oVar = this.R0;
        if (oVar != null) {
            oVar.l();
        } else {
            this.J0.d(0);
        }
        V0();
        this.X0 = false;
        this.f89831m1 = null;
        int i13 = 1;
        try {
            super.r();
            m7.i iVar = this.f134098y0;
            cVar.getClass();
            synchronized (iVar) {
            }
            Handler handler = (Handler) cVar.f116959a;
            if (handler != null) {
                handler.post(new h0(cVar, iVar, i13));
            }
            cVar.p(o1.f1158d);
        } catch (Throwable th3) {
            m7.i iVar2 = this.f134098y0;
            cVar.getClass();
            synchronized (iVar2) {
                Handler handler2 = (Handler) cVar.f116959a;
                if (handler2 != null) {
                    handler2.post(new h0(cVar, iVar2, i13));
                }
                cVar.p(o1.f1158d);
                throw th3;
            }
        }
    }

    @Override // x7.p
    public final void r0(p0 p0Var) {
        o oVar = this.R0;
        if (oVar != null) {
            oVar.f89868k.f89889r = p0Var;
        }
    }

    @Override // m7.h
    public final void s(boolean z13, boolean z14) {
        this.f134098y0 = new m7.i();
        v1 v1Var = this.f86173d;
        v1Var.getClass();
        int i13 = 0;
        boolean z15 = v1Var.f86443b;
        bf.b.t((z15 && this.f89830l1 == 0) ? false : true);
        if (this.f89829k1 != z15) {
            this.f89829k1 = z15;
            v0();
        }
        m7.i iVar = this.f134098y0;
        tb.c cVar = this.G0;
        Handler handler = (Handler) cVar.f116959a;
        if (handler != null) {
            handler.post(new h0(cVar, iVar, i13));
        }
        boolean z16 = this.S0;
        x xVar = this.J0;
        if (!z16) {
            if (this.T0 != null && this.R0 == null) {
                m mVar = new m(this.E0, xVar);
                d7.e eVar = this.f86176g;
                eVar.getClass();
                mVar.f89853g = eVar;
                s a13 = mVar.a();
                a13.f89894w = 1;
                this.R0 = a13.a();
            }
            this.S0 = true;
        }
        o oVar = this.R0;
        if (oVar == null) {
            d7.e eVar2 = this.f86176g;
            eVar2.getClass();
            xVar.f89915l = eVar2;
            xVar.f89908e = z14 ? 1 : 0;
            return;
        }
        androidx.appcompat.widget.q qVar = new androidx.appcompat.widget.q(this, 2);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        oVar.f89866i = qVar;
        oVar.f89867j = rVar;
        v vVar = this.f89832n1;
        if (vVar != null) {
            oVar.y(vVar);
        }
        if (this.U0 != null && !this.W0.equals(d7.f0.f53820c)) {
            this.R0.t(this.U0, this.W0);
        }
        this.R0.s(this.Z0);
        this.R0.v(Y());
        List list = this.T0;
        if (list != null) {
            this.R0.x(list);
        }
        this.R0.m(z14);
        p0 p0Var = this.G;
        if (p0Var != null) {
            this.R0.f89868k.f89889r = p0Var;
        }
    }

    @Override // x7.p, m7.h
    public final void t(long j13, boolean z13) {
        o oVar = this.R0;
        if (oVar != null) {
            if (!z13) {
                oVar.c(true);
            }
            this.R0.w(this.f134100z0.f134062b, M0());
            this.f89835q1 = true;
        }
        super.t(j13, z13);
        o oVar2 = this.R0;
        x xVar = this.J0;
        if (oVar2 == null) {
            a0 a0Var = xVar.f89905b;
            a0Var.f89741m = 0L;
            a0Var.f89744p = -1L;
            a0Var.f89742n = -1L;
            xVar.f89911h = -9223372036854775807L;
            xVar.f89909f = -9223372036854775807L;
            xVar.d(1);
            xVar.f89912i = -9223372036854775807L;
        }
        if (z13) {
            o oVar3 = this.R0;
            if (oVar3 != null) {
                oVar3.j(false);
            } else {
                xVar.c(false);
            }
        }
        V0();
        this.f89821c1 = 0;
    }

    @Override // x7.p
    public final boolean t0(long j13, long j14, x7.l lVar, ByteBuffer byteBuffer, int i13, int i14, int i15, long j15, boolean z13, boolean z14, androidx.media3.common.b bVar) {
        lVar.getClass();
        long j16 = j15 - this.f134100z0.f134063c;
        int i16 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.N0;
            Long l13 = (Long) priorityQueue.peek();
            if (l13 == null || l13.longValue() >= j15) {
                break;
            }
            i16++;
            priorityQueue.poll();
        }
        g1(i16, 0);
        if (this.R0 != null) {
            if (!z13 || z14) {
                return this.R0.e(M0() + j15, new f(this, lVar, i13, j16));
            }
            f1(lVar, i13);
            return true;
        }
        int a13 = this.J0.a(j15, j13, j14, this.f134100z0.f134062b, z13, z14, this.K0);
        h6.c0 c0Var = this.K0;
        if (a13 == 0) {
            this.f86176g.getClass();
            long nanoTime = System.nanoTime();
            v vVar = this.f89832n1;
            if (vVar != null) {
                vVar.d(j16, nanoTime, bVar, this.N);
            }
            Y0(lVar, i13, nanoTime);
            h1(c0Var.f67702a);
            return true;
        }
        if (a13 == 1) {
            long j17 = c0Var.f67703b;
            long j18 = c0Var.f67702a;
            if (j17 == this.f89825g1) {
                f1(lVar, i13);
            } else {
                v vVar2 = this.f89832n1;
                if (vVar2 != null) {
                    vVar2.d(j16, j17, bVar, this.N);
                }
                Y0(lVar, i13, j17);
            }
            h1(j18);
            this.f89825g1 = j17;
            return true;
        }
        if (a13 == 2) {
            K0(lVar, i13);
            h1(c0Var.f67702a);
            return true;
        }
        if (a13 == 3) {
            f1(lVar, i13);
            h1(c0Var.f67702a);
            return true;
        }
        if (a13 == 4 || a13 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a13));
    }

    @Override // m7.h
    public final void u() {
        o oVar = this.R0;
        if (oVar == null || !this.F0) {
            return;
        }
        oVar.q();
    }

    @Override // m7.h
    public final void v() {
        try {
            try {
                K();
                v0();
                s7.j jVar = this.F;
                if (jVar != null) {
                    jVar.c(null);
                }
                this.F = null;
            } catch (Throwable th3) {
                s7.j jVar2 = this.F;
                if (jVar2 != null) {
                    jVar2.c(null);
                }
                this.F = null;
                throw th3;
            }
        } finally {
            this.S0 = false;
            this.f89833o1 = -9223372036854775807L;
            X0();
        }
    }

    @Override // m7.h
    public final void w() {
        this.f89820b1 = 0;
        this.f86176g.getClass();
        this.f89819a1 = SystemClock.elapsedRealtime();
        this.f89823e1 = 0L;
        this.f89824f1 = 0;
        o oVar = this.R0;
        if (oVar != null) {
            oVar.n();
        } else {
            this.J0.e();
        }
    }

    @Override // x7.p
    public final void w0() {
        o oVar = this.R0;
        if (oVar != null) {
            oVar.z();
        }
    }

    @Override // m7.h
    public final void x() {
        T0();
        final int i13 = this.f89824f1;
        if (i13 != 0) {
            final long j13 = this.f89823e1;
            final tb.c cVar = this.G0;
            Handler handler = (Handler) cVar.f116959a;
            if (handler != null) {
                handler.post(new Runnable(i13, j13, cVar) { // from class: n8.g0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ tb.c f89810a;

                    {
                        this.f89810a = cVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        i0 i0Var = (i0) this.f89810a.f116960b;
                        int i14 = n0.f53866a;
                        n7.c0 c0Var = (n7.c0) ((m7.i0) i0Var).f86205a.f86285t;
                        c0Var.x(c0Var.u(c0Var.f89397d.f89392e), 1021, new com.google.firebase.messaging.k());
                    }
                });
            }
            this.f89823e1 = 0L;
            this.f89824f1 = 0;
        }
        o oVar = this.R0;
        if (oVar != null) {
            oVar.o();
        } else {
            this.J0.f();
        }
    }

    @Override // x7.p
    public final void x0() {
        super.x0();
        this.N0.clear();
        this.f89837s1 = false;
        this.f89822d1 = 0;
        this.f89838t1 = 0;
        androidx.appcompat.widget.q qVar = this.L0;
        if (qVar != null) {
            qVar.f16669b = null;
        }
    }

    @Override // x7.p, m7.h
    public final void y(androidx.media3.common.b[] bVarArr, long j13, long j14, g8.e0 e0Var) {
        super.y(bVarArr, j13, j14, e0Var);
        if (this.f89833o1 == -9223372036854775807L) {
            this.f89833o1 = j13;
        }
        b1 b1Var = this.f86185p;
        if (b1Var.q()) {
            this.f89834p1 = -9223372036854775807L;
            return;
        }
        e0Var.getClass();
        this.f89834p1 = b1Var.h(e0Var.f64233a, new z0()).f1254d;
    }
}
