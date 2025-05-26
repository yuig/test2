package s1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class t implements androidx.compose.foundation.lazy.layout.q {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f110538a;

    /* renamed from: b, reason: collision with root package name */
    public final kl2.m f110539b;

    public t(Function1 function1, kl2.m mVar) {
        this.f110538a = function1;
        this.f110539b = mVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final Function1 getKey() {
        return this.f110538a;
    }
}
