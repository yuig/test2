package jz;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f77744a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f77745b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f77746c;

    public e(String message, i0 acceptButtonLabel, f0 f0Var) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(acceptButtonLabel, "acceptButtonLabel");
        this.f77744a = message;
        this.f77745b = acceptButtonLabel;
        this.f77746c = f0Var;
    }

    public final i0 a() {
        return this.f77745b;
    }

    public final i0 b() {
        return this.f77746c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f77744a, eVar.f77744a) && Intrinsics.d(this.f77745b, eVar.f77745b) && Intrinsics.d(this.f77746c, eVar.f77746c);
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f77745b, this.f77744a.hashCode() * 31, 31);
        i0 i0Var = this.f77746c;
        return d2 + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartMessage(message=");
        sb3.append(this.f77744a);
        sb3.append(", acceptButtonLabel=");
        sb3.append(this.f77745b);
        sb3.append(", declineButtonLabel=");
        return jq.b.k(sb3, this.f77746c, ")");
    }
}
