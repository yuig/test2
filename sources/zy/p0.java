package zy;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.vh;
import h32.v2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.y0;

/* loaded from: classes3.dex */
public final class p0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final u50.r f143105a;

    /* renamed from: b, reason: collision with root package name */
    public final gw f143106b;

    public p0(u50.r eventIntake, gw modelHelper) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f143105a = eventIntake;
        this.f143106b = modelHelper;
    }

    @Override // zy.m
    public final void c(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        boolean z13 = impression instanceof v2;
        u50.r rVar = this.f143105a;
        gw gwVar = this.f143106b;
        HashMap hashMap = null;
        if (z13) {
            v2 impression2 = (v2) impression;
            HashMap hashMap2 = new HashMap();
            Intrinsics.checkNotNullParameter(impression2, "impression");
            String str = impression2.f67313c;
            gwVar.getClass();
            vh vhVar = str == null ? null : (vh) ew.f37362f.get(str);
            rVar.a(new k(new y0(impression2, vhVar != null ? kh2.d.E(vhVar) : null, hashMap2, null), str));
            return;
        }
        if (impression instanceof y0) {
            y0 y0Var = (y0) impression;
            String str2 = y0Var.f92481a.f67313c;
            gwVar.getClass();
            vh vhVar2 = str2 == null ? null : (vh) ew.f37362f.get(str2);
            HashMap hashMap3 = y0Var.f92482b;
            if (hashMap3 != null) {
                hashMap = hashMap3;
            } else if (vhVar2 != null) {
                hashMap = kh2.d.E(vhVar2);
            }
            rVar.a(new k(new y0(y0Var.f92481a, hashMap, y0Var.f92483c, y0Var.f92484d), str2));
        }
    }
}
