package mr1;

import com.google.firebase.messaging.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes2.dex */
public interface c {
    void H3(Function1 function1);

    default b0 I5() {
        kk2.b bVar = new kk2.b(new a0(this, 24), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }
}
