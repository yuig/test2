package mt1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f88161a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f88162b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88163c;

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f88162b = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f88161a = doneProducingCallback;
    }

    @Override // mt1.e
    public final void e(Object obj) {
        Function1 function1 = this.f88162b;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }

    @Override // mt1.e
    public final void f() {
        this.f88163c = true;
        Function0 function0 = this.f88161a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final String toString() {
        return "Simple Producer: sent done-producing? [" + this.f88163c + "]";
    }
}
