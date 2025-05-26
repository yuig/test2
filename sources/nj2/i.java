package nj2;

import a.cb;
import io.opentelemetry.api.trace.StatusCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.a0;

/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f91000u = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final p f91001a;

    /* renamed from: b, reason: collision with root package name */
    public final ui2.l f91002b;

    /* renamed from: c, reason: collision with root package name */
    public final ui2.l f91003c;

    /* renamed from: d, reason: collision with root package name */
    public final q f91004d;

    /* renamed from: e, reason: collision with root package name */
    public final ui2.n f91005e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f91006f;

    /* renamed from: g, reason: collision with root package name */
    public final mj2.a f91007g;

    /* renamed from: h, reason: collision with root package name */
    public final zi2.a f91008h;

    /* renamed from: i, reason: collision with root package name */
    public final long f91009i;

    /* renamed from: k, reason: collision with root package name */
    public String f91011k;

    /* renamed from: l, reason: collision with root package name */
    public aj2.b f91012l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f91013m;

    /* renamed from: o, reason: collision with root package name */
    public final List f91015o;

    /* renamed from: r, reason: collision with root package name */
    public long f91018r;

    /* renamed from: t, reason: collision with root package name */
    public Thread f91020t;

    /* renamed from: j, reason: collision with root package name */
    public final Object f91010j = new Object();

    /* renamed from: n, reason: collision with root package name */
    public int f91014n = 0;

    /* renamed from: q, reason: collision with root package name */
    public oj2.b f91017q = oj2.b.f95404d;

    /* renamed from: p, reason: collision with root package name */
    public final int f91016p = 0;

    /* renamed from: s, reason: collision with root package name */
    public h f91019s = h.NOT_ENDED;

    static {
        ri2.e.c("exception.type");
        ri2.e.c("exception.message");
        ri2.e.c("exception.stacktrace");
    }

    public i(ri2.b bVar, String str, zi2.a aVar, ui2.n nVar, ui2.l lVar, p pVar, q qVar, a0 a0Var, mj2.a aVar2, aj2.b bVar2, List list, long j13) {
        this.f91002b = bVar;
        this.f91008h = aVar;
        this.f91003c = lVar;
        this.f91015o = list;
        this.f91011k = str;
        this.f91005e = nVar;
        this.f91004d = qVar;
        this.f91007g = aVar2;
        this.f91006f = a0Var;
        this.f91009i = j13;
        this.f91012l = bVar2;
        this.f91001a = pVar;
    }

    @Override // ui2.j
    public final boolean b() {
        boolean z13;
        synchronized (this.f91010j) {
            z13 = this.f91019s != h.ENDED;
        }
        return z13;
    }

    @Override // ui2.j
    public final ui2.j d(String str) {
        synchronized (this.f91010j) {
            try {
                if (j()) {
                    this.f91011k = str;
                } else {
                    f91000u.log(Level.FINE, "Calling updateName() on an ended Span.");
                }
            } finally {
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ui2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ui2.j e(java.lang.String r7, qi2.a r8, long r9, java.util.concurrent.TimeUnit r11) {
        /*
            r6 = this;
            if (r7 == 0) goto Lc8
            if (r11 != 0) goto L6
            goto Lc8
        L6:
            if (r8 != 0) goto La
            qi2.a r8 = qi2.a.f104005d
        La:
            int r1 = r8.c()
            long r2 = r11.toNanos(r9)
            nj2.p r9 = r6.f91001a
            nj2.a r9 = (nj2.a) r9
            int r10 = r9.f90980e
            int r9 = r9.f90982g
            boolean r11 = r8.isEmpty()
            if (r11 != 0) goto L26
            int r11 = r8.c()
            if (r11 > r10) goto L49
        L26:
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r11) goto L2d
        L2b:
            r4 = r8
            goto L83
        L2d:
            java.util.Map r11 = r8.a()
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L39:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r11.next()
            boolean r0 = kotlin.jvm.internal.r.a0(r9, r0)
            if (r0 != 0) goto L39
        L49:
            qi2.b r11 = new qi2.b
            r11.<init>()
            java.util.Map r8 = r8.a()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L5b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r0 < r10) goto L6a
            goto L7e
        L6a:
            java.lang.Object r5 = r4.getKey()
            ri2.e r5 = (ri2.e) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r4 = kotlin.jvm.internal.r.h(r9, r4)
            r11.b(r5, r4)
            int r0 = r0 + 1
            goto L5b
        L7e:
            qi2.a r8 = r11.a()
            goto L2b
        L83:
            oj2.a r8 = new oj2.a
            r0 = r8
            r5 = r7
            r0.<init>(r1, r2, r4, r5)
            java.lang.Object r7 = r6.f91010j
            monitor-enter(r7)
            boolean r9 = r6.j()     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto La0
            java.util.logging.Logger r8 = nj2.i.f91000u     // Catch: java.lang.Throwable -> L9e
            java.util.logging.Level r9 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L9e
            java.lang.String r10 = "Calling addEvent() on an ended Span."
            r8.log(r9, r10)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            goto Lc8
        L9e:
            r8 = move-exception
            goto Lc6
        La0:
            java.util.ArrayList r9 = r6.f91013m     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto Lab
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9e
            r9.<init>()     // Catch: java.lang.Throwable -> L9e
            r6.f91013m = r9     // Catch: java.lang.Throwable -> L9e
        Lab:
            java.util.ArrayList r9 = r6.f91013m     // Catch: java.lang.Throwable -> L9e
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L9e
            nj2.p r10 = r6.f91001a     // Catch: java.lang.Throwable -> L9e
            nj2.a r10 = (nj2.a) r10     // Catch: java.lang.Throwable -> L9e
            int r10 = r10.f90978c     // Catch: java.lang.Throwable -> L9e
            if (r9 >= r10) goto Lbe
            java.util.ArrayList r9 = r6.f91013m     // Catch: java.lang.Throwable -> L9e
            r9.add(r8)     // Catch: java.lang.Throwable -> L9e
        Lbe:
            int r8 = r6.f91014n     // Catch: java.lang.Throwable -> L9e
            int r8 = r8 + 1
            r6.f91014n = r8     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            goto Lc8
        Lc6:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            throw r8
        Lc8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.i.e(java.lang.String, qi2.a, long, java.util.concurrent.TimeUnit):ui2.j");
    }

    @Override // ui2.j
    public final void g(long j13, TimeUnit timeUnit) {
        long nanos;
        if (timeUnit == null) {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        if (j13 == 0) {
            a0 a0Var = this.f91006f;
            nanos = a0Var.f123341a + (((zi2.b) a0Var.f123343c).a() - a0Var.f123342b);
        } else {
            nanos = timeUnit.toNanos(j13);
        }
        synchronized (this.f91010j) {
            try {
                if (this.f91019s != h.NOT_ENDED) {
                    f91000u.log(Level.FINE, "Calling end() on an ended or ending Span.");
                    return;
                }
                this.f91018r = nanos;
                this.f91020t = Thread.currentThread();
                this.f91019s = h.ENDING;
                q qVar = this.f91004d;
                if (qVar instanceof d) {
                    d dVar = (d) qVar;
                    if (!dVar.f90995b.isEmpty()) {
                        dVar.a();
                    }
                }
                synchronized (this.f91010j) {
                    this.f91019s = h.ENDED;
                }
                if (this.f91004d.e2()) {
                    this.f91004d.X(this);
                }
            } finally {
            }
        }
    }

    @Override // ui2.j
    public final ui2.l h() {
        return this.f91002b;
    }

    @Override // ui2.j
    public final ui2.j i(StatusCode statusCode, String str) {
        oj2.b bVar;
        if (statusCode != null) {
            synchronized (this.f91010j) {
                try {
                    if (!j()) {
                        f91000u.log(Level.FINE, "Calling setStatus() on an ended Span.");
                    } else if (this.f91017q.f95406a == StatusCode.OK) {
                        f91000u.log(Level.FINE, "Calling setStatus() on a Span that is already set to OK.");
                    } else if (statusCode == StatusCode.UNSET) {
                        f91000u.log(Level.FINE, "Ignoring call to setStatus() with status UNSET.");
                    } else {
                        if (str != null && statusCode != StatusCode.ERROR) {
                            f91000u.log(Level.FINE, "Ignoring setStatus() description since status is not ERROR.");
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        oj2.b bVar2 = oj2.b.f95403c;
                        if (str.isEmpty()) {
                            int i13 = oj2.d.f95408a[statusCode.ordinal()];
                            if (i13 == 1) {
                                bVar = oj2.b.f95404d;
                            } else if (i13 == 2) {
                                bVar = oj2.b.f95403c;
                            } else if (i13 == 3) {
                                bVar = oj2.b.f95405e;
                            }
                            this.f91017q = bVar;
                        }
                        bVar = new oj2.b(statusCode, str);
                        this.f91017q = bVar;
                    }
                } finally {
                }
            }
        }
        return this;
    }

    public final boolean j() {
        h hVar = this.f91019s;
        return hVar == h.NOT_ENDED || (hVar == h.ENDING && Thread.currentThread() == this.f91020t);
    }

    @Override // ui2.j
    public final ui2.j o(ri2.e eVar, Object obj) {
        if (!eVar.f108404b.isEmpty() && obj != null) {
            synchronized (this.f91010j) {
                try {
                    if (j()) {
                        if (this.f91012l == null) {
                            this.f91012l = new aj2.b(((a) r1).f90977b, ((a) this.f91001a).f90982g);
                        }
                        this.f91012l.c(eVar, obj);
                    } else {
                        f91000u.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                    }
                } finally {
                }
            }
        }
        return this;
    }

    public final String toString() {
        String str;
        String valueOf;
        String valueOf2;
        long j13;
        long j14;
        long j15;
        synchronized (this.f91010j) {
            str = this.f91011k;
            valueOf = String.valueOf(this.f91012l);
            valueOf2 = String.valueOf(this.f91017q);
            j13 = this.f91014n;
            j14 = this.f91018r;
            j15 = this.f91016p;
        }
        StringBuilder sb3 = new StringBuilder("SdkSpan{traceId=");
        sb3.append(((ri2.b) this.f91002b).f108393a);
        sb3.append(", spanId=");
        sb3.append(((ri2.b) this.f91002b).f108394b);
        sb3.append(", parentSpanContext=");
        sb3.append(this.f91003c);
        sb3.append(", name=");
        sb3.append(str);
        sb3.append(", kind=");
        sb3.append(this.f91005e);
        sb3.append(", attributes=");
        sb3.append(valueOf);
        sb3.append(", status=");
        sb3.append(valueOf2);
        sb3.append(", totalRecordedEvents=");
        sb3.append(j13);
        cb.v(sb3, ", totalRecordedLinks=", j15, ", startEpochNanos=");
        sb3.append(this.f91009i);
        sb3.append(", endEpochNanos=");
        sb3.append(j14);
        sb3.append("}");
        return sb3.toString();
    }
}
