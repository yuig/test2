package oc1;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z3;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.m3;
import m60.w;
import m60.x0;
import px0.g;
import qz.d;
import v.f1;
import w1.l0;
import xa0.j;
import yb0.e;
import yb0.k;
import yb0.l;
import yb0.n;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94049i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f94050j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ nc1.b f94051k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f94052l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nc1.b bVar, boolean z13, c cVar) {
        super(1);
        this.f94049i = 0;
        this.f94051k = bVar;
        this.f94052l = z13;
        this.f94050j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 f13;
        mc1.a aVar;
        n a13;
        f1 f1Var;
        d M;
        int i13 = this.f94049i;
        nc1.b bVar = this.f94051k;
        c cVar = this.f94050j;
        boolean z13 = this.f94052l;
        switch (i13) {
            case 0:
                if (bVar instanceof nc1.a) {
                    if (z13 && (f13 = ((b60.d) cVar.f94057b).f()) != null) {
                        Integer V2 = f13.V2();
                        Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
                        if (V2.intValue() > 0 && (aVar = (mc1.a) cVar.getViewIfBound()) != null) {
                            String userId = f13.getUid();
                            Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
                            String o13 = f13.o();
                            pc1.d dVar = (pc1.d) aVar;
                            Intrinsics.checkNotNullParameter(userId, "userId");
                            Context requireContext = dVar.requireContext();
                            int i14 = n.f138503p;
                            Intrinsics.f(requireContext);
                            String string = requireContext.getString(b52.c.review_your_followers_title);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = requireContext.getString(b52.c.review_your_followers_body);
                            String string3 = requireContext.getString(b52.c.review);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = requireContext.getString(x0.not_now);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            a13 = j.a(requireContext, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? k.f138491j : new g((Object) dVar, (Object) userId, (Object) o13, 10), (r20 & 64) != 0 ? k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? l.f138495j : null);
                            cb.x(a13, dVar.f7());
                        }
                    }
                    mc1.a aVar2 = (mc1.a) cVar.getView();
                    String message = bs1.c.b2(z13 ? b52.c.private_profile_enabled : b52.c.private_profile_disabled);
                    Intrinsics.checkNotNullExpressionValue(message, "string(...)");
                    pc1.d dVar2 = (pc1.d) aVar2;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    i92.k kVar = dVar2.B0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.m(message);
                }
                cVar.loadData();
                return Unit.f80348a;
            case 1:
                String verifiedPasscode = (String) obj;
                Intrinsics.checkNotNullParameter(verifiedPasscode, "verifiedPasscode");
                c.t3(this.f94050j, this.f94051k, this.f94052l, verifiedPasscode, false, 8);
                return Unit.f80348a;
            default:
                Throwable th3 = (Throwable) obj;
                cVar.v3(bVar, !z13);
                Intrinsics.f(th3);
                if (r91.b.c(th3) && cVar.isBound()) {
                    mc1.a aVar3 = (mc1.a) cVar.getView();
                    a onPasscodeVerified = new a(cVar, bVar, z13, 1);
                    pc1.d dVar3 = (pc1.d) aVar3;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(onPasscodeVerified, "onPasscodeVerified");
                    dVar3.E0 = onPasscodeVerified;
                    m3 m3Var = dVar3.G0;
                    if (m3Var == null) {
                        Intrinsics.r("settingsExperiments");
                        throw null;
                    }
                    NavigationImpl w13 = Navigation.w1(m3Var.c() ? z3.b() : z3.a());
                    Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                    dVar3.M1(w13);
                } else if (r91.b.d(th3) && cVar.isBound()) {
                    mc1.a aVar4 = (mc1.a) cVar.getView();
                    l0 onUserConfirmedSkip = new l0(cVar, bVar, z13, 6);
                    pc1.d dVar4 = (pc1.d) aVar4;
                    dVar4.getClass();
                    Intrinsics.checkNotNullParameter(onUserConfirmedSkip, "onUserConfirmedSkip");
                    w f73 = dVar4.f7();
                    Context requireContext2 = dVar4.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    f73.d(new e(r91.b.a(requireContext2, dVar4.b7(), onUserConfirmedSkip)));
                } else {
                    mc1.a aVar5 = (mc1.a) cVar.getView();
                    NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                    String str = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.f105384d;
                    pc1.d dVar5 = (pc1.d) aVar5;
                    i92.k kVar2 = dVar5.B0;
                    if (kVar2 == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    if (str == null) {
                        str = dVar5.getString(x0.generic_error);
                        Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                    }
                    kVar2.i(str);
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, nc1.b bVar, boolean z13, int i13) {
        super(1);
        this.f94049i = i13;
        this.f94050j = cVar;
        this.f94051k = bVar;
        this.f94052l = z13;
    }
}
