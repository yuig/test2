package og0;

import com.pinterest.error.AuthFailureError;
import com.pinterest.error.NetworkErrorWithUrls;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.error.NoConnectionErrorWithUrls;
import com.pinterest.error.ParseError;
import com.pinterest.error.ServerError;
import com.pinterest.error.TimeoutError;
import com.pinterest.error.TimeoutErrorWithUrls;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v.f1;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final v f94441a = m.b(a.f94440i);

    public static final long a(long j13, float f13, int i13) {
        return (long) (Math.pow(f13 + 1.0d, i13 - 1.0d) * j13);
    }

    public static final boolean b(String str, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof TimeoutErrorWithUrls) || (throwable instanceof ParseError) || (throwable instanceof TimeoutError)) {
            return true;
        }
        boolean z13 = throwable instanceof ServerError;
        v vVar = f94441a;
        if (z13) {
            f1 f1Var = ((ServerError) throwable).f45043a;
            return CollectionsKt.L((Set) vVar.getValue(), f1Var != null ? Integer.valueOf(f1Var.f123449b) : null);
        }
        if (!(throwable instanceof RuntimeException) && !(throwable instanceof AuthFailureError)) {
            if (throwable instanceof NoConnectionErrorWithUrls) {
                if (str != null) {
                    return StringsKt.E(str, "/v3/callback/ping", false);
                }
                return false;
            }
            if (throwable instanceof NetworkErrorWithUrls) {
                f1 f1Var2 = ((NetworkErrorWithUrls) throwable).f45043a;
                return CollectionsKt.L((Set) vVar.getValue(), f1Var2 != null ? Integer.valueOf(f1Var2.f123449b) : null);
            }
            if (throwable instanceof NetworkResponseError) {
                f1 f1Var3 = ((NetworkResponseError) throwable).f45043a;
                return CollectionsKt.L((Set) vVar.getValue(), f1Var3 != null ? Integer.valueOf(f1Var3.f123449b) : null);
            }
        }
        return false;
    }
}
