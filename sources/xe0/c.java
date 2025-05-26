package xe0;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import we1.p1;

/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f134662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134663b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f134664c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134665d;

    public c(String imageUrl, p1 p1Var, boolean z13, int i13) {
        imageUrl = (i13 & 2) != 0 ? "" : imageUrl;
        p1Var = (i13 & 4) != 0 ? null : p1Var;
        z13 = (i13 & 8) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f134662a = "";
        this.f134663b = imageUrl;
        this.f134664c = p1Var;
        this.f134665d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f134662a, cVar.f134662a) && Intrinsics.d(this.f134663b, cVar.f134663b) && Intrinsics.d(this.f134664c, cVar.f134664c) && this.f134665d == cVar.f134665d;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f134663b, this.f134662a.hashCode() * 31, 31);
        Function0 function0 = this.f134664c;
        return Boolean.hashCode(this.f134665d) + ((d2 + (function0 == null ? 0 : function0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UrlImageStackItem(id=");
        sb3.append(this.f134662a);
        sb3.append(", imageUrl=");
        sb3.append(this.f134663b);
        sb3.append(", onImageClick=");
        sb3.append(this.f134664c);
        sb3.append(", shouldAddPinWash=");
        return a.a.r(sb3, this.f134665d, ")");
    }
}
