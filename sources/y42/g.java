package y42;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import df.j1;
import i92.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.b0;
import nx.d0;
import okhttp3.MultipartBody;
import so.oa;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public b f137718a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f137719b;

    /* renamed from: c, reason: collision with root package name */
    public final w f137720c;

    /* renamed from: d, reason: collision with root package name */
    public final f f137721d;

    /* renamed from: e, reason: collision with root package name */
    public final t20.a f137722e;

    /* renamed from: f, reason: collision with root package name */
    public final n20.a f137723f;

    /* renamed from: g, reason: collision with root package name */
    public final tz1.a f137724g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f137725h;

    /* renamed from: i, reason: collision with root package name */
    public int f137726i;

    /* renamed from: j, reason: collision with root package name */
    public List f137727j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f137728k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f137729l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f137730m;

    /* renamed from: n, reason: collision with root package name */
    public final k f137731n;

    public g(b bVar, d0 pinalytics, w eventManager, f pinUploadHelper, t20.a pinUploadService, n20.a logApi, tz1.a localNotificationHelper, b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinUploadHelper, "pinUploadHelper");
        Intrinsics.checkNotNullParameter(pinUploadService, "pinUploadService");
        Intrinsics.checkNotNullParameter(logApi, "logApi");
        Intrinsics.checkNotNullParameter(localNotificationHelper, "localNotificationHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f137718a = bVar;
        this.f137719b = pinalytics;
        this.f137720c = eventManager;
        this.f137721d = pinUploadHelper;
        this.f137722e = pinUploadService;
        this.f137723f = logApi;
        this.f137724g = localNotificationHelper;
        this.f137725h = pinAuxHelper;
        this.f137729l = new Object();
        this.f137730m = true;
        Context context = kb0.a.f79058b;
        this.f137731n = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
    }

    public static List a() {
        ArrayList arrayList = new ArrayList();
        File file = new File(l3.c.H());
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(new ArrayList(f0.j(Arrays.copyOf(listFiles, listFiles.length))));
            if (linkedHashSet.size() > 0) {
                arrayList.addAll(linkedHashSet);
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                Collections.reverse(arrayList);
                linkedHashSet.clear();
            }
        }
        List synchronizedList = Collections.synchronizedList(arrayList);
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        return synchronizedList;
    }

    public final void b() {
        File file;
        File file2;
        synchronized (this.f137729l) {
            try {
                List list = this.f137727j;
                String name = (list == null || (file2 = (File) CollectionsKt.firstOrNull(list)) == null) ? null : file2.getName();
                if (name == null) {
                    name = "";
                }
                b bVar = this.f137718a;
                new File(bVar != null ? bVar.getCacheDir() : null, j1.U("%s.jpg", new Object[]{name})).delete();
                List list2 = this.f137727j;
                if (list2 != null && (file = (File) list2.remove(0)) != null) {
                    file.delete();
                }
                this.f137728k = false;
                this.f137726i = 0;
                this.f137729l.notifyAll();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(int i13) {
        String b23 = bs1.c.b2(x0.app_name);
        Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
        String b24 = bs1.c.b2(i13);
        Intrinsics.checkNotNullExpressionValue(b24, "string(...)");
        Notification b13 = tz1.a.b(this.f137724g, b23, b24, 0L, 12);
        Context context = kb0.a.f79058b;
        Object systemService = m60.f0.W().getSystemService("notification");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(0, b13);
    }

    public final boolean d(File file) {
        try {
            ByteArrayOutputStream g03 = com.bumptech.glide.d.g0(file);
            x10.c cVar = new x10.c(new vd0.c(g03 == null ? "" : g03.toString()));
            Pair e13 = cVar.e();
            this.f137722e.a((Map) e13.f80346a, (MultipartBody.Part) e13.f80347b).r(tk2.e.f118017c).l(wj2.c.a()).p(new mn0.d(this, cVar));
            return true;
        } catch (Exception e14) {
            e14.getMessage();
            return false;
        }
    }
}
