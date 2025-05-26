package ads_mobile_sdk;

import android.util.Base64;
import ao2.j0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import nm.s;

/* loaded from: classes2.dex */
public abstract class w32 extends r32 {

    /* renamed from: o, reason: collision with root package name */
    public static final nk0 f12848o = new nk0("The ad has already been shown.", yx0.f14448f);

    /* renamed from: p, reason: collision with root package name */
    public static final nk0 f12849p = new nk0("The ad format requested does not match the ad format specified when generating a Signal.", yx0.f14444b);

    /* renamed from: q, reason: collision with root package name */
    public static final nk0 f12850q = new nk0("The request ID on the ad string does not match the request ID from any valid signal request.", yx0.f14451i);

    /* renamed from: r, reason: collision with root package name */
    public static final nk0 f12851r = new nk0("The ad response was malformed.", yx0.f14450h);

    /* renamed from: k, reason: collision with root package name */
    public final rh2 f12852k;

    /* renamed from: l, reason: collision with root package name */
    public final dv f12853l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12854m;

    /* renamed from: n, reason: collision with root package name */
    public final mo2.a f12855n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w32(rh2 signalGenerationMap, dv cryptoUtil, String adResponse, j0 loadScope, j0 backgroundScope, ss2 traceMetaSet, oh0 flags, sb2 rootTraceCreator, String requestId, h92 requestType, String appId, ws0 inspectorAdLifecycleMonitor) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, requestId, requestType, null, false, appId, inspectorAdLifecycleMonitor);
        Intrinsics.checkNotNullParameter(signalGenerationMap, "signalGenerationMap");
        Intrinsics.checkNotNullParameter(cryptoUtil, "cryptoUtil");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        this.f12852k = signalGenerationMap;
        this.f12853l = cryptoUtil;
        this.f12854m = adResponse;
        this.f12855n = mo2.d.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(4:(1:(1:(1:(9:14|15|16|17|18|19|(1:21)|50|51)(2:55|56))(9:57|58|59|60|61|62|63|64|(2:66|(2:68|(1:70)(7:71|17|18|19|(0)|50|51))(2:72|73))(2:74|75)))(7:89|90|91|92|93|94|(9:111|112|113|114|115|19|(0)|50|51)(3:96|97|(4:99|100|101|(1:103)(6:104|61|62|63|64|(0)(0)))(3:106|107|108))))(7:125|126|127|128|129|130|(7:132|114|115|19|(0)|50|51)(4:133|(2:135|(2:137|(7:139|140|115|19|(0)|50|51)(1:141))(2:150|151))(1:152)|142|(2:144|(1:146)(4:147|93|94|(0)(0)))(2:148|149)))|81|82|83)(4:158|159|160|161))(11:170|171|172|173|174|(5:176|177|(2:179|(5:181|19|(0)|50|51)(1:182))|183|(1:185)(1:186))|188|177|(0)|183|(0)(0))|162|163|(1:165)(4:166|129|130|(0)(0))))|7|(0)(0)|162|163|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034f, code lost:
    
        r5 = r12;
        r6 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x033a: MOVE (r6 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:110:0x0338 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e6 A[Catch: all -> 0x0235, TryCatch #12 {all -> 0x0235, blocks: (B:130:0x01e2, B:132:0x01e6, B:133:0x01f5, B:135:0x01fb, B:137:0x0209, B:139:0x0213, B:141:0x022b, B:142:0x0243, B:144:0x0247, B:148:0x0349, B:149:0x034d, B:150:0x023a, B:151:0x023e, B:152:0x023f), top: B:129:0x01e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f5 A[Catch: all -> 0x0235, TryCatch #12 {all -> 0x0235, blocks: (B:130:0x01e2, B:132:0x01e6, B:133:0x01f5, B:135:0x01fb, B:137:0x0209, B:139:0x0213, B:141:0x022b, B:142:0x0243, B:144:0x0247, B:148:0x0349, B:149:0x034d, B:150:0x023a, B:151:0x023e, B:152:0x023f), top: B:129:0x01e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x013d A[Catch: all -> 0x0135, TryCatch #11 {all -> 0x0135, blocks: (B:172:0x0108, B:174:0x011b, B:176:0x0130, B:177:0x0139, B:179:0x013d, B:181:0x014c, B:182:0x015d, B:183:0x0174), top: B:171:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0318 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #15 {all -> 0x00f8, blocks: (B:19:0x0314, B:21:0x0318, B:160:0x00ed), top: B:159:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0364 A[Catch: all -> 0x0374, TryCatch #10 {all -> 0x0374, blocks: (B:25:0x035d, B:27:0x0364, B:29:0x036b, B:31:0x036f, B:33:0x0373, B:35:0x0377, B:36:0x037c, B:37:0x037d, B:38:0x0384, B:39:0x0385, B:40:0x038c, B:41:0x038d), top: B:24:0x035d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x038d A[Catch: all -> 0x0374, TRY_LEAVE, TryCatch #10 {all -> 0x0374, blocks: (B:25:0x035d, B:27:0x0364, B:29:0x036b, B:31:0x036f, B:33:0x0373, B:35:0x0377, B:36:0x037c, B:37:0x037d, B:38:0x0384, B:39:0x0385, B:40:0x038c, B:41:0x038d), top: B:24:0x035d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ee A[Catch: all -> 0x0326, TryCatch #1 {all -> 0x0326, blocks: (B:64:0x02e4, B:66:0x02ee, B:68:0x02f4, B:72:0x032a, B:73:0x032e, B:74:0x032f, B:75:0x0333), top: B:63:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x032f A[Catch: all -> 0x0326, TryCatch #1 {all -> 0x0326, blocks: (B:64:0x02e4, B:66:0x02ee, B:68:0x02f4, B:72:0x032a, B:73:0x032e, B:74:0x032f, B:75:0x0333), top: B:63:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b1 A[Catch: all -> 0x033d, TRY_ENTER, TryCatch #17 {all -> 0x033d, blocks: (B:94:0x028e, B:96:0x02b1, B:99:0x02bc), top: B:93:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ads_mobile_sdk.cs2, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.w32 r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w32.a(ads_mobile_sdk.w32, bl2.c):java.lang.Object");
    }

    public abstract Object a(String str, mh2 mh2Var, v32 v32Var);

    @Override // ads_mobile_sdk.r32
    public final Object b(bl2.c cVar) {
        return a(this, cVar);
    }

    public static Pair a(String str) {
        try {
            s v13 = ((nm.u) new nm.o().b(nm.u.class, str)).v("render_id");
            String p13 = v13 != null ? v13.p() : null;
            if (p13 == null) {
                p13 = "";
            }
            try {
                byte[] decode = Base64.decode(p13, 0);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                List V = StringsKt.V(new String(decode, Charsets.UTF_8), new char[]{':'});
                if (V.size() == 2) {
                    return new Pair(V.get(0), Integer.valueOf(Integer.parseInt((String) V.get(1))));
                }
                return new Pair(null, 0);
            } catch (Exception unused) {
                return new Pair(null, 0);
            }
        } catch (Exception unused2) {
            return new Pair(null, 0);
        }
    }
}
