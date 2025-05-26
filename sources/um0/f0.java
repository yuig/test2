package um0;

import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f122706a;

    /* renamed from: b, reason: collision with root package name */
    public final List f122707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122708c;

    public f0(v7 board, List pins, int i13) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f122706a = board;
        this.f122707b = pins;
        this.f122708c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f122706a, f0Var.f122706a) && Intrinsics.d(this.f122707b, f0Var.f122707b) && this.f122708c == f0Var.f122708c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122708c) + ep.b.c(this.f122707b, this.f122706a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PersistPinReorder(board=");
        sb3.append(this.f122706a);
        sb3.append(", pins=");
        sb3.append(this.f122707b);
        sb3.append(", position=");
        return a.a.n(sb3, this.f122708c, ")");
    }
}
