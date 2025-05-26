package ads_mobile_sdk;

import java.io.File;

/* loaded from: classes2.dex */
public final class yn2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14344a;

    public yn2(a.o8 o8Var) {
        this.f14344a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        return new File(new File((File) this.f14344a.get(), "dgd"), "pcam.jar.tmp");
    }
}
