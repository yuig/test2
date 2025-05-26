package ads_mobile_sdk;

import java.io.File;

/* loaded from: classes2.dex */
public final class vn2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12575a;

    public vn2(a.o8 o8Var) {
        this.f12575a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        return new File(new File((File) this.f12575a.get(), "dgd"), "pcopt");
    }
}
