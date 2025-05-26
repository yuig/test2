package xp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vb0.j;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f135638j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f135639k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f135640l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f135641m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135642i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f135642i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135642i;
        switch (i13) {
            case 0:
                br.d it = (br.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f23704b != null);
            case 1:
                br.d it2 = (br.d) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.f23704b;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.f23703a;
                }
            case 2:
                br.d it3 = (br.d) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3.f23704b;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3.f23703a;
                }
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                j.f125466a.H(th3);
                return Unit.f80348a;
        }
    }
}
