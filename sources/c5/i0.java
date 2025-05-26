package c5;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class i0 extends Service {

    /* renamed from: c */
    public static final Object f25808c = new Object();

    /* renamed from: d */
    public static final HashMap f25809d = new HashMap();

    /* renamed from: a */
    public k f25810a;

    /* renamed from: b */
    public i f25811b;

    public final j a() {
        this.f25810a.getClass();
        k kVar = this.f25810a;
        synchronized (kVar.f25815b) {
            try {
                JobParameters jobParameters = kVar.f25816c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(kVar.f25814a.getClassLoader());
                return new j(kVar, dequeueWork);
            } finally {
            }
        }
    }

    @Override // android.app.Service
    /* renamed from: b */
    public final IBinder onBind(Intent intent) {
        k kVar = this.f25810a;
        if (kVar != null) {
            return kVar.getBinder();
        }
        return null;
    }

    public final void c() {
        super.onCreate();
        this.f25810a = new k(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i13, int i14) {
        return 2;
    }
}
