package eg1;

import com.pinterest.api.model.k01;
import nm.s;
import nm.u;
import nm.w;

/* loaded from: classes5.dex */
public final class g implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        k01 k01Var = (k01) obj;
        u uVar = new u();
        if (k01Var != null) {
            uVar.u("path", k01Var.e());
        }
        return uVar;
    }
}
