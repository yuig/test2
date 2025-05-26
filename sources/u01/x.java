package u01;

import kh2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import lh0.z3;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b11.g f119966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ps.c f119967j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b60.b f119968k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f119969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hs.d f119970m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f119971n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f119972o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f119973p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hs.d dVar, ps.c cVar, b60.b bVar, a0 a0Var, b11.g gVar, boolean z13, boolean z14, boolean z15) {
        super(1);
        this.f119966i = gVar;
        this.f119967j = cVar;
        this.f119968k = bVar;
        this.f119969l = a0Var;
        this.f119970m = dVar;
        this.f119971n = z13;
        this.f119972o = z14;
        this.f119973p = z15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j01.a closeup = (j01.a) obj;
        Intrinsics.checkNotNullParameter(closeup, "$this$closeup");
        b11.g gVar = this.f119966i;
        a aVar = new a(gVar, 1);
        ps.c cVar = this.f119967j;
        b0.I1(closeup, aVar, cVar);
        boolean q13 = hf0.b.q();
        hs.d dVar = this.f119970m;
        a0 a0Var = this.f119969l;
        b60.b bVar = this.f119968k;
        if (!q13) {
            b0.I1(closeup, new w(gVar, bVar, a0Var, dVar), cVar);
        }
        b0.I1(closeup, new org.chromium.net.y(), cVar);
        b0.I1(closeup, new a(gVar, 4), cVar);
        b0.I1(closeup, new a(gVar, 6), cVar);
        b0.I1(closeup, new s(gVar, bVar, 1), cVar);
        b0.I1(closeup, new a(gVar, 2), cVar);
        if (a0Var.q()) {
            b0.I1(closeup, new s(gVar, a0Var), cVar);
        }
        if (!this.f119971n) {
            b0.I1(closeup, new a(gVar, 5), cVar);
        }
        if (!this.f119972o) {
            b0.I1(closeup, new t(gVar, bVar, dVar), cVar);
        }
        if (!this.f119973p) {
            b0.I1(closeup, new s(gVar, bVar, 0), cVar);
        }
        if (a0Var.U(z3.ACTIVATE_EXPERIMENT)) {
            b0.I1(closeup, new a(gVar, 3), cVar);
        }
        return Unit.f80348a;
    }
}
