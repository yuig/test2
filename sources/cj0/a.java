package cj0;

import android.graphics.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f27776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27777b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f27778c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f27779d;

    public a(int i13, int i14, Point titlePositionInWindow, Point toolbarPositionInWindow) {
        Intrinsics.checkNotNullParameter(titlePositionInWindow, "titlePositionInWindow");
        Intrinsics.checkNotNullParameter(toolbarPositionInWindow, "toolbarPositionInWindow");
        this.f27776a = i13;
        this.f27777b = i14;
        this.f27778c = titlePositionInWindow;
        this.f27779d = toolbarPositionInWindow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27776a == aVar.f27776a && this.f27777b == aVar.f27777b && Intrinsics.d(this.f27778c, aVar.f27778c) && Intrinsics.d(this.f27779d, aVar.f27779d);
    }

    public final int hashCode() {
        return this.f27779d.hashCode() + ((this.f27778c.hashCode() + ep.b.b(this.f27777b, Integer.hashCode(this.f27776a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "AppBarOffsetChanged(offset=" + this.f27776a + ", titleHeight=" + this.f27777b + ", titlePositionInWindow=" + this.f27778c + ", toolbarPositionInWindow=" + this.f27779d + ")";
    }
}
