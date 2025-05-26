package mz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.y2;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.framework.screens.y;
import com.pinterest.gestalt.text.GestaltText;
import cz.i;
import dl1.s;
import h32.d4;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes3.dex */
public final class e extends FrameLayout implements ez.b, cz.c, y {

    /* renamed from: a, reason: collision with root package name */
    public final dz.a f88527a;

    /* renamed from: b, reason: collision with root package name */
    public final cz.e f88528b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88529c;

    /* renamed from: d, reason: collision with root package name */
    public jz.a f88530d;

    /* renamed from: e, reason: collision with root package name */
    public kz.a f88531e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f88532f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayoutCompat f88533g;

    /* renamed from: h, reason: collision with root package name */
    public g f88534h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, dz.a anketViewPagerAdapter, cz.e anketManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anketViewPagerAdapter, "anketViewPagerAdapter");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        this.f88527a = anketViewPagerAdapter;
        this.f88528b = anketManager;
        this.f88529c = f0.j(Integer.valueOf(nz.b.ic_inline_survey_like_nonpds), Integer.valueOf(nz.b.ic_inline_survey_dislike_nonpds));
        View.inflate(context, nz.d.view_anket_inline_survey, this);
        View findViewById = findViewById(nz.c.tv_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f88532f = (GestaltText) findViewById;
        View findViewById2 = findViewById(nz.c.inline_survey_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f88533g = (LinearLayoutCompat) findViewById2;
        View findViewById3 = findViewById(nz.c.view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ((ViewPager) findViewById3).z(anketViewPagerAdapter);
    }

    @Override // ez.b
    public final void B1(kz.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f88531e = listener;
    }

    public final void a(jz.a survey) {
        jz.d dVar;
        Intrinsics.checkNotNullParameter(survey, "survey");
        this.f88530d = survey;
        c cVar = new c(survey, 0);
        GestaltText gestaltText = this.f88532f;
        gestaltText.i(cVar);
        dz.a aVar = this.f88527a;
        aVar.f56648n = false;
        LinearLayoutCompat linearLayoutCompat = this.f88533g;
        linearLayoutCompat.setPaddingRelative(linearLayoutCompat.getPaddingStart(), 0, linearLayoutCompat.getPaddingEnd(), linearLayoutCompat.getPaddingBottom());
        jz.a aVar2 = this.f88530d;
        if (aVar2 == null || (dVar = aVar2.f77734c) == null) {
            return;
        }
        List b13 = e0.b(dVar);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        aVar.H(context, b13, true);
        String type = cz.f.LIKE.getType();
        String str = dVar.f77740b;
        if (!Intrinsics.d(str, type)) {
            if (Intrinsics.d(str, cz.f.VERTICAL_SCALE.getType())) {
                LinearLayoutCompat linearLayoutCompat2 = this.f88533g;
                ViewGroup.LayoutParams layoutParams = linearLayoutCompat2.getLayoutParams();
                layoutParams.height = bs1.c.W(this, nz.a.anket_inline_survey_card_height_large);
                linearLayoutCompat2.setLayoutParams(layoutParams);
                if (Intrinsics.d(dVar.f77743e, a.BLUE.getType())) {
                    linearLayoutCompat2.setBackground(getContext().getDrawable(nz.b.lego_answers_blue_bg));
                } else {
                    linearLayoutCompat2.setBackground(getContext().getDrawable(nz.b.lego_answers_gray_bg));
                }
                int W = bs1.c.W(this, eo1.c.space_800);
                LinearLayoutCompat linearLayoutCompat3 = this.f88533g;
                linearLayoutCompat3.setPaddingRelative(linearLayoutCompat3.getPaddingStart(), W, linearLayoutCompat3.getPaddingEnd(), linearLayoutCompat3.getPaddingBottom());
                return;
            }
            return;
        }
        String str2 = dVar.f77739a;
        if (str2 == null) {
            return;
        }
        jz.a aVar3 = this.f88530d;
        if (Intrinsics.d(aVar3 != null ? aVar3.f77732a : null, i.SEARCH_STYLES_SURVEY.getId())) {
            gestaltText.i(d.f88526i);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean T1 = dl2.b.T1(context2);
        cz.e eVar = this.f88528b;
        if (T1) {
            eVar.f53464l.put(str2, om1.e.LG);
        } else {
            eVar.f53463k.put(str2, this.f88529c);
        }
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF70541u0() {
        return d4.IN_APP_SURVEY;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        s B2;
        g gVar;
        super.onMeasure(i13, i14);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        PinterestStaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams ? (PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        View f13 = layoutParams2 != null ? layoutParams2.f() : null;
        y2 M1 = (f13 == null || (gVar = this.f88534h) == null) ? null : gVar.M1(f13);
        int j13 = M1 != null ? M1.j() : -1;
        g gVar2 = this.f88534h;
        if (gVar2 == null || (B2 = gVar2.B2(j13)) == null) {
            return;
        }
        cz.e eVar = this.f88528b;
        if (eVar.f53467o == null) {
            eVar.f53468p = String.valueOf(M1 != null ? Integer.valueOf(M1.f19722f) : null);
            eVar.f53467o = B2.getId();
        }
    }

    @Override // cz.c
    public final void p1() {
        kz.a aVar = this.f88531e;
        if (aVar != null) {
            aVar.q3();
        }
    }

    @Override // ez.b
    public final void q6() {
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }

    @Override // com.pinterest.framework.screens.y
    public final List u6() {
        return q0.f80391a;
    }
}
