package hx1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f70526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(0);
        this.f70526i = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f fVar = this.f70526i;
        uk1.e eVar = fVar.f70530j0;
        if (eVar != null) {
            return uk1.e.c(eVar, fVar);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }
}
