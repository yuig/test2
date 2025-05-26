package s1;

import androidx.compose.foundation.lazy.layout.w0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class a0 extends androidx.compose.foundation.lazy.layout.o {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f110366a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f110367b;

    public a0(kl2.m mVar, Function1 function1, int i13) {
        this.f110366a = function1;
        w0 w0Var = new w0();
        w0Var.a(i13, new t(function1, mVar));
        this.f110367b = w0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final w0 m() {
        return this.f110367b;
    }
}
