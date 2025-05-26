package jh;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f76165a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f76166b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76167c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f76168d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f76169e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f76170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f76171g;

    public j0(k0 k0Var, i0 i0Var) {
        this.f76171g = k0Var;
        this.f76169e = i0Var;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f76166b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            k0 k0Var = this.f76171g;
            nh.a aVar = k0Var.f76175g;
            Context context = k0Var.f76173e;
            boolean d2 = aVar.d(context, str, this.f76169e.a(context), this, 4225, executor);
            this.f76167c = d2;
            if (d2) {
                this.f76171g.f76174f.sendMessageDelayed(this.f76171g.f76174f.obtainMessage(1, this.f76169e), this.f76171g.f76177i);
            } else {
                this.f76166b = 2;
                try {
                    k0 k0Var2 = this.f76171g;
                    k0Var2.f76175g.c(k0Var2.f76173e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th3) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f76171g.f76172d) {
            try {
                this.f76171g.f76174f.removeMessages(1, this.f76169e);
                this.f76168d = iBinder;
                this.f76170f = componentName;
                Iterator it = this.f76165a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f76166b = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f76171g.f76172d) {
            try {
                this.f76171g.f76174f.removeMessages(1, this.f76169e);
                this.f76168d = null;
                this.f76170f = componentName;
                Iterator it = this.f76165a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f76166b = 2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
