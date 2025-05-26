package mx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f88470a;

    public e(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f88470a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f88470a, ((e) obj).f88470a);
    }

    public final int hashCode() {
        return this.f88470a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NewsHubItemClickedEvent(id="), this.f88470a, ")");
    }
}
