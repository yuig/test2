package rq;

import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109273i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k3 f109274j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(k3 k3Var, int i13) {
        super(1);
        this.f109273i = i13;
        this.f109274j = k3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109273i;
        k3 k3Var = this.f109274j;
        switch (i13) {
            case 0:
                is1.g0 g0Var = (is1.g0) obj;
                if (((g0Var instanceof is1.f0) || (g0Var instanceof is1.d0)) && k3Var.shouldShowForPin()) {
                    k3Var.updateView();
                    if (k3Var.f109343f) {
                        oq.m0 m0Var = k3Var.f109359v;
                        if (m0Var != null && !m0Var.f97084e.a()) {
                            m0Var.c(null);
                        }
                    } else {
                        GestaltPreviewTextView gestaltPreviewTextView = k3Var.f109352o;
                        if (gestaltPreviewTextView != null && gestaltPreviewTextView.getLineCount() > gestaltPreviewTextView.k().f122878v && gestaltPreviewTextView.k().f122881y) {
                            kh2.m0.g(gestaltPreviewTextView, f2.f109196x);
                        }
                    }
                }
                break;
            default:
                un1.m bind = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                CharSequence charSequence = k3Var.f109353p;
                boolean z13 = !(charSequence == null || charSequence.length() == 0);
                bind.getClass();
                bind.f122900h = z13 ? fm1.c.VISIBLE : fm1.c.GONE;
                CharSequence charSequence2 = k3Var.f109353p;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                bind.a(charSequence2);
                bind.f122903k = true;
                break;
        }
        return Unit.f80348a;
    }
}
