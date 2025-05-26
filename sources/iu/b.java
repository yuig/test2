package iu;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.f;
import rm1.i;
import rm1.q;
import vn1.g;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f73679j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f73680k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73681i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f73681i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73681i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                rm1.d it2 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rm1.d.e(it2, new f(q.CHECK, i.SM), null, null, 0, null, 30);
        }
    }
}
