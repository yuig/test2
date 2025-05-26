package ads_mobile_sdk;

import a.r7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nm.s;

/* loaded from: classes2.dex */
public final class mj1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oj1 f8257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(s sVar, oj1 oj1Var, bl2.c cVar) {
        super(2, cVar);
        this.f8256b = sVar;
        this.f8257c = oj1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mj1(this.f8256b, this.f8257c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mj1(this.f8256b, this.f8257c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8255a;
        if (i13 == 0) {
            ue.c.H(obj);
            nm.u a13 = k41.a(this.f8256b);
            if (a13 == null) {
                return null;
            }
            oj1 oj1Var = this.f8257c;
            this.f8255a = 1;
            obj = oj1.a(oj1Var, a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return (r7) obj;
    }
}
