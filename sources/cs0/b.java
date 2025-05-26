package cs0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f53122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53123b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53124c;

    /* renamed from: d, reason: collision with root package name */
    public final a f53125d;

    public b(int i13, int i14, String str, fs0.g selectionListener) {
        Intrinsics.checkNotNullParameter(selectionListener, "selectionListener");
        this.f53122a = i13;
        this.f53123b = i14;
        this.f53124c = str;
        this.f53125d = selectionListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f53122a == bVar.f53122a && this.f53123b == bVar.f53123b && Intrinsics.d(this.f53124c, bVar.f53124c) && Intrinsics.d(this.f53125d, bVar.f53125d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f53123b, Integer.hashCode(this.f53122a) * 31, 31);
        String str = this.f53124c;
        return this.f53125d.hashCode() + ((b13 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "OverflowMenuOption(textResId=" + this.f53122a + ", iconResId=" + this.f53123b + ", description=" + this.f53124c + ", selectionListener=" + this.f53125d + ")";
    }
}
