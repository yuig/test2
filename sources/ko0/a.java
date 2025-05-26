package ko0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import vb0.j;
import xo0.s;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final io0.a f80292d;

    public a(io0.a carouselDataSource) {
        Intrinsics.checkNotNullParameter(carouselDataSource, "carouselDataSource");
        this.f80292d = carouselDataSource;
        A(true);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return Collections.unmodifiableList(((jo0.a) this.f80292d).f77208a).size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        String str;
        if (i13 < 0 || i13 >= e()) {
            str = "";
        } else {
            str = ((f30) Collections.unmodifiableList(((jo0.a) this.f80292d).f77208a).get(i13)).getUid();
            Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
        }
        return str.hashCode();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        io0.a aVar = this.f80292d;
        j.f125466a.S(i13 >= 0 && i13 < Collections.unmodifiableList(((jo0.a) aVar).f77208a).size(), "Invalid position passed to getItemViewType in BoardSectionPinCarouselAdapter", new Object[0]);
        if (b40.w0((f30) Collections.unmodifiableList(((jo0.a) aVar).f77208a).get(i13))) {
            return 0;
        }
        return RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (g(i13) == 0 || g(i13) == 277) {
            io0.c cVar = (io0.c) viewHolder;
            jo0.a pinClickListener = (jo0.a) this.f80292d;
            pinClickListener.getClass();
            ArrayList arrayList = pinClickListener.f77208a;
            boolean z13 = i13 >= 0 && i13 < arrayList.size();
            f0 f0Var = j.f125466a;
            f0Var.S(z13, "bindPinView in BoardSectionPinCarouselPresenter failed because the position being bound is greater than the number of pins available.", new Object[0]);
            f30 f30Var = (f30) arrayList.get(i13);
            String pinImageUrl = bs1.c.B0(f30Var);
            if (pinImageUrl != null) {
                c cVar2 = (c) cVar;
                Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
                cVar2.f80295u.V1(pinImageUrl, true, null, 0, 0, cVar2.f80297w, null, null);
            } else {
                f0Var.G("Can't get pin image url. Pin uid: %s", f30Var.getUid());
            }
            v resources = pinClickListener.f77213f;
            if (resources != null) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String contentDescription = com.bumptech.glide.c.X(resources, f30Var, true, false);
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                ((c) cVar).f80295u.setContentDescription(contentDescription);
            }
            if (pinClickListener.f77210c) {
                Intrinsics.checkNotNullParameter(pinClickListener, "pinClickListener");
                ((c) cVar).f80296v = pinClickListener;
            }
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView viewGroup, int i13) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (i13 != 0 && i13 != 277) {
            return new s(new View(viewGroup.getContext()), 0);
        }
        View inflate = View.inflate(viewGroup.getContext(), l70.b.board_section_pin_carousel_item, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new c(inflate);
    }
}
