package qp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;
import u50.i0;

/* loaded from: classes3.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104690i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f104691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(f0 f0Var, int i13) {
        super(1);
        this.f104690i = i13;
        this.f104691j = f0Var;
    }

    public final yl1.b b(yl1.b displayState) {
        switch (this.f104690i) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "state");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f139300a;
                f0 text = this.f104691j;
                Intrinsics.checkNotNullParameter(text, "text");
                f0 contentDescription = this.f104691j;
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                return new yl1.b(text, displayState.f139301b, displayState.f139302c, contentDescription, displayState.f139304e, displayState.f139305f, displayState.f139306g, displayState.f139307h, displayState.f139308i, displayState.f139309j);
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                yl1.g c13 = yl1.i.c();
                f0 f0Var = this.f104691j;
                return yl1.b.f(displayState, f0Var, false, null, f0Var, c13, null, null, null, 0, null, 998);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f104690i) {
        }
        return b((yl1.b) obj);
    }
}
