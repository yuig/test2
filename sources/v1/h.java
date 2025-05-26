package v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!Intrinsics.d(this.f123820a, hVar.f123820a)) {
            return false;
        }
        if (!Intrinsics.d(this.f123821b, hVar.f123821b)) {
            return false;
        }
        if (Intrinsics.d(this.f123822c, hVar.f123822c)) {
            return Intrinsics.d(this.f123823d, hVar.f123823d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123823d.hashCode() + ((this.f123822c.hashCode() + ((this.f123821b.hashCode() + (this.f123820a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f123820a + ", topEnd = " + this.f123821b + ", bottomEnd = " + this.f123822c + ", bottomStart = " + this.f123823d + ')';
    }
}
