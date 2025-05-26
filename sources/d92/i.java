package d92;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f54150a;

    /* renamed from: b, reason: collision with root package name */
    public final a f54151b;

    /* renamed from: c, reason: collision with root package name */
    public final c92.o f54152c;

    public i(ArrayList handshakeWebViewAction, a handshakeBackPressAction, c92.o handshakeBottomSheetDisplayState) {
        Intrinsics.checkNotNullParameter(handshakeWebViewAction, "handshakeWebViewAction");
        Intrinsics.checkNotNullParameter(handshakeBackPressAction, "handshakeBackPressAction");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetDisplayState, "handshakeBottomSheetDisplayState");
        this.f54150a = handshakeWebViewAction;
        this.f54151b = handshakeBackPressAction;
        this.f54152c = handshakeBottomSheetDisplayState;
    }

    public static i e(i iVar, ArrayList handshakeWebViewAction, a handshakeBackPressAction, c92.o handshakeBottomSheetDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            handshakeWebViewAction = iVar.f54150a;
        }
        if ((i13 & 2) != 0) {
            handshakeBackPressAction = iVar.f54151b;
        }
        if ((i13 & 4) != 0) {
            handshakeBottomSheetDisplayState = iVar.f54152c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(handshakeWebViewAction, "handshakeWebViewAction");
        Intrinsics.checkNotNullParameter(handshakeBackPressAction, "handshakeBackPressAction");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetDisplayState, "handshakeBottomSheetDisplayState");
        return new i(handshakeWebViewAction, handshakeBackPressAction, handshakeBottomSheetDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f54150a, iVar.f54150a) && this.f54151b == iVar.f54151b && Intrinsics.d(this.f54152c, iVar.f54152c);
    }

    public final int hashCode() {
        return this.f54152c.hashCode() + ((this.f54151b.hashCode() + (this.f54150a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TargetHandshakeWebViewDisplayState(handshakeWebViewAction=" + this.f54150a + ", handshakeBackPressAction=" + this.f54151b + ", handshakeBottomSheetDisplayState=" + this.f54152c + ")";
    }
}
