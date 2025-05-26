package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class va2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va2(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f12413b = str;
        this.f12414c = str2;
        this.f12415d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new va2(this.f12413b, this.f12414c, this.f12415d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((va2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12412a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f12413b, "] on listener [", this.f12414c, "]");
            a.bg bgVar = (a.bg) this.f12415d;
            this.f12412a = 1;
            if (bgVar.j(this) == aVar) {
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
