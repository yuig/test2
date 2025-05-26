package nm1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f91431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91432b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91433c;

    public i(int i13, String imageUrl, String name) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f91431a = i13;
        this.f91432b = imageUrl;
        this.f91433c = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f91431a == iVar.f91431a && Intrinsics.d(this.f91432b, iVar.f91432b) && Intrinsics.d(this.f91433c, iVar.f91433c);
    }

    public final int hashCode() {
        return this.f91433c.hashCode() + cb.d(this.f91432b, Integer.hashCode(this.f91431a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarWithColorIndex(colorIndex=");
        sb3.append(this.f91431a);
        sb3.append(", imageUrl=");
        sb3.append(this.f91432b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f91433c, ")");
    }
}
