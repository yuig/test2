package com.pinterest.design.components.images;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bb2.j;
import bs1.c;
import com.pinterest.ui.imageview.WebImageView;
import eo1.a;
import eo1.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe0.d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/design/components/images/ImageStack;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xe0/d", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImageStack extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f44923j = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f44924a;

    /* renamed from: b, reason: collision with root package name */
    public int f44925b;

    /* renamed from: c, reason: collision with root package name */
    public float f44926c;

    /* renamed from: d, reason: collision with root package name */
    public int f44927d;

    /* renamed from: e, reason: collision with root package name */
    public int f44928e;

    /* renamed from: f, reason: collision with root package name */
    public int f44929f;

    /* renamed from: g, reason: collision with root package name */
    public int f44930g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f44931h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f44932i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStack(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44924a = c.W(this, eo1.c.image_stack_default_item_width);
        this.f44925b = c.W(this, eo1.c.image_stack_default_item_height);
        this.f44926c = c.W(this, eo1.c.image_stack_default_corner_radius);
        this.f44927d = c.W(this, eo1.c.lego_border_width_large);
        this.f44928e = c.B(this, b.color_white_0);
        this.f44929f = ml2.c.c(this.f44924a * 0.5f);
        this.f44930g = 5;
        this.f44931h = new ArrayList();
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        this.f44932i = imageView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public static void b(ImageStack imageStack, int i13, int i14, int i15, float f13, int i16, int i17, int i18, int i19) {
        if ((i19 & 1) != 0) {
            i13 = imageStack.f44924a;
        }
        if ((i19 & 2) != 0) {
            i14 = imageStack.f44925b;
        }
        if ((i19 & 4) != 0) {
            i15 = imageStack.f44929f;
        }
        if ((i19 & 8) != 0) {
            f13 = imageStack.f44926c;
        }
        if ((i19 & 16) != 0) {
            i16 = imageStack.f44927d;
        }
        if ((i19 & 32) != 0) {
            i17 = imageStack.f44928e;
        }
        if ((i19 & 64) != 0) {
            i18 = imageStack.f44930g;
        }
        imageStack.f44924a = i13;
        imageStack.f44925b = i14;
        imageStack.f44929f = i15;
        imageStack.f44926c = f13;
        imageStack.f44927d = i16;
        imageStack.f44928e = i17;
        imageStack.f44930g = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ArrayList items) {
        int size;
        Intrinsics.checkNotNullParameter(items, "items");
        int min = Math.min(items.size(), this.f44930g);
        ArrayList arrayList = this.f44931h;
        if (arrayList.size() < min && (size = arrayList.size()) <= min) {
            for (size = arrayList.size(); size < min; size++) {
                WebImageView webImageView = new WebImageView(getContext());
                webImageView.setLayoutParams(new FrameLayout.LayoutParams(this.f44924a, this.f44925b));
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                float f13 = this.f44926c;
                webImageView.g2(f13, f13, f13, f13);
                webImageView.M1(this.f44927d);
                webImageView.setBackgroundColor(dl2.b.y0(webImageView, a.sema_color_background_wash_light));
                webImageView.a2(true);
                webImageView.o0(this.f44928e);
                ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(this.f44929f * size);
                webImageView.setLayoutParams(marginLayoutParams);
                addView(webImageView, size);
                arrayList.add(new Pair(webImageView, new xe0.c(null, null, false, 15)));
            }
        }
        for (int i13 = 0; i13 < min; i13++) {
            d dVar = (d) items.get(i13);
            j jVar = (j) ((Pair) arrayList.get(i13)).f80346a;
            removeView(this.f44932i);
            if (dVar instanceof xe0.c) {
                xe0.c cVar = (xe0.c) dVar;
                jVar.V1(cVar.f134663b, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                if (cVar.f134664c != null) {
                    setOnClickListener(new tq.j(dVar, 21));
                }
            } else if (dVar instanceof xe0.b) {
                xe0.b bVar = (xe0.b) dVar;
                jVar.V1(bVar.f134652a, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                View view = (View) jVar;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = bVar.f134653b;
                layoutParams2.height = bVar.f134654c;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams2.setMarginStart(bVar.f134656e);
                marginLayoutParams2.setMarginStart(marginLayoutParams2.getMarginStart());
                marginLayoutParams2.topMargin = bVar.f134658g;
                marginLayoutParams2.setMarginEnd(bVar.f134660i);
                marginLayoutParams2.bottomMargin = bVar.f134659h;
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams4).gravity = bVar.f134657f;
                view.setLayoutParams(layoutParams2);
                view.setRotation(bVar.f134655d);
                if (bVar.f134661j != null) {
                    view.setOnClickListener(new tq.j(bVar, 22));
                }
            }
            c.U1(this);
            arrayList.set(i13, new Pair(jVar, dVar));
            Pair pair = (Pair) arrayList.get(i13);
            Object obj = pair.f80347b;
            xe0.c cVar2 = obj instanceof xe0.c ? (xe0.c) obj : null;
            if (cVar2 != null && cVar2.f134665d) {
                j jVar2 = (j) pair.f80346a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                jVar2.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(context, a.color_background_dark_opacity_100), PorterDuff.Mode.SRC_ATOP));
            }
        }
        int size2 = arrayList.size();
        while (min < size2) {
            Object obj2 = (j) ((Pair) arrayList.get(min)).f80346a;
            Intrinsics.g(obj2, "null cannot be cast to non-null type android.view.View");
            c.X0((View) obj2);
            min++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStack(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44924a = c.W(this, eo1.c.image_stack_default_item_width);
        this.f44925b = c.W(this, eo1.c.image_stack_default_item_height);
        this.f44926c = c.W(this, eo1.c.image_stack_default_corner_radius);
        this.f44927d = c.W(this, eo1.c.lego_border_width_large);
        this.f44928e = c.B(this, b.color_white_0);
        this.f44929f = ml2.c.c(this.f44924a * 0.5f);
        this.f44930g = 5;
        this.f44931h = new ArrayList();
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        this.f44932i = imageView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStack(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44924a = c.W(this, eo1.c.image_stack_default_item_width);
        this.f44925b = c.W(this, eo1.c.image_stack_default_item_height);
        this.f44926c = c.W(this, eo1.c.image_stack_default_corner_radius);
        this.f44927d = c.W(this, eo1.c.lego_border_width_large);
        this.f44928e = c.B(this, b.color_white_0);
        this.f44929f = ml2.c.c(this.f44924a * 0.5f);
        this.f44930g = 5;
        this.f44931h = new ArrayList();
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        this.f44932i = imageView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }
}
