package yw;

import ao2.j0;
import dl2.j;
import k1.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pb0.g;

/* loaded from: classes.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f140248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f140249t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f140248s = fVar;
        this.f140249t = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f140248s, this.f140249t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        f fVar = this.f140248s;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140247r;
        try {
            if (i13 != 0) {
                if (i13 == 1) {
                    ue.c.H(obj);
                }
                if (i13 == 2) {
                    ue.c.H(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            if (fVar.f140264f.length() > 0) {
                return new xz.b(fVar.f140264f);
            }
            if (!this.f140249t) {
                wt.c cVar = new wt.c(fVar, 17);
                this.f140247r = 2;
                obj = f.b(fVar, cVar, this);
                return obj == aVar ? aVar : obj;
            }
            ((g) fVar.f140261c).getClass();
            if (System.currentTimeMillis() <= ((lb0.b) fVar.f140263e).g("PREF_ADS_OPEN_MEASUREMENT_JS_EXPIRY_MS", 0L)) {
                fVar.f140262d.getClass();
                String g13 = lb0.g.g("ADS_OPEN_MEASUREMENT_SERVICE_CONTENT");
                if (g13 == null) {
                    g13 = "";
                }
                if (g13.length() > 0) {
                    fVar.f140264f = g13;
                    return new xz.b(g13);
                }
                f.a(fVar);
            }
            s2 s2Var = new s2(fVar, 25);
            this.f140247r = 1;
            obj = f.b(fVar, s2Var, this);
            return obj == aVar ? aVar : obj;
        } catch (Exception e13) {
            return new xz.a(e13);
        }
    }
}
