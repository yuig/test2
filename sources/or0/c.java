package or0;

import com.pinterest.feature.home.model.f;
import com.pinterest.feature.home.model.g;
import java.util.Map;
import jk2.h0;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import pk.a0;
import ps0.x;
import uj2.q;
import x02.r1;
import x02.s1;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public final s1 f97253f;

    public c(x xVar, f fVar) {
        super(xVar, true);
        this.f97253f = fVar;
    }

    @Override // or0.b
    public final q a(Map args) {
        r1 requestType = r1.REQUEST_TYPE_ONLY_REMOTE;
        f fVar = (f) this.f97253f;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(args, "args");
        fVar.f45791w.set(true);
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(args, "args");
        if (fVar.f45790v || f.K("HomeFeedRepository.REQUEST_PARAMS_KEY_INITIAL_HOME_FEED_REQUEST", args)) {
            requestType = r1.REQUEST_TYPE_ALWAYS_REMOTE;
            fVar.f45790v = false;
        }
        if (fVar.f45789u) {
            requestType = dl2.b.f55293b ? r1.REQUEST_TYPE_DEFAULT : r1.REQUEST_TYPE_ALWAYS_REMOTE;
            fVar.f45789u = false;
        }
        r1 r1Var = requestType;
        fVar.f45789u = f.K("HomeFeedRepository.REQUEST_PARAMS_KEY_HOME_FEED_PREFETCH", args);
        boolean K = f.K("HomeFeedRepository.REQUEST_PARAMS_KEY_HOME_FEED_PREFETCH", args);
        boolean K2 = f.K("HomeFeedRepository.REQUEST_PARAMS_KEY_LOADING_HOME_FEED_POST_NUX", args);
        Object obj = args.get("HomeFeedRepository.REQUEST_PARAMS_KEY_NUX_SIGNALS_MAP");
        return new j1(fVar.b(new g(r1Var, K, K2, obj != null ? f.N(obj) : null, "", f.K("HomeFeedRepository.REQUEST_PARAMS_KEY_IN_LOCAL_NAV", args))), s1.f131484q, 0);
    }

    @Override // or0.b
    public final q b(String nextRequestUrl) {
        String n13;
        s1 s1Var = this.f97253f;
        s1Var.getClass();
        if (a0.x0(nextRequestUrl)) {
            return h0.f76488a;
        }
        f fVar = (f) s1Var;
        Intrinsics.checkNotNullParameter(nextRequestUrl, "nextRequestUrl");
        if (fVar.J()) {
            n13 = f.M(nextRequestUrl);
        } else {
            m60.h0 h0Var = fVar.f45786r;
            n13 = z.n(nextRequestUrl, "link_header=" + String.valueOf(h0Var.f85907c + h0Var.f85905a) + "&", "");
        }
        String nextRequestUrl2 = n13;
        r1 requestType = r1.REQUEST_TYPE_DEFAULT;
        Intrinsics.checkNotNullParameter(nextRequestUrl2, "nextRequestUrl");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        return new j1(s1Var.b(new g(requestType, false, nextRequestUrl2, false, 46)), s1.f131484q, 0);
    }
}
