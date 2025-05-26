package ys0;

import kotlin.jvm.internal.Intrinsics;
import o82.a0;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f140111a;

    public b(a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f140111a = multiSectionDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f140111a, ((b) obj).f140111a);
    }

    public final int hashCode() {
        return this.f140111a.f93524a.hashCode();
    }

    public final String toString() {
        return "SbaHftBoardsTabDisplayState(multiSectionDisplayState=" + this.f140111a + ")";
    }
}
