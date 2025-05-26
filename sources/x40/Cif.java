package x40;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x40.if, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cif {

    /* renamed from: a, reason: collision with root package name */
    public final String f132573a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132574b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132575c;

    public Cif(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132573a = __typename;
        this.f132574b = num;
        this.f132575c = num2;
    }

    public final Integer a() {
        return this.f132575c;
    }

    public final Integer b() {
        return this.f132574b;
    }

    public final String c() {
        return this.f132573a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cif)) {
            return false;
        }
        Cif cif = (Cif) obj;
        return Intrinsics.d(this.f132573a, cif.f132573a) && Intrinsics.d(this.f132574b, cif.f132574b) && Intrinsics.d(this.f132575c, cif.f132575c);
    }

    public final int hashCode() {
        int hashCode = this.f132573a.hashCode() * 31;
        Integer num = this.f132574b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132575c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f132573a);
        sb3.append(", width=");
        sb3.append(this.f132574b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132575c, ")");
    }
}
