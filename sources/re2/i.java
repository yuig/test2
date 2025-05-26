package re2;

import kotlin.jvm.internal.Intrinsics;
import wo2.m;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final vb0.i f107703e = new vb0.i(15);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f107704a;

    /* renamed from: b, reason: collision with root package name */
    public final Short f107705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f107706c;

    /* renamed from: d, reason: collision with root package name */
    public final m f107707d;

    public i(Integer num, Short sh3, String str, m mVar) {
        this.f107704a = num;
        this.f107705b = sh3;
        this.f107706c = str;
        this.f107707d = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f107704a, iVar.f107704a) && Intrinsics.d(this.f107705b, iVar.f107705b) && Intrinsics.d(this.f107706c, iVar.f107706c) && Intrinsics.d(this.f107707d, iVar.f107707d);
    }

    public final int hashCode() {
        Integer num = this.f107704a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Short sh3 = this.f107705b;
        int hashCode2 = (hashCode + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str = this.f107706c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.f107707d;
        return hashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "Endpoint(ipv4=" + this.f107704a + ", port=" + this.f107705b + ", service_name=" + this.f107706c + ", ipv6=" + this.f107707d + ")";
    }
}
