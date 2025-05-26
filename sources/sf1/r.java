package sf1;

import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f112685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qf1.x f112686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hh1.l f112687k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f112688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f112689m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f112690n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f112691o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, qf1.x xVar, hh1.l lVar, Long l13, String str, String str2, boolean z13) {
        super(1);
        this.f112685i = sVar;
        this.f112686j = xVar;
        this.f112687k = lVar;
        this.f112688l = l13;
        this.f112689m = str;
        this.f112690n = str2;
        this.f112691o = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 function0;
        View it = (View) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        s sVar = this.f112685i;
        w0 w0Var = sVar.C;
        if (w0Var != null) {
            w0Var.c(this.f112686j);
        }
        hh1.l lVar = this.f112687k;
        if (lVar instanceof hh1.q) {
            nx.d1 d1Var = sVar.f112710q;
            if (d1Var == null) {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
            Long l13 = this.f112688l;
            ph.a.B0(sVar.f112698e, this.f112689m, this.f112688l, this.f112690n, d1Var.c(String.valueOf(l13)), this.f112691o);
            m60.w s13 = sVar.s();
            NavigationImpl z03 = Navigation.z0((ScreenLocation) h2.f50892a.getValue(), String.valueOf(l13));
            String str = this.f112689m;
            z03.y0(new to0.z(ph.a.r(str, this.f112690n, l13)), "com.pinterest.PIN_LOGGING_EVENT_DATA");
            z03.m0("product_tag_parent_pin_id", str);
            s13.d(z03);
        } else if ((lVar instanceof hh1.p) && (function0 = ((hh1.p) lVar).f69206i) != null) {
            function0.invoke();
        }
        return Unit.f80348a;
    }
}
