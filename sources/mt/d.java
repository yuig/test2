package mt;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final nt.v f88105a;

    /* renamed from: b, reason: collision with root package name */
    public final pu.a f88106b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88107c;

    public d(nt.v bottomSheetDisplayState, pu.a coreDisplayState, List leadGenActions) {
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        Intrinsics.checkNotNullParameter(coreDisplayState, "coreDisplayState");
        Intrinsics.checkNotNullParameter(leadGenActions, "leadGenActions");
        this.f88105a = bottomSheetDisplayState;
        this.f88106b = coreDisplayState;
        this.f88107c = leadGenActions;
    }

    public static d e(d dVar, nt.v bottomSheetDisplayState, pu.a coreDisplayState, List leadGenActions, int i13) {
        if ((i13 & 1) != 0) {
            bottomSheetDisplayState = dVar.f88105a;
        }
        if ((i13 & 2) != 0) {
            coreDisplayState = dVar.f88106b;
        }
        if ((i13 & 4) != 0) {
            leadGenActions = dVar.f88107c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        Intrinsics.checkNotNullParameter(coreDisplayState, "coreDisplayState");
        Intrinsics.checkNotNullParameter(leadGenActions, "leadGenActions");
        return new d(bottomSheetDisplayState, coreDisplayState, leadGenActions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f88105a, dVar.f88105a) && Intrinsics.d(this.f88106b, dVar.f88106b) && Intrinsics.d(this.f88107c, dVar.f88107c);
    }

    public final int hashCode() {
        return this.f88107c.hashCode() + ((this.f88106b.hashCode() + (this.f88105a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LeadGenDisplayState(bottomSheetDisplayState=");
        sb3.append(this.f88105a);
        sb3.append(", coreDisplayState=");
        sb3.append(this.f88106b);
        sb3.append(", leadGenActions=");
        return a.c.j(sb3, this.f88107c, ")");
    }

    public d(nt.v vVar, pu.a aVar) {
        this(vVar, aVar, q0.f80391a);
    }
}
