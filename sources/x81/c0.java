package x81;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f134170j = new c0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f134171k = new c0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f134172l = new c0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f134173m = new c0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f134174n = new c0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f134175o = new c0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f134176p = new c0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f134177q = new c0(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134178i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i13) {
        super(1);
        this.f134178i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f134178i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(""), false, null, null, null, null, null, null, 0, null, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.lens_enable_camera_access_btn), false, null, null, null, null, null, null, 0, null, 1022);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.save_pin), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.ar_try_on_camera_permission_btn), false, null, null, null, null, null, null, 0, null, 1022);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.ar_try_on_gallery_permission_btn), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.ar_try_on_face_not_detected_btn), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f134178i;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 6:
                        th3.getMessage();
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 6:
                        th4.getMessage();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
