package tu1;

import android.content.Context;
import com.google.android.gms.net.PlayServicesCronetProvider;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f119381a;

    /* renamed from: b, reason: collision with root package name */
    public final gz1.b f119382b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f119383c;

    /* renamed from: d, reason: collision with root package name */
    public volatile CronetEngine f119384d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f119385e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f119386f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f119387g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f119388h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Boolean f119389i;

    public i(Context context, gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f119381a = context;
        this.f119382b = googlePlayServices;
        this.f119383c = new Object();
        this.f119386f = xk2.m.b(g.f119377i);
        this.f119387g = xk2.m.b(new h(this, 0));
        this.f119388h = xk2.m.b(new h(this, 1));
    }

    public final CronetEngine a() {
        CronetEngine.Builder createBuilder = new PlayServicesCronetProvider(this.f119381a).createBuilder();
        Intrinsics.checkNotNullExpressionValue(createBuilder, "createBuilder(...)");
        createBuilder.enableHttp2(true).enableQuic(true).enableHttpCache(1, 2097152L).addQuicHint("i.pinimg.com", 443, 443);
        CronetEngine build = createBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final boolean b() {
        return ((Boolean) this.f119387g.getValue()).booleanValue();
    }

    public final boolean c() {
        boolean z13 = false;
        z13 = false;
        if (!((Boolean) this.f119388h.getValue()).booleanValue()) {
            return false;
        }
        Boolean bool = this.f119389i;
        if (bool != null) {
            return bool.booleanValue();
        }
        int intValue = ((Number) this.f119386f.getValue()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                try {
                    z13 = new PlayServicesCronetProvider(this.f119381a).isEnabled();
                } catch (Throwable unused) {
                }
                ((lb0.b) lb0.n.f82724c.a()).l("cronet_provider_is_enabled", z13 ? 1 : 0);
            } else {
                z13 = true;
            }
        }
        this.f119389i = Boolean.valueOf(z13);
        return z13;
    }
}
