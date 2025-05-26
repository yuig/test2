package wm0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f130238j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f130239k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f130240l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f130241m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f130242n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f130243o = new e(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130244i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(0);
        this.f130244i = i13;
    }

    public final vm0.c b() {
        switch (this.f130244i) {
            case 0:
                c.f130236a.getClass();
                return new vm0.c(b.f130234b, "base-header");
            case 1:
                c.f130236a.getClass();
                return new vm0.c(b.f130235c, "base-tools");
            case 2:
                c.f130236a.getClass();
                return new vm0.c(b.f130234b, "base-header");
            case 3:
                c.f130236a.getClass();
                return new vm0.c(b.f130235c, "base-tools");
            case 4:
                c.f130236a.getClass();
                return new vm0.c(b.f130234b, "organize-header");
            default:
                c.f130236a.getClass();
                return new vm0.c(b.f130235c, "organize-tools");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f130244i) {
        }
        return b();
    }
}
