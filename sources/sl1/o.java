package sl1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends p {

    /* renamed from: c, reason: collision with root package name */
    public final List f113209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f113210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List avatarInfo, int i13) {
        super(avatarInfo, i13);
        Intrinsics.checkNotNullParameter(avatarInfo, "avatarInfo");
        this.f113209c = avatarInfo;
        this.f113210d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f113209c, oVar.f113209c) && this.f113210d == oVar.f113210d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113210d) + (this.f113209c.hashCode() * 31);
    }

    public final String toString() {
        return "OverflowClicked(avatarInfo=" + this.f113209c + ", resID=" + this.f113210d + ")";
    }
}
