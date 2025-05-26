package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23210a;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f23211b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23212c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23213d;

    public e0(f30 pin, g2 source, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f23210a = pin;
        this.f23211b = source;
        this.f23212c = z13;
        this.f23213d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f23210a, e0Var.f23210a) && this.f23211b == e0Var.f23211b && this.f23212c == e0Var.f23212c && this.f23213d == e0Var.f23213d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23213d) + ep.b.e(this.f23212c, (this.f23211b.hashCode() + (this.f23210a.hashCode() * 31)) * 31, 31);
    }

    public final f30 j() {
        return this.f23210a;
    }

    public final boolean k() {
        return this.f23213d;
    }

    public final boolean l() {
        return this.f23212c;
    }

    public final g2 m() {
        return this.f23211b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinActionHandlerEvent(pin=");
        sb3.append(this.f23210a);
        sb3.append(", source=");
        sb3.append(this.f23211b);
        sb3.append(", shouldLog=");
        sb3.append(this.f23212c);
        sb3.append(", shouldExecuteFallbackNavigationOnClickThrough=");
        return a.a.r(sb3, this.f23213d, ")");
    }
}
