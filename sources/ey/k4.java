package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k4 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f60528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(String pinUid, String str) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f60528e = str;
    }

    @Override // ey.u1
    public final String e() {
        return "idea_pin_image_load";
    }

    @Override // ey.u1
    public final String g() {
        return b5.f60449a;
    }
}
