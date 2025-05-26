package dh1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.zv0;
import ey.n4;
import h32.a4;
import h32.c3;
import h32.d4;
import h32.g0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import oy.i0;
import uj2.q;
import vb0.j;
import wa2.p;
import x02.x2;
import yk1.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class e extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final w f55001a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f55002b;

    /* renamed from: c, reason: collision with root package name */
    public c3 f55003c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f55004d;

    /* renamed from: e, reason: collision with root package name */
    public zv0 f55005e;

    /* renamed from: f, reason: collision with root package name */
    public ol1.a f55006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w eventManager, uk1.d presenterPinalytics, x2 userRepository, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f55001a = eventManager;
        this.f55002b = userRepository;
    }

    public static boolean s3(zv0 zv0Var, c42.c cVar) {
        return zv0Var.L().intValue() == cVar.getValue();
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        ch1.b view = (ch1.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.D3(this);
        zv0 zv0Var = this.f55005e;
        if (zv0Var != null) {
            q3(zv0Var);
        }
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f55006f = null;
        ((ch1.b) getView()).D3(null);
        ((ch1.b) getView()).d();
        super.onUnbind();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        if (r3.booleanValue() != false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6, types: [ch1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3(com.pinterest.api.model.zv0 r10) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dh1.e.q3(com.pinterest.api.model.zv0):void");
    }

    public final HashMap r3() {
        HashMap hashMap = new HashMap();
        hashMap.put("grid_index", String.valueOf(this.f55004d));
        zv0 zv0Var = this.f55005e;
        bs1.c.G1("today_article_id", zv0Var != null ? zv0Var.getUid() : null, hashMap);
        return hashMap;
    }

    public final void t3(String str) {
        List I;
        f30 f30Var;
        ol1.a aVar = this.f55006f;
        if (aVar != null) {
            if (aVar.f96441b != p.STATE_NO_FEEDBACK) {
                return;
            }
        }
        getPresenterPinalytics().f122379a.h(g0.TODAY_ARTICLE, null, r3());
        this.f55001a.d(c0.d.X(this.f55005e, null));
        zv0 zv0Var = this.f55005e;
        if (zv0Var != null) {
            if (zv0Var.L().intValue() == c42.c.IDEA_STREAM.getValue()) {
                zv0 zv0Var2 = this.f55005e;
                if (zv0Var2 == null || (I = zv0Var2.I()) == null || (f30Var = (f30) CollectionsKt.firstOrNull(I)) == null) {
                    j.f125466a.G("Failed to get today article cover Pin ID for Idea Stream, needed for Static Grid to Story Pin PWT", new Object[0]);
                    return;
                }
                if (b40.P0(f30Var)) {
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    new n4(uid).i();
                    return;
                }
                if (str == null) {
                    str = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
                }
                String str2 = str;
                boolean R0 = b40.R0(f30Var);
                dl0 v63 = f30Var.v6();
                if (v63 != null) {
                    v63.r();
                }
                new i0(str2, null, R0, d4.FEED, a4.TODAY_ARTICLE_FEED, 22).i();
            }
        }
    }

    public final c3 u3() {
        c3 c3Var;
        c3 source = this.f55003c;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            c3Var = new c3(source.f66932a, source.f66933b, jq.b.c(TimeUnit.MILLISECONDS), source.f66935d, source.f66936e);
        } else {
            c3Var = null;
        }
        this.f55003c = null;
        return c3Var;
    }

    public final c3 v3() {
        c3 c3Var = this.f55003c;
        if (c3Var != null) {
            return c3Var;
        }
        zv0 zv0Var = this.f55005e;
        String uid = zv0Var != null ? zv0Var.getUid() : null;
        Integer num = this.f55004d;
        c3 c3Var2 = new c3(null, jq.b.c(TimeUnit.MILLISECONDS), null, num != null ? Short.valueOf((short) num.intValue()) : null, uid);
        this.f55003c = c3Var2;
        return c3Var2;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        ch1.b view = (ch1.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.D3(this);
        zv0 zv0Var = this.f55005e;
        if (zv0Var != null) {
            q3(zv0Var);
        }
    }
}
