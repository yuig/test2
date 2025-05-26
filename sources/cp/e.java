package cp;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52926i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f52927j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f52926i = i13;
        this.f52927j = fVar;
    }

    public final mp.s b() {
        int i13 = this.f52926i;
        f fVar = this.f52927j;
        switch (i13) {
            case 6:
                Context requireContext = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new mp.s(requireContext, 4);
            default:
                Context requireContext2 = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.s(requireContext2, 3);
        }
    }

    public final rb2.d e() {
        int i13 = this.f52926i;
        f fVar = this.f52927j;
        switch (i13) {
            case 1:
                Context requireContext = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                rb2.d dVar = new rb2.d(requireContext, false);
                dVar.f107147t = fVar.f52929a1;
                return dVar;
            case 2:
            default:
                Context requireContext2 = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                rb2.d dVar2 = new rb2.d(requireContext2, false);
                dVar2.f107147t = fVar.f52929a1;
                return dVar2;
            case 3:
                Context requireContext3 = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                rb2.d dVar3 = new rb2.d(requireContext3, false);
                dVar3.f107147t = fVar.f52929a1;
                return dVar3;
        }
    }

    public final rb2.i f() {
        int i13 = this.f52926i;
        f fVar = this.f52927j;
        switch (i13) {
            case 2:
                Context requireContext = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                rb2.i iVar = new rb2.i(requireContext, false);
                iVar.f107186w = fVar.f52929a1;
                return iVar;
            default:
                Context requireContext2 = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                rb2.i iVar2 = new rb2.i(requireContext2, false);
                iVar2.f107186w = fVar.f52929a1;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f52926i) {
            case 0:
                super/*yq0.t*/.V1();
                break;
        }
        return b();
    }
}
