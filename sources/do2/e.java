package do2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public class e extends eo2.f {

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f55760d;

    public e(Function2 function2, CoroutineContext coroutineContext, int i13, co2.a aVar) {
        super(coroutineContext, i13, aVar);
        this.f55760d = function2;
    }

    @Override // eo2.f
    public Object d(co2.z zVar, bl2.c cVar) {
        Object invoke = this.f55760d.invoke(zVar, cVar);
        return invoke == cl2.a.COROUTINE_SUSPENDED ? invoke : Unit.f80348a;
    }

    @Override // eo2.f
    public eo2.f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new e(this.f55760d, coroutineContext, i13, aVar);
    }

    @Override // eo2.f
    public final String toString() {
        return "block[" + this.f55760d + "] -> " + super.toString();
    }
}
