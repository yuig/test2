package ob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import ja.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kb.b0;
import kb.l0;
import kb.s0;
import kotlin.jvm.internal.Intrinsics;
import lb.q;
import tb.g;
import tb.h;
import tb.i;
import tb.j;
import tb.s;
import ub.e;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: f, reason: collision with root package name */
    public static final String f93971f = b0.h("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f93972a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f93973b;

    /* renamed from: c, reason: collision with root package name */
    public final c f93974c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f93975d;

    /* renamed from: e, reason: collision with root package name */
    public final kb.d f93976e;

    public d(Context context, WorkDatabase workDatabase, kb.d dVar) {
        JobScheduler c13 = a.c(context);
        c cVar = new c(context, dVar.f78973d, dVar.f78981l);
        this.f93972a = context;
        this.f93973b = c13;
        this.f93974c = cVar;
        this.f93975d = workDatabase;
        this.f93976e = dVar;
    }

    public static void b(JobScheduler jobScheduler, int i13) {
        try {
            jobScheduler.cancel(i13);
        } catch (Throwable th3) {
            b0.e().d(f93971f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i13)), th3);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b13 = a.b(jobScheduler);
        if (b13 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b13.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b13) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // lb.q
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f93972a;
        JobScheduler jobScheduler = this.f93973b;
        ArrayList e13 = e(context, jobScheduler);
        if (e13 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e13.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f13 = f(jobInfo);
                if (f13 != null && str.equals(f13.f116981a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b(jobScheduler, ((Integer) it2.next()).intValue());
        }
        i v13 = this.f93975d.v();
        d0 d0Var = v13.f116977a;
        d0Var.b();
        h hVar = v13.f116980d;
        oa.i a13 = hVar.a();
        a13.c1(1, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            hVar.j(a13);
        }
    }

    @Override // lb.q
    public final void c(s... sVarArr) {
        int intValue;
        kb.d dVar = this.f93976e;
        WorkDatabase workDatabase = this.f93975d;
        final e eVar = new e(workDatabase, 0);
        for (s sVar : sVarArr) {
            workDatabase.c();
            try {
                s j13 = workDatabase.y().j(sVar.f117016a);
                String str = f93971f;
                String str2 = sVar.f117016a;
                if (j13 == null) {
                    b0.e().i(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (j13.f117017b != s0.ENQUEUED) {
                    b0.e().i(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    j generationalId = b7.c.q(sVar);
                    g a13 = workDatabase.v().a(generationalId);
                    if (a13 != null) {
                        intValue = a13.f116974c;
                    } else {
                        dVar.getClass();
                        final int i13 = dVar.f78978i;
                        Object p13 = eVar.f121655a.p(new Callable() { // from class: ub.d

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f121653b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                e eVar2 = e.this;
                                WorkDatabase workDatabase2 = eVar2.f121655a;
                                Long e13 = workDatabase2.u().e("next_job_scheduler_id");
                                int longValue = e13 != null ? (int) e13.longValue() : 0;
                                workDatabase2.u().h(new tb.d("next_job_scheduler_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                                int i14 = this.f121653b;
                                if (i14 > longValue || longValue > i13) {
                                    eVar2.f121655a.u().h(new tb.d("next_job_scheduler_id", Long.valueOf(i14 + 1)));
                                    longValue = i14;
                                }
                                return Integer.valueOf(longValue);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(p13, "workDatabase.runInTransa…d\n            }\n        )");
                        intValue = ((Number) p13).intValue();
                    }
                    if (a13 == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        workDatabase.v().b(new g(generationalId.f116981a, generationalId.f116982b, intValue));
                    }
                    g(sVar, intValue);
                    workDatabase.r();
                }
            } finally {
                workDatabase.m();
            }
        }
    }

    @Override // lb.q
    public final boolean d() {
        return true;
    }

    public final void g(s sVar, int i13) {
        JobInfo a13 = this.f93974c.a(sVar, i13);
        b0 e13 = b0.e();
        StringBuilder sb3 = new StringBuilder("Scheduling work ID ");
        String str = sVar.f117016a;
        sb3.append(str);
        sb3.append("Job ID ");
        sb3.append(i13);
        String sb4 = sb3.toString();
        String str2 = f93971f;
        e13.a(str2, sb4);
        try {
            if (this.f93973b.schedule(a13) == 0) {
                b0.e().i(str2, "Unable to schedule work ID " + str);
                if (sVar.f117032q && sVar.f117033r == l0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    sVar.f117032q = false;
                    b0.e().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(sVar, i13);
                }
            }
        } catch (IllegalStateException e14) {
            String a14 = a.a(this.f93972a, this.f93975d, this.f93976e);
            b0.e().c(str2, a14);
            throw new IllegalStateException(a14, e14);
        } catch (Throwable th3) {
            b0.e().d(str2, "Unable to schedule " + sVar, th3);
        }
    }
}
