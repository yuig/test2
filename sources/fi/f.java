package fi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f62183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f62184c;

    public f(h hVar, IBinder iBinder) {
        this.f62184c = hVar;
        this.f62183b = iBinder;
    }

    @Override // fi.c
    public final void a() {
        wg.c aVar;
        h hVar = this.f62184c;
        i iVar = (i) hVar.f62187b;
        int i13 = wg.b.f129717b;
        IBinder iBinder = this.f62183b;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.engage.protocol.IAppEngageService");
            aVar = queryLocalInterface instanceof wg.c ? (wg.c) queryLocalInterface : new wg.a(iBinder);
        }
        iVar.f62201m = aVar;
        Object obj = hVar.f62187b;
        i iVar2 = (i) obj;
        iVar2.f62190b.c("linkToDeath", new Object[0]);
        try {
            iVar2.f62201m.asBinder().linkToDeath(iVar2.f62198j, 0);
        } catch (RemoteException e13) {
            iVar2.f62190b.a("linkToDeath failed", e13, new Object[0]);
        }
        i iVar3 = (i) obj;
        iVar3.f62195g = false;
        Iterator it = iVar3.f62192d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((i) obj).f62192d.clear();
    }
}
