package ll0;

import ao2.m;
import com.pinterest.api.model.wy0;
import h32.f1;
import i92.k;
import jc0.s;
import kh2.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d0;
import xk2.q;

/* loaded from: classes5.dex */
public final class d implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83798b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f83797a = i13;
        this.f83798b = obj;
    }

    @Override // uj2.d
    public final void a() {
        int i13 = this.f83797a;
        Object obj = this.f83798b;
        switch (i13) {
            case 0:
                f fVar = (f) obj;
                com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) fVar.getView();
                wy0 f13 = ((b60.d) fVar.f83806e).f();
                String userId = f13 != null ? f13.getUid() : null;
                if (userId == null) {
                    userId = "";
                }
                ol0.f fVar2 = (ol0.f) aVar;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(userId, "userId");
                d0.v(fVar2.s7(), f1.BOARD_REMOVE_COLLABORATOR, userId, false, 12);
                k kVar = fVar2.f96371k0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.n(d70.g.left_board);
                if (fVar.isBound()) {
                    fVar2.c8("com.pinterest.EXTRA_BOARD_EDIT_ACTION_LEAVE");
                }
                fVar.f83808g.d(new s());
                return;
            case 1:
                n.g gVar = (n.g) obj;
                ((xj2.b) gVar.f88600c).dispose();
                ((uj2.d) gVar.f88601d).a();
                return;
            default:
                q qVar = xk2.s.f135225b;
                ((m) obj).resumeWith(Unit.f80348a);
                return;
        }
    }

    @Override // uj2.d
    public final void b(xj2.c disposable) {
        int i13 = this.f83797a;
        Object obj = this.f83798b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                ((f) obj).addDisposable(disposable);
                break;
            case 1:
                ((xj2.b) ((n.g) obj).f88600c).a(disposable);
                break;
            default:
                j.A((m) obj, disposable);
                break;
        }
    }

    @Override // uj2.d
    public final void onError(Throwable e13) {
        int i13 = this.f83797a;
        Object obj = this.f83798b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                f fVar = (f) obj;
                fVar.f83809h.i(((yk1.a) fVar.f83807f).f139224a.getString(x0.generic_error));
                break;
            case 1:
                n.g gVar = (n.g) obj;
                ((xj2.b) gVar.f88600c).dispose();
                ((uj2.d) gVar.f88601d).onError(e13);
                break;
            default:
                q qVar = xk2.s.f135225b;
                ((m) obj).resumeWith(ue.c.m(e13));
                break;
        }
    }
}
