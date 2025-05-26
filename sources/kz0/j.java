package kz0;

import androidx.lifecycle.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import ni1.t2;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81163i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f81164j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, int i13) {
        super(0);
        this.f81163i = i13;
        this.f81164j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f81163i;
        m mVar = this.f81164j;
        switch (i13) {
            case 0:
                t2 t2Var = mVar.f81178g;
                if (t2Var != null) {
                    z r13 = b7.c.r(mVar);
                    return t2.a(t2Var, r13 != null ? bf.b.S(r13) : dl2.b.e(), null, 14);
                }
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            default:
                w wVar = mVar.f81174c;
                if (wVar != null) {
                    wVar.d(new dc0.h(false));
                    return Unit.f80348a;
                }
                Intrinsics.r("eventManager");
                throw null;
        }
    }
}
