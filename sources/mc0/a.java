package mc0;

import a.c;
import b4.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f86904a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f86905b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f86906c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f86907d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f86908e;

    public a(q0 labelTextStyle, q0 placeholderTextStyle, q0 helperTextStyle, q0 errorTextStyle, q0 textTextStyle) {
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        Intrinsics.checkNotNullParameter(placeholderTextStyle, "placeholderTextStyle");
        Intrinsics.checkNotNullParameter(helperTextStyle, "helperTextStyle");
        Intrinsics.checkNotNullParameter(errorTextStyle, "errorTextStyle");
        Intrinsics.checkNotNullParameter(textTextStyle, "textTextStyle");
        this.f86904a = labelTextStyle;
        this.f86905b = placeholderTextStyle;
        this.f86906c = helperTextStyle;
        this.f86907d = errorTextStyle;
        this.f86908e = textTextStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86904a, aVar.f86904a) && Intrinsics.d(this.f86905b, aVar.f86905b) && Intrinsics.d(this.f86906c, aVar.f86906c) && Intrinsics.d(this.f86907d, aVar.f86907d) && Intrinsics.d(this.f86908e, aVar.f86908e);
    }

    public final int hashCode() {
        return this.f86908e.hashCode() + c.c(this.f86907d, c.c(this.f86906c, c.c(this.f86905b, this.f86904a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "PinterestTextFieldTextStyles(labelTextStyle=" + this.f86904a + ", placeholderTextStyle=" + this.f86905b + ", helperTextStyle=" + this.f86906c + ", errorTextStyle=" + this.f86907d + ", textTextStyle=" + this.f86908e + ")";
    }
}
