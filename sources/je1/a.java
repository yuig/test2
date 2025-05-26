package je1;

import af2.c;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.r0;
import nx.v;
import sl1.j;
import so.jb;
import xd1.e;
import ye2.o;

/* loaded from: classes5.dex */
public final class a extends ViewGroup implements he1.a, v, c {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f75842m = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f75843a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75844b;

    /* renamed from: c, reason: collision with root package name */
    public final e f75845c;

    /* renamed from: d, reason: collision with root package name */
    public final e f75846d;

    /* renamed from: e, reason: collision with root package name */
    public final e f75847e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f75848f;

    /* renamed from: g, reason: collision with root package name */
    public final j f75849g;

    /* renamed from: h, reason: collision with root package name */
    public final int f75850h;

    /* renamed from: i, reason: collision with root package name */
    public final int f75851i;

    /* renamed from: j, reason: collision with root package name */
    public ie1.a f75852j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f75853k;

    /* renamed from: l, reason: collision with root package name */
    public final l f75854l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f75844b) {
            this.f75844b = true;
            this.f75854l = (l) ((jb) ((b) generatedComponent())).f113485c.f114476s.get();
        }
        setVisibility(8);
        this.f75850h = getResources().getDimensionPixelOffset(r0.margin_extra_small);
        this.f75851i = getResources().getDimensionPixelSize(r0.margin_half);
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f75848f = new ColorDrawable(context.getColor(i13));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        this.f75845c = a(new xd1.b(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 12), marginLayoutParams);
        this.f75847e = a(new xd1.b(0.0f, 0.0f, dimensionPixelSize, 0.0f, 11), marginLayoutParams);
        this.f75846d = a(new xd1.b(0.0f, 0.0f, 0.0f, dimensionPixelSize, 7), marginLayoutParams);
        String titleText = getResources().getString(f62.e.shop_board_package_action_button);
        Intrinsics.checkNotNullExpressionValue(titleText, "getString(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        j jVar = new j(context, null);
        jVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Drawable drawable = context.getDrawable(ga2.c.lego_large_button);
        if (drawable != null) {
            jVar.setBackground(drawable);
        }
        jVar.setGravity(17);
        jVar.setMaxLines(2);
        jVar.setEllipsize(TextUtils.TruncateAt.END);
        int dimensionPixelSize2 = jVar.getResources().getDimensionPixelSize(r0.margin_three_quarter);
        jVar.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        dl2.b.A2(jVar);
        j1.q1(jVar, eo1.c.font_size_300);
        jVar.setTextColor(context.getColor(eo1.b.color_themed_text_default));
        jVar.setText(titleText);
        addView(jVar, new ViewGroup.MarginLayoutParams(-1, -2));
        this.f75849g = jVar;
    }

    public final e a(xd1.b bVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e eVar = new e(context, bVar);
        addView(eVar, marginLayoutParams);
        return eVar;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f75843a == null) {
            this.f75843a = new o(this);
        }
        return this.f75843a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f75843a == null) {
            this.f75843a = new o(this);
        }
        return this.f75843a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        vh vhVar;
        String id3;
        ie1.a aVar = this.f75852j;
        if (aVar == null || (vhVar = aVar.f72202b) == null || (id3 = vhVar.getId()) == null) {
            return null;
        }
        int i13 = aVar.f72204d;
        vh vhVar2 = aVar.f72202b;
        return ll.j.x(aVar.f72203c, id3, i13, 0, vhVar2 != null ? vhVar2.u() : null, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        ie1.a aVar = this.f75852j;
        if (aVar != null) {
            return aVar.f72203c.y(aVar.f72209i);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        e eVar = this.f75845c;
        bs1.c.p1(eVar, paddingStart, paddingTop);
        int G0 = bs1.c.G0(eVar);
        int i17 = this.f75850h;
        int i18 = G0 + i17 + paddingTop;
        e eVar2 = this.f75847e;
        bs1.c.p1(eVar2, paddingStart, i18);
        int I0 = bs1.c.I0(eVar2) + i17 + paddingStart;
        e eVar3 = this.f75846d;
        bs1.c.p1(eVar3, I0, i18);
        bs1.c.p1(this.f75849g, getPaddingStart(), bs1.c.G0(eVar3) + this.f75851i + i18);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        if (!this.f75853k) {
            super.onMeasure(i13, i14);
            return;
        }
        int size = View.MeasureSpec.getSize(i13);
        int i15 = this.f75850h;
        int i16 = (size - i15) / 2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (i16 * 1.5d), 1073741824);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        e eVar = this.f75845c;
        measureChildWithMargins(eVar, makeMeasureSpec3, 0, makeMeasureSpec3, 0);
        int G0 = i15 + bs1.c.G0(eVar);
        e eVar2 = this.f75847e;
        measureChildWithMargins(eVar2, makeMeasureSpec, 0, makeMeasureSpec2, 0);
        int G02 = G0 + bs1.c.G0(eVar2);
        e eVar3 = this.f75846d;
        measureChildWithMargins(eVar3, makeMeasureSpec, 0, makeMeasureSpec2, 0);
        bs1.c.G0(eVar3);
        int i17 = G02 + this.f75851i;
        j jVar = this.f75849g;
        measureChildWithMargins(jVar, makeMeasureSpec3, 0, i14, 0);
        setMeasuredDimension(size, bs1.c.G0(jVar) + i17);
    }
}
