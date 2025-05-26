package wg1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129875i;

    /* renamed from: j, reason: collision with root package name */
    public static final y f129858j = new y(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y f129859k = new y(1);

    /* renamed from: l, reason: collision with root package name */
    public static final y f129860l = new y(2);

    /* renamed from: m, reason: collision with root package name */
    public static final y f129861m = new y(3);

    /* renamed from: n, reason: collision with root package name */
    public static final y f129862n = new y(4);

    /* renamed from: o, reason: collision with root package name */
    public static final y f129863o = new y(5);

    /* renamed from: p, reason: collision with root package name */
    public static final y f129864p = new y(6);

    /* renamed from: q, reason: collision with root package name */
    public static final y f129865q = new y(7);

    /* renamed from: r, reason: collision with root package name */
    public static final y f129866r = new y(8);

    /* renamed from: s, reason: collision with root package name */
    public static final y f129867s = new y(9);

    /* renamed from: t, reason: collision with root package name */
    public static final y f129868t = new y(10);

    /* renamed from: u, reason: collision with root package name */
    public static final y f129869u = new y(11);

    /* renamed from: v, reason: collision with root package name */
    public static final y f129870v = new y(12);

    /* renamed from: w, reason: collision with root package name */
    public static final y f129871w = new y(13);

    /* renamed from: x, reason: collision with root package name */
    public static final y f129872x = new y(14);

    /* renamed from: y, reason: collision with root package name */
    public static final y f129873y = new y(15);

    /* renamed from: z, reason: collision with root package name */
    public static final y f129874z = new y(16);
    public static final y A = new y(17);
    public static final y B = new y(18);
    public static final y C = new y(19);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13) {
        super(1);
        this.f129875i = i13;
    }

    public final om1.c b(om1.c state) {
        switch (this.f129875i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                rm1.q qVar = rm1.q.ELLIPSIS;
                int i13 = i82.f.spotlight_ad_pin_content_description_overflow;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return om1.c.e(state, qVar, null, null, null, new k0(i13, new ArrayList(0)), false, 0, 1006);
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                rm1.q qVar2 = rm1.q.MUTE_FILL;
                int i14 = i82.f.spotlight_ad_pin_content_description_sound;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return om1.c.e(state, qVar2, null, null, null, new k0(i14, new ArrayList(0)), false, 0, 1006);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return om1.c.e(state, rm1.q.MUTE, null, null, null, null, false, 0, 1022);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f129875i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 10:
            case 12:
            case 16:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f129875i;
        switch (i13) {
            case 10:
                sl1.i it = (sl1.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 12:
                switch (i13) {
                }
            case 16:
                switch (i13) {
                }
        }
        return e((rn1.a) obj);
    }
}
