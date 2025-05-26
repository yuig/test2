package hx;

import com.pinterest.api.model.h2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f70496a;

    /* renamed from: b, reason: collision with root package name */
    public final h2 f70497b;

    public a(String pinUid, h2 h2Var) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f70496a = pinUid;
        this.f70497b = h2Var;
    }

    public final h2 a() {
        return this.f70497b;
    }

    public final String b() {
        return this.f70496a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f70496a, aVar.f70496a) && Intrinsics.d(this.f70497b, aVar.f70497b);
    }

    public final int hashCode() {
        int hashCode = this.f70496a.hashCode() * 31;
        h2 h2Var = this.f70497b;
        return hashCode + (h2Var == null ? 0 : h2Var.hashCode());
    }

    public final String toString() {
        return "CategoryTapEvent(pinUid=" + this.f70496a + ", category=" + this.f70497b + ")";
    }
}
