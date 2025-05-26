package bx0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f24036j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f24037k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f24038l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f24039m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f24040n = new g(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f24041i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n nVar = n.f24080a;
        switch (this.f24041i) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof nx.v);
            case 1:
                w effect = (w) obj;
                Intrinsics.checkNotNullParameter(effect, "effect");
                u uVar = effect instanceof u ? (u) effect : null;
                if (uVar != null) {
                    return uVar.f24089a;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Void) obj, "it");
                return nVar;
            case 3:
                w effect2 = (w) obj;
                Intrinsics.checkNotNullParameter(effect2, "effect");
                if (effect2 instanceof t) {
                    return (t) effect2;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((s) obj, "it");
                return nVar;
        }
    }
}
