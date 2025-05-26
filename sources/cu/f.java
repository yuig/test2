package cu;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class f extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f53189j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f53190k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f53191l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f53192m = new f(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53193i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(0);
        this.f53193i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f53193i;
        switch (i13) {
            case 0:
                return Unit.f80348a;
            case 1:
                switch (i13) {
                    case 1:
                        return us.c.a();
                    default:
                        return us.c.a();
                }
            case 2:
                switch (i13) {
                    case 1:
                        return us.c.a();
                    default:
                        return us.c.a();
                }
            default:
                return Boolean.valueOf(us.c.a().g());
        }
    }
}
