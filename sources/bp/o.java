package bp;

import android.view.View;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.model.v7;
import uj2.b0;

/* loaded from: classes3.dex */
public final class o extends g {

    /* renamed from: h, reason: collision with root package name */
    public final m f23647h;

    /* renamed from: i, reason: collision with root package name */
    public final f12.a f23648i;

    public o(v7 v7Var, f fVar, xo.n nVar, z12.f fVar2, f12.a aVar) {
        super(v7Var, new UserFeed(), fVar, nVar);
        this.f23648i = aVar;
        m mVar = new m(this.f23630d, this, fVar2);
        this.f23647h = mVar;
        mVar.f23619d = this.f23633g;
    }

    @Override // bp.g
    public final k C(View view) {
        return new k(this, view, 1);
    }

    @Override // bp.g
    public final m D() {
        return this.f23647h;
    }

    @Override // bp.g
    public final void E() {
        b0<UserFeed> b13 = this.f23648i.b(this.f23631e.getId(), n00.b.a(n00.c.DEFAULT_USER_FEED), 30);
        final int i13 = 0;
        ak2.e eVar = new ak2.e(this) { // from class: bp.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f23646b;

            {
                this.f23646b = this;
            }

            @Override // ak2.e
            public final void accept(Object obj) {
                int i14 = i13;
                o oVar = this.f23646b;
                switch (i14) {
                    case 0:
                        oVar.f23633g.b();
                        break;
                    case 1:
                        UserFeed userFeed = (UserFeed) obj;
                        oVar.f23647h.b(userFeed);
                        oVar.f23633g.a(userFeed, true);
                        break;
                    default:
                        oVar.f23633g.a(null, false);
                        break;
                }
            }
        };
        b13.getClass();
        final int i14 = 2;
        final int i15 = 1;
        new kk2.g(b13, eVar, 2).r(tk2.e.f118017c).l(wj2.c.a()).o(new ak2.e(this) { // from class: bp.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f23646b;

            {
                this.f23646b = this;
            }

            @Override // ak2.e
            public final void accept(Object obj) {
                int i142 = i15;
                o oVar = this.f23646b;
                switch (i142) {
                    case 0:
                        oVar.f23633g.b();
                        break;
                    case 1:
                        UserFeed userFeed = (UserFeed) obj;
                        oVar.f23647h.b(userFeed);
                        oVar.f23633g.a(userFeed, true);
                        break;
                    default:
                        oVar.f23633g.a(null, false);
                        break;
                }
            }
        }, new ak2.e(this) { // from class: bp.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f23646b;

            {
                this.f23646b = this;
            }

            @Override // ak2.e
            public final void accept(Object obj) {
                int i142 = i14;
                o oVar = this.f23646b;
                switch (i142) {
                    case 0:
                        oVar.f23633g.b();
                        break;
                    case 1:
                        UserFeed userFeed = (UserFeed) obj;
                        oVar.f23647h.b(userFeed);
                        oVar.f23633g.a(userFeed, true);
                        break;
                    default:
                        oVar.f23633g.a(null, false);
                        break;
                }
            }
        });
    }
}
