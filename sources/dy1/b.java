package dy1;

import a.cb;
import f0.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: b, reason: collision with root package name */
    public final String f56644b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56645c;

    /* renamed from: d, reason: collision with root package name */
    public final String f56646d;

    /* renamed from: e, reason: collision with root package name */
    public final String f56647e;

    public b(String title, String subtitle, String okButtonText, String dismissButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(okButtonText, "okButtonText");
        Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
        this.f56644b = title;
        this.f56645c = subtitle;
        this.f56646d = okButtonText;
        this.f56647e = dismissButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f56644b, bVar.f56644b) && Intrinsics.d(this.f56645c, bVar.f56645c) && Intrinsics.d(this.f56646d, bVar.f56646d) && Intrinsics.d(this.f56647e, bVar.f56647e);
    }

    public final int hashCode() {
        return this.f56647e.hashCode() + cb.d(this.f56646d, cb.d(this.f56645c, this.f56644b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Success(title=");
        sb3.append(this.f56644b);
        sb3.append(", subtitle=");
        sb3.append(this.f56645c);
        sb3.append(", okButtonText=");
        sb3.append(this.f56646d);
        sb3.append(", dismissButtonText=");
        return a.a.p(sb3, this.f56647e, ")");
    }
}
