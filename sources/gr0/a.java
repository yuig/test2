package gr0;

import ak2.e;
import com.pinterest.api.model.yc0;
import kotlin.jvm.internal.Intrinsics;
import yk1.i;
import yq0.t;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f65988b;

    public /* synthetic */ a(b bVar, int i13) {
        this.f65987a = i13;
        this.f65988b = bVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f65987a;
        b this$0 = this.f65988b;
        switch (i13) {
            case 0:
                yc0 yc0Var = (yc0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f65993g = yc0Var;
                this$0.v3();
                this$0.x3(yc0Var.h());
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f65992f.p((Throwable) obj);
                ((t) ((com.pinterest.feature.creator.savedboards.b) this$0.getView())).setLoadState(i.ERROR);
                break;
            case 2:
                yc0 yc0Var2 = (yc0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.x3(yc0Var2.h());
                this$0.f65993g = yc0Var2;
                ((t) ((com.pinterest.feature.creator.savedboards.b) this$0.getView())).setLoadState(i.LOADED);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f65992f.p((Throwable) obj);
                ((t) ((com.pinterest.feature.creator.savedboards.b) this$0.getView())).setLoadState(i.ERROR);
                break;
        }
    }
}
