package v;

import a.jg;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f123647j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f123648k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f123649l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f123650a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f123651b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f123652c;

    /* renamed from: d, reason: collision with root package name */
    public final n f123653d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.b f123654e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f123655f;

    /* renamed from: g, reason: collision with root package name */
    public long f123656g = f123647j;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f123657h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final r0 f123658i = new r0(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f123647j = timeUnit.toNanos(1L);
        f123648k = timeUnit.toNanos(5L);
    }

    public s0(int i13, Executor executor, ScheduledExecutorService scheduledExecutorService, n nVar, boolean z13, n3.b bVar) {
        this.f123650a = i13;
        this.f123651b = executor;
        this.f123652c = scheduledExecutorService;
        this.f123653d = nVar;
        this.f123655f = z13;
        this.f123654e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.common.util.concurrent.c0 a(final int i13) {
        g0.p pVar;
        g0.p e13 = g0.m.e(null);
        if (this.f123657h.isEmpty()) {
            return e13;
        }
        if (this.f123658i.b()) {
            v0 v0Var = new v0(null);
            n nVar = this.f123653d;
            nVar.n(v0Var);
            jg jgVar = new jg(9, nVar, v0Var);
            r4.l lVar = v0Var.f123692b;
            lVar.f106128b.d(jgVar, nVar.f123547c);
            pVar = lVar;
        } else {
            pVar = g0.m.e(null);
        }
        g0.d a13 = g0.d.a(pVar);
        g0.a aVar = new g0.a() { // from class: v.p0
            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                s0 s0Var = s0.this;
                s0Var.getClass();
                if (c1.i(i13, totalCaptureResult)) {
                    s0Var.f123656g = s0.f123648k;
                }
                return s0Var.f123658i.a(totalCaptureResult);
            }
        };
        a13.getClass();
        Executor executor = this.f123651b;
        return g0.m.j(g0.m.j(a13, aVar, executor), new a.z0(this, 0), executor);
    }
}
