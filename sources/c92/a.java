package c92;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f26993a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.d f26994b;

    public a(k0 text, rm1.d dVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f26993a = text;
        this.f26994b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f26993a, aVar.f26993a) && Intrinsics.d(this.f26994b, aVar.f26994b);
    }

    public final int hashCode() {
        int hashCode = this.f26993a.hashCode() * 31;
        rm1.d dVar = this.f26994b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TargetBenefitSection(text=" + this.f26993a + ", icon=" + this.f26994b + ")";
    }
}
