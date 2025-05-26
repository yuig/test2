package ads_mobile_sdk;

import a.lc;
import ads_mobile_sdk.t60;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kh2.c3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class t60 {

    /* renamed from: q, reason: collision with root package name */
    public static final Uri f11407q = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f11408a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f11409b;

    /* renamed from: c, reason: collision with root package name */
    public final sb2 f11410c;

    /* renamed from: d, reason: collision with root package name */
    public final a.j3 f11411d;

    /* renamed from: e, reason: collision with root package name */
    public final x f11412e;

    /* renamed from: f, reason: collision with root package name */
    public final oh0 f11413f;

    /* renamed from: g, reason: collision with root package name */
    public final cm0 f11414g;

    /* renamed from: h, reason: collision with root package name */
    public final fg f11415h;

    /* renamed from: i, reason: collision with root package name */
    public final yp0 f11416i;

    /* renamed from: j, reason: collision with root package name */
    public final ku0 f11417j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f11418k;

    /* renamed from: l, reason: collision with root package name */
    public String f11419l;

    /* renamed from: m, reason: collision with root package name */
    public String f11420m;

    /* renamed from: n, reason: collision with root package name */
    public nm.u f11421n;

    /* renamed from: o, reason: collision with root package name */
    public ss2 f11422o;

    /* renamed from: p, reason: collision with root package name */
    public String f11423p;

    public t60(CoroutineContext uiContext, j0 backgroundScope, sb2 rootTraceCreator, a.j3 traceLogger, x activityTracker, oh0 flags, cm0 gmaUtil, fg appState, yp0 httpClient, ku0 inspectorManager, String afmaVersion) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        this.f11408a = uiContext;
        this.f11409b = backgroundScope;
        this.f11410c = rootTraceCreator;
        this.f11411d = traceLogger;
        this.f11412e = activityTracker;
        this.f11413f = flags;
        this.f11414g = gmaUtil;
        this.f11415h = appState;
        this.f11416i = httpClient;
        this.f11417j = inspectorManager;
        this.f11418k = new AtomicBoolean(false);
        this.f11422o = c3.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0371 A[Catch: all -> 0x009a, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x009a, blocks: (B:125:0x008f, B:127:0x02bc, B:130:0x02d5, B:132:0x02d9, B:136:0x0371), top: B:124:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0230 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #3 {all -> 0x00a9, blocks: (B:141:0x00a4, B:142:0x022a, B:144:0x0230, B:147:0x00b3, B:148:0x0204), top: B:8:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fc A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #5 {all -> 0x020c, blocks: (B:156:0x01e6, B:159:0x01ef, B:164:0x01fc), top: B:155:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x038c A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:14:0x003f, B:15:0x0386, B:17:0x038c, B:80:0x004e, B:81:0x0361), top: B:8:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0215 A[Catch: all -> 0x00fe, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x00fe, blocks: (B:192:0x00f4, B:194:0x0160, B:197:0x0179, B:199:0x017d, B:203:0x0215), top: B:191:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03a3 A[Catch: all -> 0x03b3, TryCatch #12 {all -> 0x03b3, blocks: (B:25:0x039c, B:27:0x03a3, B:29:0x03aa, B:31:0x03ae, B:33:0x03b2, B:34:0x03b6, B:35:0x03bb, B:36:0x03bc, B:37:0x03c3, B:38:0x03c4, B:39:0x03cb, B:40:0x03cc), top: B:24:0x039c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03cc A[Catch: all -> 0x03b3, TRY_LEAVE, TryCatch #12 {all -> 0x03b3, blocks: (B:25:0x039c, B:27:0x03a3, B:29:0x03aa, B:31:0x03ae, B:33:0x03b2, B:34:0x03b6, B:35:0x03bb, B:36:0x03bc, B:37:0x03c3, B:38:0x03c4, B:39:0x03cb, B:40:0x03cc), top: B:24:0x039c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0245 A[Catch: all -> 0x0255, TryCatch #15 {all -> 0x0255, blocks: (B:55:0x023e, B:57:0x0245, B:59:0x024c, B:61:0x0250, B:63:0x0254, B:64:0x0258, B:65:0x025d, B:66:0x025e, B:67:0x0265, B:68:0x0266, B:69:0x026d, B:70:0x026e), top: B:54:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026e A[Catch: all -> 0x0255, TRY_LEAVE, TryCatch #15 {all -> 0x0255, blocks: (B:55:0x023e, B:57:0x0245, B:59:0x024c, B:61:0x0250, B:63:0x0254, B:64:0x0258, B:65:0x025d, B:66:0x025e, B:67:0x0265, B:68:0x0266, B:69:0x026d, B:70:0x026e), top: B:54:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035a A[Catch: all -> 0x0368, TRY_LEAVE, TryCatch #2 {all -> 0x0368, blocks: (B:89:0x0343, B:92:0x034d, B:97:0x035a), top: B:88:0x0343 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26, types: [ads_mobile_sdk.t60, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v49, types: [ads_mobile_sdk.t60, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ads_mobile_sdk.cs2, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ads_mobile_sdk.p12, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r9v5, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.t60 r17, bl2.c r18) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.a(ads_mobile_sdk.t60, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x010c, code lost:
    
        if (r1.a(r4, r12, r6) == r0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01db, code lost:
    
        if (r12 == r0) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011b A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:107:0x005b, B:108:0x0115, B:110:0x011b), top: B:106:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d1 A[Catch: all -> 0x00f1, TryCatch #4 {all -> 0x00f1, blocks: (B:120:0x00cb, B:122:0x00d1, B:128:0x00eb, B:129:0x00f3, B:131:0x00f7), top: B:119:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f3 A[Catch: all -> 0x00f1, TryCatch #4 {all -> 0x00f1, blocks: (B:120:0x00cb, B:122:0x00d1, B:128:0x00eb, B:129:0x00f3, B:131:0x00f7), top: B:119:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e9 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #9 {all -> 0x003a, blocks: (B:14:0x0035, B:15:0x01e3, B:17:0x01e9), top: B:13:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0201 A[Catch: all -> 0x0211, TryCatch #5 {all -> 0x0211, blocks: (B:26:0x01fa, B:28:0x0201, B:30:0x0208, B:32:0x020c, B:34:0x0210, B:35:0x0213, B:36:0x0218, B:37:0x0219, B:38:0x0220, B:39:0x0221, B:40:0x0228, B:41:0x0229), top: B:25:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0229 A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #5 {all -> 0x0211, blocks: (B:26:0x01fa, B:28:0x0201, B:30:0x0208, B:32:0x020c, B:34:0x0210, B:35:0x0213, B:36:0x0218, B:37:0x0219, B:38:0x0220, B:39:0x0221, B:40:0x0228, B:41:0x0229), top: B:25:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133 A[Catch: all -> 0x0143, TryCatch #7 {all -> 0x0143, blocks: (B:56:0x012c, B:58:0x0133, B:60:0x013a, B:62:0x013e, B:64:0x0142, B:65:0x0145, B:66:0x014a, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b), top: B:55:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #7 {all -> 0x0143, blocks: (B:56:0x012c, B:58:0x0133, B:60:0x013a, B:62:0x013e, B:64:0x0142, B:65:0x0145, B:66:0x014a, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b), top: B:55:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a1 A[Catch: all -> 0x01c0, TryCatch #2 {all -> 0x01c0, blocks: (B:87:0x019b, B:89:0x01a1, B:95:0x01bb, B:96:0x01c2, B:98:0x01c6), top: B:86:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2 A[Catch: all -> 0x01c0, TryCatch #2 {all -> 0x01c0, blocks: (B:87:0x019b, B:89:0x01a1, B:95:0x01bb, B:96:0x01c2, B:98:0x01c6), top: B:86:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [ads_mobile_sdk.jk0] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ads_mobile_sdk.cs2, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v30, types: [ads_mobile_sdk.jk0] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ads_mobile_sdk.cs2, ads_mobile_sdk.p12, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ads_mobile_sdk.t60, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ads_mobile_sdk.t60 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.b(ads_mobile_sdk.t60, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.b60
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.b60 r0 = (ads_mobile_sdk.b60) r0
            int r1 = r0.f2752f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2752f = r1
            goto L18
        L13:
            ads_mobile_sdk.b60 r0 = new ads_mobile_sdk.b60
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f2750d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2752f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ads_mobile_sdk.t60 r1 = r0.f2749c
            ads_mobile_sdk.cm0 r2 = r0.f2748b
            ads_mobile_sdk.t60 r0 = r0.f2747a
            ue.c.H(r9)
            goto L5e
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            ue.c.H(r9)
            ads_mobile_sdk.cm0 r2 = r8.f11414g
            ads_mobile_sdk.oh0 r9 = r8.f11413f
            java.lang.String r5 = "https://www.google.com/dfp/linkDevice"
            ads_mobile_sdk.jh0 r6 = ads_mobile_sdk.oh0.f9294r
            java.lang.String r7 = "gads:drx_debug:debug_device_linking_url"
            java.lang.Object r9 = r9.a(r7, r5, r6)
            java.lang.String r9 = (java.lang.String) r9
            r0.f2747a = r8
            r0.f2748b = r2
            r0.f2749c = r8
            r0.f2752f = r3
            java.lang.String r3 = r8.f11419l
            ads_mobile_sdk.ku0 r5 = r8.f11417j
            java.lang.Object r9 = r5.a(r9, r3, r4, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r0 = r8
            r1 = r0
        L5e:
            android.net.Uri r9 = (android.net.Uri) r9
            r1.getClass()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r3.<init>(r5, r9)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r5 = "android.support.customtabs.extra.SESSION"
            r9.putBinder(r5, r4)
            java.lang.String r1 = r1.f11423p
            if (r1 == 0) goto L8c
            java.lang.String r4 = "com.android.browser.application_id"
            r9.putString(r4, r1)
            r3.putExtras(r9)
            r2.a(r3)
            java.util.concurrent.atomic.AtomicBoolean r9 = r0.f11418k
            r0 = 0
            r9.set(r0)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L8c:
            java.lang.String r9 = "packageName"
            kotlin.jvm.internal.Intrinsics.r(r9)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.c(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01ec A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #6 {all -> 0x01f3, blocks: (B:13:0x01e6, B:15:0x01ec, B:49:0x01c9), top: B:48:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0200 A[Catch: all -> 0x0210, TryCatch #1 {all -> 0x0210, blocks: (B:19:0x01f9, B:21:0x0200, B:23:0x0207, B:25:0x020b, B:27:0x020f, B:29:0x0213, B:30:0x0218, B:31:0x0219, B:32:0x0220, B:33:0x0221, B:34:0x0228, B:35:0x0229), top: B:18:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0229 A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #1 {all -> 0x0210, blocks: (B:19:0x01f9, B:21:0x0200, B:23:0x0207, B:25:0x020b, B:27:0x020f, B:29:0x0213, B:30:0x0218, B:31:0x0219, B:32:0x0220, B:33:0x0221, B:34:0x0228, B:35:0x0229), top: B:18:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #5 {all -> 0x0113, blocks: (B:55:0x0106, B:57:0x010c, B:89:0x00e9), top: B:88:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[Catch: all -> 0x0131, TryCatch #4 {all -> 0x0131, blocks: (B:61:0x011a, B:63:0x0121, B:65:0x0128, B:67:0x012c, B:69:0x0130, B:70:0x0134, B:71:0x0139, B:72:0x013a, B:73:0x0141, B:74:0x0142, B:75:0x0149, B:76:0x014a), top: B:60:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #4 {all -> 0x0131, blocks: (B:61:0x011a, B:63:0x0121, B:65:0x0128, B:67:0x012c, B:69:0x0130, B:70:0x0134, B:71:0x0139, B:72:0x013a, B:73:0x0141, B:74:0x0142, B:75:0x0149, B:76:0x014a), top: B:60:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(bl2.c r18) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.d(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0340 A[Catch: all -> 0x0383, TryCatch #2 {all -> 0x0383, blocks: (B:86:0x035f, B:88:0x0367, B:93:0x0390, B:101:0x0338, B:103:0x0340), top: B:100:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ad A[Catch: all -> 0x02bd, TRY_LEAVE, TryCatch #15 {all -> 0x02bd, blocks: (B:114:0x02a7, B:116:0x02ad, B:153:0x00dc, B:155:0x0202, B:160:0x021c, B:172:0x00f0, B:173:0x01b6, B:177:0x0102, B:179:0x019b, B:181:0x01a3, B:184:0x01bf, B:189:0x0118, B:191:0x0177, B:193:0x017f), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8 A[Catch: all -> 0x02d8, TryCatch #11 {all -> 0x02d8, blocks: (B:128:0x02c1, B:130:0x02c8, B:132:0x02cf, B:134:0x02d3, B:136:0x02d7, B:137:0x02db, B:138:0x02e0, B:139:0x02e1, B:140:0x02e8, B:141:0x02e9, B:142:0x02f0, B:143:0x02f1), top: B:127:0x02c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f1 A[Catch: all -> 0x02d8, TRY_LEAVE, TryCatch #11 {all -> 0x02d8, blocks: (B:128:0x02c1, B:130:0x02c8, B:132:0x02cf, B:134:0x02d3, B:136:0x02d7, B:137:0x02db, B:138:0x02e0, B:139:0x02e1, B:140:0x02e8, B:141:0x02e9, B:142:0x02f0, B:143:0x02f1), top: B:127:0x02c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01a3 A[Catch: all -> 0x02bd, TryCatch #15 {all -> 0x02bd, blocks: (B:114:0x02a7, B:116:0x02ad, B:153:0x00dc, B:155:0x0202, B:160:0x021c, B:172:0x00f0, B:173:0x01b6, B:177:0x0102, B:179:0x019b, B:181:0x01a3, B:184:0x01bf, B:189:0x0118, B:191:0x0177, B:193:0x017f), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x047e A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #10 {all -> 0x0075, blocks: (B:16:0x0478, B:18:0x047e, B:57:0x0068, B:79:0x007f, B:80:0x037c, B:84:0x0090, B:98:0x00a5), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x017f A[Catch: all -> 0x02bd, TryCatch #15 {all -> 0x02bd, blocks: (B:114:0x02a7, B:116:0x02ad, B:153:0x00dc, B:155:0x0202, B:160:0x021c, B:172:0x00f0, B:173:0x01b6, B:177:0x0102, B:179:0x019b, B:181:0x01a3, B:184:0x01bf, B:189:0x0118, B:191:0x0177, B:193:0x017f), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x049a A[Catch: all -> 0x04aa, TryCatch #5 {all -> 0x04aa, blocks: (B:32:0x0493, B:34:0x049a, B:36:0x04a1, B:38:0x04a5, B:40:0x04a9, B:41:0x04ad, B:42:0x04b2, B:43:0x04b3, B:44:0x04ba, B:45:0x04bb, B:46:0x04c2, B:47:0x04c3), top: B:31:0x0493 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04c3 A[Catch: all -> 0x04aa, TRY_LEAVE, TryCatch #5 {all -> 0x04aa, blocks: (B:32:0x0493, B:34:0x049a, B:36:0x04a1, B:38:0x04a5, B:40:0x04a9, B:41:0x04ad, B:42:0x04b2, B:43:0x04b3, B:44:0x04ba, B:45:0x04bb, B:46:0x04c2, B:47:0x04c3), top: B:31:0x0493 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x044e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0367 A[Catch: all -> 0x0383, TRY_LEAVE, TryCatch #2 {all -> 0x0383, blocks: (B:86:0x035f, B:88:0x0367, B:93:0x0390, B:101:0x0338, B:103:0x0340), top: B:100:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r27) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.e(bl2.c):java.lang.Object");
    }

    public static final void c(t60 this$0, DialogInterface dialogInterface, int i13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11418k.set(false);
    }

    public static final void c(t60 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11418k.set(false);
    }

    public final Object b(bl2.c cVar) {
        Object a13 = this.f11417j.a(gt0.f5686d, new wi.t() { // from class: a.qc
            @Override // wi.t
            public final void a(wi.g gVar) {
                t60.a(t60.this, gVar);
            }
        }, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    public static final void b(t60 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        j0 j0Var = this$0.f11409b;
        g60 block = new g60(this$0, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public static final void b(t60 this$0, DialogInterface dialogInterface, int i13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        j0 j0Var = this$0.f11409b;
        h60 block = new h60(this$0, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public static final void d(t60 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11418k.set(false);
    }

    public static final void d(t60 this$0, DialogInterface dialogInterface, int i13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cm0 cm0Var = this$0.f11414g;
        Intent intent = new Intent("android.intent.action.VIEW", f11407q);
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        String str = this$0.f11423p;
        if (str != null) {
            bundle.putString("com.android.browser.application_id", str);
            intent.putExtras(bundle);
            cm0Var.a(intent);
            return;
        }
        Intrinsics.r("packageName");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ad A[Catch: all -> 0x01b3, TRY_LEAVE, TryCatch #7 {all -> 0x01b3, blocks: (B:15:0x01a7, B:17:0x01ad), top: B:14:0x01a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c7 A[Catch: all -> 0x01d7, TryCatch #9 {all -> 0x01d7, blocks: (B:25:0x01c0, B:27:0x01c7, B:29:0x01ce, B:31:0x01d2, B:33:0x01d6, B:34:0x01da, B:35:0x01df, B:36:0x01e0, B:37:0x01e7, B:38:0x01e8, B:39:0x01ef, B:40:0x01f0), top: B:24:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f0 A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #9 {all -> 0x01d7, blocks: (B:25:0x01c0, B:27:0x01c7, B:29:0x01ce, B:31:0x01d2, B:33:0x01d6, B:34:0x01da, B:35:0x01df, B:36:0x01e0, B:37:0x01e7, B:38:0x01e8, B:39:0x01ef, B:40:0x01f0), top: B:24:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #13 {all -> 0x00fe, blocks: (B:65:0x00f2, B:67:0x00f8), top: B:64:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:72:0x010a, B:74:0x0111, B:76:0x0118, B:78:0x011c, B:80:0x0120, B:81:0x0124, B:82:0x0129, B:83:0x012a, B:84:0x0131, B:85:0x0132, B:86:0x0139, B:87:0x013a), top: B:71:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:72:0x010a, B:74:0x0111, B:76:0x0118, B:78:0x011c, B:80:0x0120, B:81:0x0124, B:82:0x0129, B:83:0x012a, B:84:0x0131, B:85:0x0132, B:86:0x0139, B:87:0x013a), top: B:71:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r1v21, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ads_mobile_sdk.cs2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.t60 r16, java.lang.String r17, java.lang.String r18, nm.u r19, ads_mobile_sdk.ss2 r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.a(ads_mobile_sdk.t60, java.lang.String, java.lang.String, nm.u, ads_mobile_sdk.ss2, bl2.c):java.lang.Object");
    }

    public static /* synthetic */ Object a(t60 t60Var, boolean z13, String str, Activity activity, boolean z14, bl2.c cVar, int i13) {
        boolean z15 = (i13 & 1) != 0 ? false : z13;
        if ((i13 & 2) != 0) {
            str = "In-app preview failed to load because of a system error. Please try again later.";
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            activity = null;
        }
        return t60Var.a(z15, str2, activity, (i13 & 8) != 0 ? false : z14, cVar);
    }

    public final Object a(Activity activity, bl2.c cVar) {
        String str;
        String str2;
        if (activity == null) {
            activity = this.f11412e.c();
        }
        if (activity == null) {
            Intrinsics.checkNotNullParameter("No Activity context available for displaying the debug menu.", "message");
            ft2.a(true, "No Activity context available for displaying the debug menu.", null);
            this.f11418k.set(false);
            return Unit.f80348a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("Ad information");
        final int size = arrayList.size() - 1;
        Object obj = this.f11415h.f5146f.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        if (z.j((CharSequence) obj)) {
            str = "Creative preview";
        } else {
            str = "Creative preview (enabled)";
        }
        arrayList.add(str);
        final int size2 = arrayList.size() - 1;
        if (this.f11415h.f5147g.get()) {
            str2 = "Troubleshooting (enabled)";
        } else {
            str2 = "Troubleshooting";
        }
        arrayList.add(str2);
        final int size3 = arrayList.size() - 1;
        arrayList.add("Open ad inspector");
        final int size4 = arrayList.size() - 1;
        arrayList.add("Ad inspector settings");
        final int size5 = arrayList.size() - 1;
        Object M = kotlin.jvm.internal.j.M(cVar, this.f11408a, new j60(new AlertDialog.Builder(activity, R.style.Theme.Material.Dialog.Alert).setTitle("Select a debug mode").setNegativeButton("Close", new a.kc(this, 0)).setOnDismissListener(new lc(this, 0)).setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: a.mc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                t60.a(size, this, size5, size4, size2, size3, dialogInterface, i13);
            }
        }), null));
        return M == cl2.a.COROUTINE_SUSPENDED ? M : Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d2 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #9 {all -> 0x007d, blocks: (B:24:0x01ce, B:26:0x01d2, B:84:0x0078, B:85:0x0117, B:87:0x011d, B:88:0x0121), top: B:83:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e5 A[Catch: all -> 0x01f5, TryCatch #4 {all -> 0x01f5, blocks: (B:31:0x01de, B:33:0x01e5, B:35:0x01ec, B:37:0x01f0, B:39:0x01f4, B:40:0x01f8, B:41:0x01fd, B:42:0x01fe, B:43:0x0205, B:44:0x0206, B:45:0x020d, B:46:0x020e), top: B:30:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020e A[Catch: all -> 0x01f5, TRY_LEAVE, TryCatch #4 {all -> 0x01f5, blocks: (B:31:0x01de, B:33:0x01e5, B:35:0x01ec, B:37:0x01f0, B:39:0x01f4, B:40:0x01f8, B:41:0x01fd, B:42:0x01fe, B:43:0x0205, B:44:0x0206, B:45:0x020d, B:46:0x020e), top: B:30:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d A[Catch: all -> 0x007d, TryCatch #9 {all -> 0x007d, blocks: (B:24:0x01ce, B:26:0x01d2, B:84:0x0078, B:85:0x0117, B:87:0x011d, B:88:0x0121), top: B:83:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #9 {all -> 0x007d, blocks: (B:24:0x01ce, B:26:0x01d2, B:84:0x0078, B:85:0x0117, B:87:0x011d, B:88:0x0121), top: B:83:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r13v10, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.ku0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r18) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.a(bl2.c):java.lang.Object");
    }

    public final String a(String str) {
        if (str.length() == 0) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(new Regex("\\+").replace(str, "%20")).build();
        cm0 cm0Var = this.f11414g;
        Intrinsics.f(build);
        String obj = StringsKt.i0(CollectionsKt.Z(cm0Var.b(build).entrySet(), "\n\n", null, null, 0, null, y50.f14088a, 30)).toString();
        return z.j(obj) ? "No debug information" : obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object a(Activity activity, String str, s60 s60Var) {
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    Object a13 = a(this, false, "The device is successfully linked for creative preview.", activity, false, (bl2.c) s60Var, 1);
                    cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                    if (a13 != aVar) {
                        a13 = Unit.f80348a;
                    }
                    return a13 == aVar ? a13 : Unit.f80348a;
                }
                break;
            case 49:
                if (str.equals(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE)) {
                    Object c13 = c(s60Var);
                    return c13 == cl2.a.COROUTINE_SUSPENDED ? c13 : Unit.f80348a;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    Object a14 = a(this, false, "There was no creative pushed from DFP to the device.", activity, true, (bl2.c) s60Var, 1);
                    cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                    if (a14 != aVar2) {
                        a14 = Unit.f80348a;
                    }
                    return a14 == aVar2 ? a14 : Unit.f80348a;
                }
                break;
        }
        String substring = str.substring(0, Math.min(50, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        ft2.b("Invalid creative preview status: " + substring);
        Object a15 = a(this, true, (String) null, activity, false, (bl2.c) s60Var, 10);
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        if (a15 != aVar3) {
            a15 = Unit.f80348a;
        }
        return a15 == aVar3 ? a15 : Unit.f80348a;
    }

    public static final void a(t60 this$0, wi.g gVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gVar != null) {
            j0 j0Var = this$0.f11409b;
            a60 block = new a60(this$0, gVar, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
    }

    public static final void a(t60 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11418k.set(false);
    }

    public static final void a(t60 this$0, DialogInterface dialogInterface, int i13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11418k.set(false);
    }

    public static final void a(t60 this$0, String diagnosticText, DialogInterface dialogInterface, int i13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(diagnosticText, "$diagnosticText");
        this$0.f11414g.a(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", diagnosticText), "Share via"));
        this$0.f11418k.set(false);
    }

    public static final void a(AtomicInteger selectedGestureIndex, DialogInterface dialogInterface, int i13) {
        Intrinsics.checkNotNullParameter(selectedGestureIndex, "$selectedGestureIndex");
        selectedGestureIndex.set(i13);
    }

    public static final void a(t60 this$0, AtomicInteger selectedGestureIndex, int i13, int i14, int i15, DialogInterface dialogInterface, int i16) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectedGestureIndex, "$selectedGestureIndex");
        j0 j0Var = this$0.f11409b;
        i60 block = new i60(selectedGestureIndex, i13, i14, this$0, i15, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public static final void a(int i13, t60 this$0, int i14, int i15, int i16, int i17, DialogInterface dialogInterface, int i18) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i18 == i13) {
            ft2.a(this$0.f11409b, new k60(this$0, null));
            return;
        }
        if (i18 == i14) {
            ft2.a(this$0.f11409b, new l60(this$0, null));
            return;
        }
        if (i18 == i15) {
            ft2.a(this$0.f11409b, new m60(this$0, null));
            return;
        }
        if (i18 == i16) {
            ft2.a(this$0.f11409b, new n60(this$0, null));
            return;
        }
        if (i18 == i17) {
            ft2.a(this$0.f11409b, new o60(this$0, null));
            return;
        }
        ok.e0 e0Var = gk0.f5596a;
        gk0.d("Unsupported debug menu option: " + i18, null);
        this$0.f11418k.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r7, java.lang.String r8, android.app.Activity r9, boolean r10, bl2.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.p60
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.p60 r0 = (ads_mobile_sdk.p60) r0
            int r1 = r0.f9567d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9567d = r1
            goto L18
        L13:
            ads_mobile_sdk.p60 r0 = new ads_mobile_sdk.p60
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f9565b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9567d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            ads_mobile_sdk.t60 r7 = r0.f9564a
            ue.c.H(r11)     // Catch: java.lang.Throwable -> L2b
            goto Lc0
        L2b:
            r8 = move-exception
            goto La0
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            ue.c.H(r11)
            if (r9 != 0) goto L45
            ads_mobile_sdk.x r9 = r6.f11412e     // Catch: java.lang.Throwable -> L42
            android.app.Activity r9 = r9.c()     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r8 = move-exception
            r7 = r6
            goto La0
        L45:
            r11 = 0
            if (r9 != 0) goto L5a
            java.lang.String r7 = "No Activity context available for showing status dialog."
            java.lang.String r8 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)     // Catch: java.lang.Throwable -> L42
            ads_mobile_sdk.ft2.a(r4, r7, r11)     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f11418k     // Catch: java.lang.Throwable -> L42
            r7.set(r3)     // Catch: java.lang.Throwable -> L42
            kotlin.Unit r7 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L42
            return r7
        L5a:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L42
            r5 = 16974374(0x1030226, float:2.4062441E-38)
            r2.<init>(r9, r5)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L67
            java.lang.String r7 = "Error"
            goto L69
        L67:
            java.lang.String r7 = "Info"
        L69:
            r2.setTitle(r7)     // Catch: java.lang.Throwable -> L42
            r2.setMessage(r8)     // Catch: java.lang.Throwable -> L42
            a.lc r7 = new a.lc     // Catch: java.lang.Throwable -> L42
            r8 = 3
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L42
            r2.setOnDismissListener(r7)     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = "Dismiss"
            if (r10 == 0) goto L8b
            r2.setNegativeButton(r7, r11)     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = "Learn More"
            a.kc r8 = new a.kc     // Catch: java.lang.Throwable -> L42
            r9 = 5
            r8.<init>(r6, r9)     // Catch: java.lang.Throwable -> L42
            r2.setPositiveButton(r7, r8)     // Catch: java.lang.Throwable -> L42
            goto L8e
        L8b:
            r2.setNeutralButton(r7, r11)     // Catch: java.lang.Throwable -> L42
        L8e:
            kotlin.coroutines.CoroutineContext r7 = r6.f11408a     // Catch: java.lang.Throwable -> L42
            ads_mobile_sdk.q60 r8 = new ads_mobile_sdk.q60     // Catch: java.lang.Throwable -> L42
            r8.<init>(r2, r11)     // Catch: java.lang.Throwable -> L42
            r0.f9564a = r6     // Catch: java.lang.Throwable -> L42
            r0.f9567d = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r7, r8)     // Catch: java.lang.Throwable -> L42
            if (r7 != r1) goto Lc0
            return r1
        La0:
            java.lang.String r9 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            ads_mobile_sdk.cs2 r9 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r10 = r9.f()
            r10.f6988j = r3
            r9.a(r8)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f11418k
            r9.set(r3)
            a.j3 r7 = r7.f11411d
            ads_mobile_sdk.ks2 r7 = (ads_mobile_sdk.ks2) r7
            java.lang.String r9 = "Failed to show status dialog"
            r7.a(r9, r8)
        Lc0:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t60.a(boolean, java.lang.String, android.app.Activity, boolean, bl2.c):java.lang.Object");
    }
}
