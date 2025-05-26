package d92;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f54171a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54172b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54173c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54174d;

    /* renamed from: e, reason: collision with root package name */
    public final String f54175e;

    /* renamed from: f, reason: collision with root package name */
    public final e92.e f54176f;

    /* renamed from: g, reason: collision with root package name */
    public final c92.w f54177g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54178h;

    public n0(String pinId, long j13, long j14, String destinationType, String shoppingIntegrationType, e92.e eVar, c92.w handshakeBottomSheetVMState, String promotedName) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(shoppingIntegrationType, "shoppingIntegrationType");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetVMState, "handshakeBottomSheetVMState");
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        this.f54171a = pinId;
        this.f54172b = j13;
        this.f54173c = j14;
        this.f54174d = destinationType;
        this.f54175e = shoppingIntegrationType;
        this.f54176f = eVar;
        this.f54177g = handshakeBottomSheetVMState;
        this.f54178h = promotedName;
    }

    public static n0 b(n0 n0Var, String str, long j13, long j14, String str2, String str3, e92.e eVar, c92.w wVar, String str4, int i13) {
        String pinId = (i13 & 1) != 0 ? n0Var.f54171a : str;
        long j15 = (i13 & 2) != 0 ? n0Var.f54172b : j13;
        long j16 = (i13 & 4) != 0 ? n0Var.f54173c : j14;
        String destinationType = (i13 & 8) != 0 ? n0Var.f54174d : str2;
        String shoppingIntegrationType = (i13 & 16) != 0 ? n0Var.f54175e : str3;
        e92.e eVar2 = (i13 & 32) != 0 ? n0Var.f54176f : eVar;
        c92.w handshakeBottomSheetVMState = (i13 & 64) != 0 ? n0Var.f54177g : wVar;
        String promotedName = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? n0Var.f54178h : str4;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(shoppingIntegrationType, "shoppingIntegrationType");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetVMState, "handshakeBottomSheetVMState");
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        return new n0(pinId, j15, j16, destinationType, shoppingIntegrationType, eVar2, handshakeBottomSheetVMState, promotedName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f54171a, n0Var.f54171a) && this.f54172b == n0Var.f54172b && this.f54173c == n0Var.f54173c && Intrinsics.d(this.f54174d, n0Var.f54174d) && Intrinsics.d(this.f54175e, n0Var.f54175e) && Intrinsics.d(this.f54176f, n0Var.f54176f) && Intrinsics.d(this.f54177g, n0Var.f54177g) && Intrinsics.d(this.f54178h, n0Var.f54178h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f54175e, cb.d(this.f54174d, a.a.c(this.f54173c, a.a.c(this.f54172b, this.f54171a.hashCode() * 31, 31), 31), 31), 31);
        e92.e eVar = this.f54176f;
        return this.f54178h.hashCode() + ((this.f54177g.hashCode() + ((d2 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TargetHandshakeWebViewVMState(pinId=");
        sb3.append(this.f54171a);
        sb3.append(", startPinClickthroughTimeNs=");
        sb3.append(this.f54172b);
        sb3.append(", startLoadingPDPTimeStamp=");
        sb3.append(this.f54173c);
        sb3.append(", destinationType=");
        sb3.append(this.f54174d);
        sb3.append(", shoppingIntegrationType=");
        sb3.append(this.f54175e);
        sb3.append(", previousJsMessage=");
        sb3.append(this.f54176f);
        sb3.append(", handshakeBottomSheetVMState=");
        sb3.append(this.f54177g);
        sb3.append(", promotedName=");
        return a.a.p(sb3, this.f54178h, ")");
    }
}
