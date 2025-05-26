package wr1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131019i;

    /* renamed from: j, reason: collision with root package name */
    public static final t0 f131002j = new t0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t0 f131003k = new t0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final t0 f131004l = new t0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final t0 f131005m = new t0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final t0 f131006n = new t0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final t0 f131007o = new t0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final t0 f131008p = new t0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final t0 f131009q = new t0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final t0 f131010r = new t0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final t0 f131011s = new t0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final t0 f131012t = new t0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final t0 f131013u = new t0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final t0 f131014v = new t0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final t0 f131015w = new t0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final t0 f131016x = new t0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final t0 f131017y = new t0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final t0 f131018z = new t0(16);
    public static final t0 A = new t0(17);
    public static final t0 B = new t0(18);
    public static final t0 C = new t0(19);
    public static final t0 D = new t0(20);
    public static final t0 E = new t0(21);
    public static final t0 F = new t0(22);
    public static final t0 G = new t0(23);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i13) {
        super(1);
        this.f131019i = i13;
    }

    public final q b(q it) {
        k kVar = k.f130976a;
        switch (this.f131019i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, m.f130980a, null, null, null, 28);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.NONE, kVar, null, null, null, 28);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADING, null, null, null, null, 28);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, kVar, null, null, null, 28);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADING, null, null, null, null, 28);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, n.f130981a, null, null, null, 28);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, null, null, null, 15);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADING, null, null, null, null, 28);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADING, null, null, null, null, 30);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, null, null, d.f130953a, 15);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADING, null, null, null, null, 30);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, null, null, g.f130968a, 15);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, j.f130974a, null, null, null, 28);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, l.f130978a, null, null, null, 28);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.NONE, null, null, null, e.f130961a, 14);
        }
    }

    public final void e(h32.h0 update) {
        switch (this.f131019i) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.FORGET_PW_LINK;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.HELP_CENTER_LINK;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.GOOGLE_CONTINUE_BUTTON;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.CONTINUE_BUTTON;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.GOOGLE_CONTINUE_BUTTON;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.GOOGLE_CONTINUE_BUTTON;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                update.f67047f = h32.u0.LOGIN_BUTTON;
                break;
            case 22:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.RECOVER_ACCOUNT_VIEW;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131019i) {
            case 0:
                e((h32.h0) obj);
                break;
            case 1:
                e((h32.h0) obj);
                break;
            case 2:
                e((h32.h0) obj);
                break;
            case 3:
                e((h32.h0) obj);
                break;
            case 4:
                e((h32.h0) obj);
                break;
            case 5:
                e((h32.h0) obj);
                break;
            case 6:
                e((h32.h0) obj);
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                e((h32.h0) obj);
                break;
            default:
                e((h32.h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
