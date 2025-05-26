package ed1;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58555i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f58538j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f58539k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f58540l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f58541m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f58542n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f58543o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f58544p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f58545q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f58546r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f58547s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f58548t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f58549u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f58550v = new c(12);

    /* renamed from: w, reason: collision with root package name */
    public static final c f58551w = new c(13);

    /* renamed from: x, reason: collision with root package name */
    public static final c f58552x = new c(14);

    /* renamed from: y, reason: collision with root package name */
    public static final c f58553y = new c(15);

    /* renamed from: z, reason: collision with root package name */
    public static final c f58554z = new c(16);
    public static final c A = new c(17);
    public static final c B = new c(18);
    public static final c C = new c(19);
    public static final c D = new c(20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f58555i = i13;
    }

    public final Boolean b(os.g it) {
        switch (this.f58555i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.f97486c, "save_link"));
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.f97486c, "com.instagram.android"));
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.f97486c, "com.facebook.katana"));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.f97486c, "com.instagram.android"));
        }
    }

    public final void e(Throwable th3) {
        switch (this.f58555i) {
            case 14:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("SendShareService Fail: useCachedShareContactSuggestions", th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58555i) {
            case 0:
                e((Throwable) obj);
                break;
            case 1:
                e((Throwable) obj);
                break;
            case 2:
                e((Throwable) obj);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                e((Throwable) obj);
                break;
            case 8:
                e((Throwable) obj);
                break;
            case 9:
                e((Throwable) obj);
                break;
            case 10:
                e((Throwable) obj);
                break;
            case 11:
                e((Throwable) obj);
                break;
            case 12:
                e((Throwable) obj);
                break;
            case 13:
                e((Throwable) obj);
                break;
            case 14:
                e((Throwable) obj);
                break;
            case 15:
                e((Throwable) obj);
                break;
            case 16:
                e((Throwable) obj);
                break;
            case 17:
                e((Throwable) obj);
                break;
            case 18:
                ym1.c it = (ym1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = a62.e.swipe_to_share_as_link;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                break;
            case 19:
                Intrinsics.checkNotNullParameter((gm1.c) obj, "<anonymous parameter 0>");
                break;
            default:
                Intrinsics.checkNotNullParameter((ym1.u) obj, "<anonymous parameter 0>");
                break;
        }
        return Unit.f80348a;
    }
}
