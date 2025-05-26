package cx0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ni1.y2;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f53360j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f53361k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f53362i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53362i) {
            case 0:
                y2 it = (y2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }
}
