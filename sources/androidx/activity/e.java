package androidx.activity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15886b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f15885a = i13;
        this.f15886b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f15885a;
        Object obj = this.f15886b;
        switch (i13) {
            case 0:
                ((o) obj).reportFullyDrawn();
                return null;
            case 1:
                lb.b0 b0Var = (lb.b0) obj;
                String str = lb.b0.f82573k;
                b0Var.getClass();
                ub.b.a(b0Var);
                return Unit.f80348a;
            default:
                lb.j0 j0Var = (lb.j0) obj;
                lb.j0 j0Var2 = lb.j0.f82602l;
                j0Var.getClass();
                int i14 = Build.VERSION.SDK_INT;
                String str2 = ob.d.f93971f;
                Context context = j0Var.f82605b;
                if (i14 >= 34) {
                    ob.a.c(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList e13 = ob.d.e(context, jobScheduler);
                if (e13 != null && !e13.isEmpty()) {
                    Iterator it = e13.iterator();
                    while (it.hasNext()) {
                        ob.d.b(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                WorkDatabase workDatabase = j0Var.f82607d;
                tb.y y13 = workDatabase.y();
                ja.d0 d0Var = y13.f117050a;
                d0Var.b();
                tb.u uVar = y13.f117063n;
                oa.i a13 = uVar.a();
                try {
                    d0Var.c();
                    try {
                        a13.G();
                        d0Var.r();
                        uVar.j(a13);
                        lb.s.b(j0Var.f82606c, workDatabase, j0Var.f82609f);
                        return Unit.f80348a;
                    } finally {
                        d0Var.m();
                    }
                } catch (Throwable th3) {
                    uVar.j(a13);
                    throw th3;
                }
        }
    }
}
