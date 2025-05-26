package rr;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109840i;

    /* renamed from: j, reason: collision with root package name */
    public static final q1 f109823j = new q1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q1 f109824k = new q1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q1 f109825l = new q1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final q1 f109826m = new q1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final q1 f109827n = new q1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final q1 f109828o = new q1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final q1 f109829p = new q1(6);

    /* renamed from: q, reason: collision with root package name */
    public static final q1 f109830q = new q1(7);

    /* renamed from: r, reason: collision with root package name */
    public static final q1 f109831r = new q1(8);

    /* renamed from: s, reason: collision with root package name */
    public static final q1 f109832s = new q1(9);

    /* renamed from: t, reason: collision with root package name */
    public static final q1 f109833t = new q1(10);

    /* renamed from: u, reason: collision with root package name */
    public static final q1 f109834u = new q1(11);

    /* renamed from: v, reason: collision with root package name */
    public static final q1 f109835v = new q1(12);

    /* renamed from: w, reason: collision with root package name */
    public static final q1 f109836w = new q1(13);

    /* renamed from: x, reason: collision with root package name */
    public static final q1 f109837x = new q1(14);

    /* renamed from: y, reason: collision with root package name */
    public static final q1 f109838y = new q1(15);

    /* renamed from: z, reason: collision with root package name */
    public static final q1 f109839z = new q1(16);
    public static final q1 A = new q1(17);
    public static final q1 B = new q1(18);
    public static final q1 C = new q1(19);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(int i13) {
        super(1);
        this.f109840i = i13;
    }

    public final Boolean b(List segments) {
        boolean z13 = false;
        switch (this.f109840i) {
            case 0:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 3 && Intrinsics.d(segments.get(1), "autopublish") && Intrinsics.d(segments.get(2), "instagram")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            default:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 2 && Intrinsics.d(segments.get(1), "security")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 2:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 2 && Intrinsics.d(segments.get(1), "change_password")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 4:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() > 1 && Intrinsics.d(segments.get(1), "claim") && (segments.size() == 2 || Intrinsics.d(segments.get(2), "instagram"))) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 6:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 4 && Intrinsics.d(segments.get(1), "claim") && Intrinsics.d(segments.get(2), "instagram") && Intrinsics.d(segments.get(3), "reconnect")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 8:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 2 && Intrinsics.d(segments.get(1), "edit_settings")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 10:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 2 && Intrinsics.d(segments.get(1), "login_options")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 12:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 1 && e2.f109738i.contains(segments.get(0))) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 14:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 2 && Intrinsics.d(segments.get(1), "privacy_data")) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 16:
                Intrinsics.checkNotNullParameter(segments, "segments");
                if (segments.size() == 2 && e2.f109739j.contains(segments.get(1))) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
        }
    }

    public final void e(e2 handler) {
        switch (this.f109840i) {
            case 1:
                Intrinsics.checkNotNullParameter(handler, "handler");
                handler.f109740g = "auto_publish";
                NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.D());
                w13.m0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE", e82.w.INSTAGRAM.getApiParam());
                handler.f109723a.m(w13);
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            default:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "security", (ScreenLocation) com.pinterest.screens.g1.U.getValue());
                break;
            case 3:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "change_password", (ScreenLocation) com.pinterest.screens.g1.P.getValue());
                break;
            case 5:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.h(handler, false);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.h(handler, true);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "edit_settings", (ScreenLocation) com.pinterest.screens.g1.L.getValue());
                break;
            case 11:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "login_options", (ScreenLocation) com.pinterest.screens.g1.N.getValue());
                break;
            case 13:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "settings", com.pinterest.screens.g1.E());
                break;
            case 15:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "privacy_data", (ScreenLocation) com.pinterest.screens.g1.Q.getValue());
                break;
            case 17:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "profile_visibility", (ScreenLocation) com.pinterest.screens.g1.R.getValue());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109840i) {
            case 0:
                return b((List) obj);
            case 1:
                e((e2) obj);
                return Unit.f80348a;
            case 2:
                return b((List) obj);
            case 3:
                e((e2) obj);
                return Unit.f80348a;
            case 4:
                return b((List) obj);
            case 5:
                e((e2) obj);
                return Unit.f80348a;
            case 6:
                return b((List) obj);
            case 7:
                e((e2) obj);
                return Unit.f80348a;
            case 8:
                return b((List) obj);
            case 9:
                e((e2) obj);
                return Unit.f80348a;
            case 10:
                return b((List) obj);
            case 11:
                e((e2) obj);
                return Unit.f80348a;
            case 12:
                return b((List) obj);
            case 13:
                e((e2) obj);
                return Unit.f80348a;
            case 14:
                return b((List) obj);
            case 15:
                e((e2) obj);
                return Unit.f80348a;
            case 16:
                return b((List) obj);
            case 17:
                e((e2) obj);
                return Unit.f80348a;
            case 18:
                return b((List) obj);
            default:
                e((e2) obj);
                return Unit.f80348a;
        }
    }
}
