package e10;

import ey.n;
import ey.p;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okhttp3.Call;
import okhttp3.internal.connection.RealCall;
import qz.x;

/* loaded from: classes3.dex */
public final class a extends x {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f56766t;

    public a(b bVar) {
        this.f56766t = bVar;
    }

    @Override // qz.x, okhttp3.EventListener
    public final void d(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.d(call);
        new ey.b().i();
        new p().i();
    }

    @Override // qz.x, okhttp3.EventListener
    public final void f(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        new n().i();
        String c13 = call.getF95898b().f95702c.c("X-B3-ParentSpanId");
        Long valueOf = c13 != null ? Long.valueOf(new BigInteger(c13, CharsKt.checkRadix(16)).longValue()) : null;
        if (valueOf != null) {
            new ey.a(valueOf.longValue()).i();
        } else {
            vb0.j.f125466a.F("[ApolloPWTEventListener]: Missing parent span ID header.", this.f56766t.f56767a, new Object[0]);
        }
        super.f(call);
    }

    @Override // okhttp3.EventListener
    public final void z(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        new ey.c().i();
        super.z(call);
    }
}
