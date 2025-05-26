package cc2;

import a.cb;
import android.util.SizeF;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.s3;
import hc2.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.c1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.f0;

/* loaded from: classes2.dex */
public final class a {
    public int A;
    public String B;
    public final List C;
    public String D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public String f27452J;
    public SizeF K;
    public SizeF L;
    public final List M;
    public int N;
    public final long O;
    public int P;
    public float Q;
    public boolean R;
    public String S;
    public short T;
    public int U;
    public q V;
    public Long W;
    public final Long X;
    public gc2.c Y;
    public final int Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f27453a;

    /* renamed from: a0, reason: collision with root package name */
    public final f0 f27454a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f27455b;

    /* renamed from: b0, reason: collision with root package name */
    public Long f27456b0;

    /* renamed from: c, reason: collision with root package name */
    public double f27457c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f27458c0;

    /* renamed from: d, reason: collision with root package name */
    public long f27459d;

    /* renamed from: e, reason: collision with root package name */
    public long f27460e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27461f;

    /* renamed from: g, reason: collision with root package name */
    public long f27462g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27463h;

    /* renamed from: i, reason: collision with root package name */
    public long f27464i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27465j;

    /* renamed from: k, reason: collision with root package name */
    public final List f27466k;

    /* renamed from: l, reason: collision with root package name */
    public long f27467l;

    /* renamed from: m, reason: collision with root package name */
    public final List f27468m;

    /* renamed from: n, reason: collision with root package name */
    public long f27469n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27470o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27471p;

    /* renamed from: q, reason: collision with root package name */
    public long f27472q;

    /* renamed from: r, reason: collision with root package name */
    public long f27473r;

    /* renamed from: s, reason: collision with root package name */
    public long f27474s;

    /* renamed from: t, reason: collision with root package name */
    public long f27475t;

    /* renamed from: u, reason: collision with root package name */
    public long f27476u;

    /* renamed from: v, reason: collision with root package name */
    public float f27477v;

    /* renamed from: w, reason: collision with root package name */
    public float f27478w;

    /* renamed from: x, reason: collision with root package name */
    public float f27479x;

    /* renamed from: y, reason: collision with root package name */
    public float f27480y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f27481z;

    public a(String uid, String url, boolean z13, boolean z14, boolean z15, float f13, float f14, float f15, float f16, long j13, SizeF sizeF, SizeF sizeF2, int i13, long j14, float f17, boolean z16, q qVar, Long l13, Long l14, gc2.c videoTransferListener, int i14, int i15, int i16) {
        boolean z17 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13;
        ArrayList bufferSegments = new ArrayList();
        ArrayList pauseSegments = new ArrayList();
        boolean z18 = (i15 & 16384) != 0 ? false : z14;
        boolean z19 = (i15 & 32768) != 0 ? false : z15;
        float f18 = (2097152 & i15) != 0 ? 0.0f : f13;
        float f19 = (4194304 & i15) != 0 ? 0.0f : f14;
        float f23 = (i15 & 8388608) != 0 ? 0.0f : f15;
        float f24 = (i15 & 16777216) != 0 ? 0.0f : f16;
        ArrayList detailedErrors = new ArrayList();
        boolean z23 = z19;
        long j15 = (i16 & 2) != 0 ? 0L : j13;
        SizeF sizeF3 = (i16 & 16) != 0 ? null : sizeF;
        SizeF sizeF4 = (i16 & 32) != 0 ? null : sizeF2;
        ArrayList videoSegments = new ArrayList();
        SizeF sizeF5 = sizeF3;
        int i17 = (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? 0 : i13;
        long j16 = (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 0L : j14;
        float f25 = (i16 & 1024) != 0 ? 0.0f : f17;
        boolean z24 = (i16 & 2048) != 0 ? false : z16;
        q qVar2 = (i16 & 32768) != 0 ? null : qVar;
        Long l15 = (i16 & 65536) != 0 ? null : l13;
        Long l16 = (i16 & 131072) != 0 ? null : l14;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bufferSegments, "bufferSegments");
        Intrinsics.checkNotNullParameter(pauseSegments, "pauseSegments");
        Intrinsics.checkNotNullParameter(detailedErrors, "detailedErrors");
        Intrinsics.checkNotNullParameter(videoSegments, "videoSegments");
        Intrinsics.checkNotNullParameter(videoTransferListener, "videoTransferListener");
        this.f27453a = uid;
        this.f27455b = url;
        this.f27457c = 0.0d;
        this.f27459d = 0L;
        this.f27460e = 0L;
        this.f27461f = false;
        this.f27462g = 0L;
        this.f27463h = z17;
        this.f27464i = 0L;
        this.f27465j = false;
        this.f27466k = bufferSegments;
        this.f27467l = 0L;
        this.f27468m = pauseSegments;
        this.f27469n = 0L;
        this.f27470o = z18;
        this.f27471p = z23;
        this.f27472q = -1L;
        this.f27473r = 0L;
        this.f27474s = 0L;
        this.f27475t = 0L;
        this.f27476u = 0L;
        this.f27477v = f18;
        this.f27478w = f19;
        this.f27479x = f23;
        this.f27480y = f24;
        this.f27481z = false;
        this.A = -1;
        this.B = null;
        this.C = detailedErrors;
        this.D = null;
        this.E = 0;
        this.F = 0L;
        this.G = 0L;
        this.H = j15;
        this.I = 0L;
        this.f27452J = null;
        this.K = sizeF5;
        this.L = sizeF4;
        this.M = videoSegments;
        this.N = i17;
        this.O = j16;
        this.P = 0;
        this.Q = f25;
        this.R = z24;
        this.S = null;
        this.T = (short) 0;
        this.U = 0;
        this.V = qVar2;
        this.W = l15;
        this.X = l16;
        this.Y = videoTransferListener;
        this.Z = i14;
        this.f27454a0 = vb0.j.f125466a;
        if (z.h(url, ".mp4", false)) {
            this.f27452J = url;
        }
    }

    public static boolean a(SizeF dimensions) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        return dimensions.getWidth() == 0.0f && dimensions.getHeight() == 0.0f;
    }

    public static long b(a aVar) {
        long j13 = aVar.f27460e;
        long j14 = aVar.f27472q;
        if (j14 == -1) {
            return 0L;
        }
        return (j13 - aVar.f27459d) - (aVar.d() + (aVar.c() + j14));
    }

    public static void j(a aVar, long j13, long j14, SizeF sizeF, SizeF sizeF2, int i13) {
        SizeF sizeF3;
        SizeF sizeF4 = (i13 & 4) != 0 ? aVar.L : sizeF;
        SizeF sizeF5 = (i13 & 8) != 0 ? aVar.K : sizeF2;
        aVar.getClass();
        if (sizeF4 == null || sizeF5 == null || a(sizeF4) || a(sizeF5)) {
            sizeF3 = sizeF5;
        } else {
            long j15 = j13 - aVar.H;
            String str = aVar.f27452J;
            long j16 = aVar.I;
            String str2 = aVar.Y.f64783b.f64780f;
            Short valueOf = Short.valueOf((short) sizeF4.getWidth());
            Short valueOf2 = Short.valueOf((short) sizeF4.getHeight());
            Short valueOf3 = Short.valueOf((short) sizeF5.getWidth());
            Short valueOf4 = Short.valueOf((short) sizeF5.getHeight());
            Long valueOf5 = Long.valueOf(j15);
            Long valueOf6 = Long.valueOf(j16);
            if (!Intrinsics.d(aVar.S, g10.c.f63362b)) {
                String str3 = aVar.S;
                if (str3 != null && str3.length() != 0) {
                    aVar.T = (short) (aVar.T + 1);
                }
                aVar.S = g10.c.f63362b;
            }
            sizeF3 = sizeF5;
            aVar.M.add(new s3(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, str, aVar.S, Short.valueOf(aVar.T), valueOf6, str2 != null ? str2 : null));
            aVar.Y.f64783b.f64780f = null;
            aVar.H = j13;
        }
        aVar.L = sizeF4;
        aVar.K = sizeF3;
        aVar.I = j14;
    }

    public final long c() {
        long j13 = 0;
        for (Pair pair : this.f27466k) {
            j13 += ((Number) pair.f80347b).longValue() - ((Number) pair.f80346a).longValue();
        }
        return j13;
    }

    public final long d() {
        long j13 = 0;
        for (Pair pair : this.f27468m) {
            j13 += ((Number) pair.f80347b).longValue() - ((Number) pair.f80346a).longValue();
        }
        return j13;
    }

    public final boolean e() {
        return this.f27459d != 0;
    }

    public final void f(long j13) {
        boolean z13 = this.f27458c0;
        this.f27458c0 = false;
        if (this.f27467l == 0) {
            return;
        }
        if (!e()) {
            this.f27467l = 0L;
            return;
        }
        long max = Math.max(this.f27467l, this.f27459d);
        long j14 = j13 - max;
        if (j14 == 0) {
            this.f27467l = 0L;
            return;
        }
        if (j14 >= 0) {
            if (z13) {
                this.f27467l = 0L;
                return;
            }
            this.f27466k.add(new Pair(Long.valueOf(max), Long.valueOf(j13)));
            this.f27467l = 0L;
            return;
        }
        long j15 = this.f27467l;
        long j16 = this.f27459d;
        StringBuilder sb3 = new StringBuilder("Bad buffer: ");
        sb3.append(this.f27453a);
        sb3.append(" ");
        sb3.append(j14);
        cb.v(sb3, " Init: ", j15, " Curr: ");
        sb3.append(j13);
        sb3.append(" Start: ");
        sb3.append(j16);
        this.f27454a0.T(true, sb3.toString(), new Object[0]);
        this.f27467l = 0L;
    }

    public final void g(long j13) {
        if (this.f27469n == 0 || !e()) {
            this.f27469n = 0L;
            return;
        }
        long max = Math.max(this.f27469n, this.f27459d);
        long j14 = j13 - max;
        if (j14 == 0) {
            this.f27469n = 0L;
            return;
        }
        if (j14 >= 0) {
            this.f27468m.add(new Pair(Long.valueOf(max), Long.valueOf(j13)));
            this.f27469n = 0L;
            return;
        }
        long j15 = this.f27469n;
        StringBuilder sb3 = new StringBuilder("Bad pause: ");
        sb3.append(this.f27453a);
        sb3.append(" ");
        sb3.append(j14);
        cb.v(sb3, " Init: ", j15, ", Curr: ");
        sb3.append(j13);
        this.f27454a0.T(true, sb3.toString(), new Object[0]);
        this.f27469n = 0L;
    }

    public final void h(int i13) {
        this.E = i13;
    }

    public final void i(long j13) {
        this.F = j13;
    }

    public final String toString() {
        long j13 = this.f27459d;
        if (j13 > 0) {
            long j14 = this.f27460e;
            if (j14 > j13) {
                long j15 = this.f27472q;
                long j16 = j14 - j13;
                float f13 = j15 / (j14 - j13);
                int size = this.f27466k.size();
                int size2 = this.f27468m.size();
                int i13 = this.N;
                List list = this.M;
                Intrinsics.checkNotNullParameter(list, "<this>");
                c1 c1Var = new c1(list);
                q qVar = this.V;
                Long l13 = this.W;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f27453a);
                sb3.append(",\nstartupLatencyMs=");
                sb3.append(j15);
                cb.v(sb3, ",\nsessionTotalTime=", j16, ",\nlatency%=");
                sb3.append(f13);
                sb3.append(",\npauseDuration%=");
                sb3.append(d() / (this.f27460e - this.f27459d));
                sb3.append(",\nbufferDuration%=");
                sb3.append(c() / (this.f27460e - this.f27459d));
                sb3.append(",\nbufferCount=");
                sb3.append(size);
                sb3.append(",\npauseCount=");
                a.a.z(sb3, size2, ",\nloopCount=", i13, ",\nsegments=");
                sb3.append(c1Var);
                sb3.append(",\nprefetchTrigger=");
                sb3.append(qVar);
                sb3.append(",\nprefetchDurationMs=");
                sb3.append(l13);
                return sb3.toString();
            }
        }
        return super.toString();
    }
}
