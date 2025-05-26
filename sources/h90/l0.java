package h90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f68270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68271b;

    public l0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f68270a = model;
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f68271b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f68270a, ((l0) obj).f68270a);
    }

    @Override // h90.n0
    public final String getId() {
        return this.f68271b;
    }

    public final int hashCode() {
        return this.f68270a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinItemVMState(model="), this.f68270a, ")");
    }
}
