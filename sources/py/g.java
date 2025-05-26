package py;

import ey.b2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends d implements b2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
    }

    @Override // py.d, ey.u1
    public final String e() {
        return "load_image";
    }

    @Override // ey.u1
    public final String g() {
        String str = j.f101729a;
        return j.f101729a;
    }
}
