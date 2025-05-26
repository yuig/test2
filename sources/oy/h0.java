package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 extends j0 implements ey.b2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
    }

    @Override // oy.j0, ey.u1
    public final String e() {
        return "perceived_video_load";
    }

    @Override // ey.u1
    public final String g() {
        StringBuilder i13 = n60.o.i(l0.f98134a);
        i13.append(this.f60634c);
        return i13.toString();
    }
}
