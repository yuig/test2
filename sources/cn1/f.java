package cn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f28189a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f28190b;

    public f(u50.i0 contentDescription, rm1.q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f28189a = icon;
        this.f28190b = contentDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f28189a == fVar.f28189a && Intrinsics.d(this.f28190b, fVar.f28190b);
    }

    public final int hashCode() {
        return this.f28190b.hashCode() + (this.f28189a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldTrailingIconButtonDisplayState(icon=" + this.f28189a + ", contentDescription=" + this.f28190b + ")";
    }
}
