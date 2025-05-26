package ads_mobile_sdk;

import a.z1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xh implements a.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f13664a;

    public xh(z1 refreshListener) {
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.f13664a = refreshListener;
    }

    @Override // a.g6
    public final Object c(bl2.c cVar) {
        Object a13 = this.f13664a.a(cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
