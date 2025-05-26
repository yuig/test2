package ns0;

import androidx.recyclerview.widget.RecyclerView;
import ar0.o;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import nl1.d;
import ps0.j;
import ur0.g;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: c, reason: collision with root package name */
    public final d f91974c;

    /* renamed from: d, reason: collision with root package name */
    public final j f91975d;

    public a(d fragment, j listener) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f91974c = fragment;
        this.f91975d = listener;
    }

    @Override // ar0.o
    public final void k(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        g.d(y0.ANDROID_HOME_FEED_TAKEOVER_AFTER_SCROLL, this.f91974c, null);
        j jVar = this.f91975d;
        jVar.getClass();
        int i15 = HomeFeedFragment.U1;
        HomeFeedFragment this$0 = jVar.f101273a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.D1;
        Intrinsics.f(aVar);
        this$0.A8(aVar);
        this$0.D1 = null;
    }
}
