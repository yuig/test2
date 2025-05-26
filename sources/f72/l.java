package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* renamed from: a, reason: collision with root package name */
    public final String f61294a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61295b;

    /* renamed from: c, reason: collision with root package name */
    public final float f61296c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61297d;

    public l(int i13, String str, float f13, float f14, float f15) {
        if (15 != (i13 & 15)) {
            kg.t.b1(i13, 15, j.f61285b);
            throw null;
        }
        this.f61294a = str;
        this.f61295b = f13;
        this.f61296c = f14;
        this.f61297d = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f61294a, lVar.f61294a) && Float.compare(this.f61295b, lVar.f61295b) == 0 && Float.compare(this.f61296c, lVar.f61296c) == 0 && Float.compare(this.f61297d, lVar.f61297d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61297d) + a.a.a(this.f61296c, a.a.a(this.f61295b, this.f61294a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PriceFilterEntity(currency_type=" + this.f61294a + ", min_value=" + this.f61295b + ", max_value=" + this.f61296c + ", suggested_max_value=" + this.f61297d + ")";
    }
}
