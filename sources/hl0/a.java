package hl0;

import com.pinterest.api.model.v7;
import kl0.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f69455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v7 f69456c;

    public /* synthetic */ a(v vVar, v7 v7Var, int i13) {
        this.f69454a = i13;
        this.f69455b = vVar;
        this.f69456c = v7Var;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f69454a;
        v7 it = this.f69456c;
        v this$0 = this.f69455b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        switch (i13) {
            case 0:
                this$0.getClass();
                this$0.f69541q.c(new lr.b(((yk1.a) this$0.f69546u).f139224a.getString(y60.e.unarchived_toast, it.j1()), it.b1(), 0));
                com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) this$0.getViewIfBound();
                if (aVar != null) {
                    ((z) aVar).P7();
                    break;
                }
                break;
            default:
                this$0.getClass();
                this$0.f69541q.c(new lr.b(((yk1.a) this$0.f69546u).f139224a.getString(y60.e.archived_toast, it.j1()), it.b1(), 0));
                com.pinterest.feature.board.detail.a aVar2 = (com.pinterest.feature.board.detail.a) this$0.getViewIfBound();
                if (aVar2 != null) {
                    ((z) aVar2).P7();
                    break;
                }
                break;
        }
    }
}
