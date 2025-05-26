package qp1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f104797a;

    /* renamed from: b, reason: collision with root package name */
    public final a f104798b;

    /* renamed from: c, reason: collision with root package name */
    public final pp1.n f104799c;

    public k(ArrayList handshakeWebViewAction, a handshakeBackPressAction, pp1.n handshakeBottomSheetDisplayState) {
        Intrinsics.checkNotNullParameter(handshakeWebViewAction, "handshakeWebViewAction");
        Intrinsics.checkNotNullParameter(handshakeBackPressAction, "handshakeBackPressAction");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetDisplayState, "handshakeBottomSheetDisplayState");
        this.f104797a = handshakeWebViewAction;
        this.f104798b = handshakeBackPressAction;
        this.f104799c = handshakeBottomSheetDisplayState;
    }

    public static k e(k kVar, ArrayList handshakeWebViewAction, a handshakeBackPressAction, pp1.n handshakeBottomSheetDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            handshakeWebViewAction = kVar.f104797a;
        }
        if ((i13 & 2) != 0) {
            handshakeBackPressAction = kVar.f104798b;
        }
        if ((i13 & 4) != 0) {
            handshakeBottomSheetDisplayState = kVar.f104799c;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(handshakeWebViewAction, "handshakeWebViewAction");
        Intrinsics.checkNotNullParameter(handshakeBackPressAction, "handshakeBackPressAction");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetDisplayState, "handshakeBottomSheetDisplayState");
        return new k(handshakeWebViewAction, handshakeBackPressAction, handshakeBottomSheetDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f104797a, kVar.f104797a) && this.f104798b == kVar.f104798b && Intrinsics.d(this.f104799c, kVar.f104799c);
    }

    public final int hashCode() {
        return this.f104799c.hashCode() + ((this.f104798b.hashCode() + (this.f104797a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HandshakeWebViewDisplayState(handshakeWebViewAction=" + this.f104797a + ", handshakeBackPressAction=" + this.f104798b + ", handshakeBottomSheetDisplayState=" + this.f104799c + ")";
    }
}
