package ay1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20665a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20666b;

    public f0(String pinId, List boards) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(boards, "boards");
        this.f20665a = pinId;
        this.f20666b = boards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f20665a, f0Var.f20665a) && Intrinsics.d(this.f20666b, f0Var.f20666b);
    }

    public final int hashCode() {
        return this.f20666b.hashCode() + (this.f20665a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Success(pinId=");
        sb3.append(this.f20665a);
        sb3.append(", boards=");
        return a.c.j(sb3, this.f20666b, ")");
    }
}
