package j10;

import com.pinterest.api.model.d80;
import com.pinterest.api.model.deserializer.ProductReviewDeserializer;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yn2.p;

/* loaded from: classes3.dex */
public final class j extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public ProductReviewDeserializer f74370s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f74371t;

    /* renamed from: u, reason: collision with root package name */
    public int f74372u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f74373v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vd0.a f74374w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductReviewDeserializer f74375x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vd0.a aVar, ProductReviewDeserializer productReviewDeserializer, bl2.c<? super j> cVar) {
        super(2, cVar);
        this.f74374w = aVar;
        this.f74375x = productReviewDeserializer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f74374w, this.f74375x, cVar);
        jVar.f74373v = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        ProductReviewDeserializer productReviewDeserializer;
        p pVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74372u;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar2 = (p) this.f74373v;
            it = this.f74374w.iterator();
            productReviewDeserializer = this.f74375x;
            pVar = pVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f74371t;
            productReviewDeserializer = this.f74370s;
            pVar = (p) this.f74373v;
            ue.c.H(obj);
        }
        while (it.hasNext()) {
            vd0.c cVar = (vd0.c) it.next();
            Intrinsics.f(cVar);
            productReviewDeserializer.getClass();
            d80 e13 = ProductReviewDeserializer.e(cVar);
            this.f74373v = pVar;
            this.f74370s = productReviewDeserializer;
            this.f74371t = it;
            this.f74372u = 1;
            if (pVar.b(e13, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
