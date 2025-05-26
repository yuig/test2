package xv;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends i {
    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        e eVar = this.f136012g;
        if (eVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        f30 f30Var = eVar.f135998d;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String id3 = f30Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }
}
