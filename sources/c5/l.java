package c5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.pinterest.activity.task.activity.MainActivity;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: c, reason: collision with root package name */
    public final JobInfo f25817c;

    /* renamed from: d, reason: collision with root package name */
    public final JobScheduler f25818d;

    public l(MainActivity mainActivity, ComponentName componentName) {
        a();
        this.f25817c = new JobInfo.Builder(2049654618, componentName).setOverrideDeadline(0L).build();
        this.f25818d = (JobScheduler) mainActivity.getApplicationContext().getSystemService("jobscheduler");
    }
}
