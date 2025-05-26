package qb;

import co2.z;
import dl2.j;
import i2.j2;
import kb.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f103380r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f103381s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f103382t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f103382t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f103382t, cVar);
        bVar.f103381s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f103380r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f103381s;
            c cVar = this.f103382t;
            a listener = new a(cVar, zVar);
            rb.f fVar = cVar.f103383a;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            synchronized (fVar.f107062c) {
                try {
                    if (fVar.f107063d.add(listener)) {
                        if (fVar.f107063d.size() == 1) {
                            fVar.f107064e = fVar.a();
                            b0.e().a(rb.g.f107065a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f107064e);
                            fVar.c();
                        }
                        listener.a(fVar.f107064e);
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            j2 j2Var = new j2(3, this.f103382t, listener);
            this.f103380r = 1;
            if (dl2.b.w(zVar, j2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
