package ek1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f59368a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59369b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59370c;

    /* renamed from: d, reason: collision with root package name */
    public final cs.c f59371d;

    /* renamed from: e, reason: collision with root package name */
    public final float f59372e;

    public s1(List chips, boolean z13, boolean z14, cs.c collectionDpaLayoutType, float f13) {
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(collectionDpaLayoutType, "collectionDpaLayoutType");
        this.f59368a = chips;
        this.f59369b = z13;
        this.f59370c = z14;
        this.f59371d = collectionDpaLayoutType;
        this.f59372e = f13;
    }

    public final List a() {
        return this.f59368a;
    }

    public final cs.c b() {
        return this.f59371d;
    }

    public final boolean c() {
        return this.f59370c;
    }

    public final boolean d() {
        return this.f59369b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.d(this.f59368a, s1Var.f59368a) && this.f59369b == s1Var.f59369b && this.f59370c == s1Var.f59370c && this.f59371d == s1Var.f59371d && Float.compare(this.f59372e, s1Var.f59372e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f59372e) + ((this.f59371d.hashCode() + ep.b.e(this.f59370c, ep.b.e(this.f59369b, this.f59368a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HasChips(chips=");
        sb3.append(this.f59368a);
        sb3.append(", isDirectLinkCollection=");
        sb3.append(this.f59369b);
        sb3.append(", isDLCollectionWithIcon=");
        sb3.append(this.f59370c);
        sb3.append(", collectionDpaLayoutType=");
        sb3.append(this.f59371d);
        sb3.append(", chipAspectRatio=");
        return d7.g.i(sb3, this.f59372e, ")");
    }
}
