package pm0;

import ao2.j0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x40.f7;
import x40.g7;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f100666r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f100667s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f100668t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v7 f100669u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f100670v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, v7 v7Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f100668t = jVar;
        this.f100669u = v7Var;
        this.f100670v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f100668t, this.f100669u, this.f100670v, cVar);
        hVar.f100667s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f100666r;
        u50.r rVar2 = this.f100670v;
        j jVar = this.f100668t;
        if (i13 == 0) {
            ue.c.H(obj);
            wy0 f13 = ((b60.d) jVar.f100677b).f();
            if (f13 == null) {
                rVar2.a(new v(new IllegalStateException("No active (logged-in) user available")));
                return Unit.f80348a;
            }
            String id3 = f13.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            rVar = new r(id3, this.f100669u);
            this.f100667s = rVar;
            this.f100666r = 1;
            obj = jVar.m(rVar, rVar2, this);
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
            rVar = (r) this.f100667s;
            ue.c.H(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            f7 f7Var = null;
            if (!it.hasNext()) {
                break;
            }
            f7 f7Var2 = ((g7) it.next()).f132436e;
            if (f7Var2 != null) {
                Intrinsics.checkNotNullParameter(f7Var2, "<this>");
                f7Var = f7Var2;
            }
            if (f7Var != null) {
                arrayList.add(f7Var);
            }
        }
        if (arrayList.isEmpty()) {
            rVar2.a(new y(rVar.f100692c));
        } else {
            this.f100667s = null;
            this.f100666r = 2;
            if (j.l(jVar, rVar, arrayList, rVar2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
