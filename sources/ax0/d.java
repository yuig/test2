package ax0;

import com.pinterest.api.model.vh;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import yw0.n;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f20603a;

    /* renamed from: b, reason: collision with root package name */
    public final vh f20604b;

    /* renamed from: c, reason: collision with root package name */
    public final n f20605c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20606d;

    public d(i0 context, vh productPinStory, String clientTrackingParams) {
        n moduleVariant = n.DROPDOWN;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productPinStory, "productPinStory");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        this.f20603a = context;
        this.f20604b = productPinStory;
        this.f20605c = moduleVariant;
        this.f20606d = clientTrackingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f20603a, dVar.f20603a) && Intrinsics.d(this.f20604b, dVar.f20604b) && this.f20605c == dVar.f20605c && Intrinsics.d(this.f20606d, dVar.f20606d);
    }

    public final int hashCode() {
        return this.f20606d.hashCode() + ((this.f20605c.hashCode() + ((this.f20604b.hashCode() + (this.f20603a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShowProductPinStorySideEffectRequest(context=" + this.f20603a + ", productPinStory=" + this.f20604b + ", moduleVariant=" + this.f20605c + ", clientTrackingParams=" + this.f20606d + ")";
    }
}
