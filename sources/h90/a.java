package h90;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f68232a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68233b;

    public a(wy0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f68232a = model;
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f68233b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f68232a, ((a) obj).f68232a);
    }

    @Override // h90.c
    public final String getId() {
        return this.f68233b;
    }

    public final int hashCode() {
        return this.f68232a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("ImageCloseupVMState(model="), this.f68232a, ")");
    }
}
