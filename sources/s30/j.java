package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f111035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111036b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f111037c;

    public j(Integer num, Integer num2, String str) {
        this.f111035a = num;
        this.f111036b = str;
        this.f111037c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f111035a, jVar.f111035a) && Intrinsics.d(this.f111036b, jVar.f111036b) && Intrinsics.d(this.f111037c, jVar.f111037c);
    }

    public final int hashCode() {
        Integer num = this.f111035a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f111036b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f111037c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Image(height=");
        sb3.append(this.f111035a);
        sb3.append(", uri=");
        sb3.append(this.f111036b);
        sb3.append(", width=");
        return a.c.i(sb3, this.f111037c, ")");
    }
}
