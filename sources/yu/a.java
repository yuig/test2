package yu;

import android.view.View;
import i2.o;
import i2.u;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f140134j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f140135k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, int i14, int i15) {
        super(2);
        this.f140133i = i15;
        this.f140134j = i13;
        this.f140135k = i14;
    }

    public final Integer b(View view, int i13) {
        int i14 = this.f140133i;
        int i15 = this.f140135k;
        int i16 = this.f140134j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                if (i13 <= 0) {
                    i15 = i16;
                }
                return Integer.valueOf(i15);
            case 1:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                if (i13 <= 0) {
                    i15 = i16;
                }
                return Integer.valueOf(i15);
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                if (i13 <= 0) {
                    i15 = i16;
                }
                return Integer.valueOf(i15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140133i) {
            case 0:
                return b((View) obj, ((Number) obj2).intValue());
            case 1:
                return b((View) obj, ((Number) obj2).intValue());
            case 2:
                ((Number) obj2).intValue();
                int p13 = u.p(this.f140135k | 1);
                a1.h(this.f140134j, (o) obj, p13);
                return Unit.f80348a;
            default:
                return b((View) obj, ((Number) obj2).intValue());
        }
    }
}
