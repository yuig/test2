package ab2;

import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ni1.u0;

/* loaded from: classes2.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1743r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ti1.f f1744s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PinVideoGridCell f1745t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ti1.f fVar, PinVideoGridCell pinVideoGridCell, bl2.c cVar) {
        super(2, cVar);
        this.f1744s = fVar;
        this.f1745t = pinVideoGridCell;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f1744s, this.f1745t, cVar);
        fVar.f1743r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u0 u0Var = (u0) this.f1743r;
        this.f1744s.bindDisplayState(u0Var);
        ti1.a aVar2 = u0Var.f90827u;
        if (aVar2 != null) {
            Intrinsics.f(aVar2);
            this.f1745t.calculatedFields = aVar2;
        }
        return Unit.f80348a;
    }
}
