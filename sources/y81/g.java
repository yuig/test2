package y81;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138041i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f138042j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(0);
        this.f138041i = i13;
        this.f138042j = hVar;
    }

    public final l b() {
        int i13 = this.f138041i;
        h hVar = this.f138042j;
        switch (i13) {
            case 0:
                Context context = hVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new l(context, hVar.f138043g);
            case 1:
                Context context2 = hVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new l(context2, hVar.f138043g);
            default:
                Context context3 = hVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new l(context3, hVar.f138043g);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f138041i) {
        }
        return b();
    }
}
