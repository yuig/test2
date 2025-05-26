package hl0;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.ta;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f69484s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f69484s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f69484s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69483r;
        v vVar = this.f69484s;
        if (i13 == 0) {
            ue.c.H(obj);
            qz.k kVar = vVar.D;
            this.f69483r = 1;
            obj = kVar.c(vVar.f69509a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        ta taVar = (ta) k3.f0((NetworkResponse) obj);
        String id3 = taVar != null ? taVar.getId() : null;
        if (id3 == null) {
            id3 = "";
        }
        vVar.f69512b0 = i91.b.a(vVar.f69512b0, false, id3, null, 5);
        return Unit.f80348a;
    }
}
