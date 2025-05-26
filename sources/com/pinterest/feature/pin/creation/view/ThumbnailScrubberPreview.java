package com.pinterest.feature.pin.creation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bb2.j;
import com.pinterest.ui.imageview.WebImageView;
import eo1.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ql2.k;
import sw0.q0;
import vf0.a;
import xk2.m;
import xk2.v;
import yk1.d;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pin/creation/view/ThumbnailScrubberPreview;", "Landroid/widget/LinearLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ThumbnailScrubberPreview extends LinearLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f47111a;

    /* renamed from: b, reason: collision with root package name */
    public final v f47112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47113c;

    /* renamed from: d, reason: collision with root package name */
    public int f47114d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f47115e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailScrubberPreview(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(c.legacy_image_corner_radius);
        int i13 = this.f47114d - 1;
        IntRange intRange = new IntRange(0, i13, 1);
        ArrayList arrayList = new ArrayList(g0.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((k) it).f104109c) {
            int b13 = ((u0) it).b();
            WebImageView webImageView = new WebImageView(getContext());
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (b13 == 0) {
                if (bs1.c.l1(webImageView) && webImageView.getLayoutDirection() == 1) {
                    webImageView.g2(0.0f, dimensionPixelOffset, 0.0f, dimensionPixelOffset);
                } else {
                    webImageView.g2(dimensionPixelOffset, 0.0f, dimensionPixelOffset, 0.0f);
                }
            } else if (1 <= b13 && b13 < i13) {
                webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
            } else if (b13 == i13) {
                if (bs1.c.l1(webImageView) && webImageView.getLayoutDirection() == 1) {
                    webImageView.g2(dimensionPixelOffset, 0.0f, dimensionPixelOffset, 0.0f);
                } else {
                    webImageView.g2(0.0f, dimensionPixelOffset, 0.0f, dimensionPixelOffset);
                }
            }
            addView(webImageView, layoutParams);
            arrayList.add(webImageView);
        }
        this.f47111a = arrayList;
    }

    public final void b() {
        this.f47114d = 8;
        removeAllViews();
        a();
    }

    public final void e() {
        this.f47113c = false;
    }

    public final void g(int i13, Bitmap bitmap) {
        ArrayList arrayList = this.f47111a;
        if (arrayList == null) {
            Intrinsics.r("imageViews");
            throw null;
        }
        if (i13 < arrayList.size()) {
            ArrayList arrayList2 = this.f47111a;
            if (arrayList2 == null) {
                Intrinsics.r("imageViews");
                throw null;
            }
            j jVar = (j) arrayList2.get(i13);
            jVar.setImageBitmap(bitmap);
            if (this.f47113c) {
                jVar.K1((ColorDrawable) this.f47112b.getValue());
            }
            this.f47115e.set(i13, bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailScrubberPreview(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47112b = m.b(new q0(context, 14));
        this.f47113c = true;
        this.f47114d = 6;
        ArrayList arrayList = new ArrayList(8);
        for (int i14 = 0; i14 < 8; i14++) {
            arrayList.add(null);
        }
        this.f47115e = arrayList;
        setOrientation(0);
        int i15 = a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i15));
        a();
    }
}
