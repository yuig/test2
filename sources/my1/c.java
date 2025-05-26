package my1;

import com.pinterest.api.model.wy0;
import g4.u;
import gw1.i;
import hs1.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.u2;
import x02.x2;
import yx1.l;

/* loaded from: classes4.dex */
public final class c extends ip1.c {

    /* renamed from: c, reason: collision with root package name */
    public final x2 f88504c;

    /* renamed from: d, reason: collision with root package name */
    public final q f88505d;

    /* renamed from: e, reason: collision with root package name */
    public final g51.f f88506e;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f88507f;

    /* renamed from: g, reason: collision with root package name */
    public final u2 f88508g;

    public c(x2 userRepository, q imageCache, g51.f environment, b60.b activeUserManager, u2 experiments) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f88504c = userRepository;
        this.f88505d = imageCache;
        this.f88506e = environment;
        this.f88507f = activeUserManager;
        this.f88508g = experiments;
    }

    @Override // ip1.c
    public final void a(Function0 onCompleteCallback) {
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        wy0 f13 = ((b60.d) this.f88507f).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        u uVar = new u();
        xj2.b bVar = new xj2.b();
        bVar.a(this.f88504c.g0().Q(uid).s().o(new l(4, new b(uVar, this, bVar, 0)), new l(5, new i(10, uVar, onCompleteCallback))));
        bk2.c.set(this.f73374a.f135164a, bVar);
        super.a(onCompleteCallback);
    }
}
