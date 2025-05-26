package j41;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import h32.g0;
import h32.u0;
import java.util.Locale;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import m60.x0;
import so.y1;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74655i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoUserProfileHeader f74656j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(LegoUserProfileHeader legoUserProfileHeader, int i13) {
        super(1);
        this.f74655i = i13;
        this.f74656j = legoUserProfileHeader;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i41.d dVar;
        wy0 wy0Var;
        wy0 f13;
        boolean z13 = false;
        int i13 = this.f74655i;
        LegoUserProfileHeader legoUserProfileHeader = this.f74656j;
        switch (i13) {
            case 0:
                un1.c it = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String lowerCase = bs1.c.f2(legoUserProfileHeader, x0.more_no_dot).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return un1.c.y(it, null, null, 0, null, true, null, null, 3, bs1.c.p2(lowerCase), false, 425471);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                h41.f fVar = legoUserProfileHeader.K;
                if (fVar != null && (wy0Var = (dVar = (i41.d) fVar).f71533p) != null && (dVar.w3(wy0Var) || ((f13 = ((b60.d) dVar.f71530m).f()) != null && Intrinsics.d(f13.z3(), Boolean.TRUE)))) {
                    dVar.getPinalytics().b0(u0.PROFILE_IMAGE, g0.NAVIGATION, wy0Var.getUid(), false);
                    w wVar = dVar.f71526i;
                    if (booleanValue) {
                        String uid = wy0Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        wVar.d(new v(((y1) dVar.f71531n).a(uid, yq.n.USER, wy0Var.n3(), dl2.b.j1(wy0Var)), false, 0L, 30));
                    } else {
                        wVar.d(new of0.a(nr.d.r7(wy0Var.getUid(), dVar.f71525h)));
                    }
                }
                return Unit.f80348a;
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (legoUserProfileHeader.f47557w.getVisibility() == 0 && legoUserProfileHeader.f47558x.getVisibility() == 0) {
                    z13 = true;
                }
                return rn1.a.y(it2, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }
}
