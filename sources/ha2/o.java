package ha2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f68464a;

    public o(Integer num) {
        this.f68464a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f68464a, ((o) obj).f68464a);
    }

    @Override // ha2.n
    public final int getViewType() {
        return 0;
    }

    public final int hashCode() {
        Integer num = this.f68464a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ActionSheetListLabel(labelResId=" + this.f68464a + ")";
    }
}
