package ws;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final xs.m f131051a;

    /* renamed from: b, reason: collision with root package name */
    public final pu.a f131052b;

    /* renamed from: c, reason: collision with root package name */
    public final List f131053c;

    public c(xs.m bottomSheetDisplayState, pu.a coreDisplayState, List cartingActions) {
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        Intrinsics.checkNotNullParameter(coreDisplayState, "coreDisplayState");
        Intrinsics.checkNotNullParameter(cartingActions, "cartingActions");
        this.f131051a = bottomSheetDisplayState;
        this.f131052b = coreDisplayState;
        this.f131053c = cartingActions;
    }

    public static c e(c cVar, xs.m bottomSheetDisplayState, pu.a coreDisplayState, List cartingActions, int i13) {
        if ((i13 & 1) != 0) {
            bottomSheetDisplayState = cVar.f131051a;
        }
        if ((i13 & 2) != 0) {
            coreDisplayState = cVar.f131052b;
        }
        if ((i13 & 4) != 0) {
            cartingActions = cVar.f131053c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        Intrinsics.checkNotNullParameter(coreDisplayState, "coreDisplayState");
        Intrinsics.checkNotNullParameter(cartingActions, "cartingActions");
        return new c(bottomSheetDisplayState, coreDisplayState, cartingActions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f131051a, cVar.f131051a) && Intrinsics.d(this.f131052b, cVar.f131052b) && Intrinsics.d(this.f131053c, cVar.f131053c);
    }

    public final int hashCode() {
        return this.f131053c.hashCode() + ((this.f131052b.hashCode() + (this.f131051a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CartingDisplayState(bottomSheetDisplayState=");
        sb3.append(this.f131051a);
        sb3.append(", coreDisplayState=");
        sb3.append(this.f131052b);
        sb3.append(", cartingActions=");
        return a.c.j(sb3, this.f131053c, ")");
    }
}
