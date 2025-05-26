package yn0;

import h32.f1;
import k70.e;
import kotlin.jvm.internal.Intrinsics;
import yk1.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f139516b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f139515a = i13;
        this.f139516b = dVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f139515a;
        d this$0 = this.f139516b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getPinalytics().a(f1.BOARD_SECTION_DELETE, this$0.f139522a, false, true);
                if (this$0.isBound()) {
                    ((zn0.d) ((xn0.a) this$0.getView())).setLoadState(i.LOADED);
                    ((zn0.d) ((xn0.a) this$0.getView())).b8();
                }
                this$0.f139528g.m(((yk1.a) this$0.f139527f).f139224a.getString(e.board_section_deleted_confirmed));
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getPinalytics().a(f1.BOARD_SECTION_EDIT, this$0.f139522a, false, true);
                if (this$0.isBound()) {
                    ((zn0.d) ((xn0.a) this$0.getView())).setLoadState(i.LOADED);
                    ((zn0.d) ((xn0.a) this$0.getView())).P7();
                }
                this$0.f139528g.m(((yk1.a) this$0.f139527f).f139224a.getString(e.board_section_renamed_confirmed));
                break;
        }
    }
}
