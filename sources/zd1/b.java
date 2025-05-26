package zd1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f141682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141683b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141684c;

    /* renamed from: d, reason: collision with root package name */
    public final String f141685d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f141686e;

    /* renamed from: f, reason: collision with root package name */
    public final int f141687f;

    public /* synthetic */ b(String str, String str2, String str3, String str4, boolean z13, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? false : z13, i13);
    }

    @Override // dl1.s
    public final String b() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f141682a, bVar.f141682a) && Intrinsics.d(this.f141683b, bVar.f141683b) && Intrinsics.d(this.f141684c, bVar.f141684c) && Intrinsics.d(this.f141685d, bVar.f141685d) && this.f141686e == bVar.f141686e && this.f141687f == bVar.f141687f;
    }

    public final int hashCode() {
        String str = this.f141682a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f141683b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141684c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141685d;
        return Integer.hashCode(this.f141687f) + ep.b.e(this.f141686e, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        boolean z13 = this.f141686e;
        StringBuilder sb3 = new StringBuilder("ColorFilterItem(topLeftColorHexString=");
        sb3.append(this.f141682a);
        sb3.append(", topRightColorHexString=");
        sb3.append(this.f141683b);
        sb3.append(", bottomLeftColorHexString=");
        sb3.append(this.f141684c);
        sb3.append(", bottomRightColorHexString=");
        sb3.append(this.f141685d);
        sb3.append(", isSelected=");
        sb3.append(z13);
        sb3.append(", index=");
        return a.a.n(sb3, this.f141687f, ")");
    }

    public b(String str, String str2, String str3, String str4, boolean z13, int i13) {
        this.f141682a = str;
        this.f141683b = str2;
        this.f141684c = str3;
        this.f141685d = str4;
        this.f141686e = z13;
        this.f141687f = i13;
    }
}
