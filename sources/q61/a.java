package q61;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vn1.e;
import vn1.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f102590j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f102591k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f102592i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f102592i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(e.REGULAR), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f102592i) {
        }
        return b((rn1.a) obj);
    }
}
