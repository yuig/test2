package ik1;

import ao2.j0;
import dl2.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f72405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f72406s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f72406s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f72406s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f72405r;
        if (i13 == 0) {
            ue.c.H(obj);
            g gVar = this.f72406s;
            if (gVar.f72416f.size() == 30) {
                nb0.e eVar = (nb0.e) ((bf2.b) gVar.f72411a).get();
                ArrayList arrayList = gVar.f72416f;
                ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Double.valueOf(((a) it.next()).f72404a.getValue()));
                }
                String Z = CollectionsKt.Z(arrayList2, ",", null, null, 0, null, null, 62);
                this.f72405r = 1;
                if (eVar.i("PREF_USER_ACTION_SEQUENCE", Z, this) == aVar) {
                    return aVar;
                }
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
