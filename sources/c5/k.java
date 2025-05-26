package c5;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class k extends JobServiceEngine {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f25814a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25815b;

    /* renamed from: c, reason: collision with root package name */
    public JobParameters f25816c;

    public k(i0 i0Var) {
        super(i0Var);
        this.f25815b = new Object();
        this.f25814a = i0Var;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f25816c = jobParameters;
        i0 i0Var = this.f25814a;
        if (i0Var.f25811b != null) {
            return true;
        }
        i iVar = new i(i0Var);
        i0Var.f25811b = iVar;
        iVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        i iVar = this.f25814a.f25811b;
        if (iVar != null) {
            iVar.cancel(false);
        }
        synchronized (this.f25815b) {
            this.f25816c = null;
        }
        return true;
    }
}
