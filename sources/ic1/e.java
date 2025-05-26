package ic1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import u40.a0;
import u40.b0;
import u40.z;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72075i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f72076j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f72075i = i13;
        this.f72076j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        u40.u uVar;
        String str2;
        String str3;
        String str4;
        int i13 = this.f72075i;
        str = "";
        f fVar = this.f72076j;
        switch (i13) {
            case 0:
                pc.h data = (pc.h) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                fVar.getClass();
                z zVar = null;
                u40.t tVar = ((b0) data.a()).f120295a;
                if (tVar != null) {
                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                    a0 a0Var = tVar instanceof a0 ? (a0) tVar : null;
                    if (a0Var != null && (uVar = a0Var.f120289f) != null) {
                        Intrinsics.checkNotNullParameter(uVar, "<this>");
                        if (uVar instanceof z) {
                            zVar = (z) uVar;
                        }
                    }
                }
                if (zVar != null) {
                    return zVar;
                }
                throw new IllegalStateException("Cannot get info on this account");
            case 1:
                z account = (z) obj;
                jc1.g gVar = fVar.f72077k;
                if (gVar != null) {
                    Intrinsics.f(account);
                    Intrinsics.checkNotNullParameter(account, "account");
                    List list = account.f120464o;
                    if (list == null) {
                        list = q0.f80391a;
                    }
                    gVar.f75466i = list;
                    gVar.f75467j = list;
                    gVar.f75468k = account.f120452c;
                    String str5 = account.f120456g;
                    if (str5 == null) {
                        str5 = "";
                    }
                    gVar.f75469l = str5;
                    String str6 = account.f120463n;
                    gVar.f75470m = str6 != null ? str6 : "";
                    gVar.f75471n = Intrinsics.d(account.f120468s, Boolean.TRUE);
                }
                return Unit.f80348a;
            default:
                z user = (z) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                fVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new g());
                arrayList.add(new u(new d(user)));
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = user.f120460k;
                boolean d2 = Intrinsics.d(bool2, bool);
                u40.x partner = user.f120467r;
                if (!d2) {
                    String str7 = user.f120453d;
                    if (str7 == null) {
                        str7 = "";
                    }
                    arrayList.add(new k(str7));
                    String str8 = user.f120454e;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList.add(new l(str8));
                } else {
                    if (partner == null) {
                        throw new IllegalStateException("Cannot get info on this account");
                    }
                    String str9 = partner.f120437e;
                    if (str9 == null) {
                        str9 = "";
                    }
                    arrayList.add(new i(str9));
                    String str10 = partner.f120439g;
                    if (str10 == null) {
                        str10 = "";
                    }
                    arrayList.add(new j(str10));
                }
                String str11 = user.f120456g;
                if (str11 == null) {
                    str11 = "";
                }
                arrayList.add(new n(str11));
                if (fVar.f72078l) {
                    List list2 = user.f120464o;
                    if (list2 == null || (str4 = CollectionsKt.Z(list2, "/", null, null, 0, null, null, 62)) == null) {
                        str4 = "";
                    }
                    arrayList.add(new m(str4));
                }
                String str12 = user.f120463n;
                if (str12 == null) {
                    str12 = "";
                }
                arrayList.add(new h(str12));
                String str13 = user.f120462m;
                if (str13 == null) {
                    str13 = "";
                }
                arrayList.add(new o(str13));
                if (Intrinsics.d(bool2, bool)) {
                    if (partner == null) {
                        throw new IllegalStateException("Cannot get info on this account");
                    }
                    Intrinsics.checkNotNullParameter(partner, "partner");
                    String str14 = partner.f120438f;
                    if (str14 == null) {
                        str14 = "";
                    }
                    Intrinsics.checkNotNullParameter(str14, "<set-?>");
                    kh2.r.f79662c = str14;
                    Intrinsics.checkNotNullParameter(str14, "<set-?>");
                    kh2.r.f79663d = str14;
                    u40.w wVar = partner.f120440h;
                    if (wVar == null || (str2 = wVar.f120432c) == null) {
                        str2 = "+0";
                    }
                    Intrinsics.checkNotNullParameter(str2, "<set-?>");
                    kh2.r.f79664e = str2;
                    if ((!kotlin.text.z.j(str2)) && kh2.r.f79664e.charAt(0) != '+') {
                        String str15 = "+" + kh2.r.f79664e;
                        Intrinsics.checkNotNullParameter(str15, "<set-?>");
                        kh2.r.f79664e = str15;
                    }
                    String str16 = kh2.r.f79664e;
                    Intrinsics.checkNotNullParameter(str16, "<set-?>");
                    kh2.r.f79665f = str16;
                    if (wVar != null && (str3 = wVar.f120431b) != null) {
                        str = str3;
                    }
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    kh2.r.f79666g = str;
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    kh2.r.f79667h = str;
                    arrayList.add(new q());
                }
                if (fVar.f72079m) {
                    arrayList.add(new s(Intrinsics.d(user.f120468s, bool)));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v vVar = (v) it.next();
                    v vVar2 = (v) fVar.f72082p.get(k0.f80436a.b(vVar.getClass()));
                    if (vVar2 != null) {
                        vVar = vVar2;
                    }
                    arrayList2.add(vVar);
                }
                return arrayList2;
        }
    }
}
