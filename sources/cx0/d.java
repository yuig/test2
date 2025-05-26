package cx0;

import bx0.z;
import com.pinterest.api.model.vh;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f53344a;

    /* renamed from: b, reason: collision with root package name */
    public final vh f53345b;

    /* renamed from: c, reason: collision with root package name */
    public final z f53346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f53347d;

    public d(i0 context, vh productPinStory, z moduleVariant, String clientTrackingParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productPinStory, "productPinStory");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        this.f53344a = context;
        this.f53345b = productPinStory;
        this.f53346c = moduleVariant;
        this.f53347d = clientTrackingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f53344a, dVar.f53344a) && Intrinsics.d(this.f53345b, dVar.f53345b) && this.f53346c == dVar.f53346c && Intrinsics.d(this.f53347d, dVar.f53347d);
    }

    public final int hashCode() {
        return this.f53347d.hashCode() + ((this.f53346c.hashCode() + ((this.f53345b.hashCode() + (this.f53344a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShowProductPinStorySideEffectRequest(context=" + this.f53344a + ", productPinStory=" + this.f53345b + ", moduleVariant=" + this.f53346c + ", clientTrackingParams=" + this.f53347d + ")";
    }
}
