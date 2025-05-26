package zq1;

import com.pinterest.api.model.wy0;
import h32.a4;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f142706j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f142707k = new m(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m f142708l = new m(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f142709i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f142709i) {
            case 0:
                return Unit.f80348a;
            case 1:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                return new qr1.c(user, false, qr1.j.f105010b);
            default:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67043b = a4.SIGNUP_BIRTHDAY_STEP;
                update.f67047f = u0.GOOGLE_CONTINUE_BUTTON;
                return Unit.f80348a;
        }
    }
}
