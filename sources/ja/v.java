package ja;

import a8.n0;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f75280b;

    public /* synthetic */ v(Object obj, int i13) {
        this.f75279a = i13;
        this.f75280b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        IInterface iInterface;
        int i13 = this.f75279a;
        Object obj = this.f75280b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                n0 n0Var = (n0) obj;
                int i14 = w.f75281b;
                if (service == null) {
                    iInterface = null;
                } else {
                    IInterface queryLocalInterface = service.queryLocalInterface(m.Co);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof m)) {
                        l lVar = new l();
                        lVar.f75247a = service;
                        iInterface = lVar;
                    } else {
                        iInterface = (m) queryLocalInterface;
                    }
                }
                n0Var.f1407g = iInterface;
                ((Executor) n0Var.f1404d).execute((Runnable) n0Var.f1411k);
                break;
            case 1:
                kk.c cVar = (kk.c) obj;
                cVar.f79866b.g("ServiceConnectionImpl.onServiceConnected(%s)", name);
                cVar.a().post(new kk.a(this, service));
                break;
            default:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(service, "binder");
                if (hf2.m.class.isAssignableFrom(service.getClass())) {
                    hf2.e eVar = (hf2.e) obj;
                    eVar.f69024h = ((hf2.m) service).f69055a;
                    hf2.e.a(eVar);
                    hf2.e.c(eVar);
                    break;
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        int i13 = this.f75279a;
        Object obj = this.f75280b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(name, "name");
                n0 n0Var = (n0) obj;
                ((Executor) n0Var.f1404d).execute((Runnable) n0Var.f1412l);
                n0Var.f1407g = null;
                break;
            case 1:
                kk.c cVar = (kk.c) obj;
                cVar.f79866b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                cVar.a().post(new kk.b(this, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(name, "name");
                tq2.a.f119026a.getClass();
                t72.j.g(new Object[0]);
                ((hf2.e) obj).f69024h = null;
                break;
        }
    }

    public /* synthetic */ v(kk.c cVar) {
        this.f75279a = 1;
        this.f75280b = cVar;
    }
}
