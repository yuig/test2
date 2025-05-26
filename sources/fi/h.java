package fi;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class h implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62187b;

    public /* synthetic */ h(int i13, Object obj) {
        this.f62186a = i13;
        this.f62187b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i13 = this.f62186a;
        Object obj = this.f62187b;
        switch (i13) {
            case 0:
                i iVar = (i) obj;
                iVar.f62190b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                iVar.a().post(new f(this, iBinder));
                break;
            default:
                nk.c cVar = (nk.c) obj;
                cVar.f91063b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new nk.a(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i13 = this.f62186a;
        Object obj = this.f62187b;
        switch (i13) {
            case 0:
                i iVar = (i) obj;
                iVar.f62190b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                iVar.a().post(new g(this));
                break;
            default:
                nk.c cVar = (nk.c) obj;
                cVar.f91063b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new nk.b(this));
                break;
        }
    }
}
