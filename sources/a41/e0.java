package a41;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f584d = new e0(new yl1.g(0, 0), "", o.f639l);

    /* renamed from: a, reason: collision with root package name */
    public final String f585a;

    /* renamed from: b, reason: collision with root package name */
    public final yl1.g f586b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f587c;

    public e0(yl1.g colorPalette, String buttonText, Function0 onClickListener) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f585a = buttonText;
        this.f586b = colorPalette;
        this.f587c = onClickListener;
    }

    public final boolean a() {
        if (!Intrinsics.d(this, f584d)) {
            yl1.g gVar = this.f586b;
            if (gVar.f139324a > 0 || gVar.f139325b > 0 || !kotlin.text.z.j(this.f585a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f585a, e0Var.f585a) && Intrinsics.d(this.f586b, e0Var.f586b) && Intrinsics.d(this.f587c, e0Var.f587c);
    }

    public final int hashCode() {
        return this.f587c.hashCode() + ((this.f586b.hashCode() + (this.f585a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionButton(buttonText=");
        sb3.append(this.f585a);
        sb3.append(", colorPalette=");
        sb3.append(this.f586b);
        sb3.append(", onClickListener=");
        return pk2.f.i(sb3, this.f587c, ")");
    }
}
