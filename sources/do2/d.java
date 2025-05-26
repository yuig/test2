package do2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class d extends eo2.f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55748f = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final co2.b0 f55749d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f55750e;

    public /* synthetic */ d(co2.b0 b0Var, boolean z13) {
        this(b0Var, z13, kotlin.coroutines.j.f80412a, -3, co2.a.SUSPEND);
    }

    @Override // eo2.f
    public final String c() {
        return "channel=" + this.f55749d;
    }

    @Override // eo2.f, do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        if (this.f59759b != -3) {
            Object collect = super.collect(jVar, cVar);
            return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
        }
        boolean z13 = this.f55750e;
        if (z13 && f55748f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object i03 = bs1.c.i0(jVar, this.f55749d, z13, cVar);
        return i03 == cl2.a.COROUTINE_SUSPENDED ? i03 : Unit.f80348a;
    }

    @Override // eo2.f
    public final Object d(co2.z zVar, bl2.c cVar) {
        Object i03 = bs1.c.i0(new eo2.o0(zVar), this.f55749d, this.f55750e, cVar);
        return i03 == cl2.a.COROUTINE_SUSPENDED ? i03 : Unit.f80348a;
    }

    @Override // eo2.f
    public final eo2.f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new d(this.f55749d, this.f55750e, coroutineContext, i13, aVar);
    }

    @Override // eo2.f
    public final i f() {
        return new d(this.f55749d, this.f55750e);
    }

    @Override // eo2.f
    public final co2.b0 g(ao2.j0 j0Var) {
        if (!this.f55750e || f55748f.getAndSet(this, 1) == 0) {
            return this.f59759b == -3 ? this.f55749d : super.g(j0Var);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public d(co2.b0 b0Var, boolean z13, CoroutineContext coroutineContext, int i13, co2.a aVar) {
        super(coroutineContext, i13, aVar);
        this.f55749d = b0Var;
        this.f55750e = z13;
        this.consumed$volatile = 0;
    }
}
