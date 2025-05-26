package iz0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f73897a;

    /* renamed from: b, reason: collision with root package name */
    public final yk1.i f73898b;

    public b(o82.a0 multiSectionDisplayState, yk1.i loadState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        this.f73897a = multiSectionDisplayState;
        this.f73898b = loadState;
    }

    public static b e(b bVar, o82.a0 multiSectionDisplayState, yk1.i loadState, int i13) {
        if ((i13 & 1) != 0) {
            multiSectionDisplayState = bVar.f73897a;
        }
        if ((i13 & 2) != 0) {
            loadState = bVar.f73898b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return new b(multiSectionDisplayState, loadState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f73897a, bVar.f73897a) && this.f73898b == bVar.f73898b;
    }

    public final int hashCode() {
        return this.f73898b.hashCode() + (this.f73897a.f93524a.hashCode() * 31);
    }

    public final String toString() {
        return "PearQuizResultDisplayState(multiSectionDisplayState=" + this.f73897a + ", loadState=" + this.f73898b + ")";
    }
}
