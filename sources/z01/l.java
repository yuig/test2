package z01;

import ao2.j0;
import com.pinterest.api.model.PinFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uj2.b0;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140570r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ mb0.a f140571s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f140572t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mb0.a aVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f140571s = aVar;
        this.f140572t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f140571s, this.f140572t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140570r;
        if (i13 == 0) {
            ue.c.H(obj);
            b0<PinFeed> a13 = ((z12.c) this.f140571s.f86862b).a(this.f140572t);
            this.f140570r = 1;
            obj = kh2.j.p(a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
