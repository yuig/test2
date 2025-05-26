package l62;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f81700s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f81701t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f81700s = a0Var;
        this.f81701t = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z(this.f81700s, this.f81701t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81699r;
        a0 a0Var = this.f81700s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f81699r = 1;
            obj = a0.a(a0Var, this.f81701t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        a0Var.f81618d.invoke(new v((Bitmap) obj));
        return Unit.f80348a;
    }
}
