package k1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f77960j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f77961k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(long j13, Object obj, int i13) {
        super(1);
        this.f77959i = i13;
        this.f77960j = j13;
        this.f77961k = obj;
    }

    public final void b(ei2.v captureSpanData) {
        int i13 = this.f77959i;
        long j13 = this.f77960j;
        Object obj = this.f77961k;
        switch (i13) {
            case 9:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                oi2.b bVar = ((bg2.e) obj).f22794e;
                if (bVar != null) {
                    ((ei2.k) bVar).s(null, Long.valueOf(j13));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                oi2.b bVar2 = ((lg2.d) obj).f83283h;
                if (bVar2 != null) {
                    ((ei2.k) bVar2).s(null, Long.valueOf(j13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x034e, code lost:
    
        if (r0 == null) goto L121;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.p.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, long j13, int i13) {
        super(1);
        this.f77959i = i13;
        this.f77961k = obj;
        this.f77960j = j13;
    }
}
