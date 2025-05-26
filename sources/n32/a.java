package n32;

import c50.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final w2 f89165c = new w2(24);

    /* renamed from: a, reason: collision with root package name */
    public final Short f89166a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f89167b;

    public a(Short sh3, Long l13) {
        this.f89166a = sh3;
        this.f89167b = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f89166a, aVar.f89166a) && Intrinsics.d(this.f89167b, aVar.f89167b) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        Short sh3 = this.f89166a;
        int hashCode = (sh3 == null ? 0 : sh3.hashCode()) * 31;
        Long l13 = this.f89167b;
        return (hashCode + (l13 != null ? l13.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "GAMImpData(precision=" + this.f89166a + ", impDataMcr=" + this.f89167b + ", impData=null)";
    }
}
