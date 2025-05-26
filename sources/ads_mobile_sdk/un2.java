package ads_mobile_sdk;

import java.io.File;

/* loaded from: classes2.dex */
public final class un2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12142a;

    public un2(a.o8 o8Var) {
        this.f12142a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        return new File(new File((File) this.f12142a.get(), "dgd"), "pmtd");
    }
}
