package ls1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f84702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84703b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f84704c;

    /* renamed from: d, reason: collision with root package name */
    public final v32.c f84705d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84706e;

    public o(String pinUid, int i13, Map reactions, v32.c reactionByMe, boolean z13) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
        this.f84702a = pinUid;
        this.f84703b = i13;
        this.f84704c = reactions;
        this.f84705d = reactionByMe;
        this.f84706e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f84702a, oVar.f84702a) && this.f84703b == oVar.f84703b && Intrinsics.d(this.f84704c, oVar.f84704c) && this.f84705d == oVar.f84705d && this.f84706e == oVar.f84706e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84706e) + ((this.f84705d.hashCode() + a.c.e(this.f84704c, ep.b.b(this.f84703b, this.f84702a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinReactionSelectEvent(pinUid=");
        sb3.append(this.f84702a);
        sb3.append(", totalReactions=");
        sb3.append(this.f84703b);
        sb3.append(", reactions=");
        sb3.append(this.f84704c);
        sb3.append(", reactionByMe=");
        sb3.append(this.f84705d);
        sb3.append(", isFromGrid=");
        return a.a.r(sb3, this.f84706e, ")");
    }
}
