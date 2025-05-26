package dg2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import th2.n;
import xf2.l0;

/* loaded from: classes4.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f54958i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Pair f54959j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f54960k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f54961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f54962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Pair pair, String str, n nVar, long j13) {
        super(1);
        this.f54958i = jVar;
        this.f54959j = pair;
        this.f54960k = str;
        this.f54961l = nVar;
        this.f54962m = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vf2.c captureData = (vf2.c) obj;
        Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
        Pair pair = ((tg2.i) this.f54958i.f54963d).f117610b.isViewClickCoordinateCaptureEnabled() ? this.f54959j : new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
        float floatValue = ((Float) pair.f80346a) != null ? (int) r2.floatValue() : 0.0f;
        float floatValue2 = ((Float) pair.f80347b) != null ? (int) r0.floatValue() : 0.0f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append((int) floatValue);
        sb3.append(',');
        sb3.append((int) floatValue2);
        ((ei2.a) captureData).i(new l0(this.f54960k, this.f54961l.getValue(), sb3.toString(), 5), this.f54962m);
        return Unit.f80348a;
    }
}
