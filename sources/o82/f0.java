package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93579a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f93580b;

    public f0(int i13, q1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f93579a = i13;
        this.f93580b = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f93579a == f0Var.f93579a && Intrinsics.d(this.f93580b, f0Var.f93580b);
    }

    public final int hashCode() {
        return this.f93580b.hashCode() + (Integer.hashCode(this.f93579a) * 31);
    }

    public final String toString() {
        return "SectionEventByIndex(sectionIndex=" + this.f93579a + ", event=" + this.f93580b + ")";
    }
}
