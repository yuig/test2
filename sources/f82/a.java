package f82;

import com.pinterest.error.NetworkResponseError;
import java.util.HashMap;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import qz.d;
import v.f1;

/* loaded from: classes4.dex */
public abstract class a {
    public static final HashMap a(Throwable throwable) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        HashMap hashMap = new HashMap();
        d dVar = null;
        NetworkResponseError networkResponseError = throwable instanceof NetworkResponseError ? (NetworkResponseError) throwable : null;
        if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null) {
            dVar = k3.M(f1Var);
        }
        if (dVar != null) {
        }
        String message = throwable.getMessage();
        if (message != null) {
        }
        return hashMap;
    }
}
