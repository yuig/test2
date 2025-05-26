package q71;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102709i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f102710j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ oe.f f102711k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Context context, oe.f fVar, int i13) {
        super(0);
        this.f102709i = i13;
        this.f102710j = context;
        this.f102711k = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        int i14;
        n0 n0Var = n0.f102727c;
        n0 n0Var2 = n0.f102728d;
        n0 n0Var3 = n0.f102729e;
        int i15 = this.f102709i;
        Context context = this.f102710j;
        oe.f fVar = this.f102711k;
        switch (i15) {
            case 0:
                if (Intrinsics.d(fVar, n0Var3)) {
                    i13 = eo1.a.sema_color_text_subtle;
                } else {
                    if (!Intrinsics.d(fVar, n0Var2) && !Intrinsics.d(fVar, n0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = eo1.a.sema_color_text_default;
                }
                return new ForegroundColorSpan(dl2.b.x0(context, i13));
            default:
                if (Intrinsics.d(fVar, n0Var3) || Intrinsics.d(fVar, n0Var2)) {
                    i14 = eo1.a.sema_color_text_default;
                } else {
                    if (!Intrinsics.d(fVar, n0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = eo1.a.base_color_blue_700;
                }
                return new ForegroundColorSpan(dl2.b.x0(context, i14));
        }
    }
}
