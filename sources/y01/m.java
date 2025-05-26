package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136434a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f136435b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f136436c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f136437d;

    public m(boolean z13, Integer num, Integer num2, Integer num3) {
        this.f136434a = z13;
        this.f136435b = num;
        this.f136436c = num2;
        this.f136437d = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        mVar.getClass();
        return this.f136434a == mVar.f136434a && Intrinsics.d(this.f136435b, mVar.f136435b) && Intrinsics.d(this.f136436c, mVar.f136436c) && Intrinsics.d(this.f136437d, mVar.f136437d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f136434a, Boolean.hashCode(true) * 31, 31);
        Integer num = this.f136435b;
        int hashCode = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f136436c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f136437d;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogOnActivate(viewAdapterExists=true, isResumed=");
        sb3.append(this.f136434a);
        sb3.append(", viewAdapterCount=");
        sb3.append(this.f136435b);
        sb3.append(", pinFeedCount=");
        sb3.append(this.f136436c);
        sb3.append(", pinFeedAbsCount=");
        return a.c.i(sb3, this.f136437d, ")");
    }
}
