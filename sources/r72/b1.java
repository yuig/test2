package r72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106443b;

    public b1(String id3, String str) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f106442a = id3;
        this.f106443b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f106442a;
        int i13 = c1.f106451a;
        return Intrinsics.d(this.f106442a, str) && Intrinsics.d(this.f106443b, b1Var.f106443b);
    }

    public final int hashCode() {
        int i13 = c1.f106451a;
        int hashCode = this.f106442a.hashCode() * 31;
        String str = this.f106443b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i13 = c1.f106451a;
        return a.a.p(cb.o("ItemImage(id=", a.a.p(new StringBuilder("ItemImageId(value="), this.f106442a, ")"), ", imageTrackingId="), this.f106443b, ")");
    }
}
