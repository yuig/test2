package bk1;

import a.cb;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23320b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.i0 f23321c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23322d;

    public s0(f30 pin, String url, h32.i0 i0Var, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f23319a = pin;
        this.f23320b = url;
        this.f23321c = i0Var;
        this.f23322d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f23319a, s0Var.f23319a) && Intrinsics.d(this.f23320b, s0Var.f23320b) && Intrinsics.d(this.f23321c, s0Var.f23321c) && Intrinsics.d(this.f23322d, s0Var.f23322d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(-1, ep.b.e(true, cb.d(this.f23320b, this.f23319a.hashCode() * 31, 31), 31), 31);
        h32.i0 i0Var = this.f23321c;
        int hashCode = (b13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.f23322d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final h32.i0 j() {
        return this.f23321c;
    }

    public final f30 k() {
        return this.f23319a;
    }

    public final String l() {
        return this.f23322d;
    }

    public final String m() {
        return this.f23320b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogClickThrough(pin=");
        sb3.append(this.f23319a);
        sb3.append(", url=");
        sb3.append(this.f23320b);
        sb3.append(", webCloseup=true, gridIndex=-1, analyticContext=");
        sb3.append(this.f23321c);
        sb3.append(", uniqueScreenKey=");
        return a.a.p(sb3, this.f23322d, ")");
    }
}
