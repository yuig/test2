package j41;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class l extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f74663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74664b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f74665c;

    public l(int i13, int i14, h onLearnMoreClick) {
        Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
        this.f74663a = i13;
        this.f74664b = i14;
        this.f74665c = onLearnMoreClick;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context);
        nVar.l(this.f74663a);
        GestaltText gestaltText = nVar.f44750b;
        if (gestaltText != null) {
            gestaltText.i(jc0.k.f75416o);
        }
        vn1.b textAlignment = vn1.b.CENTER;
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        GestaltText gestaltText2 = nVar.f44750b;
        if (gestaltText2 != null) {
            gestaltText2.i(new yb0.m(textAlignment, 1));
        }
        nVar.q(true);
        nVar.k();
        nVar.x(new m(context, this.f74664b, this.f74665c));
        nVar.o(false);
        nVar.L(x0.close_modal);
        nVar.Y(false);
        nVar.d0(false);
        nVar.T(true);
        nVar.D(new lp.j(nVar, 2));
        return nVar;
    }
}
