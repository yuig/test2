package v91;

import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f124973a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f124974b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f124975c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f124976d;

    public a(boolean z13, k0 k0Var, k0 k0Var2, boolean z14) {
        this.f124973a = z13;
        this.f124974b = k0Var;
        this.f124975c = k0Var2;
        this.f124976d = z14;
    }

    public static a e(a aVar, boolean z13, k0 k0Var, k0 k0Var2, boolean z14, int i13) {
        if ((i13 & 1) != 0) {
            z13 = aVar.f124973a;
        }
        if ((i13 & 2) != 0) {
            k0Var = aVar.f124974b;
        }
        if ((i13 & 4) != 0) {
            k0Var2 = aVar.f124975c;
        }
        if ((i13 & 8) != 0) {
            z14 = aVar.f124976d;
        }
        aVar.getClass();
        return new a(z13, k0Var, k0Var2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f124973a == aVar.f124973a && Intrinsics.d(this.f124974b, aVar.f124974b) && Intrinsics.d(this.f124975c, aVar.f124975c) && this.f124976d == aVar.f124976d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f124973a) * 31;
        k0 k0Var = this.f124974b;
        int hashCode2 = (hashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        k0 k0Var2 = this.f124975c;
        return Boolean.hashCode(this.f124976d) + ((hashCode2 + (k0Var2 != null ? k0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AutoOrgOptInDisplayState(isLoading=" + this.f124973a + ", connectedToSubtitle=" + this.f124974b + ", toggleLabel=" + this.f124975c + ", toggleChecked=" + this.f124976d + ")";
    }
}
