package pm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f100636a;

    /* renamed from: b, reason: collision with root package name */
    public final t f100637b;

    public b0(v7 board, t invitePolicy) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(invitePolicy, "invitePolicy");
        this.f100636a = board;
        this.f100637b = invitePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f100636a, b0Var.f100636a) && Intrinsics.d(this.f100637b, b0Var.f100637b);
    }

    public final int hashCode() {
        return this.f100637b.hashCode() + (this.f100636a.hashCode() * 31);
    }

    public final String toString() {
        return "LaunchCollaboratorFlow(board=" + this.f100636a + ", invitePolicy=" + this.f100637b + ")";
    }
}
