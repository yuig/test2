package ma1;

import kotlin.jvm.internal.Intrinsics;
import o82.a0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f86780a;

    public d(a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f86780a = multiSectionDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f86780a, ((d) obj).f86780a);
    }

    public final int hashCode() {
        return this.f86780a.f93524a.hashCode();
    }

    public final String toString() {
        return "ConnectedDevicesDisplayState(multiSectionDisplayState=" + this.f86780a + ")";
    }

    public /* synthetic */ d() {
        this(new a0());
    }
}
