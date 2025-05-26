package o71;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.ui.imageview.ProportionalImageView;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import x02.i2;

/* loaded from: classes5.dex */
public final class z extends yk1.c implements k71.j {

    /* renamed from: a, reason: collision with root package name */
    public final yk1.v f93414a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f93415b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f93416c;

    /* renamed from: d, reason: collision with root package name */
    public vh f93417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m60.w eventManager, uk1.d presenterPinalytics, yk1.v viewResources, i2 pinRepository, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f93414a = viewResources;
        this.f93415b = eventManager;
        this.f93416c = pinRepository;
    }

    public static h32.g0 q3(vh vhVar) {
        String q13 = vhVar.q();
        return Intrinsics.d(q13, "user_recently_saved_pins") ? h32.g0.USER_RECENTLY_SAVED_PINS_STORY : Intrinsics.d(q13, "user_recently_viewed_pins") ? h32.g0.USER_RECENTLY_VIEWED_PINS_STORY : h32.g0.USER_RECENTLY_VIEWED_PINS_STORY;
    }

    public final void r3() {
        vh vhVar;
        if (isBound() && (vhVar = this.f93417d) != null) {
            nx.d0.B(getPinalytics(), f1.VIEW, q3(vhVar), null, null, 28);
            List list = vhVar.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof f30) {
                    arrayList.add(obj);
                }
            }
            Map c13 = vhVar.c();
            Object obj2 = c13 != null ? c13.get("feed_count") : null;
            Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
            int doubleValue = d2 != null ? (int) d2.doubleValue() : arrayList.size();
            int i13 = 10;
            ArrayList pinImageUrls = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pinImageUrls.add(String.valueOf(bs1.c.B0((f30) it.next())));
            }
            k71.k kVar = (k71.k) getView();
            String q13 = vhVar.q();
            boolean d13 = Intrinsics.d(q13, "user_recently_saved_pins");
            yk1.v vVar = this.f93414a;
            String title = d13 ? ((yk1.a) vVar).f139224a.getString(x0.recently_saved) : Intrinsics.d(q13, "user_recently_viewed_pins") ? ((yk1.a) vVar).f139224a.getString(x0.recently_viewed) : "";
            q71.i0 i0Var = (q71.i0) kVar;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pinImageUrls, "pinImageUrls");
            Intrinsics.checkNotNullParameter(this, "listener");
            pk.a0.p(i0Var.f102721b, title);
            ArrayList arrayList2 = i0Var.f102722c;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((ProportionalImageView) it2.next()).setOnClickListener(null);
            }
            int i14 = 0;
            int i15 = i0Var.f102723d;
            boolean z13 = doubleValue > i15;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                int i16 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                ProportionalImageView proportionalImageView = (ProportionalImageView) next;
                if (i14 < pinImageUrls.size()) {
                    proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    proportionalImageView.U1(eo1.c.lego_corner_radius_medium);
                    proportionalImageView.V1((String) pinImageUrls.get(i14), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                } else {
                    Context context = i0Var.getContext();
                    int i17 = eo1.b.color_themed_transparent;
                    Object obj3 = d5.a.f53679a;
                    proportionalImageView.setImageDrawable(new ColorDrawable(context.getColor(i17)));
                }
                if (i14 == i15 - 1 && z13) {
                    proportionalImageView.setOnClickListener(new x61.e(this, i13));
                } else {
                    proportionalImageView.setOnClickListener(new androidx.media3.ui.k(this, i14, 4));
                }
                i14 = i16;
            }
            k3.R1(i0Var.f102720a, z13);
        }
    }

    @Override // yk1.p
    /* renamed from: s3, reason: merged with bridge method [inline-methods] */
    public final void r3(k71.k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        addDisposable(nl.b.s(this.f93416c.z(), new j41.i(this, 17), null, null, 6));
        r3();
    }
}
