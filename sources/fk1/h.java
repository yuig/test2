package fk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f62352a;

    /* renamed from: b, reason: collision with root package name */
    public final v32.c f62353b;

    public h(int i13, v32.c reactionByMe) {
        Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
        this.f62352a = i13;
        this.f62353b = reactionByMe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f62352a == hVar.f62352a && this.f62353b == hVar.f62353b;
    }

    public final int hashCode() {
        return this.f62353b.hashCode() + (Integer.hashCode(this.f62352a) * 31);
    }

    public final v32.c j() {
        return this.f62353b;
    }

    public final int k() {
        return this.f62352a;
    }

    public final String toString() {
        return "OnPinReactionSelect(totalReactions=" + this.f62352a + ", reactionByMe=" + this.f62353b + ")";
    }
}
