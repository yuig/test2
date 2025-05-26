package hl0;

import androidx.appcompat.widget.c2;
import ao2.j0;
import com.pinterest.api.model.v7;
import kl0.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69480r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f69481s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v7 f69482t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, v7 v7Var, bl2.c cVar) {
        super(2, cVar);
        this.f69481s = vVar;
        this.f69482t = v7Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f69481s, this.f69482t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69480r;
        v vVar = this.f69481s;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = vVar.f69519f;
            this.f69480r = 1;
            if (l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        com.pinterest.feature.board.detail.a aVar2 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
        if (aVar2 != null) {
            z zVar = (z) aVar2;
            v7 board = this.f69482t;
            Intrinsics.checkNotNullParameter(board, "board");
            c2 c2Var = zVar.f80140i1;
            if (c2Var == null) {
                Intrinsics.r("sharesheetUtils");
                throw null;
            }
            c2Var.n(board, 5, zVar.f7(), true, 1);
        }
        return Unit.f80348a;
    }
}
