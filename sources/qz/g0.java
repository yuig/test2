package qz;

import ey.b1;
import ey.w0;
import ey.x0;
import ey.y0;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class g0 extends v {
    @Override // qz.x, okhttp3.EventListener
    public final void d(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.d(call);
        new x0().i();
    }

    @Override // qz.x, okhttp3.EventListener
    public final void f(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        String a13 = call.getF95898b().a("X-B3-ParentSpanId");
        if (a13 != null) {
            new b1().i();
            new w0(new BigInteger(a13, CharsKt.checkRadix(16)).longValue()).i();
        }
        super.f(call);
    }

    @Override // qz.v, qz.x, okhttp3.EventListener
    public final void y(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        new y0().i();
        super.y(call, response);
    }
}
