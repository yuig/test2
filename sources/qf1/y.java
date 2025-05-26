package qf1;

import h32.f1;
import h32.u0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f103777a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f103778b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f103779c;

    public y(f1 event, u0 element, Function2 auxDataProvider) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        this.f103777a = event;
        this.f103778b = element;
        this.f103779c = auxDataProvider;
    }

    public static y a(y yVar, f1 event, u0 element, int i13) {
        if ((i13 & 1) != 0) {
            event = yVar.f103777a;
        }
        if ((i13 & 2) != 0) {
            element = yVar.f103778b;
        }
        Function2 auxDataProvider = yVar.f103779c;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        return new y(event, element, auxDataProvider);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f103777a == yVar.f103777a && this.f103778b == yVar.f103778b && Intrinsics.d(this.f103779c, yVar.f103779c);
    }

    public final int hashCode() {
        return this.f103779c.hashCode() + ((this.f103778b.hashCode() + (this.f103777a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StickerLog(event=" + this.f103777a + ", element=" + this.f103778b + ", auxDataProvider=" + this.f103779c + ")";
    }
}
