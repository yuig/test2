package wm1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends z {

    /* renamed from: b, reason: collision with root package name */
    public final String f130335b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130336c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f130337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String avatarURL, String avatarName) {
        super(a0.AVATAR);
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(avatarName, "avatarName");
        this.f130335b = avatarURL;
        this.f130336c = avatarName;
        this.f130337d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f130335b, uVar.f130335b) && Intrinsics.d(this.f130336c, uVar.f130336c) && Intrinsics.d(this.f130337d, uVar.f130337d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f130336c, this.f130335b.hashCode() * 31, 31);
        Integer num = this.f130337d;
        return d2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarDisplayState(avatarURL=");
        sb3.append(this.f130335b);
        sb3.append(", avatarName=");
        sb3.append(this.f130336c);
        sb3.append(", avatarBackgroundColorIndex=");
        return a.c.i(sb3, this.f130337d, ")");
    }
}
