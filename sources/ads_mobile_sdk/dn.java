package ads_mobile_sdk;

import a.j9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dn implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4350b;

    /* renamed from: c, reason: collision with root package name */
    public final nm.u f4351c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4352d;

    public dn(String str, String str2, nm.u uVar, long j13) {
        this.f4349a = str;
        this.f4350b = str2;
        this.f4351c = uVar;
        this.f4352d = j13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        nm.q qVar;
        Intrinsics.checkNotNullParameter(signals, "signals");
        String str = this.f4349a;
        signals.adUnitRequestSignals = str;
        signals.commonCldSignals = this.f4350b;
        signals.commonCldSignalsObject = this.f4351c;
        signals.timeSinceCldUpdate = this.f4352d;
        if (str != null) {
            try {
                nm.u uVar = (nm.u) new nm.o().b(nm.u.class, this.f4349a);
                qVar = new nm.q();
                qVar.t(uVar);
            } catch (Exception e13) {
                List list = c0.d.f(e13, e13).f6994p;
                String message = e13.getMessage();
                if (message == null) {
                    message = e13.getClass().getName();
                }
                list.add(message);
                qVar = null;
            }
            signals.adUnitRequestSignalsObject = qVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return Intrinsics.d(this.f4349a, dnVar.f4349a) && Intrinsics.d(this.f4350b, dnVar.f4350b) && Intrinsics.d(this.f4351c, dnVar.f4351c) && this.f4352d == dnVar.f4352d;
    }

    public final int hashCode() {
        String str = this.f4349a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4350b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        nm.u uVar = this.f4351c;
        return Long.hashCode(this.f4352d) + ((hashCode2 + (uVar != null ? uVar.f91366a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f4349a;
        String str2 = this.f4350b;
        nm.u uVar = this.f4351c;
        long j13 = this.f4352d;
        StringBuilder w13 = a.a.w("CldSignal(adUnitRequestSignals=", str, ", commonCldSignals=", str2, ", commonCldObject=");
        w13.append(uVar);
        w13.append(", timeSinceCldUpdateInMs=");
        w13.append(j13);
        w13.append(")");
        return w13.toString();
    }
}
