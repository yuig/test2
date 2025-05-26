package bg;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f22775a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22776b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22778d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22779e;

    public l(int i13, String str, String str2, String str3, boolean z13) {
        this.f22775a = str;
        this.f22776b = str2;
        this.f22777c = str3;
        this.f22778d = i13;
        this.f22779e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f22778d == lVar.f22778d && Objects.equals(this.f22776b, lVar.f22776b) && Objects.equals(this.f22777c, lVar.f22777c) && Objects.equals(this.f22775a, lVar.f22775a);
    }

    public final int hashCode() {
        String str = this.f22775a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22776b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22777c;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f22778d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(this.f22777c);
        sb3.append(":");
        return a.a.n(sb3, this.f22778d, "]");
    }
}
