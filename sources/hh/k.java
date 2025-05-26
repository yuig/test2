package hh;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static k f69122e;

    /* renamed from: a, reason: collision with root package name */
    public int f69123a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69124b;

    /* renamed from: c, reason: collision with root package name */
    public Object f69125c;

    /* renamed from: d, reason: collision with root package name */
    public Object f69126d;

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f69126d = new g(this);
        this.f69123a = 1;
        this.f69125c = scheduledExecutorService;
        this.f69124b = context.getApplicationContext();
    }

    public static synchronized k b(Context context) {
        k kVar;
        synchronized (k.class) {
            try {
                if (f69122e == null) {
                    f69122e = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new o.c("MessengerIpcClient"))));
                }
                kVar = f69122e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return kVar;
    }

    public final void a() {
        synchronized (this.f69124b) {
            try {
                bf.b.t(this.f69123a > 0);
                int i13 = this.f69123a - 1;
                this.f69123a = i13;
                if (i13 == 0) {
                    Object obj = this.f69126d;
                    if (((HandlerThread) obj) != null) {
                        ((HandlerThread) obj).quit();
                        this.f69126d = null;
                        this.f69125c = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized Task c(i iVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 9);
                sb3.append("Queueing ");
                sb3.append(valueOf);
                Log.d("MessengerIpcClient", sb3.toString());
            }
            if (!((g) this.f69126d).d(iVar)) {
                g gVar = new g(this);
                this.f69126d = gVar;
                gVar.d(iVar);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return iVar.f69119b.getTask();
    }

    public k() {
        this.f69124b = new Object();
        this.f69125c = null;
        this.f69126d = null;
        this.f69123a = 0;
    }

    public k(int i13, CoroutineContext coroutineContext, co2.a aVar, do2.i iVar) {
        this.f69124b = iVar;
        this.f69123a = i13;
        this.f69125c = aVar;
        this.f69126d = coroutineContext;
    }
}
