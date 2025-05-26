package nr;

import com.pinterest.activity.user.UserSetImageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.b0;

/* loaded from: classes3.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91853i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UserSetImageActivity f91854j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f91855k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(UserSetImageActivity userSetImageActivity, String str, int i13) {
        super(1);
        this.f91853i = i13;
        this.f91854j = userSetImageActivity;
        this.f91855k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91853i;
        String str = this.f91855k;
        UserSetImageActivity userSetImageActivity = this.f91854j;
        switch (i13) {
            case 0:
                vd0.c response = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                int i14 = UserSetImageActivity.f35226j;
                userSetImageActivity.getClass();
                vd0.c m13 = response != null ? response.m("data") : null;
                if (m13 == null || m13.j(0, str) != 4) {
                    vd0.c m14 = response != null ? response.m("data") : null;
                    if (m14 == null || m14.j(0, str) != 5) {
                        return b0.g(new Throwable());
                    }
                }
                return b0.j(response);
            default:
                vd0.c cVar = (vd0.c) obj;
                int i15 = UserSetImageActivity.f35226j;
                userSetImageActivity.getClass();
                vd0.c m15 = cVar != null ? cVar.m("data") : null;
                if (m15 == null || m15.j(0, str) != 5) {
                    userSetImageActivity.getHandler().postDelayed(new com.airbnb.lottie.k(userSetImageActivity, 29), 1000L);
                } else {
                    i92.k kVar = userSetImageActivity.f35229d;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.i(userSetImageActivity.getString(nz1.f.user_picture_failed));
                    userSetImageActivity.finish();
                }
                return Unit.f80348a;
        }
    }
}
