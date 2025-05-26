package y81;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r70;
import com.pinterest.api.model.s01;
import com.pinterest.api.model.uw;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class k extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final b f138054a;

    public k(b makeupSwatchClickedListener) {
        Intrinsics.checkNotNullParameter(makeupSwatchClickedListener, "makeupSwatchClickedListener");
        this.f138054a = makeupSwatchClickedListener;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        String p13;
        String string;
        List d2;
        c view = (c) nVar;
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        s01 O6 = model.O6();
        if (O6 == null) {
            return;
        }
        f42.c cVar = O6.e() != null ? f42.c.LIPCOLOR : O6.d() != null ? f42.c.EYESHADOW : null;
        if (cVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = j.f138053a[cVar.ordinal()];
        if (i14 == 1) {
            uw e13 = O6.e();
            if (e13 != null && (p13 = e13.p()) != null) {
                arrayList.add(p13);
            }
        } else if (i14 == 2 && (d2 = O6.d()) != null) {
            int min = Math.min(d2.size(), 3);
            for (int i15 = 0; i15 < min; i15++) {
                String p14 = ((uw) d2.get(i15)).p();
                if (p14 != null) {
                    arrayList.add(p14);
                }
            }
        }
        l lVar = (l) view;
        lVar.f138055a = Integer.valueOf(i13);
        lVar.a(arrayList);
        r70 f13 = O6.f();
        String l13 = f13 != null ? f13.l() : null;
        if (l13 == null || (string = lVar.getResources().getString(uc2.h.content_description_try_on_shade_with_shade_name, l13)) == null) {
            string = lVar.getResources().getString(uc2.h.content_description_try_on_shade_no_name);
        }
        lVar.setContentDescription(string);
        if (cVar == f42.c.LIPCOLOR) {
            uw e14 = O6.e();
            Integer y13 = e14 != null ? e14.y() : null;
            if (y13 != null && y13.intValue() > 0) {
                ImageView imageView = lVar.f138062h;
                ViewParent parent = imageView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(imageView);
                }
                lVar.addView(imageView);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(10);
                layoutParams2.addRule(21);
                int i16 = lVar.f138059e;
                layoutParams2.topMargin = i16;
                layoutParams2.setMarginEnd(i16);
                ImageView imageView2 = lVar.f138063i;
                ViewParent parent2 = imageView2.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(imageView2);
                }
                lVar.addView(imageView2);
                imageView2.setScaleX(0.44f);
                imageView2.setScaleY(0.44f);
                ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.addRule(10);
                layoutParams4.addRule(21);
                layoutParams4.topMargin = lVar.f138060f;
                layoutParams4.setMarginEnd(i16 / 2);
            }
        }
        b clickListener = this.f138054a;
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        lVar.f138056b = clickListener;
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
