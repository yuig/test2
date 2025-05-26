package ads_mobile_sdk;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class vq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.e9 f12604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(a.e9 e9Var, View view) {
        super(0);
        this.f12604a = e9Var;
        this.f12605b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f12604a.a(this.f12605b);
        return Unit.f80348a;
    }
}
