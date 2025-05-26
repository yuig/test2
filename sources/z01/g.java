package z01;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import x02.i2;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140547r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f140548s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f140549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f140548s = kVar;
        this.f140549t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f140548s, this.f140549t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140547r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.c x13 = ve.h.x((i2) this.f140548s.f140566e, this.f140549t);
            this.f140547r = 1;
            obj = l0.f0(x13, this);
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
