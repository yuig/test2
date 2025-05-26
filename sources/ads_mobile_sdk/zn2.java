package ads_mobile_sdk;

import java.io.File;

/* loaded from: classes2.dex */
public final class zn2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14844a;

    public zn2(a.o8 o8Var) {
        this.f14844a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        return new File(new File((File) this.f14844a.get(), "dgd"), "pcam.jar");
    }
}
