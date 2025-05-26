package uv1;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class k extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123213i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f123214j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i13) {
        super(0);
        this.f123213i = i13;
        this.f123214j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f123213i;
        l lVar = this.f123214j;
        switch (i13) {
            case 0:
                return lVar.generateLoggingContext();
            case 1:
                ca2.e eVar = new ca2.e(true, null, 0, lVar.getResources().getDimensionPixelOffset(nv1.b.content_type_filter_bottom_sheet_height), null, 0, null, new bh.b(lVar.s7(), new k(lVar, 0)), false, false, 886);
                eVar.f27252k = new q01.o(lVar, 1);
                return eVar;
            case 2:
                Context context = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                return new f(context);
            case 3:
                Context context2 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                return new n(context2);
            case 4:
                Context context3 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context3, "context");
                return new c(context3);
            case 5:
                Context context4 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context4, "context");
                return new e(context4);
            default:
                int i14 = l.R0;
                lVar.U8();
                return Unit.f80348a;
        }
    }
}
