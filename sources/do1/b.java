package do1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f55663a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f55664b;

    public b(i0 text, Function0 buttonClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttonClick, "buttonClick");
        this.f55663a = text;
        this.f55664b = buttonClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f55663a, bVar.f55663a) && Intrinsics.d(this.f55664b, bVar.f55664b);
    }

    public final int hashCode() {
        return this.f55664b.hashCode() + (this.f55663a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButton(text=" + this.f55663a + ", buttonClick=" + this.f55664b + ")";
    }
}
