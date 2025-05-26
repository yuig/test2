package e2;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import j1.o2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56879r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f56880s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f56880s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f56880s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56879r;
        if (i13 == 0) {
            ue.c.H(obj);
            j1.d dVar = this.f56880s.f56895g;
            Float f13 = new Float(1.0f);
            o2 r13 = j1.e.r(RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS, 0, j1.g0.f74070a, 2);
            this.f56879r = 1;
            if (j1.d.c(dVar, f13, r13, this) == aVar) {
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
