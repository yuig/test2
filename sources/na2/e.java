package na2;

import a.cb;
import dc0.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final q f90104a;

    /* renamed from: b, reason: collision with root package name */
    public final List f90105b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90106c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90107d;

    public e(q sectionRepSize, List imageData, String sectionTitle, int i13) {
        Intrinsics.checkNotNullParameter(sectionRepSize, "sectionRepSize");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        this.f90104a = sectionRepSize;
        this.f90105b = imageData;
        this.f90106c = sectionTitle;
        this.f90107d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f90104a == eVar.f90104a && Intrinsics.d(this.f90105b, eVar.f90105b) && Intrinsics.d(this.f90106c, eVar.f90106c) && this.f90107d == eVar.f90107d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90107d) + cb.d(this.f90106c, ep.b.c(this.f90105b, this.f90104a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "LegoSectionRepViewModel(sectionRepSize=" + this.f90104a + ", imageData=" + this.f90105b + ", sectionTitle=" + this.f90106c + ", numPinsInSection=" + this.f90107d + ")";
    }
}
