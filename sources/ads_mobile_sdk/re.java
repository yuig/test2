package ads_mobile_sdk;

import android.os.SystemClock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes2.dex */
public final class re implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ se f10593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao2.m f10594b;

    public re(se seVar, ao2.o oVar) {
        this.f10593a = seVar;
        this.f10594b = oVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task appSetIdInfoTask) {
        Intrinsics.checkNotNullParameter(appSetIdInfoTask, "appSetIdInfoTask");
        if (appSetIdInfoTask.isSuccessful()) {
            ah.b bVar = (ah.b) appSetIdInfoTask.getResult();
            zn2.a aVar = zn2.b.f142311b;
            this.f10593a.f11063c.getClass();
            ll llVar = new ll(bVar, dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS));
            ao2.m mVar = this.f10594b;
            xk2.q qVar = s.f135225b;
            mVar.resumeWith(new pk0(llVar));
            return;
        }
        if (appSetIdInfoTask.isCanceled()) {
            ((ks2) this.f10593a.f11062b).a("AppSet Id task was cancelled", new CancellationException("AppSet Id task was cancelled"));
            ao2.m mVar2 = this.f10594b;
            xk2.q qVar2 = s.f135225b;
            mVar2.resumeWith(new nk0("Gms Task for getting AppSetId was cancelled", yx0.f14443a));
            return;
        }
        a.j3 j3Var = this.f10593a.f11062b;
        Exception exception = appSetIdInfoTask.getException();
        if (exception == null) {
            exception = new Exception("AppSet Id task wasn't successful or cancelled, but had no exception.");
        }
        ((ks2) j3Var).a("Task failed while getting AppSet Id", exception);
        ao2.m mVar3 = this.f10594b;
        xk2.q qVar3 = s.f135225b;
        Exception exception2 = appSetIdInfoTask.getException();
        Intrinsics.f(exception2);
        mVar3.resumeWith(new kk0(exception2, null, null, 6));
    }
}
