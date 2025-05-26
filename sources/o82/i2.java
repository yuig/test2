package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i2 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f93619a;

    /* renamed from: b, reason: collision with root package name */
    public final m f93620b;

    public /* synthetic */ i2(Object obj, int i13) {
        this((i13 & 1) != 0 ? null : obj, l.f93651a);
    }

    public static i2 b(i2 i2Var, Object obj, m hiddenState, int i13) {
        if ((i13 & 1) != 0) {
            obj = i2Var.f93619a;
        }
        if ((i13 & 2) != 0) {
            hiddenState = i2Var.f93620b;
        }
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(hiddenState, "hiddenState");
        return new i2(obj, hiddenState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.d(this.f93619a, i2Var.f93619a) && Intrinsics.d(this.f93620b, i2Var.f93620b);
    }

    public final int hashCode() {
        Object obj = this.f93619a;
        return this.f93620b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionVMState(args=" + this.f93619a + ", hiddenState=" + this.f93620b + ")";
    }

    public i2(Object obj, m hiddenState) {
        Intrinsics.checkNotNullParameter(hiddenState, "hiddenState");
        this.f93619a = obj;
        this.f93620b = hiddenState;
    }
}
