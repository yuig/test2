package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class v4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f25314r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f25315s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f25316t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(boolean z13, w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f25315s = z13;
        this.f25316t = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v4(this.f25315s, this.f25316t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25314r;
        if (i13 == 0) {
            ue.c.H(obj);
            w wVar = this.f25316t;
            boolean booleanValue = ((Boolean) wVar.f25331g.getValue()).booleanValue();
            boolean z13 = this.f25315s;
            if (z13 != booleanValue) {
                Boolean valueOf = Boolean.valueOf(z13);
                this.f25314r = 1;
                if (j1.n(wVar, valueOf, wVar.f25335k.h(), this) == aVar) {
                    return aVar;
                }
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
