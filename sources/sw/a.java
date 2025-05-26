package sw;

import com.pinterest.api.model.f30;
import h32.f1;
import h32.v0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface a {
    static void b(a aVar, rw.a step, Throwable throwable, f30 f30Var, int i13) {
        if ((i13 & 4) != 0) {
            f30Var = null;
        }
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        f1 f1Var = f1.OM_SDK_FUNNEL_ERROR;
        String uid = f30Var != null ? f30Var.getUid() : null;
        HashMap hashMap = new HashMap();
        hashMap.put("om_step", step.getValue());
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        hashMap.put("error_message", message);
        Unit unit = Unit.f80348a;
        v0 v0Var = new v0();
        v0Var.C = 0L;
        bVar.f115399a.H(f1Var, uid, null, hashMap, v0Var, false);
    }
}
