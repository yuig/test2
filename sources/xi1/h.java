package xi1;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135051i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f135052j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(0);
        this.f135051i = i13;
        this.f135052j = iVar;
    }

    public final Integer b() {
        int i13 = this.f135051i;
        i iVar = this.f135052j;
        switch (i13) {
            case 0:
                Context context = iVar.f135055n;
                Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                return Integer.valueOf(dl2.b.F0(context, iVar.f135057p.getDimenAttrRes()));
            default:
                return Integer.valueOf(iVar.f135056o.getDimensionPixelSize(wy1.b.chin_cta_thumbnail_size));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f135051i) {
        }
        return b();
    }
}
