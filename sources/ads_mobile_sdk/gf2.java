package ads_mobile_sdk;

import a.b3;
import a.h5;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gf2 extends jd2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f5557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ if2 f5558c;

    public gf2(if2 if2Var, IBinder iBinder) {
        this.f5558c = if2Var;
        this.f5557b = iBinder;
    }

    @Override // ads_mobile_sdk.jd2
    public final void a() {
        a.ra q9Var;
        jf2 jf2Var = this.f5558c.f6390a;
        b3 b3Var = jf2Var.f6793i;
        IBinder iBinder = this.f5557b;
        ((h5) b3Var).getClass();
        int i13 = a.ha.f53i;
        if (iBinder == null) {
            q9Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
            q9Var = queryLocalInterface instanceof a.ra ? (a.ra) queryLocalInterface : new a.q9(iBinder, "com.google.android.play.core.prewarm.protocol.IPrewarmService");
        }
        jf2Var.f6798n = q9Var;
        jf2 jf2Var2 = this.f5558c.f6390a;
        jf2Var2.f6786b.a("linkToDeath", new Object[0]);
        try {
            jf2Var2.f6798n.asBinder().linkToDeath(jf2Var2.f6795k, 0);
        } catch (RemoteException e13) {
            u71 u71Var = jf2Var2.f6786b;
            Object[] objArr = new Object[0];
            u71Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", u71.a(u71Var.f11872a, "linkToDeath failed", objArr), e13);
            }
        }
        jf2 jf2Var3 = this.f5558c.f6390a;
        jf2Var3.f6791g = false;
        Iterator it = jf2Var3.f6788d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f5558c.f6390a.f6788d.clear();
    }
}
