package bj1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bi1.a0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends ej1.a {

    /* renamed from: k, reason: collision with root package name */
    public final c f22959k;

    /* renamed from: l, reason: collision with root package name */
    public int f22960l;

    /* renamed from: m, reason: collision with root package name */
    public int f22961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        this.f22959k = new c(pinRepView);
    }

    public final void C(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        A(displayState.f22964c);
        c cVar = this.f22959k;
        cVar.getClass();
        d boardPinAttributionDrawableDisplayState = displayState.f22965d;
        Intrinsics.checkNotNullParameter(boardPinAttributionDrawableDisplayState, "boardPinAttributionDrawableDisplayState");
        ((GestaltAvatar) cVar.f22967m.getValue()).H2(new a0(boardPinAttributionDrawableDisplayState, 5));
        View view = this.f121492a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f22960l = displayState.f22963b.a(context).intValue();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f22961m = displayState.f22962a.a(context2).intValue();
    }

    @Override // ej1.a, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.r(canvas, i13, 0, i15, i16);
        Rect j13 = this.f59096h.j();
        if (this.f121494c) {
            i17 = i15 - ((this.f59098j * 2) + (j13.right + this.f22961m));
        } else {
            i17 = j13.right + this.f22961m;
        }
        int i18 = this.f22960l + i17;
        c cVar = this.f22959k;
        cVar.getClass();
        cVar.setBounds(i17, this.f121483f, i18, this.f121484g);
        cVar.draw(canvas);
        u(canvas);
    }
}
