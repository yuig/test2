package h90;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f68274a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68275b;

    public m0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f68274a = model;
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f68275b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f68274a, ((m0) obj).f68274a);
    }

    @Override // h90.n0
    public final String getId() {
        return this.f68275b;
    }

    public final int hashCode() {
        return this.f68274a.hashCode();
    }

    public final String toString() {
        return "StoryItemVMState(model=" + this.f68274a + ")";
    }
}
