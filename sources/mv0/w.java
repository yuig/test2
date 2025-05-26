package mv0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88414i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f88415j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, int i13) {
        super(0);
        this.f88414i = i13;
        this.f88415j = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f88414i) {
            case 0:
                Context requireContext = this.f88415j.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                break;
            case 1:
                m190invoke();
                break;
            default:
                m190invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m190invoke() {
        int i13 = this.f88414i;
        y yVar = this.f88415j;
        switch (i13) {
            case 1:
                jv0.o oVar = yVar.F0;
                if (oVar == null) {
                    Intrinsics.r("actionListener");
                    throw null;
                }
                oVar.a(jv0.k.f77638e);
                return;
            default:
                jv0.o oVar2 = yVar.F0;
                if (oVar2 == null) {
                    Intrinsics.r("actionListener");
                    throw null;
                }
                oVar2.a(jv0.k.f77637d);
                return;
        }
    }
}
