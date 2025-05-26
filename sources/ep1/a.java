package ep1;

import android.app.Activity;
import android.os.Handler;
import android.os.Process;
import android.util.Pair;
import cp1.p;
import df.j1;
import h32.d4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import m60.f;
import qb0.d;
import tb0.g;
import tb0.h;

/* loaded from: classes2.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f59891a = 60000;

    /* renamed from: b, reason: collision with root package name */
    public final long f59892b = 52428800;

    /* renamed from: c, reason: collision with root package name */
    public final int f59893c = Process.myUid();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f59894d = new Handler();

    /* renamed from: e, reason: collision with root package name */
    public final sq0.a f59895e;

    /* renamed from: f, reason: collision with root package name */
    public final String f59896f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f59897g;

    /* renamed from: h, reason: collision with root package name */
    public long f59898h;

    /* renamed from: i, reason: collision with root package name */
    public long f59899i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59900j;

    public a() {
        String e13 = d.f103396a.e();
        Intrinsics.checkNotNullExpressionValue(e13, "queryNetworkClass(...)");
        this.f59896f = e13;
        this.f59895e = new sq0.a(this, 3);
    }

    public final void a(long j13, boolean z13) {
        nl1.d f52740f;
        d4 f03;
        ArrayList arrayList = new ArrayList();
        String e13 = d.f103396a.e();
        Intrinsics.checkNotNullExpressionValue(e13, "queryNetworkClass(...)");
        float f13 = j13 / 1048576.0f;
        arrayList.add(new Pair("Num MB", f13 < 1.0f ? j1.U("%.2f", new Object[]{Float.valueOf(f13), Locale.US}) : String.valueOf((int) f13)));
        arrayList.add(new Pair("Receive", String.valueOf(z13)));
        Activity activity = this.f59897g;
        p pVar = activity instanceof p ? (p) activity : null;
        arrayList.add(new Pair("Surface", (pVar == null || (f52740f = pVar.getF52740f()) == null || (f03 = f52740f.getF0()) == null) ? "Unknown" : f03.toString()));
        arrayList.add(new Pair("Start Network", this.f59896f));
        arrayList.add(new Pair("End Network", e13));
        HashSet hashSet = h.f117076w;
        g.f117075a.k("ExcessiveDataUsage", arrayList);
        this.f59900j = true;
    }

    @Override // m60.f, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.d(this.f59897g, activity)) {
            this.f59897g = null;
        }
    }

    @Override // m60.f, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59897g = activity;
    }
}
