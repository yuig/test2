package sw0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115452i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f115453j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f115454k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(ye2.m mVar, j0 j0Var, int i13) {
        super(0);
        this.f115452i = i13;
        this.f115453j = mVar;
        this.f115454k = j0Var;
    }

    public final j b() {
        int i13 = this.f115452i;
        j0 j0Var = this.f115454k;
        Context it = this.f115453j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                break;
            default:
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                break;
        }
        return new j(it, j0Var.D1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f115452i) {
        }
        return b();
    }
}
