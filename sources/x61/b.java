package x61;

import bm1.m;
import bm1.n;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f133928j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f133929k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f133930l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f133931m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f133932i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f133932i = i13;
    }

    public final m b(m it) {
        switch (this.f133932i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return m.e(it, null, n.UNSELECTED, null, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f133932i) {
            case 0:
                return b((m) obj);
            case 1:
                return b((m) obj);
            case 2:
                return b((m) obj);
            default:
                rm1.d icon = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(q.SOUND, rm1.i.XL), rm1.c.LIGHT, null, 0, null, 28);
        }
    }
}
