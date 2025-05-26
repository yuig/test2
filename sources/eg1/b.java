package eg1;

import com.pinterest.api.model.ho;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.so;
import java.lang.reflect.Type;
import kotlin.collections.d1;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import nm.r;
import nm.s;

/* loaded from: classes5.dex */
public final class b implements r {
    @Override // nm.r
    public final Object a(s sVar, Type type, j jVar) {
        s v13;
        ho hoVar = so.f41948c;
        String ratioString = (sVar == null || (v13 = sVar.i().v("canvasAspectRatio")) == null) ? null : v13.p();
        if (ratioString == null) {
            ratioString = "";
        }
        hoVar.getClass();
        Intrinsics.checkNotNullParameter(ratioString, "ratioString");
        kotlin.text.j match = so.f41949d.b(0, ratioString);
        if (match == null) {
            return lo.f39845e;
        }
        Intrinsics.checkNotNullParameter(match, "match");
        return ho.a(Integer.parseInt((String) ((d1) match.b()).get(1)), Integer.parseInt((String) ((d1) match.b()).get(2)));
    }
}
