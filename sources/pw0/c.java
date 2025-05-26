package pw0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.pu;
import com.pinterest.feature.mediagallery.view.IdeaPinMediaThumbnailCell;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q5.v0;

/* loaded from: classes5.dex */
public final class c extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public List f101498d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f101499e;

    public final void C(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f101498d = items;
        h();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f101498d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        e holder = (e) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        f0 data = (f0) this.f101498d.get(i13);
        Intrinsics.checkNotNullParameter(data, "data");
        IdeaPinMediaThumbnailCell ideaPinMediaThumbnailCell = holder.f101513u;
        ideaPinMediaThumbnailCell.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        pu puVar = data.f101516b;
        WebImageView webImageView = ideaPinMediaThumbnailCell.f46726a;
        c0.d.h2(webImageView, puVar, ideaPinMediaThumbnailCell.f46727b);
        ideaPinMediaThumbnailCell.setOnClickListener(new com.pinterest.feature.home.view.c(data, 10));
        v0.o(ideaPinMediaThumbnailCell, new androidx.core.widget.g(4));
        String e13 = data.f101516b.e();
        webImageView.setTag(e13);
        ideaPinMediaThumbnailCell.setContentDescription(ideaPinMediaThumbnailCell.getContext().getString(ct1.e.idea_pin_content_description_media_delete_or_reorder, e13));
        if (fa2.c.j(e13)) {
            webImageView.setScaleX(-1.0f);
        } else {
            webImageView.setScaleX(1.0f);
        }
        Integer num = this.f101499e;
        if (num != null && i13 == num.intValue()) {
            this.f101499e = null;
            ideaPinMediaThumbnailCell.setContentDescription(ideaPinMediaThumbnailCell.getContext().getString(ct1.e.idea_pin_content_description_media_moved_to_position, webImageView.getTag(), String.valueOf(i13)));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new e(new IdeaPinMediaThumbnailCell(bs1.c.k0(context)));
    }
}
