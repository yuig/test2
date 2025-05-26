package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1 extends z1 {

    /* renamed from: g, reason: collision with root package name */
    public static final y1 f106720g;

    /* renamed from: a, reason: collision with root package name */
    public final String f106721a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f106722b;

    /* renamed from: c, reason: collision with root package name */
    public final double f106723c;

    /* renamed from: d, reason: collision with root package name */
    public final double f106724d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f106725e;

    /* renamed from: f, reason: collision with root package name */
    public final l2 f106726f;

    static {
        int i13 = a2.f106437b;
        f106720g = new y1("none", l1.f106534c, 1.0d, 0.0d, k0.f106512o, l2.f106537h);
    }

    public y1(String id3, l1 offset, double d2, double d13, k0 effectData, l2 text) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(effectData, "effectData");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f106721a = id3;
        this.f106722b = offset;
        this.f106723c = d2;
        this.f106724d = d13;
        this.f106725e = effectData;
        this.f106726f = text;
    }

    public static y1 f(y1 y1Var, String str, l1 l1Var, double d2, double d13, k0 k0Var, l2 l2Var, int i13) {
        String id3 = (i13 & 1) != 0 ? y1Var.f106721a : str;
        l1 offset = (i13 & 2) != 0 ? y1Var.f106722b : l1Var;
        double d14 = (i13 & 4) != 0 ? y1Var.f106723c : d2;
        double d15 = (i13 & 8) != 0 ? y1Var.f106724d : d13;
        k0 effectData = (i13 & 16) != 0 ? y1Var.f106725e : k0Var;
        l2 text = (i13 & 32) != 0 ? y1Var.f106726f : l2Var;
        y1Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(effectData, "effectData");
        Intrinsics.checkNotNullParameter(text, "text");
        return new y1(id3, offset, d14, d15, effectData, text);
    }

    @Override // r72.z1
    public final k0 a() {
        return this.f106725e;
    }

    @Override // r72.z1
    public final String b() {
        return this.f106721a;
    }

    @Override // r72.z1
    public final l1 c() {
        return this.f106722b;
    }

    @Override // r72.z1
    public final double d() {
        return this.f106724d;
    }

    @Override // r72.z1
    public final double e() {
        return this.f106723c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        String str = y1Var.f106721a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f106721a, str) && Intrinsics.d(this.f106722b, y1Var.f106722b) && Double.compare(this.f106723c, y1Var.f106723c) == 0 && Double.compare(this.f106724d, y1Var.f106724d) == 0 && Intrinsics.d(this.f106725e, y1Var.f106725e) && Intrinsics.d(this.f106726f, y1Var.f106726f);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f106726f.hashCode() + ((this.f106725e.hashCode() + a.c.a(this.f106724d, a.c.a(this.f106723c, (this.f106722b.hashCode() + (this.f106721a.hashCode() * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "Text(id=" + a2.a(this.f106721a) + ", offset=" + this.f106722b + ", scale=" + this.f106723c + ", rotation=" + this.f106724d + ", effectData=" + this.f106725e + ", text=" + this.f106726f + ")";
    }
}
