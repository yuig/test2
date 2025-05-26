package ha2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f68473a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f68474b;

    public t(int i13, br0.e action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f68473a = i13;
        this.f68474b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f68473a == tVar.f68473a && Intrinsics.d(this.f68474b, tVar.f68474b);
    }

    @Override // ha2.n
    public final int getViewType() {
        return 1;
    }

    public final int hashCode() {
        return this.f68474b.hashCode() + (Integer.hashCode(this.f68473a) * 31);
    }

    public final String toString() {
        return "ActionSheetListOption(titleResId=" + this.f68473a + ", action=" + this.f68474b + ")";
    }
}
