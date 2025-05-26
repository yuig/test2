package y1;

import do2.f2;
import do2.x1;
import i1.f1;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136537r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f136538s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f136539t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f136538s = gVar;
        this.f136539t = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f136538s, this.f136539t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136537r;
        if (i13 == 0) {
            ue.c.H(obj);
            a aVar2 = a.f136514j;
            this.f136537r = 1;
            if (bs1.c.K0(getContext()).d(new f1(5, aVar2), this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                throw new KotlinNothingValueException();
            }
            ue.c.H(obj);
        }
        x1 j13 = this.f136538s.j();
        if (j13 == null) {
            return Unit.f80348a;
        }
        b bVar = new b(this.f136539t, 0);
        this.f136537r = 2;
        if (f2.j((f2) j13, bVar, this) == aVar) {
            return aVar;
        }
        throw new KotlinNothingValueException();
    }
}
