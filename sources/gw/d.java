package gw;

import ao2.m;
import ao2.o;
import h32.f1;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pb0.g;
import xk2.q;
import xk2.s;

/* loaded from: classes3.dex */
public final class d implements dj.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f66190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f66192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f66193d;

    public d(f fVar, String str, long j13, o oVar) {
        this.f66190a = fVar;
        this.f66191b = str;
        this.f66192c = j13;
        this.f66193d = oVar;
    }

    public final void a(dj.c error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f fVar = this.f66190a;
        ((hw.a) fVar.f66199c).a(hw.b.SDK_GENERATE_QUERY_INFO_FAILED);
        Objects.toString(error);
        ((g) fVar.f66197a).getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f66192c;
        fw.c cVar = fVar.f66198b;
        cVar.getClass();
        String adUnitId = this.f66191b;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        String error2 = error.f55119b;
        Intrinsics.checkNotNullParameter(error2, "error");
        f1 f1Var = f1.GMA_QUERY_INFO_FAILED;
        HashMap x13 = a.a.x("ad_unit_ids", adUnitId, "is_third_party_ad", "true");
        x13.put("fail_reason", error2);
        x13.put("3p_additional_data", fw.c.a(0, currentTimeMillis, cVar.f63036d));
        Unit unit = Unit.f80348a;
        cVar.f63033a.u(f1Var, null, null, x13, false);
        cVar.f63036d = false;
        q qVar = s.f135225b;
        this.f66193d.resumeWith(null);
    }
}
