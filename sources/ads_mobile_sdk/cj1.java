package ads_mobile_sdk;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class cj1 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f3931a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f3932b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3933c;

    /* renamed from: d, reason: collision with root package name */
    public int f3934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj1 f3935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f3936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj1(dj1 dj1Var, String str, bl2.c cVar) {
        super(1, cVar);
        this.f3935e = dj1Var;
        this.f3936f = str;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new cj1(this.f3935e, this.f3936f, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new cj1(this.f3935e, this.f3936f, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2 A[Catch: all -> 0x01b9, TRY_LEAVE, TryCatch #9 {all -> 0x01b9, blocks: (B:89:0x01a2, B:91:0x01a9, B:93:0x01b0, B:95:0x01b4, B:97:0x01b8, B:98:0x01bc, B:99:0x01c1, B:100:0x01c2, B:101:0x01c9, B:102:0x01ca, B:103:0x01d1, B:104:0x01d2), top: B:88:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #5 {all -> 0x00f7, blocks: (B:18:0x00e0, B:22:0x00ea, B:24:0x00ee, B:27:0x00fa, B:28:0x00ff), top: B:17:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: all -> 0x011d, TryCatch #11 {all -> 0x011d, blocks: (B:32:0x0106, B:34:0x010d, B:36:0x0114, B:38:0x0118, B:40:0x011c, B:41:0x0120, B:42:0x0125, B:43:0x0126, B:44:0x012d, B:45:0x012e, B:46:0x0135, B:47:0x0136), top: B:31:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #11 {all -> 0x011d, blocks: (B:32:0x0106, B:34:0x010d, B:36:0x0114, B:38:0x0118, B:40:0x011c, B:41:0x0120, B:42:0x0125, B:43:0x0126, B:44:0x012d, B:45:0x012e, B:46:0x0135, B:47:0x0136), top: B:31:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183 A[Catch: all -> 0x0190, TRY_ENTER, TryCatch #1 {all -> 0x0190, blocks: (B:74:0x0179, B:78:0x0183, B:80:0x0187, B:83:0x0193, B:84:0x0198), top: B:73:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9 A[Catch: all -> 0x01b9, TryCatch #9 {all -> 0x01b9, blocks: (B:89:0x01a2, B:91:0x01a9, B:93:0x01b0, B:95:0x01b4, B:97:0x01b8, B:98:0x01bc, B:99:0x01c1, B:100:0x01c2, B:101:0x01c9, B:102:0x01ca, B:103:0x01d1, B:104:0x01d2), top: B:88:0x01a2 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v21, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v38, types: [ads_mobile_sdk.p12, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
