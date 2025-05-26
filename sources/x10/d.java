package x10;

import com.pinterest.api.model.wy0;
import java.util.Map;
import kk2.g;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import x02.x2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f22.d f131564a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f131565b;

    /* renamed from: c, reason: collision with root package name */
    public final uo.a f131566c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f131567d;

    public d(f22.d settingsService, x2 userRepository, uo.a accountDataSource, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(settingsService, "settingsService");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(accountDataSource, "accountDataSource");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f131564a = settingsService;
        this.f131565b = userRepository;
        this.f131566c = accountDataSource;
        this.f131567d = activeUserManager;
    }

    public final g a(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        b0<wy0> f13 = this.f131564a.f(parameters);
        dv.a aVar = new dv.a(14, new mz.c(this, 3));
        f13.getClass();
        g gVar = new g(f13, aVar, 3);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnSuccess(...)");
        return gVar;
    }
}
