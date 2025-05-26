package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f93566a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f93567b;

    public e0(String sectionId, q1 event) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f93566a = sectionId;
        this.f93567b = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f93566a, e0Var.f93566a) && Intrinsics.d(this.f93567b, e0Var.f93567b);
    }

    public final int hashCode() {
        return this.f93567b.hashCode() + (this.f93566a.hashCode() * 31);
    }

    public final String toString() {
        return "SectionEventById(sectionId=" + this.f93566a + ", event=" + this.f93567b + ")";
    }
}
