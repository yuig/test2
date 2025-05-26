package gi1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.u;
import pb0.g;
import sh.f;
import so.oa;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f65153j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f65154k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f65155l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f65156m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65157i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f65157i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f65157i) {
            case 0:
                return (o20.a) ((oa) qt1.c.a()).f113858p8.get();
            case 1:
                return u.f85943a;
            case 2:
                return f.a();
            default:
                return g.f99432a;
        }
    }
}
