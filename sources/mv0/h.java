package mv0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88363i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f88364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(0);
        this.f88363i = i13;
        this.f88364j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f88363i;
        i iVar = this.f88364j;
        switch (i13) {
            case 0:
                yq0.m mVar = iVar.f139732f0;
                if (mVar != null) {
                    mVar.i(iVar.X0);
                }
                yq0.m mVar2 = iVar.f139732f0;
                if (mVar2 != null) {
                    mVar2.i(iVar.W0);
                }
                return Unit.f80348a;
            default:
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new a(requireContext, new gv0.b(iVar, 1), new h(iVar, 0));
        }
    }
}
