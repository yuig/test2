package jh;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class f0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f76142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f76143b;

    public f0(f fVar, int i13) {
        this.f76143b = fVar;
        this.f76142a = i13;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        f fVar = this.f76143b;
        if (iBinder == null) {
            f.zzk(fVar, 16);
            return;
        }
        obj = fVar.zzq;
        synchronized (obj) {
            try {
                f fVar2 = this.f76143b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new y(iBinder) : (k) queryLocalInterface;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f76143b.zzl(0, null, this.f76142a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f76143b.zzq;
        synchronized (obj) {
            this.f76143b.zzr = null;
        }
        f fVar = this.f76143b;
        int i13 = this.f76142a;
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i13, 1));
    }
}
