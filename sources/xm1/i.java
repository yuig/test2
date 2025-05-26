package xm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f135375j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f135376k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f135377l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f135378m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f135379n = new i(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135380i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f135380i = i13;
    }

    public final em1.d b(em1.d state) {
        switch (this.f135380i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return em1.d.e(state, h.f135374a[state.f59598a.ordinal()] == 1 ? em1.b.UNCHECKED : em1.b.CHECKED, null, null, null, null, null, 0, null, false, 0, 1022);
            default:
                Intrinsics.checkNotNullParameter(state, "checkBoxState");
                return em1.d.e(state, null, null, fm1.c.GONE, null, null, null, 0, null, false, 0, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135380i) {
            case 0:
                return b((em1.d) obj);
            case 1:
                cm1.d buttonGroupState = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(buttonGroupState, "buttonGroupState");
                return cm1.d.e(buttonGroupState, null, null, null, null, fm1.c.GONE, 95);
            case 2:
                rm1.d titleIconState = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(titleIconState, "titleIconState");
                return rm1.d.e(titleIconState, null, null, fm1.c.GONE, 0, null, 27);
            case 3:
                return b((em1.d) obj);
            default:
                yl1.b buttonState = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                return yl1.b.f(buttonState, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
        }
    }
}
