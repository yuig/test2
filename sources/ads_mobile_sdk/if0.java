package ads_mobile_sdk;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class if0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf0 f6365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(kf0 kf0Var, View view, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f6365a = kf0Var;
        this.f6366b = view;
        this.f6367c = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new if0(this.f6365a, this.f6366b, this.f6367c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((if0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        nm.u uVar = this.f6365a.f7262f;
        Intrinsics.checkNotNullParameter("allow_sdk_custom_click_gesture", "key");
        nm.u uVar2 = null;
        if (uVar != null) {
            try {
                Intrinsics.checkNotNullParameter(uVar, "<this>");
                Intrinsics.checkNotNullParameter("allow_sdk_custom_click_gesture", "key");
                if (uVar.v("allow_sdk_custom_click_gesture").b()) {
                    a.pf pfVar = (a.pf) this.f6365a.f13640b.get();
                    if (pfVar == null) {
                        gk0.b("Ad should be associated with an ad view before calling performClickForCustomGesture()", null);
                        return Unit.f80348a;
                    }
                    kf0 kf0Var = this.f6365a;
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
                    String a13 = kf0.a(this.f6365a, this.f6366b, yh1Var.b());
                    kf0 kf0Var2 = this.f6365a;
                    nm.u a14 = kf0Var2.f7267k.a(a13, kf0Var2.f7282z, kf0Var2.f7281y);
                    kf0 kf0Var3 = this.f6365a;
                    nm.u uVar3 = kf0Var3.f7262f;
                    th1 th1Var2 = kf0Var3.f7267k;
                    int i13 = this.f6367c;
                    Point point = kf0Var3.f7282z;
                    Point point2 = kf0Var3.f7281y;
                    th1Var2.getClass();
                    try {
                        nm.u uVar4 = new nm.u();
                        if (point != null) {
                            uVar4.s(Integer.valueOf(point.x), "x");
                            uVar4.s(Integer.valueOf(point.y), "y");
                        }
                        nm.u uVar5 = new nm.u();
                        if (point2 != null) {
                            uVar5.s(Integer.valueOf(point2.x), "x");
                            uVar5.s(Integer.valueOf(point2.y), "y");
                        }
                        nm.u uVar6 = new nm.u();
                        uVar6.r("start_point", uVar4);
                        uVar6.r("end_point", uVar5);
                        uVar6.s(Integer.valueOf(i13), "duration_ms");
                        uVar2 = uVar6;
                    } catch (Exception e14) {
                        gk0.a("Error occurred while grabbing custom click gesture signals.", e14);
                    }
                    uVar3.r("custom_click_gesture_signal", uVar2);
                    this.f6365a.a((View) yh1Var.c(), j13, a13, a14, true);
                    return Unit.f80348a;
                }
            } catch (Exception unused) {
            }
        }
        gk0.d("Custom click reporting failed. Ad unit id is not in the allow list.", null);
        return Unit.f80348a;
    }
}
