package kg1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79384i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f79385j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f79386k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f79387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13, long j13, int i14) {
        super(2);
        this.f79384i = i14;
        this.f79385j = bVar;
        this.f79386k = i13;
        this.f79387l = j13;
    }

    public final void b(float f13, float[] matrix) {
        int i13 = this.f79384i;
        long j13 = this.f79387l;
        b bVar = this.f79385j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                bVar.a(this.f79386k, matrix, bVar.f79391d, Long.valueOf(j13), f13);
                break;
            default:
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                bVar.a(this.f79386k, matrix, bVar.f79391d, Long.valueOf(j13), f13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f79384i) {
            case 0:
                b(((Number) obj2).floatValue(), (float[]) obj);
                break;
            default:
                b(((Number) obj2).floatValue(), (float[]) obj);
                break;
        }
        return Unit.f80348a;
    }
}
