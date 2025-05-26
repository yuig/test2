package wc2;

import android.view.ViewGroup;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mq.w;
import ni1.d0;
import so.ba;
import yq1.d1;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f129112j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(0);
        this.f129111i = i13;
        this.f129112j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f129111i;
        e eVar = this.f129112j;
        switch (i13) {
            case 0:
                WebView webView = eVar.f129131p;
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = eVar.f129130o.getPinDrawableHeight();
                webView.setLayoutParams(layoutParams);
                return Unit.f80348a;
            default:
                d0 d0Var = eVar.f129125j;
                if (d0Var == null) {
                    Intrinsics.r("vmStateConverterFactory");
                    throw null;
                }
                return ((ba) d0Var).a(eVar.f129121f, new w(eVar, 20), new d1(eVar, 11));
        }
    }
}
