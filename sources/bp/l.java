package bp;

import android.view.View;
import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.api.model.pc;
import com.pinterest.api.model.qc;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kh2.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends g {

    /* renamed from: h, reason: collision with root package name */
    public final m f23640h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f23641i;

    /* renamed from: j, reason: collision with root package name */
    public final h12.a f23642j;

    public l(v7 v7Var, f fVar, xo.n nVar, z12.a aVar, h12.a aVar2) {
        super(v7Var, new CollaboratorInviteFeed(), fVar, nVar);
        this.f23641i = com.bumptech.glide.d.E();
        m mVar = new m(this.f23630d, this, aVar);
        this.f23640h = mVar;
        mVar.f23619d = this.f23633g;
        this.f23642j = aVar2;
    }

    @Override // bp.g
    public final k C(View view) {
        return new k(this, view, 0);
    }

    @Override // bp.g
    public final m D() {
        return this.f23640h;
    }

    @Override // bp.g
    public final void E() {
        String boardUid = this.f23631e.getId();
        h12.a aVar = this.f23642j;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        kk2.g gVar = new kk2.g(aVar.f66466a.c(boardUid, "viewer_first", n00.b.a(n00.c.BOARD_INVITES_DETAILS)).l(wj2.c.a()).r(tk2.e.f118017c), new xo.a(this, 4), 2);
        final int i13 = 0;
        final int i14 = 1;
        nl.b.q(gVar, new Function1(this) { // from class: bp.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f23635b;

            {
                this.f23635b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = i13;
                l lVar = this.f23635b;
                switch (i15) {
                    case 0:
                        CollaboratorInviteFeed collaboratorInviteFeed = (CollaboratorInviteFeed) obj;
                        v7 v7Var = lVar.f23631e;
                        wy0 B = w.B(v7Var);
                        collaboratorInviteFeed.getClass();
                        if (v7Var.k1() != null) {
                            qc qcVar = new qc();
                            qcVar.e(B);
                            qcVar.g(pc.OWNER);
                            collaboratorInviteFeed.h(qcVar);
                        }
                        lVar.f23640h.b(collaboratorInviteFeed);
                        lVar.f23633g.a(collaboratorInviteFeed, true);
                        break;
                    default:
                        lVar.f23633g.a(null, false);
                        break;
                }
                return Unit.f80348a;
            }
        }, new Function1(this) { // from class: bp.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f23635b;

            {
                this.f23635b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = i14;
                l lVar = this.f23635b;
                switch (i15) {
                    case 0:
                        CollaboratorInviteFeed collaboratorInviteFeed = (CollaboratorInviteFeed) obj;
                        v7 v7Var = lVar.f23631e;
                        wy0 B = w.B(v7Var);
                        collaboratorInviteFeed.getClass();
                        if (v7Var.k1() != null) {
                            qc qcVar = new qc();
                            qcVar.e(B);
                            qcVar.g(pc.OWNER);
                            collaboratorInviteFeed.h(qcVar);
                        }
                        lVar.f23640h.b(collaboratorInviteFeed);
                        lVar.f23633g.a(collaboratorInviteFeed, true);
                        break;
                    default:
                        lVar.f23633g.a(null, false);
                        break;
                }
                return Unit.f80348a;
            }
        });
    }
}
