package sv;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes3.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f115264a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115265b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f115266c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115267d;

    /* renamed from: e, reason: collision with root package name */
    public final String f115268e;

    /* renamed from: f, reason: collision with root package name */
    public final int f115269f;

    /* renamed from: g, reason: collision with root package name */
    public final String f115270g;

    public c0(String collageId, String tappedCutoutItemId, l0 pinalyticsState, String str, String str2, int i13, String str3) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(tappedCutoutItemId, "tappedCutoutItemId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f115264a = collageId;
        this.f115265b = tappedCutoutItemId;
        this.f115266c = pinalyticsState;
        this.f115267d = str;
        this.f115268e = str2;
        this.f115269f = i13;
        this.f115270g = str3;
    }

    public static c0 b(c0 c0Var, l0 l0Var, int i13, String str, int i14) {
        String collageId = c0Var.f115264a;
        String tappedCutoutItemId = c0Var.f115265b;
        if ((i14 & 4) != 0) {
            l0Var = c0Var.f115266c;
        }
        l0 pinalyticsState = l0Var;
        String str2 = c0Var.f115267d;
        String str3 = c0Var.f115268e;
        if ((i14 & 32) != 0) {
            i13 = c0Var.f115269f;
        }
        int i15 = i13;
        if ((i14 & 64) != 0) {
            str = c0Var.f115270g;
        }
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(tappedCutoutItemId, "tappedCutoutItemId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new c0(collageId, tappedCutoutItemId, pinalyticsState, str2, str3, i15, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f115264a, c0Var.f115264a) && Intrinsics.d(this.f115265b, c0Var.f115265b) && Intrinsics.d(this.f115266c, c0Var.f115266c) && Intrinsics.d(this.f115267d, c0Var.f115267d) && Intrinsics.d(this.f115268e, c0Var.f115268e) && this.f115269f == c0Var.f115269f && Intrinsics.d(this.f115270g, c0Var.f115270g);
    }

    public final int hashCode() {
        int a13 = jq.b.a(this.f115266c, cb.d(this.f115265b, this.f115264a.hashCode() * 31, 31), 31);
        String str = this.f115267d;
        int hashCode = (a13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115268e;
        int b13 = ep.b.b(this.f115269f, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f115270g;
        return b13 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeroCutoutVMState(collageId=");
        sb3.append(this.f115264a);
        sb3.append(", tappedCutoutItemId=");
        sb3.append(this.f115265b);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f115266c);
        sb3.append(", rootPinUid=");
        sb3.append(this.f115267d);
        sb3.append(", rootPinId=");
        sb3.append(this.f115268e);
        sb3.append(", carouselPosition=");
        sb3.append(this.f115269f);
        sb3.append(", cutoutSelectedPinId=");
        return a.a.p(sb3, this.f115270g, ")");
    }
}
