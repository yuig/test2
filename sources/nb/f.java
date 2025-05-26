package nb;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ao2.f0;
import ao2.p1;
import i2.a2;
import java.util.concurrent.CancellationException;
import kb.b0;
import pb.m;
import rb.l;
import tb.j;
import tb.s;
import ub.t;
import ub.u;
import ub.v;

/* loaded from: classes3.dex */
public final class f implements pb.i, t {

    /* renamed from: o, reason: collision with root package name */
    public static final String f90123o = b0.h("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f90124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90125b;

    /* renamed from: c, reason: collision with root package name */
    public final j f90126c;

    /* renamed from: d, reason: collision with root package name */
    public final i f90127d;

    /* renamed from: e, reason: collision with root package name */
    public final a2 f90128e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f90129f;

    /* renamed from: g, reason: collision with root package name */
    public int f90130g;

    /* renamed from: h, reason: collision with root package name */
    public final ub.j f90131h;

    /* renamed from: i, reason: collision with root package name */
    public final vb.a f90132i;

    /* renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f90133j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f90134k;

    /* renamed from: l, reason: collision with root package name */
    public final lb.t f90135l;

    /* renamed from: m, reason: collision with root package name */
    public final f0 f90136m;

    /* renamed from: n, reason: collision with root package name */
    public volatile p1 f90137n;

    public f(Context context, int i13, i iVar, lb.t tVar) {
        this.f90124a = context;
        this.f90125b = i13;
        this.f90127d = iVar;
        this.f90126c = tVar.f82669a;
        this.f90135l = tVar;
        l lVar = iVar.f90145e.f82614k;
        vb.b bVar = iVar.f90142b;
        this.f90131h = bVar.f125444a;
        this.f90132i = bVar.f125447d;
        this.f90136m = bVar.f125445b;
        this.f90128e = new a2(lVar);
        this.f90134k = false;
        this.f90130g = 0;
        this.f90129f = new Object();
    }

    public static void a(f fVar) {
        j jVar = fVar.f90126c;
        String str = jVar.f116981a;
        int i13 = fVar.f90130g;
        String str2 = f90123o;
        if (i13 >= 2) {
            b0.e().a(str2, "Already stopped work for " + str);
            return;
        }
        fVar.f90130g = 2;
        b0.e().a(str2, "Stopping work for WorkSpec " + str);
        Context context = fVar.f90124a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.d(intent, jVar);
        i iVar = fVar.f90127d;
        int i14 = fVar.f90125b;
        int i15 = 8;
        d.d dVar = new d.d(iVar, intent, i14, i15);
        vb.a aVar = fVar.f90132i;
        aVar.execute(dVar);
        if (!iVar.f90144d.e(jVar.f116981a)) {
            b0.e().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        b0.e().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.d(intent2, jVar);
        aVar.execute(new d.d(iVar, intent2, i14, i15));
    }

    public static void b(f fVar) {
        if (fVar.f90130g != 0) {
            b0.e().a(f90123o, "Already started work for " + fVar.f90126c);
            return;
        }
        fVar.f90130g = 1;
        b0.e().a(f90123o, "onAllConstraintsMet for " + fVar.f90126c);
        if (!fVar.f90127d.f90144d.g(fVar.f90135l, null)) {
            fVar.c();
            return;
        }
        v vVar = fVar.f90127d.f90143c;
        j jVar = fVar.f90126c;
        synchronized (vVar.f121703d) {
            b0.e().a(v.f121699e, "Starting timer for " + jVar);
            vVar.a(jVar);
            u uVar = new u(vVar, jVar);
            vVar.f121701b.put(jVar, uVar);
            vVar.f121702c.put(jVar, fVar);
            vVar.f121700a.f82572a.postDelayed(uVar, 600000L);
        }
    }

    public final void c() {
        synchronized (this.f90129f) {
            try {
                if (this.f90137n != null) {
                    this.f90137n.cancel((CancellationException) null);
                }
                this.f90127d.f90143c.a(this.f90126c);
                PowerManager.WakeLock wakeLock = this.f90133j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    b0.e().a(f90123o, "Releasing wakelock " + this.f90133j + "for WorkSpec " + this.f90126c);
                    this.f90133j.release();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d() {
        String str = this.f90126c.f116981a;
        Context context = this.f90124a;
        StringBuilder D = ep.b.D(str, " (");
        D.append(this.f90125b);
        D.append(")");
        this.f90133j = ub.l.a(context, D.toString());
        b0 e13 = b0.e();
        String str2 = f90123o;
        e13.a(str2, "Acquiring wakelock " + this.f90133j + "for WorkSpec " + str);
        this.f90133j.acquire();
        s j13 = this.f90127d.f90145e.f82607d.y().j(str);
        if (j13 == null) {
            this.f90131h.execute(new e(this, 0));
            return;
        }
        boolean e14 = j13.e();
        this.f90134k = e14;
        if (e14) {
            this.f90137n = m.a(this.f90128e, j13, this.f90136m, this);
        } else {
            b0.e().a(str2, "No constraints for ".concat(str));
            this.f90131h.execute(new e(this, 1));
        }
    }

    @Override // pb.i
    public final void e(s sVar, pb.c cVar) {
        boolean z13 = cVar instanceof pb.a;
        ub.j jVar = this.f90131h;
        if (z13) {
            jVar.execute(new e(this, 2));
        } else {
            jVar.execute(new e(this, 3));
        }
    }

    public final void f(boolean z13) {
        b0 e13 = b0.e();
        StringBuilder sb3 = new StringBuilder("onExecuted ");
        j jVar = this.f90126c;
        sb3.append(jVar);
        sb3.append(", ");
        sb3.append(z13);
        e13.a(f90123o, sb3.toString());
        c();
        int i13 = 8;
        int i14 = this.f90125b;
        i iVar = this.f90127d;
        vb.a aVar = this.f90132i;
        Context context = this.f90124a;
        if (z13) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.d(intent, jVar);
            aVar.execute(new d.d(iVar, intent, i14, i13));
        }
        if (this.f90134k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new d.d(iVar, intent2, i14, i13));
        }
    }
}
