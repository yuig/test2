package yn2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q5.y0;

/* loaded from: classes2.dex */
public class q {
    public static o a(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        o oVar = new o();
        oVar.f139587d = cl2.h.a(block, oVar, oVar);
        return oVar;
    }

    public static y0 b(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new y0(block, 2);
    }
}
