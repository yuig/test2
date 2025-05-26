package rr;

import com.pinterest.framework.screens.ScreenLocation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f109754j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f109755k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f109756l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f109757m = new k(3);

    /* renamed from: n, reason: collision with root package name */
    public static final k f109758n = new k(4);

    /* renamed from: o, reason: collision with root package name */
    public static final k f109759o = new k(5);

    /* renamed from: p, reason: collision with root package name */
    public static final k f109760p = new k(6);

    /* renamed from: q, reason: collision with root package name */
    public static final k f109761q = new k(7);

    /* renamed from: r, reason: collision with root package name */
    public static final k f109762r = new k(8);

    /* renamed from: s, reason: collision with root package name */
    public static final k f109763s = new k(9);

    /* renamed from: t, reason: collision with root package name */
    public static final k f109764t = new k(10);

    /* renamed from: u, reason: collision with root package name */
    public static final k f109765u = new k(11);

    /* renamed from: v, reason: collision with root package name */
    public static final k f109766v = new k(12);

    /* renamed from: w, reason: collision with root package name */
    public static final k f109767w = new k(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109768i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f109768i = i13;
    }

    public final Boolean b(List segments) {
        switch (this.f109768i) {
            case 8:
                Intrinsics.checkNotNullParameter(segments, "segments");
                return Boolean.valueOf(segments.size() == 2 && Intrinsics.d(segments.get(0), "connect") && Intrinsics.d(segments.get(1), "instagram"));
            default:
                Intrinsics.checkNotNullParameter(segments, "segments");
                return Boolean.valueOf(segments.size() == 1 && Intrinsics.d(segments.get(0), "push_settings"));
        }
    }

    public final void e(e2 handler) {
        switch (this.f109768i) {
            case 9:
                Intrinsics.checkNotNullParameter(handler, "handler");
                handler.f109723a.l(null);
                break;
            default:
                Intrinsics.checkNotNullParameter(handler, "handler");
                e2.g(handler, "push_settings", (ScreenLocation) com.pinterest.screens.g1.S.getValue());
                break;
        }
    }

    public final void f(xj2.c cVar) {
        switch (this.f109768i) {
            case 6:
                m60.u.f85943a.d(new of0.a(new mf0.l()));
                break;
            default:
                m60.u.f85943a.d(new of0.a(new mf0.l()));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109768i;
        switch (i13) {
            case 0:
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 2:
                    default:
                        th3.getMessage();
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 2:
                    default:
                        th4.getMessage();
                        break;
                }
                break;
            case 4:
                Throwable th5 = (Throwable) obj;
                switch (i13) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 2:
                    default:
                        th5.getMessage();
                        break;
                }
                break;
            case 5:
                Throwable th6 = (Throwable) obj;
                switch (i13) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 2:
                    default:
                        th6.getMessage();
                        break;
                }
                break;
            case 6:
                f((xj2.c) obj);
                break;
            case 7:
                do1.x bind = (do1.x) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i14 = he0.d.qr_login_scan_again;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.k0 text = new u50.k0(i14, new ArrayList(0));
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f55704a = text;
                break;
            case 8:
                break;
            case 9:
                e((e2) obj);
                break;
            case 10:
                break;
            case 11:
                e((e2) obj);
                break;
            case 12:
                Throwable th7 = (Throwable) obj;
                switch (i13) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 2:
                    default:
                        th7.getMessage();
                        break;
                }
                break;
            default:
                f((xj2.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
