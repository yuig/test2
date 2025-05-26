package q72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f102815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102816b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102817c;

    /* renamed from: d, reason: collision with root package name */
    public final String f102818d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102819e;

    /* renamed from: f, reason: collision with root package name */
    public final String f102820f;

    /* renamed from: g, reason: collision with root package name */
    public final String f102821g;

    /* renamed from: h, reason: collision with root package name */
    public final String f102822h;

    public c(String id3, String username, String firstName, String lastNAme, String fullName, String imageMediumUrl, String imageLargeUrl, String imageXLargeUrl) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastNAme, "lastNAme");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(imageMediumUrl, "imageMediumUrl");
        Intrinsics.checkNotNullParameter(imageLargeUrl, "imageLargeUrl");
        Intrinsics.checkNotNullParameter(imageXLargeUrl, "imageXLargeUrl");
        this.f102815a = id3;
        this.f102816b = username;
        this.f102817c = firstName;
        this.f102818d = lastNAme;
        this.f102819e = fullName;
        this.f102820f = imageMediumUrl;
        this.f102821g = imageLargeUrl;
        this.f102822h = imageXLargeUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f102815a, cVar.f102815a) && Intrinsics.d(this.f102816b, cVar.f102816b) && Intrinsics.d(this.f102817c, cVar.f102817c) && Intrinsics.d(this.f102818d, cVar.f102818d) && Intrinsics.d(this.f102819e, cVar.f102819e) && Intrinsics.d(this.f102820f, cVar.f102820f) && Intrinsics.d(this.f102821g, cVar.f102821g) && Intrinsics.d(this.f102822h, cVar.f102822h);
    }

    public final int hashCode() {
        return this.f102822h.hashCode() + cb.d(this.f102821g, cb.d(this.f102820f, cb.d(this.f102819e, cb.d(this.f102818d, cb.d(this.f102817c, cb.d(this.f102816b, this.f102815a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(id=");
        sb3.append(this.f102815a);
        sb3.append(", username=");
        sb3.append(this.f102816b);
        sb3.append(", firstName=");
        sb3.append(this.f102817c);
        sb3.append(", lastNAme=");
        sb3.append(this.f102818d);
        sb3.append(", fullName=");
        sb3.append(this.f102819e);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f102820f);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f102821g);
        sb3.append(", imageXLargeUrl=");
        return a.a.p(sb3, this.f102822h, ")");
    }
}
