package kc1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final m f79166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79167b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f79168c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f79169d;

    public n(m selection, int i13, Boolean bool, o82.a0 listDisplayState) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        this.f79166a = selection;
        this.f79167b = i13;
        this.f79168c = bool;
        this.f79169d = listDisplayState;
    }

    public static n e(n nVar, m selection, int i13, Boolean bool, o82.a0 listDisplayState, int i14) {
        if ((i14 & 1) != 0) {
            selection = nVar.f79166a;
        }
        if ((i14 & 2) != 0) {
            i13 = nVar.f79167b;
        }
        if ((i14 & 4) != 0) {
            bool = nVar.f79168c;
        }
        if ((i14 & 8) != 0) {
            listDisplayState = nVar.f79169d;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        return new n(selection, i13, bool, listDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f79166a, nVar.f79166a) && this.f79167b == nVar.f79167b && Intrinsics.d(this.f79168c, nVar.f79168c) && Intrinsics.d(this.f79169d, nVar.f79169d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f79167b, this.f79166a.hashCode() * 31, 31);
        Boolean bool = this.f79168c;
        return this.f79169d.f93524a.hashCode() + ((b13 + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        return "PronounsDisplayState(selection=" + this.f79166a + ", selectionInstructions=" + this.f79167b + ", performSave=" + this.f79168c + ", listDisplayState=" + this.f79169d + ")";
    }
}
