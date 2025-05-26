package xm0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f135355a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f135356b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f135357c;

    public d(i0 title, i0 description, i0 ctaLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ctaLabel, "ctaLabel");
        this.f135355a = title;
        this.f135356b = description;
        this.f135357c = ctaLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [u50.i0] */
    public static d a(d dVar, i0 description, k0 k0Var, int i13) {
        i0 title = dVar.f135355a;
        k0 ctaLabel = k0Var;
        if ((i13 & 4) != 0) {
            ctaLabel = dVar.f135357c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ctaLabel, "ctaLabel");
        return new d(title, description, ctaLabel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f135355a, dVar.f135355a) && Intrinsics.d(this.f135356b, dVar.f135356b) && Intrinsics.d(this.f135357c, dVar.f135357c);
    }

    public final int hashCode() {
        return this.f135357c.hashCode() + ep.b.d(this.f135356b, this.f135355a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinSelectionHeaderDisplayState(title=");
        sb3.append(this.f135355a);
        sb3.append(", description=");
        sb3.append(this.f135356b);
        sb3.append(", ctaLabel=");
        return jq.b.k(sb3, this.f135357c, ")");
    }
}
