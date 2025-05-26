package dd0;

import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import uk1.d;
import x02.x2;

/* loaded from: classes5.dex */
public final class c extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f54443a;

    /* renamed from: b, reason: collision with root package name */
    public final k12.a f54444b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f54445c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f54446d;

    /* renamed from: e, reason: collision with root package name */
    public final a71.c f54447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w eventManager, k12.a brandedContentService, x2 userRepository, b60.b activeUserManager, d presenterPinalytics) {
        super(0);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(brandedContentService, "brandedContentService");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f54443a = eventManager;
        this.f54444b = brandedContentService;
        this.f54445c = userRepository;
        this.f54446d = activeUserManager;
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f54447e = new a71.c(d0Var, 0);
    }
}
