package hr1;

import hk1.t;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import le.s;
import uj2.b0;

/* loaded from: classes2.dex */
public abstract class e extends lr1.g {

    /* renamed from: h, reason: collision with root package name */
    public final List f69989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mr1.c activityProvider, uj2.q resultsFeed) {
        super(qr1.f.f104999b, activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        this.f69989h = f0.j("public_profile", "email", "user_friends");
    }

    public static hk2.o h() {
        kk2.k kVar = new kk2.k(new s(3), 1);
        Intrinsics.checkNotNullExpressionValue(kVar, "fromCallable(...)");
        kk2.b bVar = new kk2.b(new fl.q(23), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        hk2.o v13 = b0.v(kVar, bVar, new u20.c(5, c.f69985i));
        Intrinsics.checkNotNullExpressionValue(v13, "zipWith(...)");
        return v13;
    }

    @Override // lr1.g
    public final uj2.b e() {
        fk2.c cVar = new fk2.c(4, g(), new oo1.d(11, d.f69986j));
        Intrinsics.checkNotNullExpressionValue(cVar, "flatMapCompletable(...)");
        return cVar;
    }

    public final fk2.f0 g() {
        fk2.c cVar = new fk2.c(4, this.f84602b.I5(), new dl1.b0(13, new t(this, 19)));
        Intrinsics.checkNotNullExpressionValue(cVar, "flatMapCompletable(...)");
        fk2.f0 f0Var = new fk2.f0(cVar, new s(2), null, 0);
        Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
        return f0Var;
    }
}
