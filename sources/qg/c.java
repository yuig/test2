package qg;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f103808a;

    /* renamed from: b, reason: collision with root package name */
    public final rg.d f103809b;

    /* renamed from: c, reason: collision with root package name */
    public final a f103810c;

    public c(Context context, rg.d dVar, a aVar) {
        this.f103808a = context;
        this.f103809b = dVar;
        this.f103810c = aVar;
    }

    public final void a(lg.b bVar) {
        int i13;
        Context context = this.f103808a;
        ComponentName componentName = new ComponentName(context, (Class<?>) d.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(bVar.f83178a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ig.c cVar = bVar.f83180c;
        adler32.update(allocate.putInt(ug.a.a(cVar)).array());
        byte[] bArr = bVar.f83179b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i14 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == value) {
                if (i14 >= 1) {
                    String concat = "TRuntime.".concat("JobInfoScheduler");
                    if (Log.isLoggable(concat, 3)) {
                        Log.d(concat, "Upload for context " + bVar + " is already scheduled. Returning...");
                        return;
                    }
                    return;
                }
            }
        }
        SQLiteDatabase a13 = ((rg.g) this.f103809b).a();
        String valueOf = String.valueOf(ug.a.a(cVar));
        String str = bVar.f83178a;
        Long l13 = (Long) rg.g.g(a13.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf}), new a.e(27));
        long longValue = l13.longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        a aVar = this.f103810c;
        builder.setMinimumLatency(aVar.a(cVar, longValue));
        Set set = ((b) aVar.f103804b.get(cVar)).f103807c;
        if (set.contains(e.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(e.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(e.DEVICE_IDLE)) {
            i13 = 1;
            builder.setRequiresDeviceIdle(true);
        } else {
            i13 = 1;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i13);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", ug.a.a(cVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {bVar, Integer.valueOf(value), Long.valueOf(aVar.a(cVar, longValue)), l13, 1};
        String concat2 = "TRuntime.".concat("JobInfoScheduler");
        if (Log.isLoggable(concat2, 3)) {
            Log.d(concat2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
