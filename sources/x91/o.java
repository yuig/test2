package x91;

import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f134347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f134348s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f134348s = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f134348s, cVar);
        oVar.f134347r = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f134347r;
        int i13 = s.L0;
        s sVar = this.f134348s;
        pp2.a.k((GestaltText) sVar.I0.getValue(), new y71.b(6, sVar, aVar2));
        GestaltSearchField gestaltSearchField = sVar.H0;
        if (gestaltSearchField != null) {
            c0.d.j(gestaltSearchField, new q91.h(aVar2, 5));
            return Unit.f80348a;
        }
        Intrinsics.r("searchField");
        throw null;
    }
}
