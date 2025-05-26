package hh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.app.z;
import com.google.android.gms.cloudmessaging.zzq;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lb.x;

/* loaded from: classes.dex */
public final class g implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public tb.c f69114c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f69117f;

    /* renamed from: a, reason: collision with root package name */
    public int f69112a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f69113b = new Messenger(new bi.f(Looper.getMainLooper(), new e(this)));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f69115d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f69116e = new SparseArray();

    public g(k kVar) {
        this.f69117f = kVar;
    }

    public final synchronized void a(int i13, String str) {
        b(i13, str, null);
    }

    public final synchronized void b(int i13, String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i14 = this.f69112a;
            if (i14 == 0) {
                throw new IllegalStateException();
            }
            if (i14 != 1 && i14 != 2) {
                if (i14 != 3) {
                    return;
                }
                this.f69112a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f69112a = 4;
            nh.a.b().c((Context) this.f69117f.f69124b, this);
            zzq zzqVar = new zzq(str, securityException);
            Iterator it = this.f69115d.iterator();
            while (it.hasNext()) {
                ((i) it.next()).c(zzqVar);
            }
            this.f69115d.clear();
            for (int i15 = 0; i15 < this.f69116e.size(); i15++) {
                ((i) this.f69116e.valueAt(i15)).c(zzqVar);
            }
            this.f69116e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f69112a == 2 && this.f69115d.isEmpty() && this.f69116e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f69112a = 3;
                nh.a.b().c((Context) this.f69117f.f69124b, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean d(i iVar) {
        int i13 = this.f69112a;
        int i14 = 0;
        int i15 = 1;
        if (i13 != 0) {
            if (i13 == 1) {
                this.f69115d.add(iVar);
                return true;
            }
            if (i13 != 2) {
                return false;
            }
            this.f69115d.add(iVar);
            ((ScheduledExecutorService) this.f69117f.f69125c).execute(new f(this, i14));
            return true;
        }
        this.f69115d.add(iVar);
        if (this.f69112a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f69112a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (nh.a.b().a((Context) this.f69117f.f69124b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f69117f.f69125c).schedule(new f(this, i15), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e13) {
            b(0, "Unable to bind to service", e13);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f69117f.f69125c).execute(new x(this, iBinder, 6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f69117f.f69125c).execute(new z(this, 23));
    }
}
