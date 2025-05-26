package is1;

import a.cb;
import android.util.LruCache;
import com.pinterest.repository.pin.PinService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f73605a;

    /* renamed from: b, reason: collision with root package name */
    public final uk2.f f73606b;

    /* renamed from: c, reason: collision with root package name */
    public final xj2.b f73607c;

    /* renamed from: d, reason: collision with root package name */
    public final LruCache f73608d;

    public i0(PinService pinService) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        this.f73605a = pinService;
        this.f73606b = cb.r("create(...)");
        this.f73607c = new xj2.b();
        this.f73608d = new LruCache(10);
    }

    public final void a(String str, boolean z13) {
        xj2.b bVar = this.f73607c;
        bVar.d();
        bVar.a(this.f73605a.getPinTranslations(str).r(tk2.e.f118017c).l(wj2.c.a()).o(new zq1.c0(25, new s1.w(str, z13, this, 24)), new zq1.c0(26, new xm1.k(26, this, str))));
    }

    public final h0 b(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return (h0) this.f73608d.get(uid);
    }

    public final jk2.x c(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        uk2.f fVar = this.f73606b;
        Intrinsics.g(fVar, "null cannot be cast to non-null type io.reactivex.Observable<com.pinterest.kit.utils.TranslationEvent>");
        jk2.x xVar = new jk2.x(fVar, new b22.f(6, new dl1.i0(uid, 21)), 2);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        return xVar;
    }

    public final boolean d(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        h0 h0Var = (h0) this.f73608d.get(uid);
        if (h0Var != null) {
            return h0Var.f73598c;
        }
        return false;
    }

    public final boolean e(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        h0 h0Var = (h0) this.f73608d.get(uid);
        if (h0Var != null) {
            return h0Var.f73597b;
        }
        return false;
    }
}
