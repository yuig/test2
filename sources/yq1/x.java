package yq1;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import so.s8;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140051i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f140052j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f140053k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, String str, int i13) {
        super(1);
        this.f140051i = i13;
        this.f140052j = zVar;
        this.f140053k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140051i;
        String email = this.f140053k;
        z zVar = this.f140052j;
        switch (i13) {
            case 0:
                rn1.a autoCorrectionState = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(autoCorrectionState, "autoCorrectionState");
                Resources resources = zVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return rn1.a.y(autoCorrectionState, bs1.c.h2(gp1.e.b(resources, email)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    sr1.g gVar = zVar.f140099o0;
                    if (gVar == null) {
                        Intrinsics.r("pendingSignupData");
                        throw null;
                    }
                    qr1.m mVar = gVar.f115100b;
                    if (mVar instanceof qr1.i) {
                        vy.m mVar2 = zVar.f140087c0;
                        if (mVar2 == null) {
                            Intrinsics.r("analyticsApi");
                            throw null;
                        }
                        mVar2.a("line_phone_signup_email_taken");
                    } else if (mVar instanceof qr1.f) {
                        vy.m mVar3 = zVar.f140087c0;
                        if (mVar3 == null) {
                            Intrinsics.r("analyticsApi");
                            throw null;
                        }
                        mVar3.a("fb_phone_signup_email_taken");
                    }
                    il1.a aVar = zVar.f140089e0;
                    if (aVar == null) {
                        Intrinsics.r("fragmentFactory");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(u0.class, "fragmentClass");
                    u0 fragment = (u0) ((mu1.a) aVar).f(u0.class);
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(email, "email");
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_EMAIL", email);
                    fragment.setArguments(bundle);
                    androidx.fragment.app.w0 supportFragmentManager = zVar.requireActivity().getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    mo1.c.c(supportFragmentManager, vq1.b.fragment_wrapper, fragment, true, null, 48);
                } else {
                    int i14 = z.f140086r0;
                    lb2.q a83 = zVar.a8();
                    so.e0 e0Var = zVar.f140092h0;
                    if (e0Var == null) {
                        Intrinsics.r("pendingEmailSignupFactory");
                        throw null;
                    }
                    sr1.g gVar2 = zVar.f140099o0;
                    if (gVar2 == null) {
                        Intrinsics.r("pendingSignupData");
                        throw null;
                    }
                    s8 s8Var = e0Var.f113395a.f114091b;
                    sr1.f fVar = new sr1.f(gVar2, email);
                    oa oaVar = s8Var.f114255d;
                    fVar.f115120e = (cr1.b) oaVar.Z5.get();
                    fVar.f115121f = (or1.i) oaVar.f114015y5.get();
                    fVar.f115122g = (b60.b) oaVar.f113850p0.get();
                    fVar.f115123h = (tr1.a) oaVar.f113734i6.get();
                    fVar.f115124i = (fr1.c) oaVar.f113821n6.get();
                    FragmentActivity requireActivity = zVar.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    zVar.Z7(a83.c(fVar, bs1.c.m(requireActivity)));
                }
                return Unit.f80348a;
        }
    }
}
