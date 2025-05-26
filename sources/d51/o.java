package d51;

import a.cb;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f53707a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53709c;

    public o(@NotNull v7 board, boolean z13) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f53707a = board;
        this.f53708b = z13;
        this.f53709c = cb.g("toString(...)");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f53709c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f53707a, oVar.f53707a) && this.f53708b == oVar.f53708b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53708b) + (this.f53707a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableBoard(board=" + this.f53707a + ", selected=" + this.f53708b + ")";
    }
}
