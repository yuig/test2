package dd;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import qc.f;

/* loaded from: classes.dex */
public abstract class b {
    public static final Headers a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            builder.a(fVar.f103431a, fVar.f103432b);
        }
        return builder.e();
    }
}
