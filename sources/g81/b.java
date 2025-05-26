package g81;

import android.animation.AnimatorSet;
import android.view.View;
import com.pinterest.api.model.q11;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import f81.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import s71.o;
import uj2.q;
import uk1.d;
import yk1.p;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends p implements f81.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f64490a;

    /* renamed from: b, reason: collision with root package name */
    public final a f64491b;

    /* renamed from: c, reason: collision with root package name */
    public final float f64492c;

    /* renamed from: d, reason: collision with root package name */
    public final float f64493d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64494e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64495f;

    /* renamed from: g, reason: collision with root package name */
    public final String f64496g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f64497h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f64498i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f64499j;

    /* renamed from: k, reason: collision with root package name */
    public final List f64500k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List dotsList, a dotSelectedListener, d pinalytics, q networkStateStream, float f13, float f14, float f15, String str, String str2, String str3, boolean z13, boolean z14, List list, int i13) {
        super(pinalytics, networkStateStream);
        float f16 = (i13 & 64) != 0 ? f14 : f15;
        String str4 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str;
        String str5 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str2;
        String str6 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str3;
        boolean z15 = (i13 & 4096) != 0 ? false : z14;
        List list2 = (i13 & 8192) == 0 ? list : null;
        Intrinsics.checkNotNullParameter(dotsList, "dotsList");
        Intrinsics.checkNotNullParameter(dotSelectedListener, "dotSelectedListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f64490a = dotsList;
        this.f64491b = dotSelectedListener;
        this.f64492c = f13;
        this.f64493d = f16;
        this.f64494e = str4;
        this.f64495f = str5;
        this.f64496g = str6;
        this.f64497h = z13;
        this.f64498i = false;
        this.f64499j = z15;
        this.f64500k = list2;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        c view = (c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((h81.c) ((c) getView())).f68139i = null;
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(c view) {
        b bVar = this;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        final h81.c cVar = (h81.c) view;
        cVar.f68139i = bVar;
        Iterator it = bVar.f64490a.iterator();
        final int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            q11 q11Var = (q11) next;
            Double t13 = q11Var.t();
            Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
            final double doubleValue = t13.doubleValue();
            Double u13 = q11Var.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
            final double doubleValue2 = u13.doubleValue();
            Double s13 = q11Var.s();
            Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
            final double doubleValue3 = s13.doubleValue();
            Double o13 = q11Var.o();
            Intrinsics.checkNotNullExpressionValue(o13, "getH(...)");
            final double doubleValue4 = o13.doubleValue();
            Boolean p13 = q11Var.p();
            Intrinsics.checkNotNullExpressionValue(p13, "getIsStela(...)");
            boolean booleanValue = p13.booleanValue();
            String r13 = q11Var.r();
            boolean z13 = bVar.f64497h;
            cVar.f68141k = z13;
            h81.d dVar = new h81.d(cVar.getContext(), doubleValue, doubleValue2, doubleValue3, doubleValue4, cVar.f68131a, cVar.f68132b, ((Number) cVar.f68138h.getValue()).intValue(), booleanValue, false, r13, BitmapUtils.BITMAP_TO_JPEG_SIZE);
            if (i13 == 0 && z13) {
                dVar.setVisibility(8);
                cVar.f68135e = dVar;
            }
            dVar.setScaleX(0.0f);
            dVar.setScaleY(0.0f);
            cVar.f68140j.add(i13, dVar);
            dVar.setOnClickListener(new View.OnClickListener() { // from class: h81.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c this$0 = c.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.a(doubleValue, doubleValue2, doubleValue3, doubleValue4, i13, true);
                }
            });
            cVar.addView(dVar);
            cVar.f68136f.add(kg.a.F(1.0f, 50L, dVar));
            Boolean p14 = q11Var.p();
            Intrinsics.checkNotNullExpressionValue(p14, "getIsStela(...)");
            boolean booleanValue2 = p14.booleanValue();
            bVar = this;
            o.g(getPinalytics(), bVar.f64494e, bVar.f64495f, bVar.f64496g, bVar.f64498i, booleanValue2, doubleValue, doubleValue2, doubleValue3, doubleValue4);
            it = it;
            i13 = i14;
        }
        ArrayList arrayList = cVar.f68136f;
        AnimatorSet animatorSet = cVar.f68137g;
        animatorSet.playSequentially(arrayList);
        animatorSet.start();
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }
}
