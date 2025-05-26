package dx0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ue1.z;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f56461j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f56462k = new v(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v f56463l = new v(2);

    /* renamed from: m, reason: collision with root package name */
    public static final v f56464m = new v(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56465i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(1);
        this.f56465i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56465i) {
            case 0:
                rn1.a aVar = (rn1.a) obj;
                return rn1.a.y(aVar, jq.b.p(aVar, "it", "", "string", ""), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                return Boolean.valueOf(view instanceof nx.v);
            case 2:
                a vmState = (a) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f56413a;
            default:
                a vm3 = (a) obj;
                Intrinsics.checkNotNullParameter(vm3, "vm");
                z zVar = vm3.f56414b;
                Intrinsics.f(zVar);
                return zVar;
        }
    }
}
