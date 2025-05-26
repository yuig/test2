package ea;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f57930r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f57931s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f57931s = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f57931s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f57930r;
        if (i13 == 0) {
            ue.c.H(obj);
            fa.b bVar = this.f57931s.f57945a;
            this.f57930r = 1;
            obj = bVar.b(this);
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
