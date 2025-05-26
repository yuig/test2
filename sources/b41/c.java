package b41;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk2.f;
import yl1.g;
import yl1.i;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final g f21775a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21776b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f21777c;

    public c(int i13, String displayText, Function0 onClickAction) {
        g colorPalette = i.b();
        onClickAction = (i13 & 4) != 0 ? b.f21774i : onClickAction;
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        this.f21775a = colorPalette;
        this.f21776b = displayText;
        this.f21777c = onClickAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f21775a, cVar.f21775a) && Intrinsics.d(this.f21776b, cVar.f21776b) && Intrinsics.d(this.f21777c, cVar.f21777c);
    }

    public final int hashCode() {
        return this.f21777c.hashCode() + cb.d(this.f21776b, this.f21775a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionItem(colorPalette=");
        sb3.append(this.f21775a);
        sb3.append(", displayText=");
        sb3.append(this.f21776b);
        sb3.append(", onClickAction=");
        return f.i(sb3, this.f21777c, ")");
    }
}
