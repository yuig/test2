package com.pinterest.feature.pin.creation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.pinterest.api.model.to;
import com.pinterest.api.model.vn0;
import com.pinterest.ui.imageview.WebImageView;
import h32.g0;
import hu0.a;
import hu0.e;
import hu0.g;
import ig1.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ml2.c;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pin/creation/view/ThumbnailScrubber;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ThumbnailScrubber extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public g f47107a;

    /* renamed from: b, reason: collision with root package name */
    public int f47108b;

    /* renamed from: c, reason: collision with root package name */
    public final v f47109c;

    /* renamed from: d, reason: collision with root package name */
    public int f47110d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailScrubber(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final WebImageView a() {
        return (WebImageView) this.f47109c.getValue();
    }

    public final void b(int i13) {
        setPaddingRelative(((getWidth() - a().getWidth()) * i13) / 100, 0, 0, 0);
    }

    public final void c() {
        this.f47108b = 1;
    }

    public final void d(int i13) {
        Pair k03;
        int width = getWidth() - a().getWidth();
        int min = Math.min(Math.max(0, i13), width);
        setPaddingRelative(min, 0, 0, 0);
        int c13 = c.c((min / width) * 100);
        g gVar = this.f47107a;
        if (gVar != null) {
            e eVar = (e) ((a) gVar.getView());
            eVar.getClass();
            to toVar = new to(0, 0L, 0);
            ArrayList arrayList = eVar.f62979q0;
            if (arrayList != null && (k03 = b.k0((b.j0(arrayList) * c13) / 100, arrayList)) != null) {
                int intValue = ((Number) k03.f80346a).intValue();
                vn0 vn0Var = eVar.f62978p0;
                toVar = new to(intValue + (vn0Var != null ? vn0Var.getStartMediaIndex() : 0), ((Number) k03.f80347b).longValue(), c13);
            }
            gVar.f70412o = toVar;
            ((e) ((a) gVar.getView())).d8(toVar);
            d0 d0Var = gVar.getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.B(d0Var, null, g0.EDIT_COVER, null, null, 29);
            gVar.D3(c13);
        }
    }

    public final void e(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        a().setImageBitmap(bitmap);
    }

    public final void f(Integer num, int i13, float f13, int i14, Integer num2, int i15) {
        WebImageView a13 = a();
        a13.g2(f13, f13, f13, f13);
        a13.M1(i13);
        a13.o0(num2.intValue());
        a13.setBackgroundResource(num.intValue());
        WebImageView a14 = a();
        Intrinsics.g(a14, "null cannot be cast to non-null type android.view.View");
        updateViewLayout(a14, new FrameLayout.LayoutParams(i15, i14, 8388627));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            super.onTouchEvent(motionEvent);
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f47110d = (int) motionEvent.getRawX();
            int action = motionEvent.getAction() & 255;
            if (action == 1) {
                performClick();
            } else if (action == 2) {
                performClick();
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        if (bs1.c.l1(this)) {
            d((getWidth() - this.f47110d) - (a().getWidth() / this.f47108b));
            return true;
        }
        d(this.f47110d - (a().getWidth() / this.f47108b));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailScrubber(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47108b = 2;
        this.f47109c = m.b(new b01.c(7, this, context));
    }
}
