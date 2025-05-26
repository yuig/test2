package xc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f134556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134557b;

    public j(String id3, String imageUrl) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f134556a = id3;
        this.f134557b = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f134556a, jVar.f134556a) && Intrinsics.d(this.f134557b, jVar.f134557b);
    }

    public final int hashCode() {
        return this.f134557b.hashCode() + (this.f134556a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WidgetPinResponse(id=");
        sb3.append(this.f134556a);
        sb3.append(", imageUrl=");
        return a.a.p(sb3, this.f134557b, ")");
    }
}
