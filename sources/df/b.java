package df;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.io.Serializable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import oi.i4;
import oi.o4;
import oi.u4;
import oi.y3;

/* loaded from: classes3.dex */
public final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54712a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f54713b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54714c;

    public b(i4 i4Var, String str) {
        this.f54712a = 1;
        this.f54714c = i4Var;
        this.f54713b = str;
    }

    public final IBinder a() {
        if (!(!((AtomicBoolean) this.f54713b).compareAndSet(true, true))) {
            throw new IllegalStateException("Binder already consumed".toString());
        }
        Object take = ((BlockingQueue) this.f54714c).take();
        Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
        return (IBinder) take;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i13 = this.f54712a;
        Object obj = this.f54714c;
        switch (i13) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((BlockingQueue) obj).put(iBinder);
                        break;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                break;
            default:
                if (iBinder == null) {
                    y3 y3Var = ((i4) obj).f94843a.f95205i;
                    u4.d(y3Var);
                    y3Var.f95271i.c("Install Referrer connection returned with null binder");
                    break;
                } else {
                    try {
                        int i14 = com.google.android.gms.internal.measurement.l0.f31499a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        Object k0Var = queryLocalInterface instanceof com.google.android.gms.internal.measurement.j0 ? (com.google.android.gms.internal.measurement.j0) queryLocalInterface : new com.google.android.gms.internal.measurement.k0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
                        if (k0Var != null) {
                            y3 y3Var2 = ((i4) obj).f94843a.f95205i;
                            u4.d(y3Var2);
                            y3Var2.f95276n.c("Install Referrer Service connected");
                            o4 o4Var = ((i4) obj).f94843a.f95206j;
                            u4.d(o4Var);
                            o4Var.y(new s.f(this, k0Var, this, 8));
                            break;
                        } else {
                            y3 y3Var3 = ((i4) obj).f94843a.f95205i;
                            u4.d(y3Var3);
                            y3Var3.f95271i.c("Install Referrer Service implementation was not found");
                            break;
                        }
                    } catch (RuntimeException e13) {
                        y3 y3Var4 = ((i4) obj).f94843a.f95205i;
                        u4.d(y3Var4);
                        y3Var4.f95271i.b(e13, "Exception occurred while calling Install Referrer API");
                    }
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f54712a) {
            case 0:
                break;
            default:
                y3 y3Var = ((i4) this.f54714c).f94843a.f95205i;
                u4.d(y3Var);
                y3Var.f95276n.c("Install Referrer Service disconnected");
                break;
        }
    }

    public b() {
        this.f54712a = 0;
        this.f54713b = new AtomicBoolean(false);
        this.f54714c = new LinkedBlockingDeque();
    }
}
