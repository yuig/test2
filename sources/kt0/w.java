package kt0;

import com.pinterest.api.model.k8;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lq0.g1;
import x02.a2;

/* loaded from: classes5.dex */
public final /* synthetic */ class w implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f80860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f80861c;

    public /* synthetic */ w(e0 e0Var, List list, int i13) {
        this.f80859a = i13;
        this.f80860b = e0Var;
        this.f80861c = list;
    }

    @Override // ak2.a
    public final void run() {
        z40.h d2;
        z40.g c13;
        String a13;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        int i13 = this.f80859a;
        List boardInvites = this.f80861c;
        e0 this$0 = this.f80860b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardInvites, "$boardInvites");
                this$0.getClass();
                boolean z13 = lr.f.f84504g;
                k8 c14 = com.facebook.login.z.c(boardInvites);
                if (c14 != null) {
                    uj2.q R = ((dl1.l) this$0.f80810d).R(c14.f39332b);
                    uj2.a0 a0Var = tk2.e.f118017c;
                    uj2.q.P(R.H(a0Var).A(wj2.c.a()), this$0.f80811e.R(c14.f39331a).H(a0Var).A(wj2.c.a()), new ep.g(9, new d0(this$0))).H(a0Var).F(new fs0.q(28, new g1(21, this$0, c14)), new fs0.q(29, o.f80842l), cVar, a2Var);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardInvites, "$conversations");
                this$0.getClass();
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                if (f13 != null) {
                    lr.d0.f84486g.getClass();
                    z40.n d13 = com.google.android.gms.common.api.d.d(f13, boardInvites);
                    if (d13 != null && (d2 = d13.d()) != null && (c13 = d2.c()) != null && (a13 = c13.a()) != null) {
                        this$0.f80811e.R(a13).H(tk2.e.f118017c).A(wj2.c.a()).F(new fs0.q(26, new g1(22, this$0, d13)), new fs0.q(27, o.f80843m), cVar, a2Var);
                        break;
                    }
                }
                break;
        }
    }
}
