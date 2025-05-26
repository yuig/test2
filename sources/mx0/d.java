package mx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f88469a;

    public d(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f88469a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f88469a, ((d) obj).f88469a);
    }

    public final int hashCode() {
        return this.f88469a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NewsHubHideItemEvent(id="), this.f88469a, ")");
    }
}
