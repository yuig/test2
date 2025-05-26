package s52;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.share.board.video.pinselection.ui.PinThumbnailCell;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public List f111166d;

    public final void C(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111166d = items;
        h();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f111166d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        d holder = (d) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        b data = (b) this.f111166d.get(i13);
        Intrinsics.checkNotNullParameter(data, "data");
        PinThumbnailCell pinThumbnailCell = holder.f111167u;
        pinThumbnailCell.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        WebImageView webImageView = pinThumbnailCell.f51840a;
        webImageView.setScaleType(scaleType);
        webImageView.loadUrl(data.f111164a);
        pinThumbnailCell.setOnClickListener(new wq1.a(data, 20));
        webImageView.setTag(data.f111164a);
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new d(new PinThumbnailCell(6, bs1.c.k0(context), (AttributeSet) null));
    }
}
