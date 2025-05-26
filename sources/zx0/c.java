package zx0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.h2;
import yx0.h;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143010i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f143011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(0);
        this.f143010i = i13;
        this.f143011j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f143010i;
        f fVar = this.f143011j;
        switch (i13) {
            case 0:
                h2 h2Var = fVar.f143017t0;
                if (h2Var != null) {
                    return Boolean.valueOf(h2Var.c());
                }
                Intrinsics.r("newshubExperiments");
                throw null;
            default:
                wk2.a aVar = fVar.f143015r0;
                if (aVar != null) {
                    return (h) aVar.get();
                }
                Intrinsics.r("presenterProvider");
                throw null;
        }
    }
}
