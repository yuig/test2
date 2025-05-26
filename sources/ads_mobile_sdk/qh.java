package ads_mobile_sdk;

import a.wc;
import a.z1;
import android.content.Context;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qh extends v0 implements wc {

    /* renamed from: j, reason: collision with root package name */
    public final Context f10077j;

    /* renamed from: k, reason: collision with root package name */
    public final a.v7 f10078k;

    /* renamed from: l, reason: collision with root package name */
    public final dz f10079l;

    /* renamed from: m, reason: collision with root package name */
    public final lz2 f10080m;

    /* renamed from: n, reason: collision with root package name */
    public final z1 f10081n;

    /* renamed from: o, reason: collision with root package name */
    public final j0 f10082o;

    /* renamed from: p, reason: collision with root package name */
    public final tp0 f10083p;

    /* renamed from: q, reason: collision with root package name */
    public final hf f10084q;

    /* renamed from: r, reason: collision with root package name */
    public final vi.d f10085r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(Context context, a.o8 adComponentProvider, dz csiTicker, lz2 webViewFactory, z1 refreshListener, j0 uiScope, tp0 htmlUtil, hf appSettings, ss2 traceMetaSet, wi.k baseRequest, h92 requestType, long j13, int i13, r0 adConfiguration, vo commonConfiguration, cf2 serverTransaction, String renderId, vi.d bannerRequest) {
        super(traceMetaSet, baseRequest, requestType, j13, i13, adConfiguration, commonConfiguration, serverTransaction, renderId);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        this.f10077j = context;
        this.f10078k = adComponentProvider;
        this.f10079l = csiTicker;
        this.f10080m = webViewFactory;
        this.f10081n = refreshListener;
        this.f10082o = uiScope;
        this.f10083p = htmlUtil;
        this.f10084q = appSettings;
        this.f10085r = bannerRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0332 A[Catch: all -> 0x0342, TryCatch #0 {all -> 0x0342, blocks: (B:111:0x032b, B:113:0x0332, B:115:0x0339, B:117:0x033d, B:119:0x0341, B:120:0x0345, B:121:0x034a, B:122:0x034b, B:123:0x0352, B:124:0x0353, B:125:0x035a, B:126:0x035b), top: B:110:0x032b }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035b A[Catch: all -> 0x0342, TRY_LEAVE, TryCatch #0 {all -> 0x0342, blocks: (B:111:0x032b, B:113:0x0332, B:115:0x0339, B:117:0x033d, B:119:0x0341, B:120:0x0345, B:121:0x034a, B:122:0x034b, B:123:0x0352, B:124:0x0353, B:125:0x035a, B:126:0x035b), top: B:110:0x032b }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0285 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:25:0x0060, B:27:0x027f, B:29:0x0285), top: B:24:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f8 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:40:0x02f1, B:42:0x02f8, B:44:0x02ff, B:46:0x0303, B:48:0x0307, B:49:0x030b, B:50:0x0310, B:51:0x0311, B:52:0x0318, B:53:0x0319, B:54:0x0320, B:55:0x0321), top: B:39:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0321 A[Catch: all -> 0x0308, TRY_LEAVE, TryCatch #3 {all -> 0x0308, blocks: (B:40:0x02f1, B:42:0x02f8, B:44:0x02ff, B:46:0x0303, B:48:0x0307, B:49:0x030b, B:50:0x0310, B:51:0x0311, B:52:0x0318, B:53:0x0319, B:54:0x0320, B:55:0x0321), top: B:39:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #7 {all -> 0x00af, blocks: (B:94:0x00aa, B:95:0x015f, B:97:0x0165), top: B:93:0x00aa }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [ads_mobile_sdk.ln0, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [ads_mobile_sdk.cs2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // ads_mobile_sdk.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qh.a(boolean, bl2.c):java.lang.Object");
    }

    @Override // a.kb
    public final boolean b() {
        fs0 fs0Var = this.f12268f.H;
        return (fs0Var != null ? fs0Var.f5264a : null) != null;
    }

    @Override // a.wc
    public final hf a() {
        return this.f10084q;
    }
}
