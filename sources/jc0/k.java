package jc0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f75411j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f75412k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f75413l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f75414m = new k(3);

    /* renamed from: n, reason: collision with root package name */
    public static final k f75415n = new k(4);

    /* renamed from: o, reason: collision with root package name */
    public static final k f75416o = new k(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75417i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f75417i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f75417i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], ga2.f.done), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], le0.h.action_sheet_close), false, null, null, null, null, null, null, 0, null, 1022);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], le0.h.action_sheet_close), false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return new yl1.b(bs1.c.j2(new String[0], ga2.f.confirm), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new yl1.b(bs1.c.j2(new String[0], ga2.f.confirm), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75417i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                return b((yl1.b) obj);
            case 2:
                return b((yl1.b) obj);
            case 3:
                return b((yl1.b) obj);
            case 4:
                return b((yl1.b) obj);
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
        }
    }
}
