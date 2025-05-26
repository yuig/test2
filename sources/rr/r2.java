package rr;

import android.net.Uri;
import com.pinterest.api.model.f30;
import com.pinterest.error.ServerError;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109847i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s2 f109848j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(s2 s2Var, int i13) {
        super(1);
        this.f109847i = i13;
        this.f109848j = s2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109847i;
        s2 s2Var = this.f109848j;
        switch (i13) {
            case 0:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Uri parse = Uri.parse("https://pinterest.com/pin/" + uid);
                pd.s sVar = s2Var.f109855i;
                Intrinsics.f(parse);
                List<String> pathSegments = parse.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                sVar.i(parse, pathSegments, true, s2Var.f109726d);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                ServerError serverError = th3 instanceof ServerError ? (ServerError) th3 : null;
                v.f1 f1Var = serverError != null ? serverError.f45043a : null;
                if (f1Var == null || f1Var.f123449b != 50) {
                    s2Var.f109854h.q();
                } else {
                    s2Var.f109854h.t(null);
                }
                break;
        }
        return Unit.f80348a;
    }
}
