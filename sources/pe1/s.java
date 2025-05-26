package pe1;

import ao2.j0;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f99989r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f99990s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, List list, bl2.c cVar) {
        super(2, cVar);
        this.f99989r = tVar;
        this.f99990s = list;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f99989r, this.f99990s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ov1.k kVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        t listener = this.f99989r;
        gd1.c cVar = (gd1.c) listener.getViewIfBound();
        u uVar = cVar instanceof u ? (u) cVar : null;
        if (uVar != null) {
            p pVar = (p) uVar;
            Intrinsics.checkNotNullParameter(listener, "listener");
            ov1.k kVar2 = pVar.f99981s1;
            if (kVar2 != null) {
                Navigation navigation = pVar.I;
                String v03 = navigation != null ? navigation.v0("pinUid") : null;
                if (v03 == null) {
                    v03 = "";
                }
                kVar2.b(v03, listener);
            }
        }
        if (uVar != null) {
            p pVar2 = (p) uVar;
            List items = this.f99990s;
            Intrinsics.checkNotNullParameter(items, "items");
            ov1.k kVar3 = pVar2.f99981s1;
            if (kVar3 != null) {
                kVar3.g(items);
            }
            ov1.k kVar4 = pVar2.f99981s1;
            if (kVar4 != null) {
                kVar4.f97746n = true;
            }
        }
        if (uVar != null && (kVar = ((p) uVar).f99981s1) != null) {
            kVar.m();
        }
        return Unit.f80348a;
    }
}
