package ad2;

import kotlin.jvm.internal.Intrinsics;
import o82.a0;

/* loaded from: classes4.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f2092a;

    public b(a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f2092a = multiSectionDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f2092a, ((b) obj).f2092a);
    }

    public final int hashCode() {
        return this.f2092a.f93524a.hashCode();
    }

    public final String toString() {
        return "WidgetBoardSelectionDisplayState(multiSectionDisplayState=" + this.f2092a + ")";
    }
}
