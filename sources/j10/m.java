package j10;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.deserializer.UserDidItDataDeserializer;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yn2.p;

/* loaded from: classes3.dex */
public final class m extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public UserDidItDataDeserializer f74378s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f74379t;

    /* renamed from: u, reason: collision with root package name */
    public int f74380u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f74381v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vd0.a f74382w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ UserDidItDataDeserializer f74383x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vd0.a aVar, UserDidItDataDeserializer userDidItDataDeserializer, bl2.c<? super m> cVar) {
        super(2, cVar);
        this.f74382w = aVar;
        this.f74383x = userDidItDataDeserializer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f74382w, this.f74383x, cVar);
        mVar.f74381v = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        UserDidItDataDeserializer userDidItDataDeserializer;
        p pVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74380u;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar2 = (p) this.f74381v;
            it = this.f74382w.iterator();
            userDidItDataDeserializer = this.f74383x;
            pVar = pVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f74379t;
            userDidItDataDeserializer = this.f74378s;
            pVar = (p) this.f74381v;
            ue.c.H(obj);
        }
        while (it.hasNext()) {
            vd0.c cVar = (vd0.c) it.next();
            Intrinsics.f(cVar);
            userDidItDataDeserializer.getClass();
            az0 e13 = UserDidItDataDeserializer.e(cVar);
            this.f74381v = pVar;
            this.f74378s = userDidItDataDeserializer;
            this.f74379t = it;
            this.f74380u = 1;
            if (pVar.b(e13, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
