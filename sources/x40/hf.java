package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f132505a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132506b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132507c;

    public hf(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132505a = __typename;
        this.f132506b = str;
        this.f132507c = str2;
    }

    public final String a() {
        return this.f132507c;
    }

    public final String b() {
        return this.f132506b;
    }

    public final String c() {
        return this.f132505a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        return Intrinsics.d(this.f132505a, hfVar.f132505a) && Intrinsics.d(this.f132506b, hfVar.f132506b) && Intrinsics.d(this.f132507c, hfVar.f132507c);
    }

    public final int hashCode() {
        int hashCode = this.f132505a.hashCode() * 31;
        String str = this.f132506b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132507c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132505a);
        sb3.append(", type=");
        sb3.append(this.f132506b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132507c, ")");
    }
}
