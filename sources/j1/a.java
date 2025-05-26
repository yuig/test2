package j1;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.common.Feature;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73965i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f73966j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f73967k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f73968l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f73969m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f73965i = i13;
        this.f73966j = obj;
        this.f73967k = obj2;
        this.f73968l = obj3;
        this.f73969m = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 3;
        int i14 = this.f73965i;
        Object obj2 = this.f73969m;
        Object obj3 = this.f73968l;
        Object obj4 = this.f73967k;
        Object obj5 = this.f73966j;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                d dVar = (d) obj5;
                e.s(mVar, dVar.f74028c);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = mVar.f74148e;
                Object a13 = d.a(dVar, parcelableSnapshotMutableState.getValue());
                if (Intrinsics.d(a13, parcelableSnapshotMutableState.getValue())) {
                    Function1 function1 = (Function1) obj3;
                    if (function1 != null) {
                        function1.invoke(dVar);
                    }
                } else {
                    dVar.f74028c.f74169b.setValue(a13);
                    ((o) obj4).f74169b.setValue(a13);
                    Function1 function12 = (Function1) obj3;
                    if (function12 != null) {
                        function12.invoke(dVar);
                    }
                    mVar.a();
                    ((kotlin.jvm.internal.f0) obj2).f80424a = true;
                }
                return Unit.f80348a;
            case 1:
                ni1.y2 it = (ni1.y2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                qa2.a aVar = (qa2.a) obj4;
                lf.a aVar2 = (lf.a) obj3;
                fk1.w b13 = fk1.w.b(it.Z, null, 0, aVar, null, false, ((ni1.u0) ((l82.e) obj5).f82218a).f90815i, aVar2, false, false, false, false, null, 16756607);
                bk1.a2 b14 = bk1.a2.b(it.f90904b0, null, false, false, null, null, 0, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, aVar, null, false, false, null, false, false, null, null, false, false, false, false, -1, 524271);
                wa2.m mVar2 = (wa2.m) obj2;
                wa2.g0 g0Var = mVar2.f128851b0;
                gk1.x0 b15 = gk1.x0.b(it.X, false, false, false, null, 0, false, null, null, false, null, false, null, false, false, false, aVar2, g0Var != null ? g0Var.f128727i : null, false, false, null, -1, RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP);
                wa2.g0 g0Var2 = mVar2.f128851b0;
                return ni1.y2.b(it, null, null, null, mVar2.N, mVar2.O, mVar2.S, mVar2.T, false, false, false, false, 0, false, false, null, ek1.r1.b(it.W, null, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, aVar2, g0Var2 != null ? g0Var2.f128727i : null, false, false, false, null, null, false, null, false, false, false, -1, 4194255), b15, null, b13, null, b14, -3932161, 1376255);
            case 2:
                ek1.r it2 = (ek1.r) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                az.b bVar = it2.f59329b;
                h32.z1 source = (h32.z1) obj5;
                Intrinsics.checkNotNullParameter(source, "source");
                yi1.v vVar = (yi1.v) ((yi1.f0) obj4);
                h32.z1 z1Var = new h32.z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, Double.valueOf(vVar.f139162b.f121507b), Double.valueOf(vVar.f139162b.f121506a), source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
                nx.c cVar = it2.f59329b.f20693a;
                ps0.y yVar = ek1.q1.f59322g;
                return ek1.r.e(it2, null, az.b.e(bVar, nx.c.a(cVar, bs1.c.o2(((ek1.q1) obj3).i((l82.e) obj2))), z1Var, null, 4), null, false, null, 29);
            case 3:
                ek1.r1 it3 = (ek1.r1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ek1.q1 q1Var = (ek1.q1) obj5;
                ek1.r1 r1Var = (ek1.r1) obj4;
                wa2.m mVar3 = (wa2.m) obj3;
                ni1.x2 x2Var = (ni1.x2) obj2;
                x32.e y13 = ((es.v) q1Var.f59325d).y(r1Var.f59338a, mVar3.O, mVar3.N, x2Var.f90845b0, x2Var.f90843a0, x2Var.Z, x2Var.Y);
                wa2.g0 g0Var3 = mVar3.f128851b0;
                boolean z13 = g0Var3 != null ? g0Var3.f128743y : false;
                es.v vVar2 = (es.v) q1Var.f59325d;
                return ek1.r1.b(it3, null, null, 0, null, null, null, false, false, null, 0, null, null, false, mVar3.f128879p0, mVar3.f128877o0, mVar3.N, mVar3.O, mVar3.S, mVar3.T, mVar3.W, z13, mVar3.X, false, null, null, false, false, vVar2.D(), y13, vVar2.l(y13, r1Var.f59338a), vVar2.P(), null, false, false, false, 8388607, 4071423);
            case 4:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                kotlin.jvm.internal.j.z(((ir1.e) obj5).f73519k, null, null, new ir1.c((uj2.c0) obj4, (u5.l) obj3, activity, (u5.y) obj2, null), 3);
                return Unit.f80348a;
            default:
                xk2.w p13 = (xk2.w) obj;
                Intrinsics.checkNotNullParameter(p13, "p");
                RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
                qi.a aVar3 = (qi.a) p13.f135234a;
                RecaptchaHandle recaptchaHandle = (RecaptchaHandle) p13.f135235b;
                String str = (String) p13.f135236c;
                String action = ((RecaptchaAction) obj5).getAction();
                kl2.l lVar = (kl2.l) obj3;
                com.google.android.gms.recaptcha.RecaptchaAction recaptchaAction2 = new com.google.android.gms.recaptcha.RecaptchaAction(new RecaptchaActionType("other"), action, new Bundle(), "");
                com.google.android.gms.internal.recaptcha.r1 r1Var2 = (com.google.android.gms.internal.recaptcha.r1) aVar3;
                r1Var2.getClass();
                com.google.android.gms.common.api.internal.q a14 = com.google.android.gms.common.api.internal.r.a();
                a14.f30859c = new x92.b(r1Var2, recaptchaHandle, recaptchaAction2, 17);
                a14.f30860d = new Feature[]{qi.b.f103966b};
                Task d2 = r1Var2.d(0, a14.a());
                Intrinsics.checkNotNullExpressionValue(d2, "execute(...)");
                kk2.b bVar2 = new kk2.b(new androidx.fragment.app.c(16, d2, new com.pinterest.security.f((ox.b) obj4, action, (String) obj2)), 0);
                Intrinsics.checkNotNullExpressionValue(bVar2, "create(...)");
                kk2.g gVar = new kk2.g(new kk2.g(bVar2.k(new r42.k(2, new qz.w(str, i13))), new or1.j(22, new r42.m(aVar3, recaptchaHandle, action, lVar, 0)), 0), new or1.j(23, new r42.m(aVar3, recaptchaHandle, action, lVar, 1)), 1);
                Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
                return gVar;
        }
    }
}
