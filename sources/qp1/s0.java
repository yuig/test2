package qp1;

import a.cb;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104827a;

    /* renamed from: b, reason: collision with root package name */
    public final long f104828b;

    /* renamed from: c, reason: collision with root package name */
    public final long f104829c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104830d;

    /* renamed from: e, reason: collision with root package name */
    public final String f104831e;

    /* renamed from: f, reason: collision with root package name */
    public final rp1.e f104832f;

    /* renamed from: g, reason: collision with root package name */
    public final pp1.v f104833g;

    /* renamed from: h, reason: collision with root package name */
    public final String f104834h;

    /* renamed from: i, reason: collision with root package name */
    public final f30 f104835i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f104836j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f104837k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f104838l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f104839m;

    public s0(String pinId, long j13, long j14, String destinationType, String shoppingIntegrationType, rp1.e eVar, pp1.v handshakeBottomSheetVMState, String promotedName, f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(shoppingIntegrationType, "shoppingIntegrationType");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetVMState, "handshakeBottomSheetVMState");
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        this.f104827a = pinId;
        this.f104828b = j13;
        this.f104829c = j14;
        this.f104830d = destinationType;
        this.f104831e = shoppingIntegrationType;
        this.f104832f = eVar;
        this.f104833g = handshakeBottomSheetVMState;
        this.f104834h = promotedName;
        this.f104835i = f30Var;
        this.f104836j = z13;
        this.f104837k = z14;
        this.f104838l = z15;
        this.f104839m = z16;
    }

    public static s0 b(s0 s0Var, String str, long j13, long j14, String str2, String str3, rp1.e eVar, pp1.v vVar, String str4, f30 f30Var, int i13) {
        String pinId = (i13 & 1) != 0 ? s0Var.f104827a : str;
        long j15 = (i13 & 2) != 0 ? s0Var.f104828b : j13;
        long j16 = (i13 & 4) != 0 ? s0Var.f104829c : j14;
        String destinationType = (i13 & 8) != 0 ? s0Var.f104830d : str2;
        String shoppingIntegrationType = (i13 & 16) != 0 ? s0Var.f104831e : str3;
        rp1.e eVar2 = (i13 & 32) != 0 ? s0Var.f104832f : eVar;
        pp1.v handshakeBottomSheetVMState = (i13 & 64) != 0 ? s0Var.f104833g : vVar;
        String promotedName = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? s0Var.f104834h : str4;
        f30 f30Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? s0Var.f104835i : f30Var;
        boolean z13 = s0Var.f104836j;
        boolean z14 = s0Var.f104837k;
        boolean z15 = s0Var.f104838l;
        boolean z16 = s0Var.f104839m;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(shoppingIntegrationType, "shoppingIntegrationType");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetVMState, "handshakeBottomSheetVMState");
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        return new s0(pinId, j15, j16, destinationType, shoppingIntegrationType, eVar2, handshakeBottomSheetVMState, promotedName, f30Var2, z13, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f104827a, s0Var.f104827a) && this.f104828b == s0Var.f104828b && this.f104829c == s0Var.f104829c && Intrinsics.d(this.f104830d, s0Var.f104830d) && Intrinsics.d(this.f104831e, s0Var.f104831e) && Intrinsics.d(this.f104832f, s0Var.f104832f) && Intrinsics.d(this.f104833g, s0Var.f104833g) && Intrinsics.d(this.f104834h, s0Var.f104834h) && Intrinsics.d(this.f104835i, s0Var.f104835i) && this.f104836j == s0Var.f104836j && this.f104837k == s0Var.f104837k && this.f104838l == s0Var.f104838l && this.f104839m == s0Var.f104839m;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f104831e, cb.d(this.f104830d, a.a.c(this.f104829c, a.a.c(this.f104828b, this.f104827a.hashCode() * 31, 31), 31), 31), 31);
        rp1.e eVar = this.f104832f;
        int d13 = cb.d(this.f104834h, (this.f104833g.hashCode() + ((d2 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31, 31);
        f30 f30Var = this.f104835i;
        return Boolean.hashCode(this.f104839m) + ep.b.e(this.f104838l, ep.b.e(this.f104837k, ep.b.e(this.f104836j, (d13 + (f30Var != null ? f30Var.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HandshakeWebViewVMState(pinId=");
        sb3.append(this.f104827a);
        sb3.append(", startPinClickthroughTimeNs=");
        sb3.append(this.f104828b);
        sb3.append(", startLoadingPDPTimeStamp=");
        sb3.append(this.f104829c);
        sb3.append(", destinationType=");
        sb3.append(this.f104830d);
        sb3.append(", shoppingIntegrationType=");
        sb3.append(this.f104831e);
        sb3.append(", previousJsMessage=");
        sb3.append(this.f104832f);
        sb3.append(", handshakeBottomSheetVMState=");
        sb3.append(this.f104833g);
        sb3.append(", promotedName=");
        sb3.append(this.f104834h);
        sb3.append(", pinModel=");
        sb3.append(this.f104835i);
        sb3.append(", isAndroidHandshakeShowBadgeEnabled=");
        sb3.append(this.f104836j);
        sb3.append(", isAndroidHandshakeShowPriceEnabled=");
        sb3.append(this.f104837k);
        sb3.append(", isAndroidHandshakeShowRatingEnabled=");
        sb3.append(this.f104838l);
        sb3.append(", isAndroidHandshakeShowShippingEnabled=");
        return a.a.r(sb3, this.f104839m, ")");
    }
}
