package p4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import m60.f0;
import s3.k0;
import z2.z;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f98816a = new f0();

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(z2.j jVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        z g13 = androidx.compose.ui.focus.a.g(((androidx.compose.ui.focus.b) jVar).f17409f);
        a3.d j13 = g13 != null ? androidx.compose.ui.focus.a.j(g13) : null;
        if (j13 == null) {
            return null;
        }
        int i13 = (int) j13.f484a;
        int i14 = iArr[0];
        int i15 = iArr2[0];
        int i16 = (int) j13.f485b;
        int i17 = iArr[1];
        int i18 = iArr2[1];
        return new Rect((i13 + i14) - i15, (i16 + i17) - i18, (((int) j13.f486c) + i14) - i15, (((int) j13.f487d) + i17) - i18);
    }

    public static final View c(u2.p pVar) {
        j jVar = com.bumptech.glide.c.U0(pVar.f120042a).f110822j;
        View view = jVar != null ? jVar.f98795b : null;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Could not fetch interop view".toString());
    }

    public static final void d(j jVar, k0 k0Var) {
        long c03 = k0Var.f110837y.f110805b.c0(0L);
        int round = Math.round(a3.c.d(c03));
        int round2 = Math.round(a3.c.e(c03));
        jVar.layout(round, round2, jVar.getMeasuredWidth() + round, jVar.getMeasuredHeight() + round2);
    }
}
