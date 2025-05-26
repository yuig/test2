package ac2;

import android.os.Build;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f1941j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f1942k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f1943l = new e(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1944i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(0);
        this.f1944i = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (kotlin.text.StringsKt.E(r0, "SM-N920", false) != false) goto L13;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            r7 = this;
            int r0 = r7.f1944i
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            long r3 = ly1.d.a()
            r5 = 4000000000(0xee6b2800, double:1.9762625834E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1 = r2
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1a:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r4 = "SM-G92"
            boolean r4 = kotlin.text.StringsKt.E(r0, r4, r1)
            if (r4 != 0) goto L34
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r3 = "SM-N920"
            boolean r0 = kotlin.text.StringsKt.E(r0, r3, r1)
            if (r0 == 0) goto L35
        L34:
            r1 = r2
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.e.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1944i) {
            case 0:
                return invoke();
            case 1:
                return kotlin.collections.z0.g(new Pair("X-Pinterest-Device", Build.MODEL), new Pair("X-Pinterest-InstallId", vb0.b.f125448a.a()));
            default:
                return invoke();
        }
    }
}
