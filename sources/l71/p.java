package l71;

import ey.a0;
import ey.g1;
import ey.q1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o71.l0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f81956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uk1.d f81957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy.m f81958c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ip1.b f81959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z61.b f81960e;

    public p(s sVar, uk1.d dVar, vy.m mVar, ip1.b bVar, z61.b bVar2) {
        this.f81956a = sVar;
        this.f81957b = dVar;
        this.f81958c = mVar;
        this.f81959d = bVar;
        this.f81960e = bVar2;
    }

    public final boolean a(br.d model, int i13, boolean z13) {
        String t13;
        Intrinsics.checkNotNullParameter(model, "model");
        br.c cVar = model.f23707e;
        if (cVar == null || (t13 = pe.i.t(cVar)) == null) {
            return false;
        }
        String str = model.f23704b;
        String obj = str != null ? StringsKt.i0(str).toString() : null;
        if (obj == null) {
            obj = "";
        }
        String str2 = obj;
        br.c cVar2 = model.f23707e;
        Intrinsics.checkNotNullExpressionValue(cVar2, "getItemType(...)");
        String B = pe.i.B(cVar2, z13);
        br.c cVar3 = model.f23707e;
        Intrinsics.checkNotNullExpressionValue(cVar3, "getItemType(...)");
        s sVar = this.f81956a;
        h61.h searchType = pe.i.F(cVar3, sVar.f81967x);
        l0 l0Var = new l0(this.f81957b, this.f81958c);
        l0.c(l0Var, sVar.z(), str2, i13, t13, model.f23703a, 32);
        l0Var.a(model);
        this.f81959d.a();
        int i14 = r.f81961a[searchType.ordinal()];
        if (i14 == 1 || i14 == 2) {
            int hashCode = B.hashCode();
            z61.b bVar = this.f81960e;
            if (hashCode == 3649) {
                if (B.equals("rs")) {
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(searchType, "searchType");
                    br.a aVar = br.a.RECENT_HISTORY;
                    q1 pwtSearchType = searchType.toPWTSearchType();
                    new a0(pwtSearchType, aVar, -1).i();
                    Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
                    new g1(pwtSearchType).i();
                }
                bVar.getClass();
                Intrinsics.checkNotNullParameter(searchType, "searchType");
                br.a aVar2 = br.a.AUTO_COMPLETE;
                q1 pwtSearchType2 = searchType.toPWTSearchType();
                new a0(pwtSearchType2, aVar2, -1).i();
                Intrinsics.checkNotNullParameter(pwtSearchType2, "pwtSearchType");
                new g1(pwtSearchType2).i();
            } else if (hashCode != 112784) {
            }
        }
        return true;
    }
}
