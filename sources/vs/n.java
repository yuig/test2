package vs;

import a.cb;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.xs0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f126495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126496b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f126497c;

    /* renamed from: d, reason: collision with root package name */
    public final int f126498d;

    /* renamed from: e, reason: collision with root package name */
    public final xs0 f126499e;

    /* renamed from: f, reason: collision with root package name */
    public final kw.a f126500f;

    public n(f30 pin, String formatType, boolean z13, int i13, xs0 xs0Var, kw.a aVar) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(formatType, "formatType");
        this.f126495a = pin;
        this.f126496b = formatType;
        this.f126497c = z13;
        this.f126498d = i13;
        this.f126499e = xs0Var;
        this.f126500f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f126495a, nVar.f126495a) && Intrinsics.d(this.f126496b, nVar.f126496b) && this.f126497c == nVar.f126497c && this.f126498d == nVar.f126498d && Intrinsics.d(this.f126499e, nVar.f126499e) && Intrinsics.d(this.f126500f, nVar.f126500f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f126498d, ep.b.e(this.f126497c, cb.d(this.f126496b, this.f126495a.hashCode() * 31, 31), 31), 31);
        xs0 xs0Var = this.f126499e;
        int hashCode = (b13 + (xs0Var == null ? 0 : xs0Var.hashCode())) * 31;
        kw.a aVar = this.f126500f;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinLoaded(pin=" + this.f126495a + ", formatType=" + this.f126496b + ", isMdlAd=" + this.f126497c + ", shoppingIntegrationType=" + this.f126498d + ", thirdPartyAdConfig=" + this.f126499e + ", adsGmaQuarantine=" + this.f126500f + ")";
    }
}
