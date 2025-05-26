package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends c0.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f103771a;

    /* renamed from: b, reason: collision with root package name */
    public final ve.h f103772b;

    public v(String sourceId, ve.h education) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(education, "education");
        this.f103771a = sourceId;
        this.f103772b = education;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f103771a, vVar.f103771a) && Intrinsics.d(this.f103772b, vVar.f103772b);
    }

    public final int hashCode() {
        return this.f103772b.hashCode() + (this.f103771a.hashCode() * 31);
    }

    public final String toString() {
        return "Enabled(sourceId=" + this.f103771a + ", education=" + this.f103772b + ")";
    }
}
