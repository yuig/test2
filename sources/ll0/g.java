package ll0;

import ck2.i;
import com.pinterest.feature.user.board.view.MultiUserAvatarLayout;
import kl0.t;
import kotlin.jvm.internal.Intrinsics;
import ol0.q;
import x02.x0;
import yk1.n;

/* loaded from: classes5.dex */
public final class g extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83820a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f83821b;

    /* renamed from: c, reason: collision with root package name */
    public Object f83822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String boardId, x0 boardRepository) {
        super(0);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f83821b = boardId;
        this.f83822c = boardRepository;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        int i13 = this.f83820a;
        Object obj = this.f83821b;
        switch (i13) {
            case 0:
                q view = (q) nVar;
                Intrinsics.checkNotNullParameter(view, "view");
                super.r3(view);
                addDisposable(((x0) this.f83822c).S((String) obj).F(new zk0.b(25, new t(this, 1)), new zk0.b(26, e.f83800k), i.f27923c, i.f27924d));
                break;
            default:
                th1.a aVar = (th1.a) nVar;
                super.r3(aVar);
                ((wh1.a) obj).bind(((MultiUserAvatarLayout) aVar).f48968b);
                break;
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        switch (this.f83820a) {
            case 1:
                ((wh1.a) this.f83821b).unbind();
                this.f83822c = null;
                super.onUnbind();
                break;
            default:
                super.onUnbind();
                break;
        }
    }

    public g(wh1.a aVar) {
        super(0);
        this.f83821b = aVar;
    }
}
