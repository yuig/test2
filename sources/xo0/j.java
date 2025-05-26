package xo0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends ar0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f135594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f135595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f135596c;

    public j(k kVar, boolean z13, ye2.m mVar) {
        this.f135594a = kVar;
        this.f135595b = z13;
        this.f135596c = mVar;
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i15 = k.f135597g1;
        k kVar = this.f135594a;
        RecyclerView g83 = kVar.g8();
        Intrinsics.f(g83);
        l2 l2Var = g83.f19242n;
        Intrinsics.f(l2Var);
        boolean z13 = eb2.j.b(l2Var, null) > 0;
        fo1.a i73 = kVar.i7();
        if (i73 == null) {
            return;
        }
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
        RecyclerView g84 = kVar.g8();
        if (g84 != null) {
            int measuredHeight = d7.b.I(g84, 0).getMeasuredHeight();
            RecyclerView g85 = kVar.g8();
            boolean z14 = recyclerView.computeVerticalScrollOffset() >= (measuredHeight + (g85 != null ? g85.getPaddingTop() : 0)) - gestaltToolbarImpl.getMeasuredHeight();
            if (!z13 && !z14) {
                fo1.a i74 = kVar.i7();
                if (i74 != null) {
                    ((GestaltToolbarImpl) i74).s();
                }
            } else if (Intrinsics.d(kVar.f135601d1, Boolean.TRUE)) {
                fo1.a i75 = kVar.i7();
                if (i75 != null) {
                    ((GestaltToolbarImpl) i75).r();
                }
            } else {
                fo1.a i76 = kVar.i7();
                if (i76 != null) {
                    ((GestaltToolbarImpl) i76).q();
                }
            }
            boolean z15 = this.f135595b;
            Context context = this.f135596c;
            if (z15 && !z13 && !z14) {
                gestaltToolbarImpl.getBackground().setAlpha(0);
                gestaltToolbarImpl.v().setColorFilter(dl2.b.x0(context, eo1.a.base_color_grayscale_0));
                IconView iconView = kVar.f135598a1;
                if (iconView != null) {
                    iconView.setColorFilter(dl2.b.x0(context, eo1.a.base_color_grayscale_0));
                    return;
                } else {
                    Intrinsics.r("shareButton");
                    throw null;
                }
            }
            gestaltToolbarImpl.getBackground().setAlpha(255);
            IconView v13 = gestaltToolbarImpl.v();
            int i16 = eo1.b.color_themed_text_default;
            Object obj = d5.a.f53679a;
            v13.setColorFilter(context.getColor(i16));
            IconView iconView2 = kVar.f135598a1;
            if (iconView2 != null) {
                iconView2.setColorFilter(context.getColor(eo1.b.color_themed_text_default));
            } else {
                Intrinsics.r("shareButton");
                throw null;
            }
        }
    }
}
