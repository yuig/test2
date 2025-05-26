package m90;

import android.view.View;
import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f86705j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f86706k = new v(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v f86707l = new v(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(2);
        this.f86708i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f86708i) {
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 19));
                createLens.h(new ns.f0(subResult, 20));
                d7.g.y(subResult, 10, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 21));
                createLens.h(new ns.f0(subResult, 22));
                d7.g.y(subResult, 11, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f86708i) {
            case 0:
                Intrinsics.checkNotNullParameter((v7) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((View) obj2, "<anonymous parameter 1>");
                break;
            case 1:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            default:
                b((l82.e) obj, (l82.c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
