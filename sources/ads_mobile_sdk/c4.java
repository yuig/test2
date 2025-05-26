package ads_mobile_sdk;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class c4 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3729a;

    public c4(xv0 xv0Var) {
        this.f3729a = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        File dir = ((Context) this.f3729a.get()).getDir("yqzdkcache", 0);
        kh2.a1.p(dir);
        return dir;
    }
}
