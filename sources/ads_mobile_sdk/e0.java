package ads_mobile_sdk;

import a.j0;
import a.pd;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class e0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4528a;

    /* renamed from: b, reason: collision with root package name */
    public final pd f4529b;

    /* renamed from: c, reason: collision with root package name */
    public final bs2 f4530c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4531d;

    public e0(pd pdVar, Map map, i4 i4Var, bt2 bt2Var) {
        this.f4528a = map;
        this.f4529b = pdVar;
        this.f4530c = bt2Var.a(xb0.EVENT_ID_AD_ATTEST_SIGNALS_TASK);
        this.f4531d = i4Var.z();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        wb wbVar;
        int i13;
        try {
            try {
                this.f4530c.b();
                com.google.common.util.concurrent.c0 c0Var = (com.google.common.util.concurrent.c0) this.f4528a.get("gs");
                if (c0Var != null && (wbVar = (wb) c0Var.get(this.f4531d, TimeUnit.MILLISECONDS)) != null) {
                    synchronized (this.f4529b) {
                        pd pdVar = this.f4529b;
                        mc s13 = wbVar.s();
                        pdVar.b();
                        wb wbVar2 = (wb) pdVar.f10110b;
                        wbVar2.getClass();
                        s13.getClass();
                        wbVar2.rawAdAttestationSignal_ = s13;
                        i13 = wbVar2.bitField2_;
                        wbVar2.bitField2_ = i13 | 1073741824;
                    }
                }
                return null;
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e13) {
                this.f4530c.a(e13);
                return null;
            }
        } finally {
            this.f4530c.a();
        }
    }
}
