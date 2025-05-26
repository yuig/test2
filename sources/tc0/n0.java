package tc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f117291a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117292b;

    public n0(int i13, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f117291a = i13;
        this.f117292b = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f117291a == n0Var.f117291a && Intrinsics.d(this.f117292b, n0Var.f117292b);
    }

    public final int hashCode() {
        return this.f117292b.hashCode() + (Integer.hashCode(this.f117291a) * 31);
    }

    public final String toString() {
        return "LinkDisplayState(text=" + this.f117291a + ", url=" + this.f117292b + ")";
    }
}
