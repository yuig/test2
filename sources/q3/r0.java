package q3;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface r0 extends s {
    q0 Y(int i13, int i14, Map map, Function1 function1);

    default q0 s0(int i13, int i14, Map map, Function1 function1) {
        return Y(i13, i14, map, function1);
    }
}
