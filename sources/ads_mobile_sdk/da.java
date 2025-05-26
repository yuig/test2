package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class da extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final int f4212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4214c;

    /* renamed from: d, reason: collision with root package name */
    public final ca f4215d;

    public da(int i13, int i14, int i15, ca caVar) {
        this.f4212a = i13;
        this.f4213b = i14;
        this.f4214c = i15;
        this.f4215d = caVar;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f4215d != ca.f3833d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return daVar.f4212a == this.f4212a && daVar.f4213b == this.f4213b && daVar.f4214c == this.f4214c && daVar.f4215d == this.f4215d;
    }

    public final int hashCode() {
        return Objects.hash(da.class, Integer.valueOf(this.f4212a), Integer.valueOf(this.f4213b), Integer.valueOf(this.f4214c), this.f4215d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesGcm Parameters (variant: ");
        sb3.append(this.f4215d);
        sb3.append(", ");
        sb3.append(this.f4213b);
        sb3.append("-byte IV, ");
        sb3.append(this.f4214c);
        sb3.append("-byte tag, and ");
        return a.a.n(sb3, this.f4212a, "-byte key)");
    }
}
