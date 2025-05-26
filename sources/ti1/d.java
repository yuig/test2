package ti1;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SbaPinRep f117708a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f117709b;

    /* renamed from: c, reason: collision with root package name */
    public final wa2.m f117710c;

    public d(SbaPinRep value, o2 vm3) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(vm3, "vm");
        this.f117708a = value;
        this.f117709b = vm3;
        this.f117710c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f117708a, dVar.f117708a) && Intrinsics.d(this.f117709b, dVar.f117709b) && Intrinsics.d(this.f117710c, dVar.f117710c);
    }

    public final int hashCode() {
        int hashCode = (this.f117709b.hashCode() + (this.f117708a.hashCode() * 31)) * 31;
        wa2.m mVar = this.f117710c;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "SbaPinRep(value=" + this.f117708a + ", vm=" + this.f117709b + ", boundPinFeatureConfig=" + this.f117710c + ")";
    }
}
