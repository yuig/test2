package tm;

import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import nm.i0;
import nm.j0;
import nm.o;

/* loaded from: classes.dex */
public final class e implements j0 {
    @Override // nm.j0
    public final i0 a(o oVar, TypeToken typeToken) {
        if (typeToken.f33846a != Timestamp.class) {
            return null;
        }
        oVar.getClass();
        return new f(oVar.g(new TypeToken(Date.class)));
    }
}
