package com.pinterest.feature.pear.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.u;
import au0.a;
import c01.e;
import com.pinterest.api.model.p20;
import eo1.c;
import h01.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ky0.b;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pear/ui/PearStyleHeaderScreenshotView;", "Lc01/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PearStyleHeaderScreenshotView extends e {

    /* renamed from: m, reason: collision with root package name */
    public final v f46870m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f46871n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PearStyleHeaderScreenshotView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // c01.e
    public final void T(List styles, b onTapAction) {
        v vVar;
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        ArrayList arrayList = this.f46871n;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vVar = this.f46870m;
            if (!hasNext) {
                break;
            }
            View view = (View) it.next();
            Object value = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((Flow) value).o(view);
            removeView(view);
        }
        arrayList.clear();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u uVar = new u(context);
        Iterator it2 = styles.iterator();
        while (it2.hasNext()) {
            p20 p20Var = (p20) it2.next();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String q13 = p20Var.q();
            if (q13 == null) {
                q13 = "";
            }
            String str = q13;
            int i13 = uVar.f19640b + 1;
            uVar.f19640b = i13;
            int[] iArr = uVar.f19639a;
            h hVar = new h(context2, str, false, 0, iArr[i13 % iArr.length], c.space_400, new c01.c(onTapAction, p20Var, 0), 12);
            addView(hVar);
            Object value2 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((Flow) value2).e(hVar);
            arrayList.add(hVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearStyleHeaderScreenshotView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, iy1.e.view_pear_style_header_screenshot);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46870m = m.b(new a(this, 24));
        this.f46871n = new ArrayList();
    }
}
