package oa2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f93844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93845b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f93846c;

    /* renamed from: d, reason: collision with root package name */
    public final String f93847d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93848e;

    public a(int i13, String imageUrl, String name, String uid, boolean z13) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f93844a = imageUrl;
        this.f93845b = name;
        this.f93846c = z13;
        this.f93847d = uid;
        this.f93848e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f93844a, aVar.f93844a) && Intrinsics.d(this.f93845b, aVar.f93845b) && this.f93846c == aVar.f93846c && Intrinsics.d(this.f93847d, aVar.f93847d) && this.f93848e == aVar.f93848e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93848e) + cb.d(this.f93847d, ep.b.e(this.f93846c, cb.d(this.f93845b, this.f93844a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarViewModel(imageUrl=");
        sb3.append(this.f93844a);
        sb3.append(", name=");
        sb3.append(this.f93845b);
        sb3.append(", isVerified=");
        sb3.append(this.f93846c);
        sb3.append(", uid=");
        sb3.append(this.f93847d);
        sb3.append(", colorIndex=");
        return a.a.n(sb3, this.f93848e, ")");
    }
}
