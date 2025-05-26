package bi1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f22852j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f22853k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f22854l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22855i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f22855i = i13;
    }

    public final rm1.d b(rm1.d it) {
        switch (this.f22855i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.PLAY, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.PAUSE, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.MINIMIZE, rm1.i.SM), rm1.c.LIGHT, null, 0, null, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f22855i) {
        }
        return b((rm1.d) obj);
    }
}
