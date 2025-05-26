package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tr2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f11650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11651b;

    public /* synthetic */ tr2(Integer num, int i13) {
        this((i13 & 1) != 0 ? null : num, (String) null);
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.topics = this.f11651b;
        signals.topicsApiStatus = this.f11650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr2)) {
            return false;
        }
        tr2 tr2Var = (tr2) obj;
        return Intrinsics.d(this.f11650a, tr2Var.f11650a) && Intrinsics.d(this.f11651b, tr2Var.f11651b);
    }

    public final int hashCode() {
        Integer num = this.f11650a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f11651b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TopicsSignal(topicsApiStatus=" + this.f11650a + ", topics=" + this.f11651b + ")";
    }

    public tr2(Integer num, String str) {
        this.f11650a = num;
        this.f11651b = str;
    }
}
