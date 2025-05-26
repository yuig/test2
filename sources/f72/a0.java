package f72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* renamed from: a, reason: collision with root package name */
    public final String f61222a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61224c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61225d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61226e;

    /* renamed from: f, reason: collision with root package name */
    public final float f61227f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61228g;

    /* renamed from: h, reason: collision with root package name */
    public final float f61229h;

    /* renamed from: i, reason: collision with root package name */
    public final float f61230i;

    /* renamed from: j, reason: collision with root package name */
    public final String f61231j;

    public a0(int i13, String str, float f13, String str2, float f14, float f15, float f16, String str3, float f17, float f18, String str4) {
        if (1023 != (i13 & 1023)) {
            kg.t.b1(i13, 1023, y.f61414b);
            throw null;
        }
        this.f61222a = str;
        this.f61223b = f13;
        this.f61224c = str2;
        this.f61225d = f14;
        this.f61226e = f15;
        this.f61227f = f16;
        this.f61228g = str3;
        this.f61229h = f17;
        this.f61230i = f18;
        this.f61231j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f61222a, a0Var.f61222a) && Float.compare(this.f61223b, a0Var.f61223b) == 0 && Intrinsics.d(this.f61224c, a0Var.f61224c) && Float.compare(this.f61225d, a0Var.f61225d) == 0 && Float.compare(this.f61226e, a0Var.f61226e) == 0 && Float.compare(this.f61227f, a0Var.f61227f) == 0 && Intrinsics.d(this.f61228g, a0Var.f61228g) && Float.compare(this.f61229h, a0Var.f61229h) == 0 && Float.compare(this.f61230i, a0Var.f61230i) == 0 && Intrinsics.d(this.f61231j, a0Var.f61231j);
    }

    public final int hashCode() {
        return this.f61231j.hashCode() + a.a.a(this.f61230i, a.a.a(this.f61229h, cb.d(this.f61228g, a.a.a(this.f61227f, a.a.a(this.f61226e, a.a.a(this.f61225d, cb.d(this.f61224c, a.a.a(this.f61223b, this.f61222a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ShuffleFontEntity(id=" + this.f61222a + ", letter_spacing=" + this.f61223b + ", name=" + this.f61224c + ", min_size=" + this.f61225d + ", max_size=" + this.f61226e + ", line_height=" + this.f61227f + ", url=" + this.f61228g + ", offset=" + this.f61229h + ", default_size=" + this.f61230i + ", key=" + this.f61231j + ")";
    }
}
