package ob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import bk.f;
import java.util.Iterator;
import kb.b0;
import kb.c0;
import kb.g;
import kh2.u2;
import tb.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f93967d = b0.h("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f93968a;

    /* renamed from: b, reason: collision with root package name */
    public final f f93969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f93970c;

    public c(Context context, f fVar, boolean z13) {
        this.f93969b = fVar;
        this.f93968a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f93970c = z13;
    }

    public static JobInfo.TriggerContentUri b(kb.f fVar) {
        return new JobInfo.TriggerContentUri(fVar.a(), fVar.b() ? 1 : 0);
    }

    public final JobInfo a(s sVar, int i13) {
        int i14;
        String d2;
        g gVar = sVar.f117025j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", sVar.f117016a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", sVar.c());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", sVar.f());
        JobInfo.Builder extras = new JobInfo.Builder(i13, this.f93968a).setRequiresCharging(gVar.h()).setRequiresDeviceIdle(gVar.i()).setExtras(persistableBundle);
        NetworkRequest d13 = gVar.d();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 28 || d13 == null) {
            c0 e13 = gVar.e();
            if (i15 < 30 || e13 != c0.TEMPORARILY_UNMETERED) {
                int i16 = b.f93966a[e13.ordinal()];
                if (i16 != 1) {
                    i14 = 2;
                    if (i16 != 2) {
                        if (i16 != 3) {
                            i14 = 4;
                            if (i16 == 4) {
                                i14 = 3;
                            } else if (i16 != 5) {
                                b0.e().a(f93967d, "API version too low. Cannot convert network type value " + e13);
                            }
                        }
                    }
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                extras.setRequiredNetworkType(i14);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            u2.U0(extras, d13);
        }
        if (!gVar.i()) {
            extras.setBackoffCriteria(sVar.f117028m, sVar.f117027l == kb.a.LINEAR ? 0 : 1);
        }
        long a13 = sVar.a();
        this.f93969b.getClass();
        long max = Math.max(a13 - f.E(), 0L);
        if (i15 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!sVar.f117032q && this.f93970c) {
            extras.setImportantWhileForeground(true);
        }
        if (gVar.f()) {
            Iterator it = gVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((kb.f) it.next()));
            }
            extras.setTriggerContentUpdateDelay(gVar.b());
            extras.setTriggerContentMaxDelay(gVar.a());
        }
        extras.setPersisted(false);
        int i17 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(gVar.g());
        extras.setRequiresStorageNotLow(gVar.j());
        boolean z13 = sVar.f117026k > 0;
        boolean z14 = max > 0;
        if (i17 >= 31 && sVar.f117032q && !z13 && !z14) {
            extras.setExpedited(true);
        }
        if (i17 >= 35 && (d2 = sVar.d()) != null) {
            extras.setTraceTag(d2);
        }
        return extras.build();
    }
}
