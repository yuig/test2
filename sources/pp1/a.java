package pp1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f100911a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.d f100912b;

    public a(k0 text, rm1.d dVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f100911a = text;
        this.f100912b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f100911a, aVar.f100911a) && Intrinsics.d(this.f100912b, aVar.f100912b);
    }

    public final int hashCode() {
        int hashCode = this.f100911a.hashCode() * 31;
        rm1.d dVar = this.f100912b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "BenefitSection(text=" + this.f100911a + ", icon=" + this.f100912b + ")";
    }
}
