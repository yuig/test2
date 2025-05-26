package xe1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public wa2.i f134754a;

    /* renamed from: b, reason: collision with root package name */
    public wa2.i f134755b;

    /* renamed from: c, reason: collision with root package name */
    public wa2.i f134756c;

    /* renamed from: d, reason: collision with root package name */
    public wa2.i f134757d;

    public final wa2.i a(ue1.t repStyle) {
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        int i13 = q.f134753a[repStyle.ordinal()];
        if (i13 == 1) {
            return this.f134754a;
        }
        if (i13 == 2) {
            return this.f134756c;
        }
        if (i13 == 3) {
            return this.f134755b;
        }
        if (i13 == 4) {
            return this.f134757d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f134754a, rVar.f134754a) && Intrinsics.d(this.f134755b, rVar.f134755b) && Intrinsics.d(this.f134756c, rVar.f134756c) && Intrinsics.d(this.f134757d, rVar.f134757d);
    }

    public final int hashCode() {
        return this.f134757d.hashCode() + ((this.f134756c.hashCode() + ((this.f134755b.hashCode() + (this.f134754a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinFeatureConfigStyles(pinRepFeatureConfig=" + this.f134754a + ", ideaPinRepFeatureConfig=" + this.f134755b + ", shoppingPinRepFeatureConfig=" + this.f134756c + ", imageOnlyPinRepFeatureConfig=" + this.f134757d + ")";
    }
}
