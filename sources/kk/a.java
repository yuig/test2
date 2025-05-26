package kk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f79860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ja.v f79861c;

    public a(ja.v vVar, IBinder iBinder) {
        this.f79861c = vVar;
        this.f79860b = iBinder;
    }

    @Override // kk.u
    public final void c() {
        k iVar;
        ja.v vVar = this.f79861c;
        c cVar = (c) vVar.f75280b;
        int i13 = j.f79883b;
        IBinder iBinder = this.f79860b;
        if (iBinder == null) {
            iVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            iVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
        }
        cVar.f79877m = iVar;
        Object obj = vVar.f75280b;
        c cVar2 = (c) obj;
        cVar2.f79866b.g("linkToDeath", new Object[0]);
        try {
            cVar2.f79877m.asBinder().linkToDeath(cVar2.f79874j, 0);
        } catch (RemoteException e13) {
            cVar2.f79866b.d("linkToDeath failed", e13, new Object[0]);
        }
        c cVar3 = (c) obj;
        cVar3.f79871g = false;
        Iterator it = cVar3.f79868d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((c) obj).f79868d.clear();
    }
}
