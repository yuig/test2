package oh2;

import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.internal.payload.NativeCrashData;
import java.util.Map;
import kg.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sh2.h;
import xf2.o0;
import xf2.q;
import xf2.s0;
import xk2.s;

/* loaded from: classes4.dex */
public final class b extends uf2.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final e f94601d;

    /* renamed from: e, reason: collision with root package name */
    public final uh2.b f94602e;

    /* renamed from: f, reason: collision with root package name */
    public final vf2.b f94603f;

    /* renamed from: g, reason: collision with root package name */
    public final sg2.a f94604g;

    /* renamed from: h, reason: collision with root package name */
    public final xh2.d f94605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e nativeCrashProcessor, uh2.b preferencesService, vf2.b logWriter, sg2.a configService, xh2.d serializer, lh2.b logger) {
        super(logWriter, logger, wf2.b.f129712a);
        Intrinsics.checkNotNullParameter(nativeCrashProcessor, "nativeCrashProcessor");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f94601d = nativeCrashProcessor;
        this.f94602e = preferencesService;
        this.f94603f = logWriter;
        this.f94604g = configService;
        this.f94605h = serializer;
    }

    public final void g(NativeCrashData nativeCrash, Map sessionProperties, Map metadata) {
        Intrinsics.checkNotNullParameter(nativeCrash, "nativeCrash");
        Intrinsics.checkNotNullParameter(sessionProperties, "sessionProperties");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int b13 = ((uh2.a) this.f94602e).b("io.embrace.nativecrashnumber");
        s0 s0Var = new s0(this.f94604g, new a(0, sessionProperties), null);
        ri2.e SESSION_ID = tj2.f.f117934a;
        Intrinsics.checkNotNullExpressionValue(SESSION_ID, "SESSION_ID");
        s0Var.a(SESSION_ID, nativeCrash.f73193b, false);
        for (Map.Entry entry : metadata.entrySet()) {
            s0Var.a((ri2.e) entry.getKey(), (String) entry.getValue(), true);
        }
        s0Var.b(h.f112953b, String.valueOf(b13), false);
        String str = nativeCrash.f73195d;
        if (str != null) {
            q.f134886e.getClass();
            s0Var.b(q.f134887f, str, false);
        }
        Map map = nativeCrash.f73196e;
        if (map != null && !map.isEmpty()) {
            try {
                xk2.q qVar = s.f135225b;
                String b14 = this.f94605h.b(nativeCrash.f73196e, Map.class);
                q.f134886e.getClass();
                s0Var.b(q.f134888g, b14, false);
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                xk2.q qVar2 = s.f135225b;
                ue.c.m(th3);
            }
        }
        p.k(this.f94603f, new o0(s0Var, 2), c0.d.T2(Severity.ERROR), "", false, Long.valueOf(nativeCrash.f73194c), 8);
    }
}
