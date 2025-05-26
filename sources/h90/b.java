package h90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f68237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68238b;

    public b(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f68237a = model;
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f68238b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f68237a, ((b) obj).f68237a);
    }

    @Override // h90.c
    public final String getId() {
        return this.f68238b;
    }

    public final int hashCode() {
        return this.f68237a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinCloseupVMState(model="), this.f68237a, ")");
    }
}
