package al1;

import ao2.j0;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y01.l1;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f15492r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w60.d f15493s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, w60.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f15492r = iVar;
        this.f15493s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f15492r, this.f15493s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i iVar = this.f15492r;
        boolean z13 = iVar instanceof a;
        w60.d dVar = this.f15493s;
        if (z13) {
            dVar.f128119b.f(((a) iVar).f15476a);
        } else {
            int i13 = 3;
            if (iVar instanceof h) {
                ll.j jVar = dVar.f128119b;
                Navigation navigation = ((h) iVar).f15486a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                jVar.g(new l1(i13, navigation));
            } else if (iVar instanceof b) {
                dVar.f128119b.B();
            } else if (iVar instanceof e) {
                e eVar = (e) iVar;
                dVar.f128119b.E(eVar.f15481a, eVar.f15482b.a());
            } else if (iVar instanceof c) {
                dVar.f128119b.C(new l(iVar, 0));
            } else if (iVar instanceof f) {
                dVar.f128119b.C(new l(iVar, 1));
            } else if (iVar instanceof d) {
                ll.j jVar2 = dVar.f128119b;
                l lVar = new l(iVar, 2);
                d dVar2 = (d) iVar;
                dVar2.getClass();
                jVar2.D(lVar, "RemixPinSelection.REMIX_PIN__SELECTION_RESULT_CODE", dVar2.f15480b.a());
            } else if (iVar instanceof g) {
                ll.j jVar3 = dVar.f128119b;
                l lVar2 = new l(iVar, i13);
                g gVar = (g) iVar;
                gVar.getClass();
                jVar3.D(lVar2, "com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", gVar.f15485b.a());
            }
        }
        return Unit.f80348a;
    }
}
