package androidx.media3.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class r extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public List f19102d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19103e;

    public r(PlayerControlView playerControlView) {
        this.f19103e = playerControlView;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        if (this.f19102d.isEmpty()) {
            return 0;
        }
        return this.f19102d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        return new o(LayoutInflater.from(this.f19103e.getContext()).inflate(j0.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }
}
