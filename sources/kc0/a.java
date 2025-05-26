package kc0;

import kotlin.jvm.internal.Intrinsics;
import u50.e;
import u50.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f79128a;

    /* renamed from: b, reason: collision with root package name */
    public final i f79129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79130c;

    public a(String str, i iVar, int i13) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? new e(eo1.a.sema_color_background_transparent) : iVar, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f79128a, aVar.f79128a) && Intrinsics.d(this.f79129b, aVar.f79129b) && this.f79130c == aVar.f79130c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79130c) + ((this.f79129b.hashCode() + (this.f79128a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PseudoPinDisplayState(imageUrl=");
        sb3.append(this.f79128a);
        sb3.append(", dominantColor=");
        sb3.append(this.f79129b);
        sb3.append(", enableDominantColorPlaceholder=");
        return a.a.r(sb3, this.f79130c, ")");
    }

    public a(String imageUrl, i dominantColor, boolean z13) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(dominantColor, "dominantColor");
        this.f79128a = imageUrl;
        this.f79129b = dominantColor;
        this.f79130c = z13;
    }
}
