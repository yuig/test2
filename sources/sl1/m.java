package sl1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends p {

    /* renamed from: c, reason: collision with root package name */
    public final String f113203c;

    /* renamed from: d, reason: collision with root package name */
    public final String f113204d;

    /* renamed from: e, reason: collision with root package name */
    public final List f113205e;

    /* renamed from: f, reason: collision with root package name */
    public final int f113206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i13, String url, String str, List avatarInfo) {
        super(avatarInfo, i13);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(avatarInfo, "avatarInfo");
        this.f113203c = url;
        this.f113204d = str;
        this.f113205e = avatarInfo;
        this.f113206f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f113203c, mVar.f113203c) && Intrinsics.d(this.f113204d, mVar.f113204d) && Intrinsics.d(this.f113205e, mVar.f113205e) && this.f113206f == mVar.f113206f;
    }

    public final int hashCode() {
        int hashCode = this.f113203c.hashCode() * 31;
        String str = this.f113204d;
        return Integer.hashCode(this.f113206f) + ep.b.c(this.f113205e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarClicked(url=");
        sb3.append(this.f113203c);
        sb3.append(", userID=");
        sb3.append(this.f113204d);
        sb3.append(", avatarInfo=");
        sb3.append(this.f113205e);
        sb3.append(", resID=");
        return a.a.n(sb3, this.f113206f, ")");
    }
}
