package h60;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f67795j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f67796k = new f(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f67797i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f67797i) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return "pincluster:" + it;
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }
}
