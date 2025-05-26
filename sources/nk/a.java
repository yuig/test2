package nk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends x {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IBinder f91058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fi.h f91059h;

    public a(fi.h hVar, IBinder iBinder) {
        this.f91059h = hVar;
        this.f91058g = iBinder;
    }

    @Override // nk.x
    public final void b() {
        fi.h hVar = this.f91059h;
        IInterface iInterface = (IInterface) ((c) hVar.f62187b).f91070i.a(this.f91058g);
        Object obj = hVar.f62187b;
        c cVar = (c) obj;
        cVar.f91075n = iInterface;
        cVar.f91063b.c("linkToDeath", new Object[0]);
        try {
            cVar.f91075n.asBinder().linkToDeath(cVar.f91072k, 0);
        } catch (RemoteException e13) {
            cVar.f91063b.b("linkToDeath failed", e13, new Object[0]);
        }
        c cVar2 = (c) obj;
        cVar2.f91068g = false;
        Iterator it = cVar2.f91065d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((c) obj).f91065d.clear();
    }
}
