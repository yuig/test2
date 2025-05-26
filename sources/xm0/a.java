package xm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f135349a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f135350b;

    /* renamed from: c, reason: collision with root package name */
    public final jl0.d f135351c;

    public a(int i13, boolean z13, jl0.d boardViewState) {
        Intrinsics.checkNotNullParameter(boardViewState, "boardViewState");
        this.f135349a = i13;
        this.f135350b = z13;
        this.f135351c = boardViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135349a == aVar.f135349a && this.f135350b == aVar.f135350b && this.f135351c == aVar.f135351c;
    }

    public final int hashCode() {
        return this.f135351c.hashCode() + ep.b.e(this.f135350b, Integer.hashCode(this.f135349a) * 31, 31);
    }

    public final String toString() {
        return "BoardSelectPinsHeaderDisplayState(selectedPinCount=" + this.f135349a + ", showText=" + this.f135350b + ", boardViewState=" + this.f135351c + ")";
    }

    public /* synthetic */ a(boolean z13, int i13) {
        this(0, (i13 & 2) != 0 ? false : z13, jl0.d.ORGANIZE);
    }
}
