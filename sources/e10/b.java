package e10;

import do2.r2;
import do2.t2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import tb0.p;

/* loaded from: classes3.dex */
public final class b implements EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final p f56767a;

    /* renamed from: b, reason: collision with root package name */
    public final r2 f56768b;

    /* renamed from: c, reason: collision with root package name */
    public final a f56769c;

    public b(p productArea, t2 conditionFlow) {
        Intrinsics.checkNotNullParameter(productArea, "productArea");
        Intrinsics.checkNotNullParameter(conditionFlow, "conditionFlow");
        this.f56767a = productArea;
        this.f56768b = conditionFlow;
        this.f56769c = new a(this);
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener a(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return ((Boolean) this.f56768b.getValue()).booleanValue() ? this.f56769c : EventListener.f95611a;
    }
}
