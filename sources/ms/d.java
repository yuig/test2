package ms;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f88098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f88097i = i13;
        this.f88098j = eVar;
    }

    public final b b() {
        int i13 = this.f88097i;
        e eVar = this.f88098j;
        switch (i13) {
            case 0:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new b(requireContext);
            default:
                Context requireContext2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new b(requireContext2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f88097i) {
        }
        return b();
    }
}
