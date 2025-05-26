package lb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import m7.g1;

/* loaded from: classes.dex */
public final class j0 extends kb.w0 {

    /* renamed from: l, reason: collision with root package name */
    public static j0 f82602l;

    /* renamed from: m, reason: collision with root package name */
    public static j0 f82603m;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f82604n;

    /* renamed from: b, reason: collision with root package name */
    public final Context f82605b;

    /* renamed from: c, reason: collision with root package name */
    public final kb.d f82606c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f82607d;

    /* renamed from: e, reason: collision with root package name */
    public final vb.b f82608e;

    /* renamed from: f, reason: collision with root package name */
    public final List f82609f;

    /* renamed from: g, reason: collision with root package name */
    public final o f82610g;

    /* renamed from: h, reason: collision with root package name */
    public final ub.e f82611h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82612i = false;

    /* renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f82613j;

    /* renamed from: k, reason: collision with root package name */
    public final rb.l f82614k;

    static {
        kb.b0.h("WorkManagerImpl");
        f82602l = null;
        f82603m = null;
        f82604n = new Object();
    }

    public j0(Context context, final kb.d configuration, vb.b taskExecutor, final WorkDatabase db3, final List list, o oVar, rb.l lVar) {
        Context appContext = context.getApplicationContext();
        if (appContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        kb.b0 b0Var = new kb.b0(configuration.f78977h);
        synchronized (kb.b0.f78967b) {
            try {
                if (kb.b0.f78968c == null) {
                    kb.b0.f78968c = b0Var;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f82605b = appContext;
        this.f82608e = taskExecutor;
        this.f82607d = db3;
        this.f82610g = oVar;
        this.f82614k = lVar;
        this.f82606c = configuration;
        this.f82609f = list;
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        ao2.f0 f0Var = taskExecutor.f125445b;
        Intrinsics.checkNotNullExpressionValue(f0Var, "taskExecutor.taskCoroutineDispatcher");
        ho2.c b13 = dl2.b.b(f0Var);
        this.f82611h = new ub.e(db3, 1);
        final ub.j jVar = taskExecutor.f125444a;
        String str = s.f82667a;
        oVar.a(new c() { // from class: lb.r
            @Override // lb.c
            public final void b(tb.j jVar2, boolean z13) {
                jVar.execute(new g1(list, jVar2, configuration, db3, 1));
            }
        });
        taskExecutor.a(new ub.c(appContext, this));
        String str2 = a0.f82556a;
        Intrinsics.checkNotNullParameter(b13, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db3, "db");
        if (ub.i.a(appContext, configuration)) {
            tb.y y13 = db3.y();
            y13.getClass();
            tb.w wVar = new tb.w(y13, ja.f0.d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"));
            l0.J0(l0.Q0(new z(appContext, null), l0.V(l0.y(new do2.p0(new pb.k(new ja.f(false, y13.f117050a, new String[]{"workspec"}, wVar, null)), new y(4, null)), -1))), b13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j0 h(Context context) {
        j0 j0Var;
        Object obj = f82604n;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    j0Var = f82602l;
                    if (j0Var == null) {
                        j0Var = f82603m;
                    }
                }
                return j0Var;
            } catch (Throwable th3) {
                throw th3;
            } finally {
            }
        }
        if (j0Var == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof kb.c)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m60.m mVar = (m60.m) ((kb.c) applicationContext);
            mVar.getClass();
            kb.b bVar = new kb.b();
            p6.a workerFactory = (p6.a) mVar.f85930y.getValue();
            Intrinsics.checkNotNullParameter(workerFactory, "workerFactory");
            bVar.f78966a = workerFactory;
            i(applicationContext, new kb.d(bVar));
            j0Var = h(applicationContext);
        }
        return j0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (lb.j0.f82603m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        lb.j0.f82603m = lb.l0.R(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        lb.j0.f82602l = lb.j0.f82603m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r3, kb.d r4) {
        /*
            java.lang.Object r0 = lb.j0.f82604n
            monitor-enter(r0)
            lb.j0 r1 = lb.j0.f82602l     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            lb.j0 r2 = lb.j0.f82603m     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2c
        L16:
            if (r1 != 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            lb.j0 r1 = lb.j0.f82603m     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            lb.j0 r3 = lb.l0.R(r3, r4)     // Catch: java.lang.Throwable -> L14
            lb.j0.f82603m = r3     // Catch: java.lang.Throwable -> L14
        L26:
            lb.j0 r3 = lb.j0.f82603m     // Catch: java.lang.Throwable -> L14
            lb.j0.f82602l = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.j0.i(android.content.Context, kb.d):void");
    }

    @Override // kb.w0
    public final bk.f b(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(this, "workManagerImpl");
        bk.f fVar = this.f82606c.f78982m;
        String j13 = a.a.j("CancelWorkByTag_", tag);
        ub.j jVar = this.f82608e.f125444a;
        Intrinsics.checkNotNullExpressionValue(jVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return tb.f.T(fVar, j13, jVar, new ub.a(this, tag));
    }

    @Override // kb.w0
    public final bk.f c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(this, "workManagerImpl");
        bk.f fVar = this.f82606c.f78982m;
        String j13 = a.a.j("CancelWorkByName_", name);
        ub.j jVar = this.f82608e.f125444a;
        Intrinsics.checkNotNullExpressionValue(jVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return tb.f.T(fVar, j13, jVar, new ub.a(name, this));
    }

    @Override // kb.w0
    public final kb.i0 e(String name, kb.p pVar, kb.n0 workRequest) {
        if (pVar != kb.p.UPDATE) {
            return new b0(this, name, pVar == kb.p.KEEP ? kb.q.KEEP : kb.q.REPLACE, Collections.singletonList(workRequest), null).b();
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        bk.f fVar = this.f82606c.f78982m;
        String concat = "enqueueUniquePeriodic_".concat(name);
        ub.j jVar = this.f82608e.f125444a;
        Intrinsics.checkNotNullExpressionValue(jVar, "workTaskExecutor.serialTaskExecutor");
        return tb.f.T(fVar, concat, jVar, new n0(this, name, workRequest));
    }

    @Override // kb.w0
    public final androidx.lifecycle.j0 g(String str) {
        tb.y y13 = this.f82607d.y();
        y13.getClass();
        ja.f0 d2 = ja.f0.d(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        d2.c1(1, str);
        return c3.v(y13.f117050a.f75182e.b(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new tb.v(y13, d2, 1)), tb.s.f117015z, this.f82608e);
    }

    public final void j() {
        synchronized (f82604n) {
            try {
                this.f82612i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f82613j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f82613j = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k() {
        bk.f fVar = this.f82606c.f78982m;
        androidx.activity.e block = new androidx.activity.e(this, 2);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter("ReschedulingWork", "label");
        Intrinsics.checkNotNullParameter(block, "block");
        fVar.getClass();
        boolean Q = tb.f.Q();
        if (Q) {
            try {
                bk.f.s("ReschedulingWork");
            } finally {
                if (Q) {
                    Trace.endSection();
                }
            }
        }
        block.invoke();
    }
}
