package hj1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ni1.e0;
import qb0.j;
import rm1.c;
import ua2.d1;
import ua2.z0;
import vn1.h;
import wa2.d0;
import wa2.f0;
import wa2.h0;
import wa2.i0;
import wa2.l;
import wa2.v;
import wa2.x;

/* loaded from: classes5.dex */
public final class a extends d1 {

    /* renamed from: h, reason: collision with root package name */
    public final int f69281h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f69282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView, Context context, c defaultIconColor) {
        super(pinRepView);
        vn1.c defaultTextColor = h.f126277c;
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultIconColor, "defaultIconColor");
        Intrinsics.checkNotNullParameter(defaultTextColor, "defaultTextColor");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(e0.f90644c);
        this.f69281h = dimensionPixelSize;
        this.f69282i = new f0(pinRepView, context, defaultTextColor, dimensionPixelSize);
    }

    public final void A(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        x pinReactionsDisplayState = displayState.f69283a;
        f0 f0Var = this.f69282i;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(pinReactionsDisplayState, "pinReactionsDisplayState");
        i0 i0Var = pinReactionsDisplayState.f128951a;
        if (i0Var instanceof h0) {
            j jVar = j.f103407a;
            j.c(((h0) i0Var).f128757a, new ha2.j(f0Var, 8));
        }
        d0 d0Var = f0Var.f128698o;
        d0Var.getClass();
        v displayState2 = pinReactionsDisplayState.f128952b;
        Intrinsics.checkNotNullParameter(displayState2, "displayState");
        Context context = d0Var.f128687a;
        d0Var.f128690d = context.getResources().getDimensionPixelSize(displayState2.f128948a);
        List list = displayState2.f128949b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Object obj = d5.a.f53679a;
            Drawable drawable = context.getDrawable(intValue);
            if (drawable != null) {
                arrayList.add(drawable);
            }
        }
        d0Var.f128688b = arrayList;
        d0Var.setBounds(d0Var.getBounds().left, d0Var.getBounds().top, d0Var.getIntrinsicWidth() + d0Var.getBounds().left, d0Var.getBounds().top + d0Var.f128689c);
    }

    @Override // ua2.f1
    public final l k() {
        return this.f69282i;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f69281h;
        int i18 = i13 + i17;
        int i19 = this.f121483f;
        int i23 = i15 - i17;
        int i24 = this.f121484g;
        f0 f0Var = this.f69282i;
        f0Var.setBounds(i18, i19, i23, i24);
        f0Var.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        f0 f0Var = this.f69282i;
        f0Var.g(i14);
        f0Var.f(i13);
        f0Var.e(f0Var.f128698o.f128689c);
        String str = f0Var.f128700q;
        f0Var.f128699p.getTextBounds(str, 0, str.length(), f0Var.f128702s);
        return new z0(i13, f0Var.f128842e);
    }
}
