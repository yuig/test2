package eg1;

import com.pinterest.api.model.d30;
import nm.s;
import nm.u;
import nm.w;

/* loaded from: classes5.dex */
public final class f implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        d30 d30Var = (d30) obj;
        u uVar = new u();
        if (d30Var != null) {
            uVar.u("path", d30Var.e());
        }
        return uVar;
    }
}
