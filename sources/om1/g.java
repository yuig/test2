package om1;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96649i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f96650j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f96651k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(GestaltIconButton gestaltIconButton, c cVar, int i13) {
        super(1);
        this.f96649i = i13;
        this.f96650j = gestaltIconButton;
        this.f96651k = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1.B() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r7) {
        /*
            r6 = this;
            int r0 = r6.f96649i
            com.pinterest.gestalt.iconbutton.GestaltIconButton r1 = r6.f96650j
            om1.c r2 = r6.f96651k
            switch(r0) {
                case 1: goto Lf;
                default: goto L9;
            }
        L9:
            int r7 = r2.f96647i
            r1.setId(r7)
            return
        Lf:
            if (r7 != 0) goto L19
            ps0.m r0 = com.pinterest.gestalt.iconbutton.GestaltIconButton.A
            boolean r0 = r1.B()
            if (r0 == 0) goto L52
        L19:
            com.pinterest.gestalt.indicator.GestaltIndicator r0 = r1.f49391w
            if (r0 != 0) goto L52
            com.pinterest.gestalt.indicator.GestaltIndicator r0 = new com.pinterest.gestalt.indicator.GestaltIndicator
            android.content.Context r3 = r1.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r4 = 0
            r5 = 6
            r0.<init>(r5, r3, r4)
            om1.i r3 = om1.i.f96654j
            df.j1.r(r0, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            r4 = 8388661(0x800035, float:1.1755018E-38)
            r3.gravity = r4
            r0.setLayoutParams(r3)
            xk2.v r3 = r1.f49389u
            java.lang.Object r3 = r3.getValue()
            java.lang.String r4 = "getValue(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.addView(r0)
            r1.f49391w = r0
        L52:
            om1.e r0 = r2.f96640b
            int r0 = r0.getIndicatorPlacement()
            com.pinterest.gestalt.indicator.GestaltIndicator r3 = r1.f49391w
            if (r3 == 0) goto L72
            int r0 = dl2.b.G0(r1, r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            kotlin.jvm.internal.Intrinsics.g(r4, r5)
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r5 = 0
            r4.setMargins(r5, r0, r0, r5)
            r3.setLayoutParams(r4)
        L72:
            if (r7 == 0) goto L8c
            boolean r0 = r1.B()
            if (r0 != 0) goto L7b
            goto L8c
        L7b:
            com.pinterest.gestalt.indicator.GestaltIndicator r0 = r1.f49391w
            if (r0 == 0) goto L9a
            c2.m4 r1 = new c2.m4
            r3 = 23
            om1.e r2 = r2.f96640b
            r1.<init>(r2, r7, r3)
            r0.i(r1)
            goto L9a
        L8c:
            com.pinterest.gestalt.indicator.GestaltIndicator r7 = r1.f49391w
            if (r7 == 0) goto L9a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            um1.c r0 = um1.c.f122794n
            r7.i(r0)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.g.b(int):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96649i;
        c cVar = this.f96651k;
        GestaltIconButton gestaltIconButton = this.f96650j;
        switch (i13) {
            case 0:
                c newState = (c) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                ps0.m mVar = GestaltIconButton.A;
                gestaltIconButton.z(cVar, newState);
                break;
            case 1:
                b(((Number) obj).intValue());
                break;
            case 2:
                b(((Number) obj).intValue());
                break;
            default:
                e size = (e) obj;
                Intrinsics.checkNotNullParameter(size, "size");
                Context context = gestaltIconButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                List list = pm1.a.f100709a;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                int F0 = dl2.b.F0(context, cVar.f96640b.getBackgroundSize());
                gestaltIconButton.x().setLayoutParams(new FrameLayout.LayoutParams(F0, F0));
                gestaltIconButton.x().setMinHeight(F0);
                gestaltIconButton.x().setMaxHeight(F0);
                gestaltIconButton.x().setMinWidth(F0);
                gestaltIconButton.x().setMaxWidth(F0);
                AppCompatButton x13 = gestaltIconButton.x();
                int t13 = com.bumptech.glide.c.t1(gestaltIconButton);
                x13.setPadding(t13, t13, t13, t13);
                gestaltIconButton.requestLayout();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, GestaltIconButton gestaltIconButton) {
        super(1);
        this.f96649i = 3;
        this.f96651k = cVar;
        this.f96650j = gestaltIconButton;
    }
}
