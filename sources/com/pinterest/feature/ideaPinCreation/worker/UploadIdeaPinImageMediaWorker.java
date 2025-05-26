package com.pinterest.feature.ideaPinCreation.worker;

import ag1.h;
import android.content.Context;
import androidx.work.WorkerParameters;
import aw0.s;
import aw0.u;
import bw0.f;
import bw0.o;
import com.pinterest.api.model.d30;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import com.pinterest.feature.video.worker.base.BaseUploadMediaWorker;
import ex0.g;
import fe0.b;
import gi1.e;
import h32.f1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import jk2.g0;
import kb.y;
import kh2.g3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.s1;
import nx.d0;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import oy.s0;
import oy.x0;
import pq2.a1;
import pq2.i;
import r32.c;
import sv0.l;
import uj2.a0;
import uj2.q;
import v20.a;
import xk2.k;
import xk2.m;
import xk2.n;
import xk2.v;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cBk\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/UploadIdeaPinImageMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseUploadMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lsv0/l;", "s3UploadHelper", "Lv20/a;", "imageUploadService", "Lbw0/f;", "storyPinWorkUtils", "Lbw0/o;", "supportWorkUtils", "Lfe0/b;", "networkSpeedDataProvider", "Lag1/h;", "sessionDataManager", "Llh0/s1;", "experiments", "Luj2/q;", "Lxu1/i;", "networkType", "Ltb0/h;", "crashReporting", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsv0/l;Lv20/a;Lbw0/f;Lbw0/o;Lfe0/b;Lag1/h;Llh0/s1;Luj2/q;Ltb0/h;)V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UploadIdeaPinImageMediaWorker extends BaseUploadMediaWorker implements e {
    public String A;
    public boolean B;
    public Long C;
    public final k D;
    public final k E;
    public final k F;
    public final k G;
    public final k H;
    public final k I;

    /* renamed from: J, reason: collision with root package name */
    public final k f46693J;
    public final k K;
    public final k L;
    public final k M;
    public final v N;
    public final v O;
    public final k P;

    /* renamed from: o, reason: collision with root package name */
    public final l f46694o;

    /* renamed from: p, reason: collision with root package name */
    public final a f46695p;

    /* renamed from: q, reason: collision with root package name */
    public final f f46696q;

    /* renamed from: r, reason: collision with root package name */
    public final o f46697r;

    /* renamed from: s, reason: collision with root package name */
    public final b f46698s;

    /* renamed from: t, reason: collision with root package name */
    public final h f46699t;

    /* renamed from: u, reason: collision with root package name */
    public final s1 f46700u;

    /* renamed from: v, reason: collision with root package name */
    public final q f46701v;

    /* renamed from: w, reason: collision with root package name */
    public final tb0.h f46702w;

    /* renamed from: x, reason: collision with root package name */
    public final v f46703x;

    /* renamed from: y, reason: collision with root package name */
    public i f46704y;

    /* renamed from: z, reason: collision with root package name */
    public String f46705z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadIdeaPinImageMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull l s3UploadHelper, @NotNull a imageUploadService, @NotNull f storyPinWorkUtils, @NotNull o supportWorkUtils, @NotNull b networkSpeedDataProvider, @NotNull h sessionDataManager, @NotNull s1 experiments, @NotNull q<xu1.i> networkType, @NotNull tb0.h crashReporting) {
        super(context, workerParameters, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(s3UploadHelper, "s3UploadHelper");
        Intrinsics.checkNotNullParameter(imageUploadService, "imageUploadService");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        Intrinsics.checkNotNullParameter(supportWorkUtils, "supportWorkUtils");
        Intrinsics.checkNotNullParameter(networkSpeedDataProvider, "networkSpeedDataProvider");
        Intrinsics.checkNotNullParameter(sessionDataManager, "sessionDataManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f46694o = s3UploadHelper;
        this.f46695p = imageUploadService;
        this.f46696q = storyPinWorkUtils;
        this.f46697r = supportWorkUtils;
        this.f46698s = networkSpeedDataProvider;
        this.f46699t = sessionDataManager;
        this.f46700u = experiments;
        this.f46701v = networkType;
        this.f46702w = crashReporting;
        this.f46703x = m.b(u.f20585i);
        this.f46705z = "";
        this.A = "0";
        n nVar = n.NONE;
        this.D = m.a(nVar, new s(this, 7));
        this.E = m.a(nVar, new s(this, 6));
        this.F = m.a(nVar, new s(this, 4));
        this.G = m.a(nVar, new s(this, 9));
        this.H = m.a(nVar, new s(this, 10));
        this.I = m.a(nVar, new s(this, 3));
        this.f46693J = m.a(nVar, new s(this, 1));
        this.K = m.a(nVar, new s(this, 0));
        this.L = m.a(nVar, new s(this, 2));
        this.M = m.a(nVar, new s(this, 8));
        this.N = m.b(new s(this, 12));
        this.O = m.b(new s(this, 11));
        this.P = m.a(nVar, new s(this, 5));
    }

    public static final String A(UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker, String key) {
        String str;
        kb.l lVar = uploadIdeaPinImageMediaWorker.f78963b.f19998b;
        Intrinsics.checkNotNullExpressionValue(lVar, "getInputData(...)");
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String[] i13 = lVar.i(key);
        if (i13 != null && (str = i13[0]) != null) {
            return str;
        }
        String h10 = lVar.h(key);
        return h10 == null ? "" : h10;
    }

    public static void H(UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker, String str, String str2, String str3, String str4, c cVar, Boolean bool, s92.o pwtResult, int i13) {
        String str5 = (i13 & 1) != 0 ? null : str;
        String str6 = (i13 & 2) != 0 ? null : str2;
        String str7 = (i13 & 4) != 0 ? null : str3;
        String str8 = (i13 & 8) != 0 ? null : str4;
        c cVar2 = (i13 & 16) != 0 ? null : cVar;
        Boolean bool2 = (i13 & 32) == 0 ? bool : null;
        WorkerParameters workerParameters = uploadIdeaPinImageMediaWorker.f78963b;
        HashSet hashSet = workerParameters.f19999c;
        Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
        uploadIdeaPinImageMediaWorker.f46697r.getClass();
        if (o.c(hashSet)) {
            return;
        }
        qg1.i iVar = (qg1.i) uploadIdeaPinImageMediaWorker.N.getValue();
        String uniqueIdentifier = uploadIdeaPinImageMediaWorker.E();
        Long l13 = uploadIdeaPinImageMediaWorker.C;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        new oy.b(new s0(uniqueIdentifier, workerParameters.f20000d, str5, str6, l13, str7, str8, bool2, pwtResult)).i();
        iVar.g(bool2, cVar2);
    }

    public static final int z(UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker, String key, int i13) {
        kb.l lVar = uploadIdeaPinImageMediaWorker.f78963b.f19998b;
        Intrinsics.checkNotNullExpressionValue(lVar, "getInputData(...)");
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        int[] e13 = lVar.e(key);
        return e13 != null ? e13[0] : lVar.d(key, i13);
    }

    public final HashMap B() {
        HashMap hashMap = new HashMap();
        hashMap.put("idea_pin_creation_session_id", C());
        String pageId = E();
        l lVar = this.f46694o;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        ex0.e eVar = (ex0.e) lVar.f115365n.get(pageId);
        if (eVar == null) {
            eVar = ex0.e.UNKNOWN;
        }
        hashMap.put("speed_bucket", eVar.getKey());
        k kVar = this.P;
        if (((Boolean) kVar.getValue()) != null) {
            hashMap.put("media_export_skipped", String.valueOf((Boolean) kVar.getValue()));
        }
        return hashMap;
    }

    public final String C() {
        return (String) this.f46693J.getValue();
    }

    public final ag1.b D() {
        return (ag1.b) this.f46703x.getValue();
    }

    public final String E() {
        return (String) this.D.getValue();
    }

    public final boolean F() {
        if (!this.f46696q.h()) {
            HashSet hashSet = this.f78963b.f19999c;
            Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
            this.f46697r.getClass();
            if (!o.c(hashSet)) {
                return false;
            }
        }
        return true;
    }

    public final void G(String str) {
        HashMap B = B();
        B.put("error_message", str == null ? "" : str);
        BaseMediaWorker.w(this, f1.IMAGE_UPLOAD_FAILED, B, 2);
        H(this, null, null, null, str, null, null, s92.o.ERROR, 55);
    }

    public final tt1.a I(i iVar) {
        this.f46704y = iVar;
        a1 e13 = iVar.e();
        long j13 = e13.f100989a.f95730k;
        RequestBody requestBody = iVar.d().f95703d;
        long a13 = requestBody != null ? requestBody.a() : 0L;
        g0 s13 = this.f46701v.s();
        a0 a0Var = tk2.e.f118017c;
        s13.r(a0Var).l(a0Var).o(new pv0.e(24, new aw0.v(this, j13, a13)), new pv0.e(25, new au0.f(this, 25)));
        Response response = e13.f100989a;
        this.C = Long.valueOf(response.f95731l - response.f95730k);
        return (tt1.a) e13.f100990b;
    }

    @Override // kb.a0
    public final void f() {
        this.f46698s.b(E(), g.FAIL);
        H(this, null, null, null, "onStopped() got invoked, work is canceled", c.IMAGE_UPLOAD_FAILED, Boolean.valueOf(D().f15140m), s92.o.ABORTED, 7);
        i iVar = this.f46704y;
        if (iVar != null) {
            iVar.cancel();
        }
        this.f46697r.d((bw0.q) this.O.getValue());
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        D().c((String) this.K.getValue(), C(), F(), this.f46696q.i());
        WorkerParameters workerParameters = this.f78963b;
        HashSet hashSet = workerParameters.f19999c;
        Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
        this.f46697r.getClass();
        if (!o.c(hashSet)) {
            k kVar = this.H;
            File file = new File((String) kVar.getValue());
            d30 d30Var = new d30((String) kVar.getValue(), null, 2, null);
            String path = s().getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            d30 d30Var2 = new d30(path, null, 2, null);
            int intValue = ((Number) d30Var2.h().f80346a).intValue();
            int intValue2 = ((Number) d30Var2.h().f80347b).intValue();
            qg1.i iVar = (qg1.i) this.N.getValue();
            String uniqueIdentifier = E();
            String pageId = E();
            String fileUri = u().toString();
            long length = file.length();
            int intValue3 = ((Number) d30Var.h().f80346a).intValue();
            int intValue4 = ((Number) d30Var.h().f80347b).intValue();
            long length2 = s().length();
            boolean contains = workerParameters.f19999c.contains("cover_image_upload");
            Boolean bool = (Boolean) this.P.getValue();
            Intrinsics.f(fileUri);
            Integer valueOf = Integer.valueOf(intValue3);
            Integer valueOf2 = Integer.valueOf(intValue4);
            Boolean valueOf3 = Boolean.valueOf(contains);
            Long valueOf4 = Long.valueOf(length2);
            Integer valueOf5 = Integer.valueOf(intValue);
            Integer valueOf6 = Integer.valueOf(intValue2);
            iVar.getClass();
            Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            new oy.c(new x0(uniqueIdentifier, pageId, fileUri, workerParameters.f20000d, length, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool)).i();
        }
        if (s().exists()) {
            super.j();
        } else {
            this.B = true;
            throw new MissingFormatArgumentException(a.c.g("Idea pin image key is null or empty;mediaUri=", u()));
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46698s.b(E(), g.FAIL);
        if (!Intrinsics.d(e13.getMessage(), "Canceled support work as the main work chain had already started")) {
            HashMap B = B();
            B.put("error_message", e13.toString());
            BaseMediaWorker.w(this, f1.IMAGE_UPLOAD_CANCELLED, B, 2);
        }
        new oy.a().i();
        Intrinsics.checkNotNullParameter(e13, "e");
        f();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Exception exc;
        String str;
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46698s.b(E(), g.FAIL);
        if (!F()) {
            k().f(e.c(this, null, aq1.h.story_pin_creation_error_image_upload, 7));
        }
        G(e13.getMessage());
        if (F()) {
            exc = e13;
            str = "e";
        } else {
            exc = e13;
            qg1.i.d((qg1.i) this.N.getValue(), e13, false, e13.getMessage(), c.IMAGE_UPLOAD_FAILED, null, null, null, D().f15131d.getTemplateType(), null, null, null, D().f15133f, C(), D().f15130c, this.f46696q.i(), null, 33906);
            str = "e";
        }
        Intrinsics.checkNotNullParameter(exc, str);
        f();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void o(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        G(e13.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033a  */
    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker.p():void");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        kb.l lVar;
        this.f46698s.b(E(), g.SUCCESS);
        HashSet hashSet = this.f78963b.f19999c;
        Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
        if (!(hashSet instanceof Collection) || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Intrinsics.d(str, "image_upload") || Intrinsics.d(str, "cover_image_upload")) {
                    kb.l a13 = this.f46697r.a(E());
                    String h10 = a13.h("MEDIA_ID");
                    if (h10 == null) {
                        h10 = this.A;
                    }
                    String h13 = a13.h("IMAGE_SIGNATURE");
                    if (h13 == null) {
                        h13 = this.f46705z;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    long parseLong = Long.parseLong(h10);
                    Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
                    linkedHashMap.put("MEDIA_ID", Long.valueOf(parseLong));
                    Intrinsics.checkNotNullParameter("IMAGE_SIGNATURE", "key");
                    linkedHashMap.put("IMAGE_SIGNATURE", h13);
                    String[] u13 = g3.u(E(), h13, (String[]) this.L.getValue());
                    ArrayList arrayList = new ArrayList(u13.length);
                    for (String str2 : u13) {
                        arrayList.add(str2);
                    }
                    String[] value = (String[]) arrayList.toArray(new String[0]);
                    Intrinsics.checkNotNullParameter("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    linkedHashMap.put("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", value);
                    String[] u14 = g3.u(E(), h10, (String[]) this.M.getValue());
                    ArrayList arrayList2 = new ArrayList(u14.length);
                    for (String str3 : u14) {
                        arrayList2.add(str3);
                    }
                    String[] value2 = (String[]) arrayList2.toArray(new String[0]);
                    Intrinsics.checkNotNullParameter("STORY_PIN_PAGE_ID_AND_TRACKING_ID", "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    linkedHashMap.put("STORY_PIN_PAGE_ID_AND_TRACKING_ID", value2);
                    int intValue = ((Number) this.G.getValue()).intValue();
                    Intrinsics.checkNotNullParameter("PAGE_COUNT_FROM_LAST_SESSION", "key");
                    linkedHashMap.put("PAGE_COUNT_FROM_LAST_SESSION", Integer.valueOf(intValue));
                    lVar = new kb.l(linkedHashMap);
                    bk.f.e0(lVar);
                    y yVar = new y(lVar);
                    Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
                    return yVar;
                }
            }
        }
        if (this.f46705z.length() == 0 || this.A.length() == 0) {
            throw new IllegalStateException(t3.s1.c("Invalid response: trackingId=", this.A, ", imageSignature=", this.f46705z));
        }
        String str4 = this.A;
        String str5 = this.f46705z;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
        linkedHashMap2.put("MEDIA_ID", str4);
        Intrinsics.checkNotNullParameter("IMAGE_SIGNATURE", "key");
        linkedHashMap2.put("IMAGE_SIGNATURE", str5);
        lVar = new kb.l(linkedHashMap2);
        bk.f.e0(lVar);
        y yVar2 = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar2, "success(...)");
        return yVar2;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.B || D().f15140m) {
            return false;
        }
        if (e()) {
            return true;
        }
        return super.r(e13);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseUploadMediaWorker, com.pinterest.feature.video.worker.base.BaseMediaWorker
    public final void y(Context context, d0 analytics, f1 eventType, String id3, File file, HashMap auxdata) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(auxdata, "auxdata");
        String str = this.A;
        if (!z.j(this.f46705z)) {
            auxdata.put("image_signature", this.f46705z);
        }
        if (!z.j(this.A)) {
            auxdata.put("media_upload_id", this.A);
        }
        auxdata.put("idea_pin_creation_session_id", C());
        Unit unit = Unit.f80348a;
        super.y(context, analytics, eventType, str, file, auxdata);
    }
}
