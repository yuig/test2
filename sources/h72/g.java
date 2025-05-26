package h72;

import ao2.j0;
import f72.a0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f67969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f67970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f67970s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f67970s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f67969r;
        l lVar = this.f67970s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f67969r = 1;
            obj = lVar.f67995j.v(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        File file = (File) obj;
        List list = lVar.f67996k;
        if (list != null) {
            return list;
        }
        if (!file.exists()) {
            return null;
        }
        try {
            ro2.b bVar = ro2.c.f108975d;
            String b13 = il2.k.b(file);
            bVar.getClass();
            Iterable<a0> iterable = (Iterable) bVar.a(new qo2.d(a0.Companion.serializer(), 0), b13);
            ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
            for (a0 a0Var : iterable) {
                lVar.f67990e.getClass();
                arrayList.add(y.U(a0Var));
            }
            lVar.f67996k = arrayList;
            return arrayList;
        } catch (Exception e13) {
            lVar.f67992g.d(e13, d.f67958l);
            return null;
        }
    }
}
