package u62;

import android.graphics.RectF;
import android.net.Uri;
import ao2.j0;
import do2.t2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.g2;
import r72.i1;

/* loaded from: classes4.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f120861r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f120862s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f120863t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f120864u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, Uri uri, bl2.c cVar) {
        super(2, cVar);
        this.f120863t = tVar;
        this.f120864u = uri;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f120863t, this.f120864u, cVar);
        qVar.f120862s = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        t2 t2Var;
        Object value;
        Unit unit;
        t2 t2Var2;
        Object value2;
        c cVar;
        g gVar;
        u uVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120861r;
        t tVar = this.f120863t;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f120862s;
            Uri uri = this.f120864u;
            t.b(tVar, uri);
            do {
                t2Var = tVar.f120882g;
                value = t2Var.getValue();
            } while (!t2Var.h(value, c.a((c) value, null, null, h.f120839a, false, 11)));
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            this.f120862s = j0Var;
            this.f120861r = 1;
            obj = tVar.f120878c.a(uri2, new RectF(), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        n72.k kVar = (n72.k) obj;
        if (kVar instanceof n72.j) {
            n72.j jVar = (n72.j) kVar;
            if (((List) jVar.f89728a).isEmpty()) {
                tVar.f120888m = null;
                tVar.f120892q = null;
                do {
                    t2Var2 = tVar.f120882g;
                    value2 = t2Var2.getValue();
                    cVar = (c) value2;
                    gVar = g.f120838a;
                    uVar = cVar.f120828a;
                    int i14 = g2.f106487b;
                } while (!t2Var2.h(value2, c.a(cVar, u.a(uVar, null, new i1("M0 0H1V1H0Z", null), null, 5), null, gVar, false, 10)));
                tVar.j();
            } else {
                q72.g gVar2 = (q72.g) CollectionsKt.firstOrNull((List) jVar.f89728a);
                if (gVar2 != null) {
                    tVar.f120888m = gVar2;
                    tVar.i(gVar2.f102842d, true);
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    tVar.f(null);
                }
            }
        } else if (kVar instanceof n72.i) {
            tVar.f(null);
            tVar.f120880e.d(((n72.i) kVar).f89727b, p.f120858j);
        }
        return Unit.f80348a;
    }
}
