package ob;

import a.cb;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kb.b0;
import kg.t;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f93965a;

    static {
        String h10 = b0.h("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"SystemJobScheduler\")");
        f93965a = h10;
    }

    public static final String a(Context context, WorkDatabase workDatabase, kb.d configuration) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i13 = Build.VERSION.SDK_INT;
        int i14 = i13 >= 31 ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY : 100;
        int size = workDatabase.y().h().size();
        String str2 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i13 >= 34) {
            JobScheduler c13 = c(context);
            List b13 = b(c13);
            if (b13 != null) {
                ArrayList e13 = d.e(context, c13);
                int size2 = e13 != null ? b13.size() - e13.size() : 0;
                String str3 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                ArrayList e14 = d.e(context, (JobScheduler) systemService);
                int size3 = e14 != null ? e14.size() : 0;
                if (size3 != 0) {
                    str3 = size3 + " from WorkManager in the default namespace";
                }
                String[] elements = {b13.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str3};
                Intrinsics.checkNotNullParameter(elements, "elements");
                str2 = CollectionsKt.Z(c0.A(elements), ",\n", null, null, 0, null, null, 62);
            }
        } else {
            ArrayList e15 = d.e(context, c(context));
            if (e15 != null) {
                str2 = e15.size() + " jobs from WorkManager";
            }
        }
        StringBuilder sb3 = new StringBuilder("JobScheduler ");
        sb3.append(i14);
        sb3.append(" job limit exceeded.\nIn JobScheduler there are ");
        sb3.append(str2);
        sb3.append(".\nThere are ");
        sb3.append(size);
        sb3.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        return cb.l(sb3, configuration.f78980k, '.');
    }

    public static final List b(JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "<this>");
        try {
            Intrinsics.checkNotNullParameter(jobScheduler, "jobScheduler");
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            Intrinsics.checkNotNullExpressionValue(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th3) {
            b0.e().d(f93965a, "getAllPendingJobs() is not reliable on this device.", th3);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? t.y(jobScheduler) : jobScheduler;
    }
}
