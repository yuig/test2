package dl1;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements ak2.f, OnSuccessListener, ak2.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f55199b;

    public /* synthetic */ b0(int i13, Function1 function1) {
        this.f55198a = i13;
        this.f55199b = function1;
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        int i13 = this.f55198a;
        Function1 function1 = this.f55199b;
        switch (i13) {
            case 0:
                return (s) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 1:
                return (s) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 2:
                return (uj2.t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 3:
                return (Pair) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 4:
                return (Pair) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 5:
                return (Boolean) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 6:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 7:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 8:
                return (uj2.t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 9:
                return (Pair) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 10:
                return (s) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 11:
                return (gb2.i) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 12:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 13:
                return (uj2.f) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 14:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 15:
                return (uj2.f) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 16:
                return (uj2.f) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 17:
                return (u5.l) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 18:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 19:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 20:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 21:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 22:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 23:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 24:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 25:
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 26:
                return (qr1.t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 27:
                return (Unit) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 28:
                return (Pair) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            default:
                RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
                return (uj2.f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i13 = this.f55198a;
        Function1 tmp0 = this.f55199b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        switch (i13) {
            case 0:
                tmp0.invoke(obj);
                break;
            case 1:
                tmp0.invoke(obj);
                break;
            default:
                tmp0.invoke(obj);
                break;
        }
    }

    @Override // ak2.g
    public boolean test(Object obj) {
        int i13 = this.f55198a;
        Function1 function1 = this.f55199b;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                gb2.f fVar = gb2.f.f64747a;
                break;
            case 11:
                break;
            default:
                a7.f fVar2 = ac2.m0.f1992a;
                break;
        }
        return ((Boolean) ep.b.j(function1, "$tmp0", obj, "p0", obj)).booleanValue();
    }
}
