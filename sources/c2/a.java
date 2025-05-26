package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24514r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f24515s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f24516t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar, float f13, bl2.c cVar) {
        super(2, cVar);
        this.f24515s = wVar;
        this.f24516t = f13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f24515s, this.f24516t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object n13;
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24514r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f24514r = 1;
            w wVar = this.f24515s;
            Object value = wVar.f25331g.getValue();
            float f13 = wVar.f();
            float f14 = this.f24516t;
            Object c13 = wVar.c(f13, f14, value);
            if (((Boolean) wVar.f25328d.invoke(c13)).booleanValue()) {
                n13 = j1.n(wVar, c13, f14, this);
                if (n13 != obj2) {
                    n13 = Unit.f80348a;
                }
            } else {
                n13 = j1.n(wVar, value, f14, this);
                if (n13 != obj2) {
                    n13 = Unit.f80348a;
                }
            }
            if (n13 == obj2) {
                return obj2;
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
