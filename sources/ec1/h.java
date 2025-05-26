package ec1;

import android.content.Context;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i4;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.r3;
import m60.w;
import va1.m1;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f58414i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f58415j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f58416k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f58417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f58418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f58419n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f1 f58420o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f58421p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Function1 function1, j jVar, m1 m1Var, boolean z13, String str, boolean z14, f1 f1Var, int i13) {
        super(1);
        this.f58414i = function1;
        this.f58415j = jVar;
        this.f58416k = m1Var;
        this.f58417l = z13;
        this.f58418m = str;
        this.f58419n = z14;
        this.f58420o = f1Var;
        this.f58421p = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        this.f58414i.invoke(Boolean.TRUE);
        j jVar = this.f58415j;
        ep.b.C(null, jVar.f58423a);
        this.f58416k.f125210e = this.f58417l;
        Intrinsics.f(th3);
        if (r91.b.c(th3) && jVar.isBound()) {
            com.pinterest.feature.settings.privacydata.a aVar = (com.pinterest.feature.settings.privacydata.a) jVar.getView();
            f onPasscodeVerified = new f(this.f58415j, this.f58418m, this.f58416k, this.f58419n, this.f58420o, this.f58421p, this.f58414i);
            fc1.e eVar = (fc1.e) aVar;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(onPasscodeVerified, "onPasscodeVerified");
            eVar.J0 = onPasscodeVerified;
            r3 r3Var = eVar.H0;
            if (r3Var == null) {
                Intrinsics.r("settingsPrivacyDataExperiments");
                throw null;
            }
            NavigationImpl w13 = Navigation.w1(r3Var.a() ? i4.b() : i4.a());
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            eVar.M1(w13);
        } else if (r91.b.d(th3) && jVar.isBound()) {
            com.pinterest.feature.settings.privacydata.a aVar2 = (com.pinterest.feature.settings.privacydata.a) jVar.getView();
            g onUserConfirmedSkip = new g(this.f58415j, this.f58418m, this.f58416k, this.f58419n, this.f58420o, this.f58421p, this.f58414i);
            fc1.e eVar2 = (fc1.e) aVar2;
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(onUserConfirmedSkip, "onUserConfirmedSkip");
            w f73 = eVar2.f7();
            Context requireContext = eVar2.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            f73.d(new yb0.e(r91.b.a(requireContext, eVar2.b7(), onUserConfirmedSkip)));
        }
        return Unit.f80348a;
    }
}
