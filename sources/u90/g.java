package u90;

import android.net.Uri;
import do2.r2;
import do2.t2;
import do2.v1;
import do2.y1;
import dv0.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lb.l0;
import r72.i1;
import sa0.a0;
import sa0.b0;
import sa0.z;
import u50.r;
import u62.t;
import v.d3;
import v90.a1;
import v90.u0;
import x62.p;
import z80.n;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f121186r;

    /* renamed from: s, reason: collision with root package name */
    public int f121187s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f121188t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f121189u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f121190v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f121191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a1 a1Var, j jVar, ao2.j0 j0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f121188t = a1Var;
        this.f121189u = jVar;
        this.f121190v = j0Var;
        this.f121191w = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f121188t, this.f121189u, this.f121190v, this.f121191w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        j0 j0Var;
        j0 j0Var2;
        String imageUrl;
        y1 y1Var;
        t2 t2Var;
        Object value;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121187s;
        ao2.j0 j0Var3 = this.f121190v;
        bl2.c cVar = null;
        r rVar = this.f121191w;
        j jVar = this.f121189u;
        if (i13 == 0) {
            ue.c.H(obj);
            j0Var = new j0();
            j0Var.f80434a = Uri.EMPTY;
            j0 j0Var4 = new j0();
            u0 u0Var = (u0) this.f121188t;
            b0 b0Var = u0Var.f124963a;
            if (!(b0Var instanceof a0)) {
                if (b0Var instanceof z) {
                    z zVar = (z) b0Var;
                    Uri element = Uri.parse(zVar.f112201a);
                    j0Var.f80434a = element;
                    d3 d3Var = jVar.f121202a;
                    i1 i1Var = u0Var.f124964b;
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    d3Var.c(j0Var3, i1Var, new u62.a(element, zVar.f112202b));
                }
                q qVar = jVar.f121203b;
                imageUrl = ((Uri) j0Var.f80434a).toString();
                Intrinsics.checkNotNullExpressionValue(imageUrl, "toString(...)");
                qVar.getClass();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                y1Var = (y1) qVar.f56381b;
                do {
                    t2Var = (t2) y1Var;
                    value = t2Var.getValue();
                } while (!t2Var.h(value, p.a((p) value, imageUrl, null, null, 0.0f, null, 30)));
                l0.J0(l0.Q0(new f(rVar, null), (r2) jVar.f121203b.f56382c), j0Var3);
                d3 d3Var2 = jVar.f121202a;
                l0.J0(new v1(((t) d3Var2.f123428d).f120883h, (r2) d3Var2.f123430f, new fd.t(rVar, cVar, 2), 0), j0Var3);
                return Unit.f80348a;
            }
            do2.j0 j0Var5 = new do2.j0(ve.h.x(jVar.f121204c, ((a0) b0Var).f112159a), new n(2, rVar, null));
            e eVar = new e(j0Var, j0Var4, this.f121189u, this.f121190v, this.f121188t);
            this.f121186r = j0Var;
            this.f121187s = 1;
            if (j0Var5.collect(eVar, this) == aVar) {
                return aVar;
            }
            j0Var2 = j0Var;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j0Var2 = this.f121186r;
            ue.c.H(obj);
        }
        j0Var = j0Var2;
        q qVar2 = jVar.f121203b;
        imageUrl = ((Uri) j0Var.f80434a).toString();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "toString(...)");
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        y1Var = (y1) qVar2.f56381b;
        do {
            t2Var = (t2) y1Var;
            value = t2Var.getValue();
        } while (!t2Var.h(value, p.a((p) value, imageUrl, null, null, 0.0f, null, 30)));
        l0.J0(l0.Q0(new f(rVar, null), (r2) jVar.f121203b.f56382c), j0Var3);
        d3 d3Var22 = jVar.f121202a;
        l0.J0(new v1(((t) d3Var22.f123428d).f120883h, (r2) d3Var22.f123430f, new fd.t(rVar, cVar, 2), 0), j0Var3);
        return Unit.f80348a;
    }
}
