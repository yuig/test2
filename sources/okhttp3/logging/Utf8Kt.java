package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;
import wo2.j;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Utf8Kt {
    public static final boolean a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        try {
            j jVar2 = new j();
            jVar.h(0L, s.d(jVar.f130711b, 64L), jVar2);
            for (int i13 = 0; i13 < 16; i13++) {
                if (jVar2.o1()) {
                    return true;
                }
                int O = jVar2.O();
                if (Character.isISOControl(O) && !Character.isWhitespace(O)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
