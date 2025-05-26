package ko0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.f30;
import com.pinterest.feature.boardsection.pincarousel.view.BoardSectionPinCarousel;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import java.util.ArrayList;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import m60.u;

/* loaded from: classes5.dex */
public final class c extends y2 implements io0.c, View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final WebImageView f80295u;

    /* renamed from: v, reason: collision with root package name */
    public jo0.a f80296v;

    /* renamed from: w, reason: collision with root package name */
    public final Drawable f80297w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(l70.a.board_section_carousel_pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f80295u = (WebImageView) findViewById;
        Context context = itemView.getContext();
        int i13 = vf0.a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        this.f80297w = context.getDrawable(i13);
        itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v13) {
        int m13;
        n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        jo0.a aVar = this.f80296v;
        if (aVar == null || (m13 = m()) < 0) {
            return;
        }
        ArrayList arrayList = aVar.f77208a;
        if (m13 >= arrayList.size() || !aVar.f77210c) {
            return;
        }
        String pinUid = ((f30) arrayList.get(m13)).getUid();
        if (j1.d1(pinUid)) {
            ((BoardSectionPinCarousel) ((io0.b) aVar.getView())).getClass();
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            u.f85943a.d(Navigation.z0((ScreenLocation) w.f51468a.getValue(), pinUid));
        }
    }
}
