package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class wm2 implements a.n6 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13122a = new ArrayList();

    @Override // a.n6
    public final void a(HashMap hashMap) {
    }

    @Override // a.n6
    public final void b(HashMap hashMap) {
    }

    @Override // a.n6
    public final synchronized void a(HashMap hashMap, Context context, View view) {
        hashMap.put("vst", new ArrayList(this.f13122a));
        this.f13122a.clear();
    }
}
