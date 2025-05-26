package ads_mobile_sdk;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ef2 extends jd2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jf2 f4843b;

    public ef2(jf2 jf2Var) {
        this.f4843b = jf2Var;
    }

    @Override // ads_mobile_sdk.jd2
    public final void a() {
        synchronized (this.f4843b.f6790f) {
            try {
                if (this.f4843b.f6796l.get() > 0 && this.f4843b.f6796l.decrementAndGet() > 0) {
                    this.f4843b.f6786b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                jf2 jf2Var = this.f4843b;
                if (jf2Var.f6798n != null) {
                    jf2Var.f6786b.a("Unbind from service.", new Object[0]);
                    jf2 jf2Var2 = this.f4843b;
                    jf2Var2.f6785a.unbindService(jf2Var2.f6797m);
                    jf2 jf2Var3 = this.f4843b;
                    jf2Var3.f6791g = false;
                    jf2Var3.f6798n = null;
                    jf2Var3.f6797m = null;
                }
                jf2 jf2Var4 = this.f4843b;
                Iterator it = jf2Var4.f6789e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(jf2Var4.f6787c + " : Binder has died."));
                }
                jf2Var4.f6789e.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
