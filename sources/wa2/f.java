package wa2;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128693i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f128694j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(0);
        this.f128693i = i13;
        this.f128694j = gVar;
    }

    public final Integer b() {
        int i13 = this.f128693i;
        g gVar = this.f128694j;
        switch (i13) {
            case 0:
                Context context = gVar.f128706n;
                Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                return Integer.valueOf(dl2.b.F0(context, gVar.f128708p.getDimenAttrRes()));
            default:
                return Integer.valueOf(gVar.f128707o.getDimensionPixelSize(wy1.b.chin_cta_thumbnail_size));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f128693i) {
        }
        return b();
    }
}
