package yg1;

import ck2.i;
import kotlin.jvm.internal.Intrinsics;
import n70.o;
import rf1.v;
import uj2.q;
import x02.x2;
import yk1.r;

/* loaded from: classes5.dex */
public final class g extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final o f139025a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f139026b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139027c;

    /* renamed from: d, reason: collision with root package name */
    public final a f139028d;

    public /* synthetic */ g(o oVar, q qVar, x2 x2Var, String str) {
        this(oVar, qVar, x2Var, str, null);
    }

    @Override // yk1.p
    public final uk1.d getPresenterPinalytics() {
        return this.f139025a;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        d dVar = (d) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.f139019e = this;
        dVar.setPinalytics(getPinalytics());
        xj2.c F = this.f139026b.L(this.f139027c).F(new v(27, new ic1.c(21, this, view)), new v(28, f.f139024i), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o presenterPinalytics, q networkStateStream, x2 userRepository, String featuredCreatorId, a aVar) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(featuredCreatorId, "featuredCreatorId");
        this.f139025a = presenterPinalytics;
        this.f139026b = userRepository;
        this.f139027c = featuredCreatorId;
        this.f139028d = aVar;
    }
}
