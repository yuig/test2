package ads_mobile_sdk;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class hq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.e9 f6047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh0 f6049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq1(a.e9 e9Var, View view, xh0 xh0Var, String str) {
        super(0);
        this.f6047a = e9Var;
        this.f6048b = view;
        this.f6049c = xh0Var;
        this.f6050d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a.e9 e9Var = this.f6047a;
        View view = this.f6048b;
        xh0 xh0Var = this.f6049c;
        String str = this.f6050d;
        t3 t3Var = (t3) e9Var;
        if (!t3Var.f11331f) {
            t3Var.f11327b.a(view, xh0Var, str);
        }
        return Unit.f80348a;
    }
}
