package zt1;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.musicsheet.view.MusicSheetItemView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qa2.s1;

/* loaded from: classes4.dex */
public final class b extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f142769d = new ArrayList();

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f142769d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        a holder = (a) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        au1.a model = (au1.a) this.f142769d.get(i13);
        Intrinsics.checkNotNullParameter(model, "model");
        MusicSheetItemView musicSheetItemView = holder.f142768u;
        musicSheetItemView.f49890b.setText(model.f20501a);
        musicSheetItemView.f49889a.setText(model.f20502b);
        musicSheetItemView.f49891c.loadUrl(model.f20503c);
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MusicSheetItemView musicSheetItemView = new MusicSheetItemView(0, 14, bs1.c.k0(context), null);
        musicSheetItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new a(musicSheetItemView);
    }
}
