package il0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f72522a;

    /* renamed from: b, reason: collision with root package name */
    public final x31.a f72523b;

    /* renamed from: c, reason: collision with root package name */
    public final sk0.d f72524c;

    /* renamed from: d, reason: collision with root package name */
    public final tk0.e f72525d;

    public a(boolean z13, x31.a aVar, sk0.d floatingToolbarDisplayState, tk0.e organizeFloatingToolbarDisplayState) {
        Intrinsics.checkNotNullParameter(floatingToolbarDisplayState, "floatingToolbarDisplayState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarDisplayState, "organizeFloatingToolbarDisplayState");
        this.f72522a = z13;
        this.f72523b = aVar;
        this.f72524c = floatingToolbarDisplayState;
        this.f72525d = organizeFloatingToolbarDisplayState;
    }

    public static a e(a aVar, sk0.d floatingToolbarDisplayState, tk0.e organizeFloatingToolbarDisplayState, int i13) {
        boolean z13 = aVar.f72522a;
        x31.a aVar2 = aVar.f72523b;
        if ((i13 & 4) != 0) {
            floatingToolbarDisplayState = aVar.f72524c;
        }
        if ((i13 & 8) != 0) {
            organizeFloatingToolbarDisplayState = aVar.f72525d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(floatingToolbarDisplayState, "floatingToolbarDisplayState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarDisplayState, "organizeFloatingToolbarDisplayState");
        return new a(z13, aVar2, floatingToolbarDisplayState, organizeFloatingToolbarDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72522a == aVar.f72522a && Intrinsics.d(this.f72523b, aVar.f72523b) && Intrinsics.d(this.f72524c, aVar.f72524c) && Intrinsics.d(this.f72525d, aVar.f72525d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f72522a) * 31;
        x31.a aVar = this.f72523b;
        return this.f72525d.hashCode() + ((this.f72524c.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "BoardDisplayState(showFilterBar=" + this.f72522a + ", selectedFilter=" + this.f72523b + ", floatingToolbarDisplayState=" + this.f72524c + ", organizeFloatingToolbarDisplayState=" + this.f72525d + ")";
    }
}
