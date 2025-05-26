package cr;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.internal.q;
import com.pinterest.api.model.qe;
import com.pinterest.api.model.vh;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t3;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import m60.u;
import nx.d0;
import z32.m0;

/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final vh f53068a;

    /* renamed from: b, reason: collision with root package name */
    public qe f53069b;

    /* renamed from: c, reason: collision with root package name */
    public final q f53070c;

    public c(Context context, vh vhVar, q qVar) {
        super(context);
        this.f53068a = vhVar;
        this.f53070c = qVar;
    }

    public final void a() {
        NavigationImpl z03 = Navigation.z0((ScreenLocation) t3.f51398d.getValue(), this.f53069b.f41278a);
        z03.y0("VALUE_RELATED", "com.pinterest.EXTRA_SEARCH_MODE");
        vh vhVar = this.f53068a;
        String str = vhVar.A;
        if (str != null) {
            z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", str);
        }
        String id3 = vhVar.getId();
        if (id3 != null) {
            z03.m0("com.pinterest.EXTRA_SEARCH_SOURCE_ID", id3);
        }
        d0 a13 = sh.f.a();
        f1 f1Var = f1.TAP;
        g0 g0Var = g0.DYNAMIC_GRID_STORY;
        HashMap hashMap = new HashMap();
        hashMap.put("story_type", vhVar.q());
        m0 m0Var = vhVar.f42868z;
        hashMap.put("container_type", m0Var != null ? String.valueOf(m0Var.value()) : null);
        a13.h0(f1Var, null, g0Var, id3, hashMap, null, null, false);
        u.f85943a.d(z03);
    }
}
