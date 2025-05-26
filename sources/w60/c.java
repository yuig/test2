package w60;

import ao2.j0;
import com.pinterest.boardAutoCollages.t;
import com.pinterest.boardAutoCollages.u;
import com.pinterest.boardAutoCollages.v;
import dl2.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.a0;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f128116r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f128117s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f128116r = vVar;
        this.f128117s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f128116r, this.f128117s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        v vVar = this.f128116r;
        if (vVar instanceof t) {
            t tVar = (t) vVar;
            kg.t.L0(new a0(), tVar.f44596a, null, d32.c.COLLAGES_TAB, tVar.f44597b, 4);
        } else if (vVar instanceof u) {
            this.f128117s.f128119b.E("DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_CODE", e0.t.j(new Pair("DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_KEY", ((u) vVar).f44598a)));
        }
        return Unit.f80348a;
    }
}
