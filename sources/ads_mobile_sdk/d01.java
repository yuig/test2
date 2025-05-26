package ads_mobile_sdk;

import bj.n;
import java.util.Set;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4082a;

    public d01(a.o8 o8Var) {
        this.f4082a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        n nativeRequest = (n) this.f4082a.get();
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Set b13 = nativeRequest.k() != null ? kotlin.collections.g1.b(h92.f5900f) : s0.f80394a;
        kh2.a1.p(b13);
        return b13;
    }
}
