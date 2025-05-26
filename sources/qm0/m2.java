package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m2 implements l82.i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m2 f104307c = new m2(u50.h0.f120562a);

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f104308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104309b;

    public m2(u50.i0 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104308a = title;
        this.f104309b = String.valueOf(title.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && Intrinsics.d(this.f104308a, ((m2) obj).f104308a);
    }

    public final int hashCode() {
        return this.f104308a.hashCode();
    }

    public final String toString() {
        return "SectionHeader(title=" + this.f104308a + ")";
    }
}
