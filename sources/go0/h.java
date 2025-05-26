package go0;

import com.pinterest.api.model.v7;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes5.dex */
public final class h extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final String f65864k;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f65865l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a listener, String boardId, x0 boardRepository) {
        super(null);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f65864k = boardId;
        this.f65865l = boardRepository;
        o(465541, new yi0.a(listener, boardId));
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        if (i13 == 465541) {
            return true;
        }
        return this instanceof ah1.a;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        if (((dl1.s) getItem(i13)) instanceof v7) {
            return 465541;
        }
        throw new IllegalStateException("Invalid model type in BoardSectionPickerParentBoardFetchedList::getItemViewType");
    }

    @Override // xk1.c
    public final uj2.q k() {
        j1 j1Var = new j1(this.f65865l.Q(this.f65864k), new qk0.b(8, g.f65856j), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
