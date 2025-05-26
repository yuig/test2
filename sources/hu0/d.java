package hu0;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import tb0.h;
import tb0.p;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f70401j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f70402k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f70403l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f70404m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f70405n = new d(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70406i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f70406i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f70406i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.cancel), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70406i;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 2:
                        HashSet hashSet = h.f117076w;
                        tb0.g.f117075a.q(th3, "IdeaPinCoverImagePickerPresenter: Failed to generate adjusted image", p.IDEA_PINS_CREATION);
                        break;
                }
                break;
            case 3:
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 2:
                        HashSet hashSet2 = h.f117076w;
                        tb0.g.f117075a.q(th4, "IdeaPinCoverImagePickerPresenter: Failed to generate adjusted image", p.IDEA_PINS_CREATION);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
