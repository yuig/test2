package eu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f60157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60158b;

    public w(int i13, f30 f30Var) {
        this.f60157a = f30Var;
        this.f60158b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f60157a, wVar.f60157a) && this.f60158b == wVar.f60158b;
    }

    public final int hashCode() {
        f30 f30Var = this.f60157a;
        return Integer.hashCode(this.f60158b) + ((f30Var == null ? 0 : f30Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ProductImpressionStartEvent(product=" + this.f60157a + ", position=" + this.f60158b + ")";
    }
}
