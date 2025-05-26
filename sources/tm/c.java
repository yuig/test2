package tm;

import com.google.gson.reflect.TypeToken;
import java.sql.Time;
import nm.i0;
import nm.j0;
import nm.o;

/* loaded from: classes.dex */
public final class c implements j0 {
    @Override // nm.j0
    public final i0 a(o oVar, TypeToken typeToken) {
        if (typeToken.f33846a == Time.class) {
            return new d(0);
        }
        return null;
    }
}
