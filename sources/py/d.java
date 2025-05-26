package py;

import ey.u1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final String f101721c;

    public d(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f101721c = pinUid;
    }

    @Override // ey.u1
    public final String b() {
        return this.f101721c;
    }

    @Override // ey.u1
    public String e() {
        String str = j.f101729a;
        return j.f101729a;
    }
}
