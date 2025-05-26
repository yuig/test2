package qd1;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import dl2.j;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import od1.a0;
import pd1.e;
import pd1.f;
import u50.r;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f103580r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ mb0.a f103581s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0 f103582t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f103583u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mb0.a aVar, a0 a0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f103581s = aVar;
        this.f103582t = a0Var;
        this.f103583u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f103581s, this.f103582t, this.f103583u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f103580r;
        r rVar = this.f103583u;
        mb0.a aVar2 = this.f103581s;
        if (i13 == 0) {
            ue.c.H(obj);
            boolean isEmpty = ((e) aVar2.f86862b).f99812d.isEmpty();
            Object obj2 = aVar2.f86862b;
            if (!isEmpty) {
                rVar.a(new od1.e(((e) obj2).f99812d));
                return Unit.f80348a;
            }
            f fVar = this.f103582t.f94107a;
            this.f103580r = 1;
            obj = ((e) obj2).a(6, null, fVar, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        if (k3.s1((NetworkResponse) obj)) {
            rVar.a(new od1.e(((e) aVar2.f86862b).f99812d));
        }
        return Unit.f80348a;
    }
}
