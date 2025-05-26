package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class og0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tg0 f9251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f9252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og0(tg0 tg0Var, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f9251b = tg0Var;
        this.f9252c = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new og0(this.f9251b, this.f9252c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new og0(this.f9251b, this.f9252c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:2)|(1:(1:(1:(1:(1:(5:9|10|11|12|13)(2:15|16))(5:17|18|19|12|13))(9:20|21|(1:23)(1:29)|(1:25)(1:28)|(1:27)|18|19|12|13))(11:30|31|(1:33)|21|(0)(0)|(0)(0)|(0)|18|19|12|13))(2:34|35))(2:60|(2:62|63)(3:64|65|(1:67)))|36|37|38|(3:40|41|42)(5:43|44|45|46|(12:48|(1:50)|31|(0)|21|(0)(0)|(0)(0)|(0)|18|19|12|13)(4:51|19|12|13))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "t");
        r12 = ads_mobile_sdk.qs2.a();
        r12.a(r0);
        r12 = r12.f().f6994p;
        r13 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        r13 = r0.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        r12.add(r13);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:17:0x002b, B:18:0x0161, B:20:0x0033, B:21:0x012f, B:28:0x015c, B:29:0x0157, B:30:0x0038, B:31:0x011d, B:34:0x003d, B:36:0x0085, B:38:0x0088, B:40:0x00c2, B:43:0x00d1, B:45:0x00e2, B:46:0x00ef, B:48:0x0101, B:51:0x016c, B:56:0x009b, B:58:0x00b4, B:59:0x00bc, B:65:0x0075), top: B:2:0x000f, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:17:0x002b, B:18:0x0161, B:20:0x0033, B:21:0x012f, B:28:0x015c, B:29:0x0157, B:30:0x0038, B:31:0x011d, B:34:0x003d, B:36:0x0085, B:38:0x0088, B:40:0x00c2, B:43:0x00d1, B:45:0x00e2, B:46:0x00ef, B:48:0x0101, B:51:0x016c, B:56:0x009b, B:58:0x00b4, B:59:0x00bc, B:65:0x0075), top: B:2:0x000f, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.og0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
