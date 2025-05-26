package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104272a;

    /* renamed from: b, reason: collision with root package name */
    public final i91.b f104273b;

    public f1(v7 board, i91.b previewState) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        this.f104272a = board;
        this.f104273b = previewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.d(this.f104272a, f1Var.f104272a) && Intrinsics.d(this.f104273b, f1Var.f104273b);
    }

    public final int hashCode() {
        return this.f104273b.hashCode() + (this.f104272a.hashCode() * 31);
    }

    public final String toString() {
        return "LaunchShareAsVideo(board=" + this.f104272a + ", previewState=" + this.f104273b + ")";
    }
}
