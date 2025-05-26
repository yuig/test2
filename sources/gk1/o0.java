package gk1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o0 f65247j = new o0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o0 f65248k = new o0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final o0 f65249l = new o0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final o0 f65250m = new o0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final o0 f65251n = new o0(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65252i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i13) {
        super(1);
        this.f65252i = i13;
    }

    public final l b(l it) {
        switch (this.f65252i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return l.e(it, kotlin.collections.q0.f80391a, null, null, 6);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return l.e(it, null, null, d.f65225a, 3);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return l.e(it, null, i.f65233a, null, 5);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return l.e(it, null, null, e.f65226a, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65252i) {
            case 0:
                return b((l) obj);
            case 1:
                return b((l) obj);
            case 2:
                return b((l) obj);
            case 3:
                return b((l) obj);
            default:
                x0 it = (x0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, false, false, false, null, 0, false, null, null, false, null, false, null, false, false, true, null, null, false, false, null, -1, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
        }
    }
}
