package y01;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List f136504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f136506c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f136507d;

    /* renamed from: e, reason: collision with root package name */
    public final String f136508e;

    /* renamed from: f, reason: collision with root package name */
    public final String f136509f;

    public z(List pins, String baseUrl, String str, Integer num, String str2, String str3) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f136504a = pins;
        this.f136505b = baseUrl;
        this.f136506c = str;
        this.f136507d = num;
        this.f136508e = str2;
        this.f136509f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f136504a, zVar.f136504a) && Intrinsics.d(this.f136505b, zVar.f136505b) && Intrinsics.d(this.f136506c, zVar.f136506c) && Intrinsics.d(this.f136507d, zVar.f136507d) && Intrinsics.d(this.f136508e, zVar.f136508e) && Intrinsics.d(this.f136509f, zVar.f136509f);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f136505b, this.f136504a.hashCode() * 31, 31);
        String str = this.f136506c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f136507d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f136508e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f136509f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinFeedVMState(pins=");
        sb3.append(this.f136504a);
        sb3.append(", baseUrl=");
        sb3.append(this.f136505b);
        sb3.append(", bookmark=");
        sb3.append(this.f136506c);
        sb3.append(", code=");
        sb3.append(this.f136507d);
        sb3.append(", status=");
        sb3.append(this.f136508e);
        sb3.append(", message=");
        return a.a.p(sb3, this.f136509f, ")");
    }

    public z() {
        this(kotlin.collections.q0.f80391a, "", null, 0, null, null);
    }
}
