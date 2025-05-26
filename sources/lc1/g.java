package lc1;

import android.telephony.PhoneNumberUtils;
import kh2.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import u50.h0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f82864j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f82865k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f82866l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f82867m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f82868n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f82869o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f82870p = new g(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g f82871q = new g(7);

    /* renamed from: r, reason: collision with root package name */
    public static final g f82872r = new g(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f82873i = i13;
    }

    public final ao1.b b(ao1.b it) {
        switch (this.f82873i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.j2(new String[0], j52.c.missing_first_name), null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.j2(new String[0], j52.c.missing_username), null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, h0.f120562a, null, yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(r.f79662c), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String formatNumber = PhoneNumberUtils.formatNumber(r.f79663d, "US");
                if (formatNumber == null) {
                    formatNumber = "";
                }
                return ao1.b.e(it, bs1.c.h2(formatNumber), null, null, bs1.c.j2(new String[0], j52.c.profile_item_phone_hint), null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194286);
        }
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f82873i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.edit), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(r.f79664e), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(r.f79665f), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f82873i) {
            case 0:
                return e((yl1.b) obj);
            case 1:
                return b((ao1.b) obj);
            case 2:
                return b((ao1.b) obj);
            case 3:
                return b((ao1.b) obj);
            case 4:
                return b((ao1.b) obj);
            case 5:
                return e((yl1.b) obj);
            case 6:
                return b((ao1.b) obj);
            case 7:
                return e((yl1.b) obj);
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], j52.c.settings_profile_edit_warning), vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }
}
