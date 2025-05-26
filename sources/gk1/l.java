package gk1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f65239a;

    /* renamed from: b, reason: collision with root package name */
    public final k f65240b;

    /* renamed from: c, reason: collision with root package name */
    public final g f65241c;

    public l(List pieceDisplayStates, k forceDrawOver, g action) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        Intrinsics.checkNotNullParameter(forceDrawOver, "forceDrawOver");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f65239a = pieceDisplayStates;
        this.f65240b = forceDrawOver;
        this.f65241c = action;
    }

    public static l e(l lVar, List pieceDisplayStates, k forceDrawOver, g action, int i13) {
        if ((i13 & 1) != 0) {
            pieceDisplayStates = lVar.f65239a;
        }
        if ((i13 & 2) != 0) {
            forceDrawOver = lVar.f65240b;
        }
        if ((i13 & 4) != 0) {
            action = lVar.f65241c;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        Intrinsics.checkNotNullParameter(forceDrawOver, "forceDrawOver");
        Intrinsics.checkNotNullParameter(action, "action");
        return new l(pieceDisplayStates, forceDrawOver, action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f65239a, lVar.f65239a) && Intrinsics.d(this.f65240b, lVar.f65240b) && Intrinsics.d(this.f65241c, lVar.f65241c);
    }

    public final int hashCode() {
        return this.f65241c.hashCode() + ((this.f65240b.hashCode() + (this.f65239a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OverlayZoneDisplayState(pieceDisplayStates=" + this.f65239a + ", forceDrawOver=" + this.f65240b + ", action=" + this.f65241c + ")";
    }

    public l() {
        this(kotlin.collections.q0.f80391a, i.f65233a, e.f65226a);
    }
}
