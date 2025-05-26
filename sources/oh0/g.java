package oh0;

import a.cb;
import fk2.m;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f94470a;

    /* renamed from: b, reason: collision with root package name */
    public final h f94471b;

    /* renamed from: c, reason: collision with root package name */
    public final uk2.f f94472c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f94473d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f94474e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f94475f;

    /* renamed from: g, reason: collision with root package name */
    public xj2.c f94476g;

    /* renamed from: h, reason: collision with root package name */
    public final uk2.f f94477h;

    public g(h authExperimentsService, h unAuthExperimentsService, uk2.f experimentsActivationSubject) {
        Intrinsics.checkNotNullParameter(authExperimentsService, "authExperimentsService");
        Intrinsics.checkNotNullParameter(unAuthExperimentsService, "unAuthExperimentsService");
        Intrinsics.checkNotNullParameter(experimentsActivationSubject, "experimentsActivationSubject");
        this.f94470a = authExperimentsService;
        this.f94471b = unAuthExperimentsService;
        this.f94472c = experimentsActivationSubject;
        this.f94473d = new LinkedHashSet();
        this.f94474e = new AtomicBoolean(false);
        this.f94475f = new AtomicBoolean(false);
        this.f94477h = cb.r("create(...)");
    }

    public final uj2.b a(String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        return (c60.d.b() ? this.f94470a : this.f94471b).a(dl2.b.I0(g1.b(experimentName)));
    }

    public final uj2.b b() {
        synchronized (this.f94473d) {
            if (this.f94473d.isEmpty()) {
                m mVar = m.f62459a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            String I0 = dl2.b.I0(this.f94473d);
            this.f94473d.clear();
            fk2.c l13 = (c60.d.b() ? this.f94470a : this.f94471b).a(I0).l(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
            return l13;
        }
    }
}
