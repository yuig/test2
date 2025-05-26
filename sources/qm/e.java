package qm;

import com.google.gson.reflect.TypeToken;
import java.util.Date;

/* loaded from: classes.dex */
public final class e implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        if (typeToken.f33846a == Date.class) {
            return new h(g.f104162b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
