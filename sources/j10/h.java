package j10;

import com.pinterest.api.model.d20;
import com.pinterest.api.model.deserializer.PayoutsDeserializer;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yn2.p;

/* loaded from: classes3.dex */
public final class h extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public PayoutsDeserializer f74358s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f74359t;

    /* renamed from: u, reason: collision with root package name */
    public int f74360u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f74361v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vd0.a f74362w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PayoutsDeserializer f74363x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vd0.a aVar, PayoutsDeserializer payoutsDeserializer, bl2.c<? super h> cVar) {
        super(2, cVar);
        this.f74362w = aVar;
        this.f74363x = payoutsDeserializer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f74362w, this.f74363x, cVar);
        hVar.f74361v = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        PayoutsDeserializer payoutsDeserializer;
        p pVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74360u;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar2 = (p) this.f74361v;
            it = this.f74362w.iterator();
            payoutsDeserializer = this.f74363x;
            pVar = pVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f74359t;
            payoutsDeserializer = this.f74358s;
            pVar = (p) this.f74361v;
            ue.c.H(obj);
        }
        while (it.hasNext()) {
            vd0.c cVar = (vd0.c) it.next();
            Intrinsics.f(cVar);
            payoutsDeserializer.getClass();
            Object e13 = vd0.c.f125622b.e(cVar.f125623a, d20.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Payee");
            this.f74361v = pVar;
            this.f74358s = payoutsDeserializer;
            this.f74359t = it;
            this.f74360u = 1;
            if (pVar.b((d20) e13, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
