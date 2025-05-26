package r0;

import a.a4;
import a.ig;
import a.sc;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.r1;
import androidx.camera.core.impl.u1;
import androidx.camera.core.impl.v2;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import c0.m1;
import c0.p1;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kh2.j1;

/* loaded from: classes2.dex */
public final class j0 implements c1 {

    /* renamed from: f0, reason: collision with root package name */
    public static final Set f105545f0 = Collections.unmodifiableSet(EnumSet.of(i0.PENDING_RECORDING, i0.PENDING_PAUSED));

    /* renamed from: g0, reason: collision with root package name */
    public static final Set f105546g0 = Collections.unmodifiableSet(EnumSet.of(i0.CONFIGURING, i0.IDLING, i0.RESETTING, i0.STOPPING, i0.ERROR));

    /* renamed from: h0, reason: collision with root package name */
    public static final m f105547h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final e f105548i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final RuntimeException f105549j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final sc f105550k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final f0.j f105551l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f105552m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final long f105553n0;
    public Surface A;
    public MediaMuxer B;
    public final r1 C;
    public u0.e D;
    public y0.c0 E;
    public a.z0 F;
    public y0.c0 G;
    public a.z0 H;
    public b0 I;

    /* renamed from: J, reason: collision with root package name */
    public Uri f105554J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public Throwable T;
    public y0.h U;
    public final k0.a V;
    public Throwable W;
    public boolean X;
    public b1 Y;
    public ScheduledFuture Z;

    /* renamed from: a, reason: collision with root package name */
    public final r1 f105555a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f105556a0;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f105557b;

    /* renamed from: b0, reason: collision with root package name */
    public a1 f105558b0;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f105559c;

    /* renamed from: c0, reason: collision with root package name */
    public a1 f105560c0;

    /* renamed from: d, reason: collision with root package name */
    public final f0.j f105561d;

    /* renamed from: d0, reason: collision with root package name */
    public double f105562d0;

    /* renamed from: e, reason: collision with root package name */
    public final sc f105563e;

    /* renamed from: e0, reason: collision with root package name */
    public h0 f105564e0;

    /* renamed from: f, reason: collision with root package name */
    public final sc f105565f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f105566g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f105567h;

    /* renamed from: i, reason: collision with root package name */
    public final int f105568i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f105569j;

    /* renamed from: k, reason: collision with root package name */
    public i0 f105570k;

    /* renamed from: l, reason: collision with root package name */
    public int f105571l;

    /* renamed from: m, reason: collision with root package name */
    public i f105572m;

    /* renamed from: n, reason: collision with root package name */
    public i f105573n;

    /* renamed from: o, reason: collision with root package name */
    public long f105574o;

    /* renamed from: p, reason: collision with root package name */
    public i f105575p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f105576q;

    /* renamed from: r, reason: collision with root package name */
    public c0.k f105577r;

    /* renamed from: s, reason: collision with root package name */
    public c0.k f105578s;

    /* renamed from: t, reason: collision with root package name */
    public t0.a f105579t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f105580u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f105581v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f105582w;

    /* renamed from: x, reason: collision with root package name */
    public p1 f105583x;

    /* renamed from: y, reason: collision with root package name */
    public v2 f105584y;

    /* renamed from: z, reason: collision with root package name */
    public Surface f105585z;

    static {
        h hVar = r.f105631c;
        sp2.i L = sp2.i.L(Arrays.asList(hVar, r.f105630b, r.f105629a), new c(hVar, 1));
        l a13 = m.a();
        a13.f105595a = L;
        a13.f105598d = -1;
        m a14 = a13.a();
        f105547h0 = a14;
        androidx.appcompat.app.d a15 = e.a();
        a15.f15968d = -1;
        a15.f15966b = a14;
        f105548i0 = a15.l();
        f105549j0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f105550k0 = new sc(25);
        f105551l0 = new f0.j(l3.c.D0());
        f105552m0 = 3;
        f105553n0 = 1000L;
    }

    public j0(Executor executor, e eVar, int i13, sc scVar, sc scVar2) {
        this.f105567h = w0.a.f126951a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f105569j = i0.CONFIGURING;
        this.f105570k = null;
        this.f105571l = 0;
        this.f105572m = null;
        this.f105573n = null;
        this.f105574o = 0L;
        this.f105575p = null;
        this.f105576q = false;
        this.f105577r = null;
        this.f105578s = null;
        this.f105579t = null;
        this.f105580u = new ArrayList();
        this.f105581v = null;
        this.f105582w = null;
        this.f105585z = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = b0.INITIALIZING;
        this.f105554J = Uri.EMPTY;
        this.K = 0L;
        this.L = 0L;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = 0L;
        this.R = 0L;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new k0.a(60, (sc) null);
        this.W = null;
        this.X = false;
        this.Y = b1.INACTIVE;
        this.Z = null;
        this.f105556a0 = false;
        this.f105560c0 = null;
        this.f105562d0 = 0.0d;
        this.f105564e0 = null;
        executor = executor == null ? l3.c.D0() : executor;
        this.f105559c = executor;
        f0.j jVar = new f0.j(executor);
        this.f105561d = jVar;
        androidx.appcompat.app.d dVar = new androidx.appcompat.app.d(eVar, 0);
        if (eVar.f105509a.f105610d == -1) {
            dVar.n(new y.a(2));
        }
        this.C = r1.r(dVar.l());
        this.f105568i = i13;
        this.f105555a = r1.r(new k(this.f105571l, m(this.f105569j), null));
        this.f105557b = r1.r(Boolean.FALSE);
        this.f105563e = scVar;
        this.f105565f = scVar2;
        this.f105558b0 = new a1(scVar, jVar, executor);
    }

    public static Object l(r1 r1Var) {
        try {
            return r1Var.c().get();
        } catch (InterruptedException | ExecutionException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static m0 m(i0 i0Var) {
        return (i0Var == i0.RECORDING || (i0Var == i0.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) w0.a.f126951a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? m0.ACTIVE : m0.INACTIVE;
    }

    public static boolean p(l0 l0Var, i iVar) {
        return iVar != null && l0Var.f105601c == iVar.f105540m;
    }

    public static void r(y0.m mVar) {
        if (mVar instanceof y0.c0) {
            y0.c0 c0Var = (y0.c0) mVar;
            c0Var.f136284h.execute(new y0.q(c0Var, 1));
        }
    }

    public final void A(c0.k kVar) {
        kh2.m0.p("Recorder", "Update stream transformation info: " + kVar);
        this.f105577r = kVar;
        synchronized (this.f105566g) {
            this.f105555a.p(new k(this.f105571l, m(this.f105569j), kVar));
        }
    }

    public final void B(Surface surface) {
        int hashCode;
        if (this.f105585z == surface) {
            return;
        }
        this.f105585z = surface;
        synchronized (this.f105566g) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th3) {
                    throw th3;
                }
            } else {
                hashCode = 0;
            }
            D(hashCode);
        }
    }

    public final void C(i0 i0Var) {
        if (this.f105569j == i0Var) {
            throw new AssertionError("Attempted to transition to state " + i0Var + ", but Recorder is already in state " + i0Var);
        }
        kh2.m0.p("Recorder", "Transitioning Recorder internal state: " + this.f105569j + " --> " + i0Var);
        Set set = f105545f0;
        m0 m0Var = null;
        if (set.contains(i0Var)) {
            if (!set.contains(this.f105569j)) {
                if (!f105546g0.contains(this.f105569j)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f105569j);
                }
                i0 i0Var2 = this.f105569j;
                this.f105570k = i0Var2;
                m0Var = m(i0Var2);
            }
        } else if (this.f105570k != null) {
            this.f105570k = null;
        }
        this.f105569j = i0Var;
        if (m0Var == null) {
            m0Var = m(i0Var);
        }
        this.f105555a.p(new k(this.f105571l, m0Var, this.f105577r));
    }

    public final void D(int i13) {
        if (this.f105571l == i13) {
            return;
        }
        kh2.m0.p("Recorder", "Transitioning streamId: " + this.f105571l + " --> " + i13);
        this.f105571l = i13;
        this.f105555a.p(new k(i13, m(this.f105569j), this.f105577r));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:20:0x003f, B:25:0x0043, B:26:0x004b, B:28:0x0051, B:30:0x0060, B:34:0x006f, B:39:0x0092, B:41:0x009f, B:45:0x00ac, B:53:0x00c3, B:54:0x00cc, B:56:0x00d0, B:57:0x00d8, B:70:0x00e2, B:59:0x010f, B:61:0x0127, B:62:0x0137, B:63:0x0143, B:65:0x0149, B:73:0x0105, B:84:0x0157), top: B:13:0x0020, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:20:0x003f, B:25:0x0043, B:26:0x004b, B:28:0x0051, B:30:0x0060, B:34:0x006f, B:39:0x0092, B:41:0x009f, B:45:0x00ac, B:53:0x00c3, B:54:0x00cc, B:56:0x00d0, B:57:0x00d8, B:70:0x00e2, B:59:0x010f, B:61:0x0127, B:62:0x0137, B:63:0x0143, B:65:0x0149, B:73:0x0105, B:84:0x0157), top: B:13:0x0020, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149 A[Catch: all -> 0x005d, LOOP:2: B:63:0x0143->B:65:0x0149, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:20:0x003f, B:25:0x0043, B:26:0x004b, B:28:0x0051, B:30:0x0060, B:34:0x006f, B:39:0x0092, B:41:0x009f, B:45:0x00ac, B:53:0x00c3, B:54:0x00cc, B:56:0x00d0, B:57:0x00d8, B:70:0x00e2, B:59:0x010f, B:61:0x0127, B:62:0x0137, B:63:0x0143, B:65:0x0149, B:73:0x0105, B:84:0x0157), top: B:13:0x0020, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(r0.i r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.j0.E(r0.i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(r0.i r13) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.j0.F(r0.i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(r0.i r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.j0.G(r0.i, boolean):void");
    }

    public final void H(i iVar, final long j13, int i13, Throwable th3) {
        if (this.f105575p != iVar || this.f105576q) {
            return;
        }
        this.f105576q = true;
        this.S = i13;
        this.T = th3;
        if (n()) {
            while (true) {
                k0.a aVar = this.V;
                if (aVar.h()) {
                    break;
                } else {
                    aVar.e();
                }
            }
            final y0.c0 c0Var = this.G;
            c0Var.f136293q.getClass();
            final long j14 = d0.o.j();
            c0Var.f136284h.execute(new Runnable() { // from class: y0.s
                /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r9 = this;
                        java.lang.Object r0 = r3
                        y0.c0 r0 = (y0.c0) r0
                        y0.y r1 = r0.f136296t
                        int r1 = r1.ordinal()
                        switch(r1) {
                            case 0: goto Lb3;
                            case 1: goto L32;
                            case 2: goto L32;
                            case 3: goto Lb3;
                            case 4: goto L2b;
                            case 5: goto L2b;
                            case 6: goto L23;
                            case 7: goto Lb3;
                            case 8: goto L23;
                            default: goto Ld;
                        }
                    Ld:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "Unknown state: "
                        r2.<init>(r3)
                        y0.y r0 = r0.f136296t
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r1.<init>(r0)
                        throw r1
                    L23:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Encoder is released"
                        r0.<init>(r1)
                        throw r0
                    L2b:
                        y0.y r1 = y0.y.CONFIGURED
                        r0.i(r1)
                        goto Lb3
                    L32:
                        y0.y r1 = r0.f136296t
                        y0.y r2 = y0.y.STOPPING
                        r0.i(r2)
                        android.util.Range r2 = r0.f136297u
                        java.lang.Comparable r2 = r2.getLower()
                        java.lang.Long r2 = (java.lang.Long) r2
                        long r3 = r2.longValue()
                        r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                        int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r5 == 0) goto Lab
                        r5 = -1
                        long r7 = r1
                        int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                        java.lang.String r6 = r0.f136277a
                        if (r5 != 0) goto L59
                        goto L62
                    L59:
                        int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                        if (r5 >= 0) goto L64
                        java.lang.String r5 = "The expected stop time is less than the start time. Use current time as stop time."
                        kh2.m0.X0(r6, r5)
                    L62:
                        long r7 = r4
                    L64:
                        int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                        if (r3 < 0) goto La3
                        java.lang.Long r3 = java.lang.Long.valueOf(r7)
                        android.util.Range r2 = android.util.Range.create(r2, r3)
                        r0.f136297u = r2
                        java.lang.String r2 = kh2.j1.m1(r7)
                        java.lang.String r3 = "Stop on "
                        java.lang.String r2 = r3.concat(r2)
                        kh2.m0.p(r6, r2)
                        y0.y r2 = y0.y.PAUSED
                        if (r1 != r2) goto L8b
                        java.lang.Long r1 = r0.f136300x
                        if (r1 == 0) goto L8b
                        r0.j()
                        goto Lb3
                    L8b:
                        r1 = 1
                        r0.f136299w = r1
                        f0.g r1 = l3.c.H0()
                        y0.q r2 = new y0.q
                        r3 = 3
                        r2.<init>(r0, r3)
                        java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                        r4 = 1000(0x3e8, double:4.94E-321)
                        java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r4, r3)
                        r0.f136301y = r1
                        goto Lb3
                    La3:
                        java.lang.AssertionError r0 = new java.lang.AssertionError
                        java.lang.String r1 = "The start time should be before the stop time."
                        r0.<init>(r1)
                        throw r0
                    Lab:
                        java.lang.AssertionError r0 = new java.lang.AssertionError
                        java.lang.String r1 = "There should be a \"start\" before \"stop\""
                        r0.<init>(r1)
                        throw r0
                    Lb3:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: y0.s.run():void");
                }
            });
        }
        y0.h hVar = this.U;
        if (hVar != null) {
            hVar.close();
            this.U = null;
        }
        if (this.Y != b1.ACTIVE_NON_STREAMING) {
            ig igVar = new ig(this.E, 25);
            this.Z = l3.c.H0().schedule(new l0.e(6, this.f105561d, igVar), 1000L, TimeUnit.MILLISECONDS);
        } else {
            r(this.E);
        }
        final y0.c0 c0Var2 = this.E;
        c0Var2.f136293q.getClass();
        final long j15 = d0.o.j();
        c0Var2.f136284h.execute(new Runnable() { // from class: y0.s
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    this = this;
                    java.lang.Object r0 = r3
                    y0.c0 r0 = (y0.c0) r0
                    y0.y r1 = r0.f136296t
                    int r1 = r1.ordinal()
                    switch(r1) {
                        case 0: goto Lb3;
                        case 1: goto L32;
                        case 2: goto L32;
                        case 3: goto Lb3;
                        case 4: goto L2b;
                        case 5: goto L2b;
                        case 6: goto L23;
                        case 7: goto Lb3;
                        case 8: goto L23;
                        default: goto Ld;
                    }
                Ld:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "Unknown state: "
                    r2.<init>(r3)
                    y0.y r0 = r0.f136296t
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                L23:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Encoder is released"
                    r0.<init>(r1)
                    throw r0
                L2b:
                    y0.y r1 = y0.y.CONFIGURED
                    r0.i(r1)
                    goto Lb3
                L32:
                    y0.y r1 = r0.f136296t
                    y0.y r2 = y0.y.STOPPING
                    r0.i(r2)
                    android.util.Range r2 = r0.f136297u
                    java.lang.Comparable r2 = r2.getLower()
                    java.lang.Long r2 = (java.lang.Long) r2
                    long r3 = r2.longValue()
                    r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r5 == 0) goto Lab
                    r5 = -1
                    long r7 = r1
                    int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    java.lang.String r6 = r0.f136277a
                    if (r5 != 0) goto L59
                    goto L62
                L59:
                    int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                    if (r5 >= 0) goto L64
                    java.lang.String r5 = "The expected stop time is less than the start time. Use current time as stop time."
                    kh2.m0.X0(r6, r5)
                L62:
                    long r7 = r4
                L64:
                    int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                    if (r3 < 0) goto La3
                    java.lang.Long r3 = java.lang.Long.valueOf(r7)
                    android.util.Range r2 = android.util.Range.create(r2, r3)
                    r0.f136297u = r2
                    java.lang.String r2 = kh2.j1.m1(r7)
                    java.lang.String r3 = "Stop on "
                    java.lang.String r2 = r3.concat(r2)
                    kh2.m0.p(r6, r2)
                    y0.y r2 = y0.y.PAUSED
                    if (r1 != r2) goto L8b
                    java.lang.Long r1 = r0.f136300x
                    if (r1 == 0) goto L8b
                    r0.j()
                    goto Lb3
                L8b:
                    r1 = 1
                    r0.f136299w = r1
                    f0.g r1 = l3.c.H0()
                    y0.q r2 = new y0.q
                    r3 = 3
                    r2.<init>(r0, r3)
                    java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                    r4 = 1000(0x3e8, double:4.94E-321)
                    java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r4, r3)
                    r0.f136301y = r1
                    goto Lb3
                La3:
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    java.lang.String r1 = "The start time should be before the stop time."
                    r0.<init>(r1)
                    throw r0
                Lab:
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    java.lang.String r1 = "There should be a \"start\" before \"stop\""
                    r0.<init>(r1)
                    throw r0
                Lb3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: y0.s.run():void");
            }
        });
    }

    public final void I(final i iVar, boolean z13) {
        ArrayList arrayList = this.f105580u;
        final int i13 = 1;
        if (!arrayList.isEmpty()) {
            g0.r b13 = g0.m.b(arrayList);
            if (!b13.f63222e.isDone()) {
                b13.cancel(true);
            }
            arrayList.clear();
        }
        final int i14 = 0;
        arrayList.add(com.bumptech.glide.d.L(new r4.j(this) { // from class: r0.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f105671b;

            {
                this.f105671b = this;
            }

            @Override // r4.j
            public final Object C(r4.i iVar2) {
                int i15 = i14;
                i iVar3 = iVar;
                j0 j0Var = this.f105671b;
                switch (i15) {
                    case 0:
                        y0.c0 c0Var = j0Var.E;
                        y yVar = new y(iVar3, j0Var, iVar2);
                        f0.j jVar = j0Var.f105561d;
                        synchronized (c0Var.f136278b) {
                            c0Var.f136294r = yVar;
                            c0Var.f136295s = jVar;
                        }
                        return "videoEncodingFuture";
                    default:
                        j0Var.getClass();
                        h0.d dVar = new h0.d(3, j0Var, iVar2);
                        u0.e eVar = j0Var.D;
                        q4 q4Var = new q4(j0Var, dVar, 9);
                        f0.j jVar2 = eVar.f119732a;
                        f0.j jVar3 = j0Var.f105561d;
                        jVar2.execute(new a4(eVar, jVar3, q4Var, 14));
                        y0.c0 c0Var2 = j0Var.G;
                        z zVar = new z(j0Var, iVar2, dVar, iVar3);
                        synchronized (c0Var2.f136278b) {
                            c0Var2.f136294r = zVar;
                            c0Var2.f136295s = jVar3;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (n() && !z13) {
            arrayList.add(com.bumptech.glide.d.L(new r4.j(this) { // from class: r0.w

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j0 f105671b;

                {
                    this.f105671b = this;
                }

                @Override // r4.j
                public final Object C(r4.i iVar2) {
                    int i15 = i13;
                    i iVar3 = iVar;
                    j0 j0Var = this.f105671b;
                    switch (i15) {
                        case 0:
                            y0.c0 c0Var = j0Var.E;
                            y yVar = new y(iVar3, j0Var, iVar2);
                            f0.j jVar = j0Var.f105561d;
                            synchronized (c0Var.f136278b) {
                                c0Var.f136294r = yVar;
                                c0Var.f136295s = jVar;
                            }
                            return "videoEncodingFuture";
                        default:
                            j0Var.getClass();
                            h0.d dVar = new h0.d(3, j0Var, iVar2);
                            u0.e eVar = j0Var.D;
                            q4 q4Var = new q4(j0Var, dVar, 9);
                            f0.j jVar2 = eVar.f119732a;
                            f0.j jVar3 = j0Var.f105561d;
                            jVar2.execute(new a4(eVar, jVar3, q4Var, 14));
                            y0.c0 c0Var2 = j0Var.G;
                            z zVar = new z(j0Var, iVar2, dVar, iVar3);
                            synchronized (c0Var2.f136278b) {
                                c0Var2.f136294r = zVar;
                                c0Var2.f136295s = jVar3;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        g0.m.a(g0.m.b(arrayList), new fk2.o(this, i14), l3.c.s());
    }

    public final void J() {
        i iVar = this.f105575p;
        if (iVar != null) {
            iVar.h(new h1(iVar.f105535h, k()));
        }
    }

    public final void K(i0 i0Var) {
        if (!f105545f0.contains(this.f105569j)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f105569j);
        }
        if (!f105546g0.contains(i0Var)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + i0Var);
        }
        if (this.f105570k != i0Var) {
            this.f105570k = i0Var;
            this.f105555a.p(new k(this.f105571l, m(i0Var), this.f105577r));
        }
    }

    public final void L(y0.h hVar, i iVar) {
        long size = hVar.size() + this.K;
        long j13 = this.Q;
        if (j13 != 0 && size > j13) {
            kh2.m0.p("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q)));
            s(iVar, 2, null);
            return;
        }
        long F0 = hVar.F0();
        long j14 = this.N;
        if (j14 == Long.MAX_VALUE) {
            this.N = F0;
            kh2.m0.p("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(F0), j1.m1(this.N)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(F0 - Math.min(this.M, j14));
            com.bumptech.glide.d.v("There should be a previous data for adjusting the duration.", this.P != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(F0 - this.P) + nanos;
            long j15 = this.R;
            if (j15 != 0 && nanos2 > j15) {
                kh2.m0.p("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R)));
                s(iVar, 9, null);
                return;
            }
        }
        this.B.writeSampleData(this.f105581v.intValue(), hVar.t0(), hVar.Y());
        this.K = size;
        this.P = F0;
    }

    public final void M(y0.h hVar, i iVar) {
        if (this.f105582w == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = hVar.size() + this.K;
        long j13 = this.Q;
        long j14 = 0;
        if (j13 != 0 && size > j13) {
            kh2.m0.p("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q)));
            s(iVar, 2, null);
            return;
        }
        long F0 = hVar.F0();
        long j15 = this.M;
        if (j15 == Long.MAX_VALUE) {
            this.M = F0;
            kh2.m0.p("Recorder", String.format("First video time: %d (%s)", Long.valueOf(F0), j1.m1(this.M)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(F0 - Math.min(j15, this.N));
            com.bumptech.glide.d.v("There should be a previous data for adjusting the duration.", this.O != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(F0 - this.O) + nanos;
            long j16 = this.R;
            if (j16 != 0 && nanos2 > j16) {
                kh2.m0.p("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R)));
                s(iVar, 9, null);
                return;
            }
            j14 = nanos;
        }
        this.B.writeSampleData(this.f105582w.intValue(), hVar.t0(), hVar.Y());
        this.K = size;
        this.L = j14;
        this.O = F0;
        J();
    }

    @Override // r0.c1
    public final void a(p1 p1Var, v2 v2Var) {
        synchronized (this.f105566g) {
            try {
                kh2.m0.p("Recorder", "Surface is requested in state: " + this.f105569j + ", Current surface: " + this.f105571l);
                if (this.f105569j == i0.ERROR) {
                    C(i0.CONFIGURING);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f105561d.execute(new a4(this, p1Var, v2Var, 11));
    }

    @Override // r0.c1
    public final u1 b() {
        return this.C;
    }

    @Override // r0.c1
    public final void c(p1 p1Var) {
        a(p1Var, v2.UPTIME);
    }

    @Override // r0.c1
    public final u1 d() {
        return this.f105555a;
    }

    @Override // r0.c1
    public final o0 e(c0.r rVar) {
        return new k0(this.f105568i, (androidx.camera.core.impl.h0) rVar);
    }

    @Override // r0.c1
    public final u1 f() {
        return this.f105557b;
    }

    @Override // r0.c1
    public final void g(b1 b1Var) {
        this.f105561d.execute(new l0.e(7, this, b1Var));
    }

    public final void h(p1 p1Var, v2 v2Var, boolean z13) {
        Object value;
        r rVar;
        if (p1Var.a()) {
            kh2.m0.X0("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        a.z0 z0Var = new a.z0(this, 16);
        f0.j jVar = this.f105561d;
        p1Var.c(jVar, z0Var);
        k0 k0Var = new k0(0, p1Var.f24303e.g());
        c0.z zVar = p1Var.f24301c;
        n d2 = k0Var.d(zVar);
        Size size = p1Var.f24300b;
        if (d2 == null) {
            rVar = r.f105635g;
        } else {
            TreeMap treeMap = d2.f105612b;
            Size size2 = k0.c.f77781a;
            Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
            if (ceilingEntry != null) {
                value = ceilingEntry.getValue();
            } else {
                Map.Entry floorEntry = treeMap.floorEntry(size);
                value = floorEntry != null ? floorEntry.getValue() : null;
            }
            rVar = (r) value;
            if (rVar == null) {
                rVar = r.f105635g;
            }
        }
        kh2.m0.p("Recorder", "Using supported quality of " + rVar + " for surface size " + size);
        if (rVar != r.f105635g) {
            t0.a a13 = k0Var.a(rVar, zVar);
            this.f105579t = a13;
            if (a13 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        h0 h0Var = this.f105564e0;
        if (h0Var != null && !h0Var.f105524d) {
            h0Var.f105524d = true;
            ScheduledFuture scheduledFuture = h0Var.f105526f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                h0Var.f105526f = null;
            }
        }
        h0 h0Var2 = new h0(this, p1Var, v2Var, z13 ? f105552m0 : 0);
        this.f105564e0 = h0Var2;
        y().d(new a4(h0Var2, p1Var, v2Var, 12), jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8 A[LOOP:0: B:12:0x00b0->B:14:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[EDGE_INSN: B:15:0x00bc->B:16:0x00bc BREAK  A[LOOP:0: B:12:0x00b0->B:14:0x00b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:28:0x00f2, B:30:0x00f6, B:31:0x0103, B:36:0x019b, B:56:0x0110, B:58:0x0114, B:60:0x011a, B:63:0x0125, B:65:0x0132, B:66:0x013e, B:67:0x0151, B:69:0x0155, B:71:0x015b, B:72:0x016d, B:74:0x0171, B:76:0x0177, B:79:0x017f, B:81:0x0189, B:83:0x018d, B:87:0x01c4, B:88:0x01cb), top: B:27:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:28:0x00f2, B:30:0x00f6, B:31:0x0103, B:36:0x019b, B:56:0x0110, B:58:0x0114, B:60:0x011a, B:63:0x0125, B:65:0x0132, B:66:0x013e, B:67:0x0151, B:69:0x0155, B:71:0x015b, B:72:0x016d, B:74:0x0171, B:76:0x0177, B:79:0x017f, B:81:0x0189, B:83:0x018d, B:87:0x01c4, B:88:0x01cb), top: B:27:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.j0.i(int, java.lang.Throwable):void");
    }

    public final void j(i iVar, int i13, Throwable th3) {
        Uri uri = Uri.EMPTY;
        iVar.d(uri);
        j a13 = j.a(0L, 0L, new b(0.0d, 1, this.W));
        com.bumptech.glide.d.s(uri, "OutputUri cannot be null.");
        f fVar = new f(uri);
        com.bumptech.glide.d.g("An error type is required.", i13 != 0);
        iVar.h(new d1(iVar.f105535h, a13, fVar, i13, th3));
    }

    public final j k() {
        int i13;
        long j13 = this.L;
        long j14 = this.K;
        b0 b0Var = this.I;
        int ordinal = b0Var.ordinal();
        if (ordinal != 0) {
            i13 = 2;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    i13 = 4;
                    if (ordinal == 4) {
                        i13 = 3;
                    } else if (ordinal != 5) {
                        throw new AssertionError("Invalid internal audio state: " + b0Var);
                    }
                } else {
                    i iVar = this.f105575p;
                    if (iVar != null && iVar.f105533f.get()) {
                        i13 = 5;
                    } else if (!this.X) {
                        i13 = 0;
                    }
                }
                return j.a(j13, j14, new b(this.f105562d0, i13, this.W));
            }
        }
        i13 = 1;
        return j.a(j13, j14, new b(this.f105562d0, i13, this.W));
    }

    public final boolean n() {
        return this.I == b0.ENABLED;
    }

    public final boolean o() {
        i iVar = this.f105575p;
        return iVar != null && iVar.f105539l;
    }

    public final i q(i0 i0Var) {
        boolean z13;
        int i13 = 0;
        if (i0Var == i0.PENDING_PAUSED) {
            z13 = true;
        } else {
            if (i0Var != i0.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z13 = false;
        }
        if (this.f105572m != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        i iVar = this.f105573n;
        if (iVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f105572m = iVar;
        iVar.f105534g.a(new a0(this, i13), l3.c.s());
        this.f105573n = null;
        if (z13) {
            C(i0.PAUSED);
        } else {
            C(i0.RECORDING);
        }
        return iVar;
    }

    public final void s(i iVar, int i13, Exception exc) {
        boolean z13;
        if (iVar != this.f105575p) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f105566g) {
            try {
                z13 = false;
                switch (this.f105569j.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f105569j);
                    case 4:
                    case 5:
                        C(i0.STOPPING);
                        z13 = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (iVar != this.f105572m) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z13) {
            H(iVar, -1L, i13, exc);
        }
    }

    public final void t() {
        u0.e eVar = this.D;
        if (eVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.D = null;
        kh2.m0.p("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(eVar.hashCode())));
        g0.m.a(com.bumptech.glide.d.L(new a.z0(eVar, 17)), new m1(8, this, eVar), l3.c.s());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void u(boolean z13) {
        boolean z14;
        boolean z15;
        synchronized (this.f105566g) {
            try {
                z14 = true;
                z15 = false;
                switch (this.f105569j.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        K(i0.RESETTING);
                        break;
                    case 4:
                    case 5:
                        com.bumptech.glide.d.v("In-progress recording shouldn't be null when in state " + this.f105569j, this.f105575p != null);
                        if (this.f105572m != this.f105575p) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!o()) {
                            C(i0.RESETTING);
                            z15 = true;
                            z14 = false;
                        }
                        break;
                    case 6:
                        C(i0.RESETTING);
                        z14 = false;
                        break;
                    case 7:
                    default:
                        z14 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z14) {
            if (z15) {
                H(this.f105575p, -1L, 4, null);
            }
        } else if (z13) {
            w();
        } else {
            v();
        }
    }

    public final void v() {
        if (this.G != null) {
            kh2.m0.p("Recorder", "Releasing audio encoder.");
            y0.c0 c0Var = this.G;
            c0Var.getClass();
            c0Var.f136284h.execute(new y0.q(c0Var, 0));
            this.G = null;
            this.H = null;
        }
        if (this.D != null) {
            t();
        }
        z(b0.INITIALIZING);
        w();
    }

    public final void w() {
        p1 p1Var;
        boolean z13 = true;
        if (this.E != null) {
            kh2.m0.p("Recorder", "Releasing video encoder.");
            a1 a1Var = this.f105560c0;
            if (a1Var != null) {
                com.bumptech.glide.d.v(null, a1Var.f105481d == this.E);
                kh2.m0.p("Recorder", "Releasing video encoder: " + this.E);
                this.f105560c0.b();
                this.f105560c0 = null;
                this.E = null;
                this.F = null;
                B(null);
            } else {
                y();
            }
        }
        synchronized (this.f105566g) {
            try {
                switch (this.f105569j.ordinal()) {
                    case 1:
                    case 2:
                        K(i0.CONFIGURING);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z13 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        C(i0.CONFIGURING);
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f105556a0 = false;
        if (!z13 || (p1Var = this.f105583x) == null || p1Var.a()) {
            return;
        }
        h(this.f105583x, this.f105584y, false);
    }

    public final void x() {
        if (f105545f0.contains(this.f105569j)) {
            C(this.f105570k);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f105569j);
        }
    }

    public final com.google.common.util.concurrent.c0 y() {
        kh2.m0.p("Recorder", "Try to safely release video encoder: " + this.E);
        a1 a1Var = this.f105558b0;
        a1Var.a();
        return g0.m.f(a1Var.f105487j);
    }

    public final void z(b0 b0Var) {
        kh2.m0.p("Recorder", "Transitioning audio state: " + this.I + " --> " + b0Var);
        this.I = b0Var;
    }
}
