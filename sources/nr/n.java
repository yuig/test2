package nr;

import a.o3;
import com.pinterest.activity.user.UserSetImageActivity;
import com.pinterest.api.model.wy0;
import h32.f1;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import nx.d0;
import uj2.a0;

/* loaded from: classes3.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UserSetImageActivity f91863j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(UserSetImageActivity userSetImageActivity, int i13) {
        super(1);
        this.f91862i = i13;
        this.f91863j = userSetImageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 0;
        int i14 = this.f91862i;
        UserSetImageActivity userSetImageActivity = this.f91863j;
        switch (i14) {
            case 0:
                switch (i14) {
                    case 0:
                        i92.k kVar = userSetImageActivity.f35229d;
                        if (kVar == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        kVar.i(userSetImageActivity.getString(nz1.f.user_picture_failed));
                        userSetImageActivity.finish();
                        break;
                    default:
                        i92.k kVar2 = userSetImageActivity.f35229d;
                        if (kVar2 == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        kVar2.i(userSetImageActivity.getString(nz1.f.user_picture_failed));
                        userSetImageActivity.finish();
                        break;
                }
                return Unit.f80348a;
            case 1:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                if (user.k3() != null) {
                    w eventManager = userSetImageActivity.getEventManager();
                    Intrinsics.checkNotNullParameter(user, "<this>");
                    eventManager.d(new jc1.b(new ia2.c(user)));
                }
                d0.v(userSetImageActivity.getPinalytics(), f1.USER_EDIT, null, false, 12);
                userSetImageActivity.finish();
                return Unit.f80348a;
            case 2:
                vd0.c m13 = ((vd0.c) obj).m("data");
                if (m13 != null) {
                    String o13 = m13.o("image_upload_tracking_id", "");
                    Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                    int i15 = UserSetImageActivity.f35226j;
                    userSetImageActivity.getClass();
                    ol1.d dVar = new ol1.d(new o3(27, userSetImageActivity, o13), 2);
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    a0 a0Var = tk2.e.f118017c;
                    userSetImageActivity.f35227b.a(dVar.L(1L, timeUnit, a0Var).H(a0Var).A(wj2.c.a()).F(new ir.h(8, new k(userSetImageActivity, o13, 1)), new ir.h(9, new n(userSetImageActivity, i13)), ck2.i.f27923c, ck2.i.f27924d));
                }
                return Unit.f80348a;
            default:
                switch (i14) {
                    case 0:
                        i92.k kVar3 = userSetImageActivity.f35229d;
                        if (kVar3 == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        kVar3.i(userSetImageActivity.getString(nz1.f.user_picture_failed));
                        userSetImageActivity.finish();
                        break;
                    default:
                        i92.k kVar4 = userSetImageActivity.f35229d;
                        if (kVar4 == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        kVar4.i(userSetImageActivity.getString(nz1.f.user_picture_failed));
                        userSetImageActivity.finish();
                        break;
                }
                return Unit.f80348a;
        }
    }
}
