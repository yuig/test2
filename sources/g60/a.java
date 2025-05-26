package g60;

import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f63691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63692b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63693c;

    /* renamed from: d, reason: collision with root package name */
    public final String f63694d;

    /* renamed from: e, reason: collision with root package name */
    public final String f63695e;

    /* renamed from: f, reason: collision with root package name */
    public final int f63696f;

    public a(int i13, int i14, String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f63691a = name;
        this.f63692b = i13;
        this.f63693c = str;
        this.f63694d = str2;
        this.f63695e = str3;
        this.f63696f = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f63691a, aVar.f63691a) && this.f63692b == aVar.f63692b && Intrinsics.d(this.f63693c, aVar.f63693c) && Intrinsics.d(this.f63694d, aVar.f63694d) && Intrinsics.d(this.f63695e, aVar.f63695e) && this.f63696f == aVar.f63696f;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f63692b, this.f63691a.hashCode() * 31, 31);
        String str = this.f63693c;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63694d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63695e;
        return Integer.hashCode(this.f63696f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinClusterDisplayState(name=");
        sb3.append(this.f63691a);
        sb3.append(", pinCount=");
        sb3.append(this.f63692b);
        sb3.append(", primaryImage=");
        sb3.append(this.f63693c);
        sb3.append(", secondaryImageTop=");
        sb3.append(this.f63694d);
        sb3.append(", secondaryImageBottom=");
        sb3.append(this.f63695e);
        sb3.append(", buttonLabelId=");
        return a.a.n(sb3, this.f63696f, ")");
    }
}
