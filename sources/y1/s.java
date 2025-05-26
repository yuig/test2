package y1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.CancellationSignal;
import ao2.o1;
import b2.t0;
import b4.p0;
import java.util.concurrent.CancellationException;
import w1.l1;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136600b;

    public /* synthetic */ s(Object obj, int i13) {
        this.f136599a = i13;
        this.f136600b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i13 = this.f136599a;
        Object obj = this.f136600b;
        switch (i13) {
            case 0:
                t0 t0Var = (t0) obj;
                if (t0Var != null) {
                    l1 l1Var = t0Var.f21219d;
                    if (l1Var != null) {
                        l1Var.f(p0.f21639b);
                    }
                    l1 l1Var2 = t0Var.f21219d;
                    if (l1Var2 == null) {
                        return;
                    }
                    l1Var2.g(p0.f21639b);
                    return;
                }
                return;
            case 1:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                throw null;
            default:
                ((o1) obj).cancel((CancellationException) null);
                return;
        }
    }
}
