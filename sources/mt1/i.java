package mt1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i implements b, e {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f88158a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f88159b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88160c;

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f88158a = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f88159b = doneProducingCallback;
    }

    @Override // mt1.e
    public final void e(Object obj) {
        Function1 function1 = this.f88158a;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }

    @Override // mt1.e
    public final void f() {
        Function0 function0 = this.f88159b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // mt1.a
    public void g() {
        this.f88160c = true;
        Function0 function0 = this.f88159b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public String toString() {
        return "Simple consumer producer: receivedEndOfInput? [" + this.f88160c + "]";
    }
}
