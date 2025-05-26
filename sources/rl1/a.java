package rl1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f108519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108520b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108521c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108522d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f108523e;

    public a(Integer num, String imageUrl, String initials, String contentDescription, boolean z13) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f108519a = imageUrl;
        this.f108520b = initials;
        this.f108521c = z13;
        this.f108522d = contentDescription;
        this.f108523e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f108519a, aVar.f108519a) && Intrinsics.d(this.f108520b, aVar.f108520b) && this.f108521c == aVar.f108521c && Intrinsics.d(this.f108522d, aVar.f108522d) && Intrinsics.d(this.f108523e, aVar.f108523e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f108522d, ep.b.e(this.f108521c, cb.d(this.f108520b, this.f108519a.hashCode() * 31, 31), 31), 31);
        Integer num = this.f108523e;
        return d2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarBaseViewModel(imageUrl=");
        sb3.append(this.f108519a);
        sb3.append(", initials=");
        sb3.append(this.f108520b);
        sb3.append(", showVerified=");
        sb3.append(this.f108521c);
        sb3.append(", contentDescription=");
        sb3.append(this.f108522d);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f108523e, ")");
    }
}
