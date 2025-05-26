package fi;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import kk.u;
import nk.x;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62181b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f62180a = i13;
        this.f62181b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f62180a) {
            case 0:
                i iVar = (i) this.f62181b;
                iVar.f62190b.c("reportBinderDeath", new Object[0]);
                ep.b.A(iVar.f62197i.get());
                iVar.f62190b.c("%s : Binder has died.", iVar.f62191c);
                Iterator it = iVar.f62192d.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).b(iVar.d());
                }
                iVar.f62192d.clear();
                synchronized (iVar.f62194f) {
                    iVar.e();
                }
                return;
            case 1:
                kk.c cVar = (kk.c) this.f62181b;
                cVar.f79866b.g("reportBinderDeath", new Object[0]);
                ep.b.A(cVar.f79873i.get());
                cVar.f79866b.g("%s : Binder has died.", cVar.f79867c);
                Iterator it2 = cVar.f79868d.iterator();
                while (it2.hasNext()) {
                    ((u) it2.next()).b(new RemoteException(String.valueOf(cVar.f79867c).concat(" : Binder has died.")));
                }
                cVar.f79868d.clear();
                synchronized (cVar.f79870f) {
                    cVar.d();
                }
                return;
            default:
                nk.c cVar2 = (nk.c) this.f62181b;
                cVar2.f91063b.c("reportBinderDeath", new Object[0]);
                ep.b.A(cVar2.f91071j.get());
                cVar2.f91063b.c("%s : Binder has died.", cVar2.f91064c);
                Iterator it3 = cVar2.f91065d.iterator();
                while (it3.hasNext()) {
                    ((x) it3.next()).a(cVar2.e());
                }
                cVar2.f91065d.clear();
                synchronized (cVar2.f91067f) {
                    cVar2.f();
                }
                return;
        }
    }
}
