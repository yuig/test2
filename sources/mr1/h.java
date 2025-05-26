package mr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f88088a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f88089b;

    /* renamed from: c, reason: collision with root package name */
    public final c60.a f88090c;

    /* renamed from: d, reason: collision with root package name */
    public final h f88091d;

    public h(String userUid, wy0 user, c60.a aVar, h hVar, int i13) {
        aVar = (i13 & 4) != 0 ? null : aVar;
        hVar = (i13 & 8) != 0 ? null : hVar;
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f88088a = userUid;
        this.f88089b = user;
        this.f88090c = aVar;
        this.f88091d = hVar;
    }

    public final boolean a() {
        return this.f88091d != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f88088a, hVar.f88088a) && Intrinsics.d(this.f88089b, hVar.f88089b) && Intrinsics.d(this.f88090c, hVar.f88090c) && Intrinsics.d(this.f88091d, hVar.f88091d);
    }

    public final int hashCode() {
        int hashCode = (this.f88089b.hashCode() + (this.f88088a.hashCode() * 31)) * 31;
        c60.a aVar = this.f88090c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        h hVar = this.f88091d;
        return hashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserAccount(userUid=" + this.f88088a + ", user=" + this.f88089b + ", accessToken=" + this.f88090c + ", parentAccount=" + this.f88091d + ")";
    }
}
