package di1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f55055j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f55056k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f55057l = new e(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55058i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f55058i = i13;
    }

    public final rm1.d b(rm1.d icon) {
        switch (this.f55058i) {
            case 0:
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(q.PLAY, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            case 1:
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(q.PAUSE, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(q.MINIMIZE, rm1.i.SM), rm1.c.LIGHT, null, 0, null, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f55058i) {
        }
        return b((rm1.d) obj);
    }
}
