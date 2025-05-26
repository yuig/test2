package w1;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.l4;
import t3.m4;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127273i = 2;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127274j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f127275k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f127277m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f127278n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f127279o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String str, sf1.s sVar, String str2, String str3, Integer num, boolean z13) {
        super(1);
        this.f127275k = str;
        this.f127276l = sVar;
        this.f127277m = str2;
        this.f127278n = str3;
        this.f127279o = num;
        this.f127274j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h4.m0 m0Var;
        q3.x xVar;
        q3.x xVar2;
        int i13 = this.f127273i;
        Object obj2 = this.f127278n;
        Object obj3 = this.f127279o;
        Object obj4 = this.f127277m;
        Object obj5 = this.f127276l;
        Object obj6 = this.f127275k;
        switch (i13) {
            case 0:
                q3.x xVar3 = (q3.x) obj;
                l1 l1Var = (l1) obj6;
                l1Var.f127362h = xVar3;
                r2 d2 = l1Var.d();
                if (d2 != null) {
                    d2.f127472b = xVar3;
                }
                if (this.f127274j) {
                    w0 a13 = l1Var.a();
                    w0 w0Var = w0.Selection;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = l1Var.f127369o;
                    if (a13 == w0Var) {
                        if (((Boolean) l1Var.f127366l.getValue()).booleanValue() && ((m4) ((l4) obj5)).a()) {
                            ((b2.t0) obj4).t();
                        } else {
                            ((b2.t0) obj4).m();
                        }
                        b2.t0 t0Var = (b2.t0) obj4;
                        l1Var.f127367m.setValue(Boolean.valueOf(jk.r.q(t0Var, true)));
                        l1Var.f127368n.setValue(Boolean.valueOf(jk.r.q(t0Var, false)));
                        parcelableSnapshotMutableState.setValue(Boolean.valueOf(b4.p0.b(((h4.f0) obj2).f67560b)));
                    } else if (l1Var.a() == w0.Cursor) {
                        parcelableSnapshotMutableState.setValue(Boolean.valueOf(jk.r.q((b2.t0) obj4, true)));
                    }
                    h4.f0 f0Var = (h4.f0) obj2;
                    h4.y yVar = (h4.y) obj3;
                    g1.v(l1Var, f0Var, yVar);
                    r2 d13 = l1Var.d();
                    if (d13 != null && (m0Var = l1Var.f127359e) != null && l1Var.b() && (xVar = d13.f127472b) != null && xVar.h() && (xVar2 = d13.f127473c) != null) {
                        q0.e eVar = new q0.e(xVar, 18);
                        a3.d a14 = b2.j0.a(xVar);
                        a3.d J2 = xVar.J(xVar2, false);
                        if (Intrinsics.d((h4.m0) m0Var.f67592a.f67563b.get(), m0Var)) {
                            m0Var.f67593b.h(f0Var, yVar, d13.f127471a, eVar, a14, J2);
                        }
                    }
                }
                break;
            case 1:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Function1 function1 = (Function1) obj6;
                function1.invoke(Boolean.TRUE);
                xb1.j jVar = (xb1.j) obj5;
                jVar.f134525a.d(new of0.a(null));
                if (r91.b.c(it) && jVar.isBound()) {
                    ((yb1.t) ((com.pinterest.feature.settings.permissions.f) jVar.getView())).y6(new z9.n(jVar, (bd1.b) obj4, this.f127278n, this.f127274j, function1, 4));
                } else if (r91.b.d(it) && jVar.isBound()) {
                    ((yb1.t) ((com.pinterest.feature.settings.permissions.f) jVar.getView())).z3(new q4.h(jVar, (bd1.b) obj4, this.f127278n, (String) obj3, function1, 8));
                }
                break;
            default:
                sp0.d tapPosition = (sp0.d) obj;
                Intrinsics.checkNotNullParameter(tapPosition, "tapPosition");
                String userId = (String) obj6;
                Intrinsics.checkNotNullParameter(userId, "userId");
                qf1.y d03 = kg.p.d0(h32.u0.PIN_STORY_PIN_MENTION, new d91.l(userId, 29));
                qf1.x xVar4 = new qf1.x(d03, qf1.y.a(d03, null, h32.u0.PIN_STORY_PIN_MENTION_TOOLTIP, 5));
                sf1.s sVar = (sf1.s) obj5;
                hh1.f fVar = hh1.l.f69182a;
                hh1.n nVar = new hh1.n((String) obj4, (String) obj2, userId, (Integer) obj3);
                sf1.q qVar = new sf1.q(sVar, xVar4, userId);
                int i14 = sf1.s.P;
                Context context = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                sVar.m(tapPosition, fVar, nVar, this.f127274j, xVar4, qVar, hh1.l.a(context));
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l1 l1Var, boolean z13, l4 l4Var, b2.t0 t0Var, h4.f0 f0Var, h4.y yVar) {
        super(1);
        this.f127275k = l1Var;
        this.f127274j = z13;
        this.f127276l = l4Var;
        this.f127277m = t0Var;
        this.f127278n = f0Var;
        this.f127279o = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(xb1.j jVar, bd1.b bVar, Object obj, String str, Function1 function1, boolean z13) {
        super(1);
        this.f127275k = function1;
        this.f127276l = jVar;
        this.f127277m = bVar;
        this.f127278n = obj;
        this.f127274j = z13;
        this.f127279o = str;
    }
}
