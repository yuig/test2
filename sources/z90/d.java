package z90;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final q f141345a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f141346b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f141347c;

    public d(i0 label, q icon, boolean z13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f141345a = icon;
        this.f141346b = label;
        this.f141347c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f141345a == dVar.f141345a && Intrinsics.d(this.f141346b, dVar.f141346b) && this.f141347c == dVar.f141347c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141347c) + ep.b.d(this.f141346b, this.f141345a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectCategoryTabState(icon=");
        sb3.append(this.f141345a);
        sb3.append(", label=");
        sb3.append(this.f141346b);
        sb3.append(", selected=");
        return a.a.r(sb3, this.f141347c, ")");
    }
}
