package ea0;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final p f57986j = new p(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p f57987k = new p(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p f57988l = new p(2);

    /* renamed from: m, reason: collision with root package name */
    public static final p f57989m = new p(3);

    /* renamed from: n, reason: collision with root package name */
    public static final p f57990n = new p(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(1);
        this.f57991i = i13;
    }

    public final l b(l it) {
        switch (this.f57991i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return l.e(it, false, null, null, 27);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f57991i) {
            case 0:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(om1.e.MD);
                break;
            case 1:
                w vmState = (w) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                break;
            case 2:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String id3 = it.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                break;
        }
        return b((l) obj);
    }
}
