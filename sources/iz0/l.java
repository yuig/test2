package iz0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f73924j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f73925k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f73926l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f73927i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73927i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = iy1.f.pear_quiz_pin_feed_header;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i13, new ArrayList(0)), null, null, null, vn1.g.HEADING_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 1:
                return Unit.f80348a;
            default:
                b it2 = (b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return b.e(it2, null, yk1.i.LOADED, 1);
        }
    }
}
