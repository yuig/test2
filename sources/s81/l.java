package s81;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f111908j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f111909k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f111910l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111911i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f111911i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f111911i) {
            case 0:
                break;
            case 1:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.h("LensPresenter: failure to upload the Lens history image, error: " + th3);
                break;
            default:
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.h("LensPresenter: failure to upload the Lens history image, error: " + th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111911i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
