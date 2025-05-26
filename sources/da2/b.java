package da2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f54236j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f54237k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54238i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f54238i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f54238i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.BODY_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f54238i) {
        }
        return b((rn1.a) obj);
    }
}
