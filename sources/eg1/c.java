package eg1;

import com.pinterest.api.model.so;
import nm.s;
import nm.u;
import nm.w;

/* loaded from: classes5.dex */
public final class c implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        so soVar = (so) obj;
        u uVar = new u();
        if (soVar != null) {
            uVar.u("canvasAspectRatio", soVar.toString());
        }
        return uVar;
    }
}
