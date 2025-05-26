package androidx.work.impl.background.systemjob;

import a.a;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;
import lb.c;
import lb.i0;
import lb.j0;
import lb.o;
import lb.t;
import lb.v;
import o.d;
import tb.j;
import v.e1;
import x92.b;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20018e = b0.h("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public j0 f20019a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20020b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final v f20021c = new v();

    /* renamed from: d, reason: collision with root package name */
    public i0 f20022d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static j c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // lb.c
    public final void b(j jVar, boolean z13) {
        a("onExecuted");
        b0.e().a(f20018e, a.p(new StringBuilder(), jVar.f116981a, " executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.f20020b.remove(jVar);
        this.f20021c.d(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z13);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            j0 h10 = j0.h(getApplicationContext());
            this.f20019a = h10;
            o oVar = h10.f82610g;
            this.f20022d = new i0(oVar, h10.f82608e);
            oVar.a(this);
        } catch (IllegalStateException e13) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e13);
            }
            b0.e().i(f20018e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        j0 j0Var = this.f20019a;
        if (j0Var != null) {
            j0Var.f82610g.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        j0 j0Var = this.f20019a;
        String str = f20018e;
        if (j0Var == null) {
            b0.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j c13 = c(jobParameters);
        if (c13 == null) {
            b0.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.f20020b;
        if (hashMap.containsKey(c13)) {
            b0.e().a(str, "Job is already being executed by SystemJobService: " + c13);
            return false;
        }
        b0.e().a(str, "onStartJob for " + c13);
        hashMap.put(c13, jobParameters);
        int i13 = Build.VERSION.SDK_INT;
        b bVar = new b(8);
        if (jobParameters.getTriggeredContentUris() != null) {
            bVar.f134366c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            bVar.f134365b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i13 >= 28) {
            bVar.f134367d = d.d(jobParameters);
        }
        i0 i0Var = this.f20022d;
        t workSpecId = this.f20021c.b(c13);
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        i0Var.f82600b.a(new h6.o(i0Var, workSpecId, bVar, 9));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        a("onStopJob");
        if (this.f20019a == null) {
            b0.e().a(f20018e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j c13 = c(jobParameters);
        if (c13 == null) {
            b0.e().c(f20018e, "WorkSpec id not found!");
            return false;
        }
        b0.e().a(f20018e, "onStopJob for " + c13);
        this.f20020b.remove(c13);
        t workSpecId = this.f20021c.d(c13);
        if (workSpecId != null) {
            int c14 = Build.VERSION.SDK_INT >= 31 ? e1.c(jobParameters) : -512;
            i0 i0Var = this.f20022d;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            i0Var.a(workSpecId, c14);
        }
        o oVar = this.f20019a.f82610g;
        String str = c13.f116981a;
        synchronized (oVar.f82647k) {
            contains = oVar.f82645i.contains(str);
        }
        return !contains;
    }
}
