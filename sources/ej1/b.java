package ej1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f59099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59101c;

    public b(i0 disclosureText, String partnerEntityName, boolean z13) {
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        Intrinsics.checkNotNullParameter(partnerEntityName, "partnerEntityName");
        this.f59099a = disclosureText;
        this.f59100b = partnerEntityName;
        this.f59101c = z13;
    }

    public final String a() {
        return this.f59100b;
    }

    public final boolean b() {
        return this.f59101c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f59099a, bVar.f59099a) && Intrinsics.d(this.f59100b, bVar.f59100b) && this.f59101c == bVar.f59101c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59101c) + cb.d(this.f59100b, this.f59099a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinDisclosureTextState(disclosureText=");
        sb3.append(this.f59099a);
        sb3.append(", partnerEntityName=");
        sb3.append(this.f59100b);
        sb3.append(", isSimplerAdIdeaPaidPartnership=");
        return a.a.r(sb3, this.f59101c, ")");
    }
}
