package sl1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends p {

    /* renamed from: c, reason: collision with root package name */
    public final List f113207c;

    /* renamed from: d, reason: collision with root package name */
    public final int f113208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List avatarInfo, int i13) {
        super(avatarInfo, i13);
        Intrinsics.checkNotNullParameter(avatarInfo, "avatarInfo");
        this.f113207c = avatarInfo;
        this.f113208d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f113207c, nVar.f113207c) && this.f113208d == nVar.f113208d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113208d) + (this.f113207c.hashCode() * 31);
    }

    public final String toString() {
        return "IconClicked(avatarInfo=" + this.f113207c + ", resID=" + this.f113208d + ")";
    }
}
