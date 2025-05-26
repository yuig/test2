package ac;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1811i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f1812j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1813k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13, int i14) {
        super(1);
        this.f1811i = i14;
        this.f1812j = jVar;
        this.f1813k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j jVar = this.f1812j;
        int i13 = this.f1813k;
        int i14 = this.f1811i;
        switch (i14) {
            case 0:
                long longValue = ((Number) obj).longValue();
                switch (i14) {
                    case 0:
                        return Boolean.valueOf(j.b(jVar, i13, longValue));
                    default:
                        return Boolean.valueOf(j.b(jVar, i13, longValue));
                }
            default:
                long longValue2 = ((Number) obj).longValue();
                switch (i14) {
                    case 0:
                        return Boolean.valueOf(j.b(jVar, i13, longValue2));
                    default:
                        return Boolean.valueOf(j.b(jVar, i13, longValue2));
                }
        }
    }
}
