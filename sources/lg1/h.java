package lg1;

import android.os.Build;
import android.os.Handler;
import android.util.Size;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.pu;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import kotlin.text.z;
import nx.d0;
import oy.c1;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f83263a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f83264b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f83265c;

    /* renamed from: d, reason: collision with root package name */
    public final e f83266d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f83267e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f83268f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f83269g;

    /* renamed from: h, reason: collision with root package name */
    public int f83270h;

    /* renamed from: i, reason: collision with root package name */
    public long f83271i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f83272j;

    /* renamed from: k, reason: collision with root package name */
    public int f83273k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f83274l;

    public h(d0 pinalytics, tb0.h crashReporting, Handler mainHandler, e listener) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83263a = pinalytics;
        this.f83264b = crashReporting;
        this.f83265c = mainHandler;
        this.f83266d = listener;
        this.f83267e = new LinkedHashMap();
        this.f83268f = new LinkedHashMap();
        this.f83269g = new LinkedHashMap();
        this.f83272j = new ArrayList();
        this.f83273k = 4;
        this.f83274l = true;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.f83268f;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).a();
        }
        this.f83267e.clear();
        linkedHashMap.clear();
        ArrayList arrayList = this.f83272j;
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            LinkedHashMap linkedHashMap2 = this.f83269g;
            if (!hasNext) {
                arrayList.clear();
                linkedHashMap2.clear();
                this.f83270h = 0;
                this.f83271i = 0L;
                return;
            }
            pu puVar = (pu) it2.next();
            if (((Number) linkedHashMap2.getOrDefault(puVar, 0)).intValue() >= 1) {
                b(f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED, puVar.e(), null);
            }
        }
    }

    public final void b(f1 f1Var, String str, HashMap hashMap) {
        HashMap hashMap2 = hashMap != null ? new HashMap(hashMap) : new HashMap();
        String MODEL = Build.MODEL;
        if (MODEL != null && !z.j(MODEL)) {
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            hashMap2.put("device_version", e0.C(30, MODEL));
        }
        String str2 = (String) ly1.c.f85155a.getValue();
        if (str2 != null && !z.j(str2)) {
            hashMap2.put("device_cpu", e0.C(30, str2));
        }
        String str3 = Build.VERSION.RELEASE;
        if (str3 != null && !z.j(str3)) {
            hashMap2.put("os_version", str3);
        }
        this.f83263a.g(f1Var, str, hashMap2, false);
    }

    public final void c() {
        e eVar = this.f83266d;
        boolean m13 = eVar.m1();
        ArrayList arrayList = this.f83272j;
        if (!m13 || !(!arrayList.isEmpty()) || this.f83270h >= this.f83273k) {
            if (arrayList.isEmpty() && this.f83270h == 0) {
                eVar.D0(this.f83274l);
                this.f83274l = true;
                return;
            }
            return;
        }
        Object remove = arrayList.remove(0);
        Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
        pu puVar = (pu) remove;
        this.f83270h++;
        d30 d30Var = (d30) puVar;
        boolean z13 = ((Number) this.f83269g.getOrDefault(puVar, 0)).intValue() >= 1;
        String e03 = gi2.b.e0(true);
        int f13 = new k6.g(d30Var.e()).f(1, "Orientation");
        Pair f14 = (f13 == 6 || f13 == 8) ? mg1.b.f(((Number) d30Var.h().f80347b).intValue(), ((Number) d30Var.h().f80346a).intValue()) : mg1.b.f(((Number) d30Var.h().f80346a).intValue(), ((Number) d30Var.h().f80347b).intValue());
        if (!z13) {
            b(f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_ATTEMPTED, d30Var.e(), null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        new c1(e03, z13).i();
        b bVar = new b(this.f83264b, e03, d30Var, new Size(((Number) f14.f80346a).intValue(), ((Number) f14.f80347b).intValue()), this.f83271i, new g(currentTimeMillis, d30Var, this, e03));
        bVar.b();
        this.f83268f.put(d30Var.e(), bVar);
        this.f83271i = 0L;
    }
}
