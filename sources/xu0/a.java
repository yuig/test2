package xu0;

import com.pinterest.api.model.m40;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.g;
import tb0.h;
import tb0.p;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f135923j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f135924k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f135925l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f135926m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f135927i = i13;
    }

    public final String b(m40 t13) {
        switch (this.f135927i) {
            case 1:
                Intrinsics.checkNotNullParameter(t13, "t");
                return String.valueOf(t13.n());
            case 2:
                Intrinsics.checkNotNullParameter(t13, "t");
                String id3 = t13.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                return id3;
            default:
                Intrinsics.checkNotNullParameter(t13, "t");
                return String.valueOf(t13.n());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135927i) {
            case 0:
                HashSet hashSet = h.f117076w;
                g.f117075a.q((Throwable) obj, "PinInterestTaggingPresenter: failed to fetch storyPinLocalData", p.IDEA_PINS_CREATION);
                break;
        }
        return b((m40) obj);
    }
}
