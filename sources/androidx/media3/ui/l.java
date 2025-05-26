package androidx.media3.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;

/* loaded from: classes3.dex */
public final class l extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19047d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f19048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19049f;

    public l(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.f19049f = playerControlView;
        this.f19047d = strArr;
        this.f19048e = fArr;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f19047d.length;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        o oVar = (o) y2Var;
        String[] strArr = this.f19047d;
        if (i13 < strArr.length) {
            oVar.f19065u.setText(strArr[i13]);
        }
        View view = oVar.f19066v;
        View view2 = oVar.f19717a;
        int i14 = 0;
        if (i13 == 0) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new k(this, i13, i14));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        return new o(LayoutInflater.from(this.f19049f.getContext()).inflate(j0.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }
}
