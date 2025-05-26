package jy;

import ey.b2;
import ey.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends z1 implements b2 {

    /* renamed from: e, reason: collision with root package name */
    public final String f77703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String pinUid, String str) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f77703e = str;
    }

    @Override // ey.u1
    public final String e() {
        return "load_big_image";
    }

    @Override // ey.u1
    public final String g() {
        return h.f77707a;
    }

    public final String m() {
        return this.f77703e;
    }
}
