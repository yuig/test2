package h80;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f68084a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f68085b;

    public c(String imageUrl, HashMap auxData) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f68084a = imageUrl;
        this.f68085b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f68084a, cVar.f68084a) && Intrinsics.d(this.f68085b, cVar.f68085b);
    }

    public final int hashCode() {
        return this.f68085b.hashCode() + (this.f68084a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageOutpaintLoaded(imageUrl=" + this.f68084a + ", auxData=" + this.f68085b + ")";
    }
}
