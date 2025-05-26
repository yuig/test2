package sg0;

import a8.v;
import ck2.i;
import com.pinterest.framework.multisection.datasource.pagedlist.h;
import i32.y0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jc0.l;
import jk2.x;
import k1.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ra0.l0;
import rg0.s;
import uj2.a0;
import uj2.q;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final long f112862f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f112863g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final s f112864a;

    /* renamed from: b, reason: collision with root package name */
    public final q f112865b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f112866c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f112867d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f112868e;

    static {
        zn2.a aVar = zn2.b.f142311b;
        f112862f = dl2.b.P2(4, zn2.d.SECONDS);
    }

    public f(s experiences, w eventManager) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(eventManager, "<this>");
        ol1.d observableActionEvents = new ol1.d(new v(eventManager, 26), 2);
        Intrinsics.checkNotNullExpressionValue(observableActionEvents, "create(...)");
        a0 ioScheduler = tk2.e.f118017c;
        Intrinsics.checkNotNullExpressionValue(ioScheduler, "io(...)");
        a0 mainScheduler = wj2.c.a();
        Intrinsics.checkNotNullExpressionValue(mainScheduler, "mainThread(...)");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(observableActionEvents, "observableActionEvents");
        Intrinsics.checkNotNullParameter(ioScheduler, "ioScheduler");
        Intrinsics.checkNotNullParameter(mainScheduler, "mainScheduler");
        this.f112866c = new AtomicBoolean(true);
        this.f112864a = experiences;
        this.f112865b = observableActionEvents;
        this.f112867d = ioScheduler;
        this.f112868e = mainScheduler;
    }

    public final xj2.c a(String pinUid, boolean z13, y0 placement, Function1 onLoad) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        int i13 = 1;
        if (!this.f112866c.compareAndSet(true, false)) {
            xj2.e eVar = new xj2.e(i.f27922b);
            Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
            return eVar;
        }
        q t13 = q.M(zn2.b.e(f112862f), TimeUnit.MILLISECONDS, this.f112867d).t(new lb0.c(23, new b0((Object) this, (Object) placement, pinUid, z13, 4)));
        h hVar = new h(24, new l(pinUid, 10));
        q qVar = this.f112865b;
        qVar.getClass();
        jk2.v vVar = new jk2.v(t13.J(new x(qVar, hVar, 2).p(new k90.i(29, new l0(this, 27)))).A(this.f112868e), i.f27924d, new cp.b0(this, 8), i13);
        Intrinsics.checkNotNullExpressionValue(vVar, "doOnDispose(...)");
        return nl.b.s(vVar, new gd0.c(9, onLoad, placement), null, null, 6);
    }
}
