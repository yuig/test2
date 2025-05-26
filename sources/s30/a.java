package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f111018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111019b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f111020c;

    public a(Integer num, Integer num2, String str) {
        this.f111018a = num;
        this.f111019b = str;
        this.f111020c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f111018a, aVar.f111018a) && Intrinsics.d(this.f111019b, aVar.f111019b) && Intrinsics.d(this.f111020c, aVar.f111020c);
    }

    public final int hashCode() {
        Integer num = this.f111018a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f111019b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f111020c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Image(height=");
        sb3.append(this.f111018a);
        sb3.append(", uri=");
        sb3.append(this.f111019b);
        sb3.append(", width=");
        return a.c.i(sb3, this.f111020c, ")");
    }
}
