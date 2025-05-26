package com.pinterest.feature.pin.creation.view;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.d30;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.imageview.WebImageViewContainer;
import eo1.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import n11.a;
import oq.i;
import org.jetbrains.annotations.NotNull;
import sw0.q0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pin/creation/view/PinPreviewView;", "Lcom/pinterest/ui/imageview/WebImageViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinPreviewLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinPreviewView extends WebImageViewContainer {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47103f = 0;

    /* renamed from: c, reason: collision with root package name */
    public a f47104c;

    /* renamed from: d, reason: collision with root package name */
    public Pair f47105d;

    /* renamed from: e, reason: collision with root package name */
    public final v f47106e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final a g() {
        a aVar = this.f47104c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("previewParams");
        throw null;
    }

    public final void j(d30 item) {
        Pair pair;
        Intrinsics.checkNotNullParameter(item, "item");
        Pair h10 = item.h();
        int intValue = ((Number) h10.f80346a).intValue();
        int intValue2 = ((Number) h10.f80347b).intValue();
        w1();
        a previewParams = g();
        Intrinsics.checkNotNullParameter(previewParams, "previewParams");
        int i13 = previewParams.f88921a;
        int i14 = previewParams.f88922b;
        if (i13 != 0 && i14 != 0) {
            pair = new Pair(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        } else if (i13 > 0) {
            Integer valueOf = Integer.valueOf(i13);
            int i15 = (int) ((intValue2 / intValue) * i13);
            int i16 = previewParams.f88924d;
            if (i15 > i16) {
                i15 = i16;
            }
            pair = new Pair(valueOf, Integer.valueOf(i15));
        } else if (i14 > 0) {
            int i17 = (int) ((intValue / intValue2) * i14);
            int i18 = previewParams.f88923c;
            if (i17 > i18) {
                i17 = i18;
            }
            pair = new Pair(Integer.valueOf(i17), Integer.valueOf(i14));
        } else {
            pair = new Pair(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        this.f47105d = pair;
        requestLayout();
        P0(new File(item.e()), ((Number) this.f47105d.f80346a).intValue(), ((Number) this.f47105d.f80347b).intValue());
    }

    public final void k() {
        b2(0.0f);
    }

    public final void m(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f47104c = aVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        H0(((Number) this.f47105d.f80346a).intValue(), ((Number) this.f47105d.f80347b).intValue());
        setMeasuredDimension(((Number) this.f47105d.f80346a).intValue(), ((Number) this.f47105d.f80347b).intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPreviewView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47105d = new Pair(0, 0);
        v b13 = m.b(new q0(context, 13));
        this.f47106e = b13;
        getResources().getDimensionPixelSize(c.corner_radius);
        addView((GestaltSpinner) b13.getValue());
        Y(new i(this, 9));
    }
}
