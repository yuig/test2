package nm1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f91436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91437b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91438c;

    public j(String userID, String imageUrl, String name) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f91436a = userID;
        this.f91437b = imageUrl;
        this.f91438c = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f91436a, jVar.f91436a) && Intrinsics.d(this.f91437b, jVar.f91437b) && Intrinsics.d(this.f91438c, jVar.f91438c);
    }

    public final int hashCode() {
        return this.f91438c.hashCode() + cb.d(this.f91437b, this.f91436a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarWithUserID(userID=");
        sb3.append(this.f91436a);
        sb3.append(", imageUrl=");
        sb3.append(this.f91437b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f91438c, ")");
    }
}
