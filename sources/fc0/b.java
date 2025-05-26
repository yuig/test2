package fc0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f61680j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f61681k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f61682l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61683i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f61683i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f61683i) {
            case 0:
                return new a();
            case 1:
                return h.f61705e;
            default:
                return i.f61709b;
        }
    }
}
