package sa0;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112173r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f112174s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f112174s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f112174s, cVar);
        iVar.f112173r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CutoutModel) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f112174s.a(new c((CutoutModel) this.f112173r));
        return Unit.f80348a;
    }
}
