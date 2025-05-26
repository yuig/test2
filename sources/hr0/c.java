package hr0;

import a7.e;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.m7;
import yk1.m;
import yq0.k;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhr0/c;", "Lyq0/b0;", "Lgr0/b;", "Lcom/pinterest/feature/creator/savedboards/b;", "<init>", "()V", "savedBoards_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends a<gr0.b> implements com.pinterest.feature.creator.savedboards.b {
    public static final /* synthetic */ int C0 = 0;
    public String A0;
    public final d4 B0 = d4.PIN_ANALYTICS_SAVED_BOARDS;

    /* renamed from: z0, reason: collision with root package name */
    public m7 f69981z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(43, new k(this, 18));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        this.A0 = f49940b;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(sd0.a.saved_to_boards);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final m V7() {
        m7 m7Var = this.f69981z0;
        if (m7Var == null) {
            Intrinsics.r("savedBoardsPresenterFactory");
            throw null;
        }
        String str = this.A0;
        if (str != null) {
            return m7Var.a(str);
        }
        Intrinsics.r("aggregatedPinUid");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.B0;
    }

    @Override // yq0.t
    public final e m8() {
        e eVar = new e(rf0.b.did_it_like_recycler_swipe, rf0.a.p_recycler_view);
        eVar.c(rf0.a.swipe_container);
        return eVar;
    }

    @Override // yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 14);
        getContext();
        return new v0(new PinterestGridLayoutManager(bVar, 2));
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) c7().b(), g83);
        }
    }
}
