package ads_mobile_sdk;

import a.h5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q02 {

    /* renamed from: c, reason: collision with root package name */
    public static final u71 f9891c = new u71("PrewarmService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f9892d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final jf2 f9893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9894b;

    public q02(Context context) {
        if (tw1.a(context)) {
            this.f9893a = new jf2(context.getApplicationContext(), f9891c, f9892d, new h5(15));
        } else {
            this.f9893a = null;
        }
        this.f9894b = context.getPackageName();
    }

    public static ArrayList a(jy1 jy1Var) {
        ArrayList arrayList = new ArrayList();
        jy1Var.getClass();
        Iterator it = new ArrayList(jy1Var.f7017a).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
