package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class y21 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f13958a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13959b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13960c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13961d;

    /* renamed from: e, reason: collision with root package name */
    public int f13962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f13963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g31 f13965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f13966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f13967j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f13968k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y21(String str, boolean z13, g31 g31Var, boolean z14, j0 j0Var, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f13963f = str;
        this.f13964g = z13;
        this.f13965h = g31Var;
        this.f13966i = z14;
        this.f13967j = j0Var;
        this.f13968k = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y21(this.f13963f, this.f13964g, this.f13965h, this.f13966i, this.f13967j, this.f13968k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y21) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c3 A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #5 {all -> 0x02ca, blocks: (B:100:0x02bd, B:102:0x02c3), top: B:99:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038f A[Catch: all -> 0x039f, TryCatch #11 {all -> 0x039f, blocks: (B:109:0x0388, B:111:0x038f, B:113:0x0396, B:115:0x039a, B:117:0x039e, B:118:0x03a2, B:119:0x03a7, B:120:0x03a8, B:121:0x03af, B:122:0x03b0, B:123:0x03b7, B:124:0x03b8), top: B:108:0x0388 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0327 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:8:0x0023, B:9:0x0321, B:11:0x0327), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b8 A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #11 {all -> 0x039f, blocks: (B:109:0x0388, B:111:0x038f, B:113:0x0396, B:115:0x039a, B:117:0x039e, B:118:0x03a2, B:119:0x03a7, B:120:0x03a8, B:121:0x03af, B:122:0x03b0, B:123:0x03b7, B:124:0x03b8), top: B:108:0x0388 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x034f A[Catch: all -> 0x035f, TryCatch #13 {all -> 0x035f, blocks: (B:18:0x0348, B:20:0x034f, B:22:0x0356, B:24:0x035a, B:26:0x035e, B:27:0x0362, B:28:0x0367, B:29:0x0368, B:30:0x036f, B:31:0x0370, B:32:0x0377, B:33:0x0378), top: B:17:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0378 A[Catch: all -> 0x035f, TRY_LEAVE, TryCatch #13 {all -> 0x035f, blocks: (B:18:0x0348, B:20:0x034f, B:22:0x0356, B:24:0x035a, B:26:0x035e, B:27:0x0362, B:28:0x0367, B:29:0x0368, B:30:0x036f, B:31:0x0370, B:32:0x0377, B:33:0x0378), top: B:17:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0252 A[Catch: all -> 0x0259, TRY_LEAVE, TryCatch #7 {all -> 0x0259, blocks: (B:47:0x024c, B:49:0x0252), top: B:46:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026c A[Catch: all -> 0x027c, TryCatch #10 {all -> 0x027c, blocks: (B:69:0x0265, B:71:0x026c, B:73:0x0273, B:75:0x0277, B:77:0x027b, B:78:0x027f, B:79:0x0284, B:80:0x0285, B:81:0x028c, B:82:0x028d, B:83:0x0294, B:84:0x0295), top: B:68:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0295 A[Catch: all -> 0x027c, TRY_LEAVE, TryCatch #10 {all -> 0x027c, blocks: (B:69:0x0265, B:71:0x026c, B:73:0x0273, B:75:0x0277, B:77:0x027b, B:78:0x027f, B:79:0x0284, B:80:0x0285, B:81:0x028c, B:82:0x028d, B:83:0x0294, B:84:0x0295), top: B:68:0x0265 }] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
