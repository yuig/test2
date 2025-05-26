package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ud1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12027a;

    /* renamed from: b, reason: collision with root package name */
    public vd1 f12028b;

    /* renamed from: c, reason: collision with root package name */
    public ym0 f12029c;

    /* renamed from: d, reason: collision with root package name */
    public String f12030d;

    /* renamed from: e, reason: collision with root package name */
    public String f12031e;

    /* renamed from: f, reason: collision with root package name */
    public Context f12032f;

    /* renamed from: g, reason: collision with root package name */
    public cs2 f12033g;

    /* renamed from: h, reason: collision with root package name */
    public cs2 f12034h;

    /* renamed from: i, reason: collision with root package name */
    public int f12035i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vd1 f12036j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f12037k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ym0 f12038l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12039m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f12040n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f12041o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(vd1 vd1Var, String str, ym0 ym0Var, String str2, String str3, Context context, bl2.c cVar) {
        super(2, cVar);
        this.f12036j = vd1Var;
        this.f12037k = str;
        this.f12038l = ym0Var;
        this.f12039m = str2;
        this.f12040n = str3;
        this.f12041o = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ud1(this.f12036j, this.f12037k, this.f12038l, this.f12039m, this.f12040n, this.f12041o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ud1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01bb A[Catch: all -> 0x0034, Exception -> 0x01cc, TryCatch #1 {Exception -> 0x01cc, blocks: (B:11:0x01b5, B:13:0x01bb, B:22:0x01d0, B:24:0x01d4, B:26:0x01ea, B:28:0x01f3, B:29:0x0206), top: B:10:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x022b A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #8 {all -> 0x0034, blocks: (B:8:0x0024, B:11:0x01b5, B:13:0x01bb, B:14:0x0225, B:16:0x022b, B:22:0x01d0, B:24:0x01d4, B:26:0x01ea, B:28:0x01f3, B:29:0x0206, B:34:0x0216), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d0 A[Catch: all -> 0x0034, Exception -> 0x01cc, TryCatch #1 {Exception -> 0x01cc, blocks: (B:11:0x01b5, B:13:0x01bb, B:22:0x01d0, B:24:0x01d4, B:26:0x01ea, B:28:0x01f3, B:29:0x0206), top: B:10:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0240 A[Catch: all -> 0x0250, TryCatch #6 {all -> 0x0250, blocks: (B:40:0x0239, B:42:0x0240, B:44:0x0247, B:46:0x024b, B:48:0x024f, B:49:0x0253, B:50:0x0258, B:51:0x0259, B:52:0x0260, B:53:0x0261, B:54:0x0268, B:55:0x0269), top: B:39:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0269 A[Catch: all -> 0x0250, TRY_LEAVE, TryCatch #6 {all -> 0x0250, blocks: (B:40:0x0239, B:42:0x0240, B:44:0x0247, B:46:0x024b, B:48:0x024f, B:49:0x0253, B:50:0x0258, B:51:0x0259, B:52:0x0260, B:53:0x0261, B:54:0x0268, B:55:0x0269), top: B:39:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9 A[Catch: all -> 0x0061, Exception -> 0x00da, TryCatch #0 {all -> 0x0061, blocks: (B:68:0x0052, B:71:0x00c3, B:73:0x00c9, B:74:0x0133, B:76:0x0139, B:79:0x00de, B:81:0x00e2, B:83:0x00f8, B:85:0x0101, B:86:0x0114, B:91:0x0124), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:68:0x0052, B:71:0x00c3, B:73:0x00c9, B:74:0x0133, B:76:0x0139, B:79:0x00de, B:81:0x00e2, B:83:0x00f8, B:85:0x0101, B:86:0x0114, B:91:0x0124), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de A[Catch: all -> 0x0061, Exception -> 0x00da, TryCatch #0 {all -> 0x0061, blocks: (B:68:0x0052, B:71:0x00c3, B:73:0x00c9, B:74:0x0133, B:76:0x0139, B:79:0x00de, B:81:0x00e2, B:83:0x00f8, B:85:0x0101, B:86:0x0114, B:91:0x0124), top: B:2:0x000e }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ud1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
