package ads_mobile_sdk;

import a.zb;
import android.os.SystemClock;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class tl implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11574a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f11575b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f11576c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11577d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11578e;

    /* renamed from: f, reason: collision with root package name */
    public final mo2.a f11579f;

    /* renamed from: g, reason: collision with root package name */
    public nl f11580g;

    /* renamed from: h, reason: collision with root package name */
    public ol f11581h;

    /* renamed from: i, reason: collision with root package name */
    public ao2.o1 f11582i;

    public tl(long j13, zb clock, j0 backgroundScope, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.f11574a = j13;
        this.f11575b = clock;
        this.f11576c = backgroundScope;
        this.f11577d = z13;
        this.f11578e = z14;
        this.f11579f = mo2.d.a();
    }

    @Override // a.t5
    public final Object a(bl2.c cVar) {
        return a(this, cVar);
    }

    public final ol b() {
        j0 j0Var = this.f11576c;
        pl block = new pl(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        ao2.q0 d2 = kotlin.jvm.internal.j.d(j0Var, context, new dt2(block, null), 2);
        zb zbVar = this.f11575b;
        zn2.b.f142311b.getClass();
        return new ol(d2, zbVar, zn2.b.f142312c);
    }

    public final void c() {
        long j13;
        if (this.f11577d && this.f11582i == null) {
            nl nlVar = this.f11580g;
            if (nlVar != null) {
                long j14 = nlVar.f8271b;
                zn2.a aVar = zn2.b.f142311b;
                this.f11575b.getClass();
                j13 = zn2.b.j(j14, dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS));
            } else {
                j13 = this.f11574a;
            }
            this.f11582i = kotlin.jvm.internal.j.z(this.f11576c, null, null, new sl(j13, this, null), 3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(2:3|(14:5|6|(1:(1:(10:10|11|12|13|14|15|16|(1:18)|20|21)(2:56|57))(1:58))(2:113|(1:115))|59|60|(1:(1:(1:107)(1:108))(1:105))(1:64)|65|(3:93|(1:98)|99)(1:71)|72|73|74|75|76|(6:78|15|16|(0)|20|21)(2:79|(2:81|(1:83)(8:84|13|14|15|16|(0)|20|21))(2:85|86))))|116|6|(0)(0)|59|60|(1:62)|(1:101)|(0)(0)|65|(2:67|69)|93|(8:95|98|72|73|74|75|76|(0)(0))|99|72|73|74|75|76|(0)(0)|(2:(0)|(1:46))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013b, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
    
        r0 = r14;
        r14 = r13;
        r13 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x009a A[Catch: all -> 0x0086, TryCatch #3 {all -> 0x0086, blocks: (B:60:0x0073, B:62:0x007c, B:64:0x0083, B:65:0x009f, B:67:0x00a5, B:69:0x00ac, B:71:0x00b0, B:93:0x00b5, B:95:0x00b9, B:98:0x00c0, B:99:0x00c5, B:101:0x008b, B:103:0x0091, B:105:0x0095, B:107:0x009a, B:108:0x009d), top: B:59:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009d A[Catch: all -> 0x0086, TryCatch #3 {all -> 0x0086, blocks: (B:60:0x0073, B:62:0x007c, B:64:0x0083, B:65:0x009f, B:67:0x00a5, B:69:0x00ac, B:71:0x00b0, B:93:0x00b5, B:95:0x00b9, B:98:0x00c0, B:99:0x00c5, B:101:0x008b, B:103:0x0091, B:105:0x0095, B:107:0x009a, B:108:0x009d), top: B:59:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018b A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:16:0x0186, B:18:0x018b), top: B:15:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a5 A[Catch: all -> 0x01b5, TryCatch #2 {all -> 0x01b5, blocks: (B:26:0x019e, B:28:0x01a5, B:30:0x01ac, B:32:0x01b0, B:34:0x01b4, B:35:0x01b7, B:36:0x01bc, B:37:0x01bd, B:38:0x01c4, B:39:0x01c5, B:40:0x01cc, B:41:0x01cd), top: B:25:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd A[Catch: all -> 0x01b5, TRY_LEAVE, TryCatch #2 {all -> 0x01b5, blocks: (B:26:0x019e, B:28:0x01a5, B:30:0x01ac, B:32:0x01b0, B:34:0x01b4, B:35:0x01b7, B:36:0x01bc, B:37:0x01bd, B:38:0x01c4, B:39:0x01c5, B:40:0x01cc, B:41:0x01cd), top: B:25:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c A[Catch: all -> 0x0138, Exception -> 0x013b, TryCatch #1 {Exception -> 0x013b, blocks: (B:76:0x0128, B:78:0x012c, B:79:0x013d, B:81:0x0141, B:85:0x0165, B:86:0x016a), top: B:75:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d A[Catch: all -> 0x0138, Exception -> 0x013b, TryCatch #1 {Exception -> 0x013b, blocks: (B:76:0x0128, B:78:0x012c, B:79:0x013d, B:81:0x0141, B:85:0x0165, B:86:0x016a), top: B:75:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v30, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.tl r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tl.a(ads_mobile_sdk.tl, bl2.c):java.lang.Object");
    }

    public /* synthetic */ tl(long j13, zb zbVar, j0 j0Var, boolean z13, boolean z14, int i13) {
        this(j13, zbVar, j0Var, z13, z14);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tl.b(bl2.c):java.lang.Object");
    }
}
