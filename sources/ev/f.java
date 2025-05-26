package ev;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes3.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f60205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f0 f0Var) {
        super(1);
        this.f60205i = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rn1.a displayState = (rn1.a) obj;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        return rn1.a.y(displayState, this.f60205i, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
    }
}
