package wr0;

import com.pinterest.api.model.wy0;
import jk2.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements oh1.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f130908a;

    public p(r rVar) {
        this.f130908a = rVar;
    }

    @Override // oh1.r
    public final void a(rp0.d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
    }

    @Override // oh1.r
    public final void b(rp0.d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        r rVar = this.f130908a;
        rVar.U -= comment.o() + 1;
        r.n4(rVar);
    }

    @Override // oh1.r
    public final void c(rp0.d comment, boolean z13) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        r rVar = this.f130908a;
        e0 M = rVar.K.M(rVar.f94536r);
        hk2.b bVar = new hk2.b(new uq0.c(17, new s1.w(comment, z13, rVar, 8)), new uq0.c(18, b.f130874p), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        rVar.addDisposable(bVar);
    }

    @Override // oh1.r
    public final void d(int i13) {
        r rVar = this.f130908a;
        rVar.U -= i13;
        r.n4(rVar);
    }

    @Override // oh1.r
    public final void e(wy0 user, rp0.d comment, boolean z13) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(comment, "comment");
        r rVar = this.f130908a;
        if (!z13) {
            b(comment);
            String uid = user.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            rVar.T3(uid);
            return;
        }
        Intrinsics.checkNotNullParameter(comment, "comment");
        rVar.U++;
        r.n4(rVar);
        rVar.w3();
        rVar.onRecyclerRefresh();
    }
}
