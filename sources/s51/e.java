package s51;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.wy0;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import ok1.f;
import u51.z;
import uj2.q;
import x02.p2;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class e extends t implements q51.a {

    /* renamed from: a, reason: collision with root package name */
    public final az0 f111157a;

    /* renamed from: b, reason: collision with root package name */
    public final v f111158b;

    /* renamed from: c, reason: collision with root package name */
    public final p2 f111159c;

    /* renamed from: d, reason: collision with root package name */
    public final s60.e f111160d;

    /* renamed from: e, reason: collision with root package name */
    public final f f111161e;

    /* renamed from: f, reason: collision with root package name */
    public final ok1.d f111162f;

    /* renamed from: g, reason: collision with root package name */
    public final w f111163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d presenterPinalytics, q networkStateStream, az0 reportableModel, yk1.a viewResources, p2 userDidItRepository, s60.d userBlockActions, f userFollowActions, ok1.d boardFollowActions) {
        super(presenterPinalytics, networkStateStream);
        w eventManager = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(reportableModel, "reportableModel");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(userDidItRepository, "userDidItRepository");
        Intrinsics.checkNotNullParameter(userBlockActions, "userBlockActions");
        Intrinsics.checkNotNullParameter(userFollowActions, "userFollowActions");
        Intrinsics.checkNotNullParameter(boardFollowActions, "boardFollowActions");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f111157a = reportableModel;
        this.f111158b = viewResources;
        this.f111159c = userDidItRepository;
        this.f111160d = userBlockActions;
        this.f111161e = userFollowActions;
        this.f111162f = boardFollowActions;
        this.f111163g = eventManager;
    }

    public static final void p3(e eVar, wy0 wy0Var, int i13) {
        if (eVar.isBound()) {
            q51.b bVar = (q51.b) eVar.getView();
            String message = ((yk1.a) eVar.f111158b).f139224a.getString(i13, wy0Var.Z2());
            z zVar = (z) bVar;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            k kVar = zVar.f120653s;
            if (kVar != null) {
                kVar.i(message);
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
    }

    public static final void q3(e eVar, wy0 wy0Var, int i13) {
        if (eVar.isBound()) {
            String Z2 = wy0Var.Z2();
            if (Z2 != null && Z2.length() != 0) {
                q51.b bVar = (q51.b) eVar.getView();
                String message = ((yk1.a) eVar.f111158b).f139224a.getString(i13, Z2);
                z zVar = (z) bVar;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                k kVar = zVar.f120653s;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.m(message);
            }
            ((z) ((q51.b) eVar.getView())).dismiss();
        }
    }
}
