package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface f extends a7.k {
    void close();

    long d(i iVar);

    default Map e() {
        return Collections.emptyMap();
    }

    void f(a0 a0Var);

    Uri r();
}
