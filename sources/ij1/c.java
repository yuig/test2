package ij1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f72346a;

    public c(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f72346a = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f72346a, ((c) obj).f72346a);
    }

    public final int hashCode() {
        return this.f72346a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserImage(imageUrl="), this.f72346a, ")");
    }
}
