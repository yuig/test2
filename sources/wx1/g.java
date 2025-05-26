package wx1;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import u50.f0;
import xx1.h;

/* loaded from: classes4.dex */
public final class g extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f131216d;

    /* renamed from: e, reason: collision with root package name */
    public List f131217e;

    public g(Context context, h onSelected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        this.f131216d = onSelected;
        this.f131217e = q0.f80391a;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f131217e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        e holder = (e) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        sx.a boardMetadata = (sx.a) this.f131217e.get(i13);
        f onSelected = new f(1, this, g.class, "handleClick", "handleClick(Lcom/pinterest/analytics/data/remote/model/BoardMetadata;)V", 0);
        Intrinsics.checkNotNullParameter(boardMetadata, "boardMetadata");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        int i14 = com.pinterest.partnerAnalytics.d.pinImage;
        View view = holder.f19717a;
        WebImageView webImageView = (WebImageView) view.findViewById(i14);
        GestaltText gestaltText = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.tvBoardName);
        GestaltText gestaltText2 = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.tvBoardDescription);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) view.findViewById(com.pinterest.partnerAnalytics.d.userImage);
        view.setOnClickListener(new fd1.e(21, onSelected, boardMetadata));
        Intrinsics.f(gestaltText);
        a0.p(gestaltText, boardMetadata.f115603b);
        Intrinsics.f(gestaltText2);
        Resources resources = view.getResources();
        int i15 = com.pinterest.partnerAnalytics.f.pin_stats_board_pin_count;
        int i16 = boardMetadata.f115608g;
        String string = resources.getQuantityString(i15, i16, Integer.valueOf(i16));
        Intrinsics.checkNotNullExpressionValue(string, "getQuantityString(...)");
        Resources resources2 = view.getResources();
        int i17 = com.pinterest.partnerAnalytics.f.pin_stats_board_section_count;
        int i18 = boardMetadata.f115609h;
        String quantityString = resources2.getQuantityString(i17, i18, Integer.valueOf(i18));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (i16 > 0 && i18 > 0) {
            string = a.a.D(string, " • ", quantityString);
        } else if (i16 <= 0) {
            string = quantityString;
        }
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q(gestaltText2, new f0(string));
        webImageView.loadUrl(boardMetadata.f115604c);
        String str = boardMetadata.f115607f;
        if (str != null) {
            gestaltAvatar.H2(new d(str, boardMetadata, 0));
        }
        String str2 = boardMetadata.f115606e;
        if (str2 != null) {
            gestaltAvatar.H2(new d(str2, boardMetadata, 1));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = LayoutInflater.from(bs1.c.k0(context)).inflate(com.pinterest.partnerAnalytics.e.saved_to_board_list_item, (ViewGroup) parent, false);
        Intrinsics.f(view);
        Intrinsics.checkNotNullParameter(view, "view");
        return new e(view);
    }
}
