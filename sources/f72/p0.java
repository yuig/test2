package f72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final String f61332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61333b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61334c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61336e;

    /* renamed from: f, reason: collision with root package name */
    public final int f61337f;

    public p0(int i13, String str, String str2, String str3, float f13, int i14, int i15) {
        if (59 != (i13 & 59)) {
            kg.t.b1(i13, 59, n0.f61321b);
            throw null;
        }
        this.f61332a = str;
        this.f61333b = str2;
        if ((i13 & 4) == 0) {
            this.f61334c = null;
        } else {
            this.f61334c = str3;
        }
        this.f61335d = f13;
        this.f61336e = i14;
        this.f61337f = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f61332a, p0Var.f61332a) && Intrinsics.d(this.f61333b, p0Var.f61333b) && Intrinsics.d(this.f61334c, p0Var.f61334c) && Float.compare(this.f61335d, p0Var.f61335d) == 0 && this.f61336e == p0Var.f61336e && this.f61337f == p0Var.f61337f;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f61333b, this.f61332a.hashCode() * 31, 31);
        String str = this.f61334c;
        return Integer.hashCode(this.f61337f) + ep.b.b(this.f61336e, a.a.a(this.f61335d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleItemTextEntity(text=");
        sb3.append(this.f61332a);
        sb3.append(", color_hex=");
        sb3.append(this.f61333b);
        sb3.append(", background_color_hex=");
        sb3.append(this.f61334c);
        sb3.append(", font_size=");
        sb3.append(this.f61335d);
        sb3.append(", font_type=");
        sb3.append(this.f61336e);
        sb3.append(", alignment=");
        return a.a.n(sb3, this.f61337f, ")");
    }

    public p0(String text, String color_hex, String str, float f13, int i13, int i14) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color_hex, "color_hex");
        this.f61332a = text;
        this.f61333b = color_hex;
        this.f61334c = str;
        this.f61335d = f13;
        this.f61336e = i13;
        this.f61337f = i14;
    }
}
