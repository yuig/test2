package kt0;

import android.text.Spannable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f80832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13) {
        super(1);
        this.f80831i = i13;
        this.f80832j = obj;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f80831i;
        Object obj = this.f80832j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!((q) obj).L0) {
                    break;
                } else {
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!((q) obj).L0) {
                    break;
                } else {
                    break;
                }
        }
        return om1.c.e(it, rm1.q.MAGIC_WAND, null, null, null, null, false, 0, 1022);
    }

    public final pn1.b e(pn1.b it) {
        int i13 = this.f80831i;
        Object obj = this.f80832j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return pn1.b.e(it, bs1.c.h2(((q) obj).K0), null, 0, false, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return pn1.b.e(it, bs1.c.h2((Spannable) obj), null, 0, false, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80831i) {
        }
        return e((pn1.b) obj);
    }
}
