package eg1;

import com.pinterest.api.model.pu;
import nm.s;
import nm.u;
import nm.w;

/* loaded from: classes5.dex */
public final class e implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        pu puVar = (pu) obj;
        u uVar = new u();
        if (puVar != null) {
            uVar.u("path", puVar.e());
        }
        return uVar;
    }
}
