package ew1;

import a.cb;
import kg.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends t {

    /* renamed from: d, reason: collision with root package name */
    public final String f60354d;

    /* renamed from: e, reason: collision with root package name */
    public final String f60355e;

    /* renamed from: f, reason: collision with root package name */
    public final String f60356f;

    /* renamed from: g, reason: collision with root package name */
    public final String f60357g;

    public i(String description, String okButtonText, String okButtonUri, String dismissButtonText) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(okButtonText, "okButtonText");
        Intrinsics.checkNotNullParameter(okButtonUri, "okButtonUri");
        Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
        this.f60354d = description;
        this.f60355e = okButtonText;
        this.f60356f = okButtonUri;
        this.f60357g = dismissButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f60354d, iVar.f60354d) && Intrinsics.d(this.f60355e, iVar.f60355e) && Intrinsics.d(this.f60356f, iVar.f60356f) && Intrinsics.d(this.f60357g, iVar.f60357g);
    }

    public final int hashCode() {
        return this.f60357g.hashCode() + cb.d(this.f60356f, cb.d(this.f60355e, this.f60354d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Success(description=");
        sb3.append(this.f60354d);
        sb3.append(", okButtonText=");
        sb3.append(this.f60355e);
        sb3.append(", okButtonUri=");
        sb3.append(this.f60356f);
        sb3.append(", dismissButtonText=");
        return a.a.p(sb3, this.f60357g, ")");
    }
}
