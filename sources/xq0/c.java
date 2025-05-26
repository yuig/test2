package xq0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import dl1.s;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements d {
    @Override // xq0.d
    public final boolean a(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model instanceof f30;
    }

    @Override // xq0.d
    public final List b(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!a(model)) {
            return q0.f80391a;
        }
        f30 f30Var = (f30) model;
        String message = "extract urls from a Pin model id [" + f30Var.getUid() + "]";
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        sr m13 = b40.m(f30Var);
        String D0 = m13 != null ? bs1.c.D0(m13) : null;
        if (D0 == null || D0.length() == 0) {
            D0 = bs1.c.B0(f30Var);
        }
        return D0 != null ? e0.b(D0) : q0.f80391a;
    }
}
