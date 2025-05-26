package ln2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.b f84091a;

    /* renamed from: b, reason: collision with root package name */
    public final h f84092b;

    public j(ym2.b classId, h hVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f84091a = classId;
        this.f84092b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Intrinsics.d(this.f84091a, ((j) obj).f84091a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84091a.hashCode();
    }
}
