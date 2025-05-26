package hh;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lb.x;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f69111b;

    public /* synthetic */ f(g gVar, int i13) {
        this.f69110a = i13;
        this.f69111b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69110a) {
            case 0:
                g gVar = this.f69111b;
                while (true) {
                    synchronized (gVar) {
                        try {
                            if (gVar.f69112a != 2) {
                                return;
                            }
                            if (gVar.f69115d.isEmpty()) {
                                gVar.c();
                                return;
                            }
                            i iVar = (i) gVar.f69115d.poll();
                            gVar.f69116e.put(iVar.f69118a, iVar);
                            ((ScheduledExecutorService) gVar.f69117f.f69125c).schedule(new x(gVar, iVar, 7), 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                String valueOf = String.valueOf(iVar);
                                StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
                                sb3.append("Sending ");
                                sb3.append(valueOf);
                                Log.d("MessengerIpcClient", sb3.toString());
                            }
                            Context context = (Context) gVar.f69117f.f69124b;
                            Messenger messenger = gVar.f69113b;
                            Message obtain = Message.obtain();
                            obtain.what = iVar.f69120c;
                            obtain.arg1 = iVar.f69118a;
                            obtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", iVar.b());
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", iVar.f69121d);
                            obtain.setData(bundle);
                            try {
                                tb.c cVar = gVar.f69114c;
                                Messenger messenger2 = (Messenger) cVar.f116959a;
                                if (messenger2 == null) {
                                    zzd zzdVar = (zzd) cVar.f116960b;
                                    if (zzdVar == null) {
                                        throw new IllegalStateException("Both messengers are null");
                                        break;
                                    } else {
                                        zzdVar.a(obtain);
                                    }
                                } else {
                                    messenger2.send(obtain);
                                }
                            } catch (RemoteException e13) {
                                gVar.a(2, e13.getMessage());
                            }
                        } finally {
                        }
                    }
                }
            default:
                g gVar2 = this.f69111b;
                synchronized (gVar2) {
                    if (gVar2.f69112a == 1) {
                        gVar2.a(1, "Timed out while binding");
                    }
                }
                return;
        }
    }
}
