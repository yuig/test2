package e2;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import j1.o2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56881r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f56882s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f56882s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f56882s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56881r;
        if (i13 == 0) {
            ue.c.H(obj);
            j1.d dVar = this.f56882s.f56896h;
            Float f13 = new Float(1.0f);
            o2 r13 = j1.e.r(RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS, 0, j1.g0.f74072c, 2);
            this.f56881r = 1;
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
