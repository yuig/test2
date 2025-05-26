package eg1;

import com.pinterest.api.model.y6;
import nm.s;
import nm.u;
import nm.w;

/* loaded from: classes5.dex */
public final class a implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        y6 y6Var = (y6) obj;
        u uVar = new u();
        if (y6Var != null) {
            uVar.u("path", y6Var.e());
        }
        return uVar;
    }
}
