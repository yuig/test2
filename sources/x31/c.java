package x31;

import kotlin.jvm.internal.Intrinsics;
import zy.a0;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f131617a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f131618b;

    public c(b componentDisplayState, a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(componentDisplayState, "componentDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f131617a = componentDisplayState;
        this.f131618b = pinalyticsDisplayState;
    }

    public static c e(c cVar, b componentDisplayState, a0 pinalyticsDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            componentDisplayState = cVar.f131617a;
        }
        if ((i13 & 2) != 0) {
            pinalyticsDisplayState = cVar.f131618b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(componentDisplayState, "componentDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new c(componentDisplayState, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f131617a, cVar.f131617a) && Intrinsics.d(this.f131618b, cVar.f131618b);
    }

    public final int hashCode() {
        return this.f131618b.hashCode() + (this.f131617a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterBarDisplayState(componentDisplayState=" + this.f131617a + ", pinalyticsDisplayState=" + this.f131618b + ")";
    }

    public c(b bVar) {
        this(bVar, new a0());
    }
}
