package ads_mobile_sdk;

import ao2.j0;
import co2.z;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class jg1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6802a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6803b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6804c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6805d;

    /* renamed from: e, reason: collision with root package name */
    public cs2 f6806e;

    /* renamed from: f, reason: collision with root package name */
    public Closeable f6807f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6808g;

    /* renamed from: h, reason: collision with root package name */
    public a.zc f6809h;

    /* renamed from: i, reason: collision with root package name */
    public int f6810i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ng1 f6811j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6812k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6813l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nm.q f6814m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f6815n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg1(ng1 ng1Var, int i13, int i14, nm.q qVar, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f6811j = ng1Var;
        this.f6812k = i13;
        this.f6813l = i14;
        this.f6814m = qVar;
        this.f6815n = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new jg1(this.f6811j, this.f6812k, this.f6813l, this.f6814m, this.f6815n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jg1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0066: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:195:0x0066 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00f8: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:198:0x00f8 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0067: MOVE (r3 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:195:0x0066 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00f9: MOVE (r3 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:198:0x00f8 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b A[Catch: all -> 0x025b, TryCatch #14 {all -> 0x025b, blocks: (B:108:0x0244, B:110:0x024b, B:112:0x0252, B:114:0x0256, B:116:0x025a, B:117:0x025e, B:118:0x0263, B:119:0x0264, B:120:0x026b, B:121:0x026c, B:122:0x0273, B:123:0x0274), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0274 A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #14 {all -> 0x025b, blocks: (B:108:0x0244, B:110:0x024b, B:112:0x0252, B:114:0x0256, B:116:0x025a, B:117:0x025e, B:118:0x0263, B:119:0x0264, B:120:0x026b, B:121:0x026c, B:122:0x0273, B:123:0x0274), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0368 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:9:0x0028, B:10:0x0362, B:12:0x0368, B:19:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x017e A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #16 {all -> 0x019e, blocks: (B:153:0x0178, B:155:0x017e), top: B:152:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0338 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x037a A[Catch: all -> 0x038a, TryCatch #6 {all -> 0x038a, blocks: (B:30:0x0373, B:32:0x037a, B:34:0x0381, B:36:0x0385, B:38:0x0389, B:39:0x038d, B:40:0x0392, B:41:0x0393, B:42:0x039a, B:43:0x039b, B:44:0x03a2, B:45:0x03a3), top: B:29:0x0373 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03a3 A[Catch: all -> 0x038a, TRY_LEAVE, TryCatch #6 {all -> 0x038a, blocks: (B:30:0x0373, B:32:0x037a, B:34:0x0381, B:36:0x0385, B:38:0x0389, B:39:0x038d, B:40:0x0392, B:41:0x0393, B:42:0x039a, B:43:0x039b, B:44:0x03a2, B:45:0x03a3), top: B:29:0x0373 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0320 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0303 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7 A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #5 {all -> 0x02c8, blocks: (B:75:0x02a1, B:77:0x02a7), top: B:74:0x02a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #10 {all -> 0x00d3, blocks: (B:89:0x00ba, B:90:0x0234, B:92:0x023a, B:97:0x00cb), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ads_mobile_sdk.cs2, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ads_mobile_sdk.cs2, ads_mobile_sdk.p12, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
