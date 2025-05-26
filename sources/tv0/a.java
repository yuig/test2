package tv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f119500a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.c f119501b;

    /* renamed from: c, reason: collision with root package name */
    public final om1.f f119502c;

    /* renamed from: d, reason: collision with root package name */
    public final vn1.c f119503d;

    public a(int i13, vn1.c titleColor, om1.f iconStyle, vn1.c subtitleColor) {
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
        Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
        this.f119500a = i13;
        this.f119501b = titleColor;
        this.f119502c = iconStyle;
        this.f119503d = subtitleColor;
    }

    public final int a() {
        return this.f119500a;
    }

    public final vn1.c b() {
        return this.f119501b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f119500a == aVar.f119500a && this.f119501b == aVar.f119501b && this.f119502c == aVar.f119502c && this.f119503d == aVar.f119503d;
    }

    public final int hashCode() {
        return this.f119503d.hashCode() + ((this.f119502c.hashCode() + ((this.f119501b.hashCode() + (Integer.hashCode(this.f119500a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AtMentionPageColorParams(pageColor=" + this.f119500a + ", titleColor=" + this.f119501b + ", iconStyle=" + this.f119502c + ", subtitleColor=" + this.f119503d + ")";
    }
}
