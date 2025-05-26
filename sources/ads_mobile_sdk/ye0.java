package ads_mobile_sdk;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ye0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf0 f14210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(kf0 kf0Var, bl2.c cVar) {
        super(2, cVar);
        this.f14210a = kf0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ye0(this.f14210a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ye0(this.f14210a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a.pf pfVar = (a.pf) this.f14210a.f13640b.get();
        if (pfVar == null) {
            gk0.b("Ad should be associated with an ad view before click happens.", null);
            return Unit.f80348a;
        }
        kf0 kf0Var = this.f14210a;
        sb2 sb2Var = kf0Var.f7269m;
        ss2 ss2Var = kf0Var.f7270n;
        th1 th1Var = kf0Var.f7267k;
        yh1 yh1Var = (yh1) pfVar;
        FrameLayout c13 = yh1Var.c();
        Map b13 = yh1Var.b();
        ImageView.ScaleType e13 = yh1Var.e();
        if (e13 == null) {
            e13 = ImageView.ScaleType.CENTER_INSIDE;
        }
        qh1 j13 = kh2.a1.j(sb2Var, ss2Var, th1Var, c13, b13, e13);
        kf0 kf0Var2 = this.f14210a;
        String a13 = kf0.a(kf0Var2, (View) kf0Var2.f13643e.get(), yh1Var.b());
        kf0 kf0Var3 = this.f14210a;
        this.f14210a.a((View) yh1Var.c(), j13, a13, kf0Var3.f7267k.a(a13, kf0Var3.f7282z, kf0Var3.f7281y), false);
        return Unit.f80348a;
    }
}
