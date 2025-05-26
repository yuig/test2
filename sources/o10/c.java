package o10;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zj0;
import com.pinterest.api.model.zs;
import com.pinterest.api.model.zv0;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f92770a = new c();

    private c() {
    }

    public final e a(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof v7) {
            return a.f92768a;
        }
        if (model instanceof ba) {
            return b.f92769a;
        }
        if (model instanceof vh) {
            return d.f92771a;
        }
        if (model instanceof zs) {
            return h.f92773a;
        }
        if (model instanceof f30) {
            return g.f92772a;
        }
        if (model instanceof zj0) {
            return i.f92774a;
        }
        if (model instanceof zv0) {
            return l.f92777a;
        }
        if (model instanceof wy0) {
            return m.f92778a;
        }
        return null;
    }
}
