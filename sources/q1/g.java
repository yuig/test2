package q1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class g implements androidx.compose.foundation.lazy.layout.q {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f101899a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f101900b;

    /* renamed from: c, reason: collision with root package name */
    public final kl2.m f101901c;

    public g(Function1 function1, Function1 function12, q2.h hVar) {
        this.f101899a = function1;
        this.f101900b = function12;
        this.f101901c = hVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final Function1 getKey() {
        return this.f101899a;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final Function1 getType() {
        return this.f101900b;
    }
}
