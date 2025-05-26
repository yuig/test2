package cw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f53332a;

    /* renamed from: b, reason: collision with root package name */
    public final float f53333b;

    public a(String title, float f13) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f53332a = title;
        this.f53333b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53332a, aVar.f53332a) && Float.compare(this.f53333b, aVar.f53333b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f53333b) + (this.f53332a.hashCode() * 31);
    }

    public final String toString() {
        return "BarChart(title=" + this.f53332a + ", progress=" + this.f53333b + ")";
    }
}
