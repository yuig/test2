package qq0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public String f104861a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f104862b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f104863c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f104864d;

    /* renamed from: e, reason: collision with root package name */
    public final int f104865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f104866f;

    /* renamed from: g, reason: collision with root package name */
    public final int f104867g;

    /* renamed from: h, reason: collision with root package name */
    public final int f104868h;

    /* renamed from: i, reason: collision with root package name */
    public final int f104869i;

    /* renamed from: j, reason: collision with root package name */
    public final int f104870j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104862b = true;
        List list = oq0.b.f97215a;
        this.f104864d = new ArrayList(list.size());
        int dimensionPixelSize = getResources().getDimensionPixelSize(yc0.a.message_reaction_context_menu_icon_padding_left_right);
        this.f104865e = dimensionPixelSize;
        this.f104866f = getResources().getDimensionPixelSize(yc0.a.message_reaction_context_menu_icon_padding_top_bottom);
        int dimensionPixelOffset = (dimensionPixelSize * 2) + getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_content_width);
        this.f104867g = dimensionPixelOffset;
        this.f104868h = getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_height);
        this.f104869i = dimensionPixelOffset / list.size();
        this.f104870j = -getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_icon_margin);
        setClipChildren(false);
        setClipToPadding(false);
        float f13 = ((-r1) - r3) * 0.5f;
        int i13 = 0;
        for (Object obj : c.w0(this) ? CollectionsKt.q0(list) : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            oq0.a aVar = (oq0.a) obj;
            this.f104864d.add(new Rect());
            View bVar = new b(context, f13, aVar);
            bVar.setTag(aVar);
            int i15 = this.f104865e;
            int i16 = this.f104866f;
            bVar.setPadding(i15, i16, i15, i16);
            int i17 = this.f104869i;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i17, i17, 16);
            int i18 = (i13 * this.f104869i) + this.f104870j;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i19 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i23 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            layoutParams.setMargins(i18, i19, i23, marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            Unit unit = Unit.f80348a;
            addView(bVar, layoutParams);
            i13 = i14;
        }
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f104867g, this.f104868h);
        layoutParams5.gravity = 1;
        setLayoutParams(layoutParams5);
    }
}
