package ed1;

import com.pinterest.api.model.v7;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x02.x0;

/* loaded from: classes5.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58708r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f58709s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f58710t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f58709s = vVar;
        this.f58710t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f58709s, this.f58710t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58708r;
        v vVar = this.f58709s;
        if (i13 == 0) {
            ue.c.H(obj);
            x0 x0Var = vVar.f58713c;
            this.f58708r = 1;
            obj = ve.h.y(x0Var, this.f58710t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        v7 v7Var = (v7) obj;
        if (v7Var != null) {
            vVar.f58722l = v7Var;
            if (vVar.isBound()) {
                ((SharesheetBoardPreviewContainer) vVar.getView()).setLoadState(yk1.i.LOADING);
            }
            this.f58708r = 2;
            if (vVar.f58718h.a(v7Var)) {
                obj2 = vVar.q3(v7Var, this);
                if (obj2 != aVar) {
                    obj2 = Unit.f80348a;
                }
            } else {
                obj2 = Unit.f80348a;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
