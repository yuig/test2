package x61;

import android.content.Context;
import android.content.res.Resources;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.media3.ui.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends LinearLayout implements u61.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f133945l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f133946a;

    /* renamed from: b, reason: collision with root package name */
    public final g f133947b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133948c;

    /* renamed from: d, reason: collision with root package name */
    public w61.a f133949d;

    /* renamed from: e, reason: collision with root package name */
    public c f133950e;

    /* renamed from: f, reason: collision with root package name */
    public c f133951f;

    /* renamed from: g, reason: collision with root package name */
    public final HorizontalScrollView f133952g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f133953h;

    /* renamed from: i, reason: collision with root package name */
    public List f133954i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f133955j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f133956k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(android.content.Context r11, int r12, x61.g r13, lh0.i3 r14, int r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x61.j.<init>(android.content.Context, int, x61.g, lh0.i3, int):void");
    }

    public final void a(u61.a hairPatternFilterViewModel) {
        int U;
        c cVar;
        Intrinsics.checkNotNullParameter(hairPatternFilterViewModel, "hairPatternFilterViewModel");
        if (getContext() == null) {
            return;
        }
        int i13 = this.f133947b == g.CLOSEUP_STYLE ? eo1.c.space_100 : eo1.c.space_400;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int U2 = bs1.c.U(i13, resources);
        if (hairPatternFilterViewModel.f120820i == 0) {
            U = 0;
        } else {
            Resources resources2 = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            U = bs1.c.U(eo1.c.space_100, resources2);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        v61.a aVar = hairPatternFilterViewModel.f120819h;
        c cVar2 = new c(context, aVar, this.f133948c, U);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        String str = aVar.f124214g;
        if (str == null) {
            str = context2.getString(aVar.f124208a);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        String str2 = str;
        int i14 = hairPatternFilterViewModel.f120820i;
        if (i14 == 0) {
            cVar2.setPaddingRelative(U2, cVar2.getPaddingTop(), cVar2.getPaddingEnd(), cVar2.getPaddingBottom());
        }
        if (i14 == hairPatternFilterViewModel.f120822k - 1) {
            cVar2.setPaddingRelative(cVar2.getPaddingStart(), cVar2.getPaddingTop(), U2, cVar2.getPaddingBottom());
        }
        cVar2.setOnClickListener(new q(this, cVar2, str2, hairPatternFilterViewModel, 9));
        if (hairPatternFilterViewModel.f120821j) {
            this.f133950e = cVar2;
        }
        cVar2.setContentDescription(cVar2.getResources().getString(m42.e.content_description_search_hair_pattern_unselected, str2));
        this.f133953h.addView(cVar2);
        if (!Intrinsics.d(this.f133950e, cVar2) || (cVar = this.f133950e) == null) {
            return;
        }
        cVar.a();
    }

    public final int b() {
        return this.f133952g.getScrollX();
    }

    public final void e(List hairPatternFilters, v61.a selectedHairPattern) {
        Intrinsics.checkNotNullParameter(hairPatternFilters, "hairPatternFilters");
        Intrinsics.checkNotNullParameter(selectedHairPattern, "selectedHairPattern");
        if (hairPatternFilters.indexOf(selectedHairPattern) > 3) {
            HorizontalScrollView horizontalScrollView = this.f133952g;
            if (!horizontalScrollView.isLaidOut() || horizontalScrollView.isLayoutRequested()) {
                horizontalScrollView.addOnLayoutChangeListener(new qn0.b());
            } else {
                horizontalScrollView.scrollTo(10000, 0);
            }
        }
    }

    public final void g(w61.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f133949d = listener;
    }

    public final void i() {
        this.f133950e = this.f133951f;
    }

    public final void j() {
        ArrayList arrayList;
        this.f133953h.removeAllViews();
        List list = this.f133954i;
        Integer num = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((u61.a) obj).f120821j) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            num = Integer.valueOf(((u61.a) arrayList.get(0)).f120820i);
        }
        this.f133955j = num;
        List list2 = this.f133954i;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                a((u61.a) it.next());
            }
        }
    }
}
