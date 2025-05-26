package zv0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import rm1.q;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f142850j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f142851k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f142852l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f142853m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f142854n = new c(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142855i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f142855i = i13;
    }

    public final rm1.d b(rm1.d it) {
        switch (this.f142855i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(q.WORKFLOW_STATUS_WARNING, rm1.i.XXL), rm1.c.LIGHT, fm1.c.VISIBLE, 0, null, 24);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(q.WORKFLOW_STATUS_WARNING, rm1.i.XXL), rm1.c.LIGHT, fm1.c.GONE, 0, null, 24);
        }
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f142855i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.cancel), false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f142855i) {
        }
        return e((yl1.b) obj);
    }
}
