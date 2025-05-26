package yq0;

import androidx.recyclerview.widget.g2;
import com.pinterest.ui.grid.PinterestRecyclerView;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f139727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f139728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f139729c;

    public s(t tVar, g2 g2Var) {
        this.f139728b = tVar;
        this.f139729c = g2Var;
    }

    public final void a() {
        if (this.f139727a) {
            return;
        }
        this.f139727a = true;
        PinterestRecyclerView pinterestRecyclerView = this.f139728b.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.k(this.f139729c);
        }
    }
}
