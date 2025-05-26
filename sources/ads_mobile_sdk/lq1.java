package ads_mobile_sdk;

import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class lq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq1 f7925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f7926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq1(zq1 zq1Var, WebView webView, boolean z13) {
        super(0);
        this.f7925a = zq1Var;
        this.f7926b = webView;
        this.f7927c = z13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new l21(this.f7925a.f14870k, this.f7926b, this.f7927c);
    }
}
