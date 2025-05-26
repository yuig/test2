package np0;

import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f91717j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f91718k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f91719l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91720i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f91720i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f91720i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, yl1.i.b(), null, null, null, 0, null, 1007);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91720i) {
            case 0:
                k11.j it = (k11.j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String saveSessionId = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(saveSessionId, "toString(...)");
                it.getClass();
                Intrinsics.checkNotNullParameter(saveSessionId, "saveSessionId");
                break;
        }
        return b((yl1.b) obj);
    }
}
