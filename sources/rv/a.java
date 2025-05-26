package rv;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qa2.s1;
import uv.f;
import wt.c;

/* loaded from: classes3.dex */
public final class a extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f110086d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f110087e;

    public a(c cutoutClickListener) {
        Intrinsics.checkNotNullParameter(cutoutClickListener, "cutoutClickListener");
        this.f110086d = cutoutClickListener;
        this.f110087e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f110087e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        if (r9 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c4, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        r9 = r0.f35461d.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "getValue(...)");
        pk.a0.p((com.pinterest.gestalt.text.GestaltText) r9, r4);
        r4 = r0.f35462e;
        r9 = r4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "getValue(...)");
        bs1.c.B((com.pinterest.gestalt.text.GestaltText) r9, eo1.b.color_gray_300);
        r4 = r4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getValue(...)");
        pk.a0.p((com.pinterest.gestalt.text.GestaltText) r4, r8);
        r4 = r2.M4();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getIsEligibleForPdp(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010b, code lost:
    
        if (r4.booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010d, code lost:
    
        r4 = m60.x0.pin_action_shop;
        r9 = new java.lang.String[0];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "formatArgs");
        r9 = new u50.k0(r4, new java.util.ArrayList(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
    
        r4 = r0.f35460c;
        r8 = r4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "getValue(...)");
        ((com.pinterest.gestalt.button.view.GestaltButton) r8).d(new uv.b(r9, r10));
        r4 = r4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getValue(...)");
        ((com.pinterest.gestalt.button.view.GestaltButton) r4).e(new defpackage.a(r7, r3));
        r3 = r2.M4();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "getIsEligibleForPdp(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015f, code lost:
    
        if (r3.booleanValue() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0161, code lost:
    
        r3 = po1.c.g(r0.getResources().getColor(eo1.b.color_gray_300, r0.getContext().getTheme()), r0.getResources().getColor(eo1.b.color_white_0, r0.getContext().getTheme()), r2);
        r4 = r0.f35463f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x018b, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x018d, code lost:
    
        r4 = r4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getValue(...)");
        ((com.pinterest.gestalt.text.GestaltText) r4).i(new zp.s0(r3, 12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01af, code lost:
    
        r3 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b8, code lost:
    
        if (bs1.c.f1(r2) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01ba, code lost:
    
        r3.append(r0.getResources().getString(az1.c.product_in_stock));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c7, code lost:
    
        r4 = com.pinterest.api.model.b40.t(r2);
        r8 = com.pinterest.api.model.b40.u(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01cf, code lost:
    
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d1, code lost:
    
        if (r8 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d3, code lost:
    
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01db, code lost:
    
        if (r3.length() <= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01dd, code lost:
    
        r3.append(" · ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e2, code lost:
    
        r9 = r0.getContext().getResources();
        kotlin.jvm.internal.Intrinsics.f(r9);
        r3.append(dl2.b.d1(r2, r9, java.lang.Integer.valueOf(r8), r4, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f8, code lost:
    
        r2 = r3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r3 = r2.length();
        r0 = r0.f35464g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0207, code lost:
    
        if (r3 <= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0209, code lost:
    
        r0 = r0.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "getValue(...)");
        ((com.pinterest.gestalt.text.GestaltText) r0).i(new rq.l2(r2, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021b, code lost:
    
        r0 = r0.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "getValue(...)");
        bs1.c.X0((com.pinterest.gestalt.text.GestaltText) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a1, code lost:
    
        r3 = r4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "getValue(...)");
        bs1.c.X0((com.pinterest.gestalt.text.GestaltText) r3);
        r3 = kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
    
        r4 = m60.x0.pin_action_default;
        r9 = new java.lang.String[0];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "formatArgs");
        r9 = new u50.k0(r4, new java.util.ArrayList(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        if (r9 == null) goto L31;
     */
    @Override // androidx.recyclerview.widget.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.recyclerview.widget.y2 r18, int r19) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.a.r(androidx.recyclerview.widget.y2, int):void");
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f fVar = new f(context, this.f110086d);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -1);
        fVar.setClipChildren(false);
        fVar.setLayoutParams(layoutParams);
        return new b(fVar);
    }
}
