package nt;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final r1 f92161j = new r1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r1 f92162k = new r1(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(int i13) {
        super(2);
        this.f92163i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f92163i) {
            case 0:
                m91.b country = (m91.b) obj;
                String text = (String) obj2;
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(text, "text");
                boolean d2 = Intrinsics.d(country.f86724d, text);
                country.f86725e = d2;
                return Boolean.valueOf(d2);
            default:
                ju.i month = (ju.i) obj;
                String text2 = (String) obj2;
                Intrinsics.checkNotNullParameter(month, "month");
                Intrinsics.checkNotNullParameter(text2, "text");
                boolean z13 = month.f77608a == ju.h.valueOf(text2);
                month.f77609b = z13;
                return Boolean.valueOf(z13);
        }
    }
}
