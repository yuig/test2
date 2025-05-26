package u62;

import android.net.Uri;
import ao2.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public t f120865r;

    /* renamed from: s, reason: collision with root package name */
    public int f120866s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f120867t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f120868u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f120869v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f120870w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Uri uri, t tVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f120868u = tVar;
        this.f120869v = uri;
        this.f120870w = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f120869v, this.f120868u, this.f120870w, cVar);
        rVar.f120867t = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        n72.k kVar;
        t tVar;
        Unit unit;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120866s;
        String str = this.f120870w;
        Uri uri = this.f120869v;
        t tVar2 = this.f120868u;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f120867t;
            t.b(tVar2, uri);
            this.f120867t = j0Var;
            this.f120866s = 1;
            obj = tVar2.f120877b.b(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    tVar2 = (t) this.f120867t;
                    ue.c.H(obj);
                    tVar2.f((q72.g) obj);
                    return Unit.f80348a;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = this.f120865r;
                kVar = (n72.k) this.f120867t;
                ue.c.H(obj);
                tVar.f((q72.g) obj);
                tVar2.f120880e.d(((n72.i) kVar).f89727b, p.f120859k);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        kVar = (n72.k) obj;
        if (kVar instanceof n72.j) {
            q72.g gVar = (q72.g) CollectionsKt.firstOrNull((List) ((n72.j) kVar).f89728a);
            if (gVar != null) {
                tVar2.f120888m = gVar;
                tVar2.i(gVar.f102842d, true);
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f120867t = tVar2;
                this.f120866s = 2;
                obj = t.a(uri, tVar2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
                tVar2.f((q72.g) obj);
            }
        } else if (kVar instanceof n72.i) {
            this.f120867t = kVar;
            this.f120865r = tVar2;
            this.f120866s = 3;
            obj = t.a(uri, tVar2, str, this);
            if (obj == aVar) {
                return aVar;
            }
            tVar = tVar2;
            tVar.f((q72.g) obj);
            tVar2.f120880e.d(((n72.i) kVar).f89727b, p.f120859k);
        }
        return Unit.f80348a;
    }
}
