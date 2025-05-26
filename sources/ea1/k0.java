package ea1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58070i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f58071j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f58072k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f58073l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(String str, boolean z13, boolean z14) {
        super(1);
        this.f58073l = str;
        this.f58071j = z13;
        this.f58072k = z14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58070i;
        String str = this.f58073l;
        switch (i13) {
            case 0:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.q middleItem = new wm1.q(u50.g0.b(new String[0], b52.c.enable_auto_org_title), u50.g0.b(new String[]{str}, b52.c.enable_auto_org_description), false, 4);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                wm1.k endItem = new wm1.k(this.f58071j, this.f58072k, 4);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                return Unit.f80348a;
            default:
                on1.k it = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, this.f58071j, this.f58072k, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER), bs1.c.h2(str), null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z13, boolean z14, String str) {
        super(1);
        this.f58071j = z13;
        this.f58072k = z14;
        this.f58073l = str;
    }
}
