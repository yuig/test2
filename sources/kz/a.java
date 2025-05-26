package kz;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.e11;
import com.pinterest.api.model.j6;
import com.pinterest.api.model.k6;
import com.pinterest.api.model.m11;
import com.pinterest.api.model.ur0;
import com.pinterest.api.model.w01;
import cp.b0;
import cz.e;
import ez.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nm.o;
import nm.s;
import nm.u;
import rg0.s0;
import rg0.u0;
import uj2.q;
import uk1.d;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes3.dex */
public final class a extends t {

    /* renamed from: a, reason: collision with root package name */
    public final e f81136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e anketManager, q networkStateStream, d presenterPinalytics) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f81136a = anketManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        b view = (b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.B1(this);
    }

    public final void p3() {
        e eVar = this.f81136a;
        u0 u0Var = eVar.f53459g;
        if (u0Var != null) {
            ((s0) u0Var).b();
        }
        eVar.a();
        ((b) getView()).q6();
    }

    public final void q3() {
        e11 c13;
        m11 d2;
        m11 d13;
        e eVar = this.f81136a;
        HashMap hashMap = eVar.f53461i;
        if (!hashMap.isEmpty()) {
            ur0 ur0Var = eVar.f53460h;
            String str = null;
            String str2 = ur0Var != null ? ur0Var.f42627a : null;
            w01 w01Var = eVar.f53457e;
            String h10 = (w01Var == null || (d13 = w01Var.d()) == null) ? null : d13.h();
            w01 w01Var2 = eVar.f53457e;
            o oVar = new o();
            HashMap hashMap2 = new HashMap();
            Set keySet = eVar.f53456d.f53471b.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
            for (String str3 : CollectionsKt.F0(keySet)) {
                cz.b bVar = (cz.b) hashMap.get(str3);
                if (bVar != null) {
                    hashMap2.put(str3, bVar);
                }
            }
            j6 j6Var = new j6(0);
            j6Var.f((w01Var2 == null || (d2 = w01Var2.d()) == null) ? null : d2.g());
            u uVar = new u();
            for (Map.Entry entry : hashMap2.entrySet()) {
                cz.b bVar2 = (cz.b) entry.getValue();
                if (bVar2 != null) {
                    List a13 = bVar2.a();
                    TypeToken<List<? extends Object>> typeToken = new TypeToken<List<? extends Object>>() { // from class: com.pinterest.anket.AnketManager$getSurveyAnswers$answers$1$1$1$1$arrayOfAnswers$1
                    };
                    qm.o oVar2 = new qm.o();
                    oVar.m(a13, typeToken.f33847b, oVar2);
                    s Q = oVar2.Q();
                    Q.getClass();
                    if (Q instanceof nm.q) {
                        uVar.r((String) entry.getKey(), Q.f());
                    }
                }
            }
            j6Var.b(uVar.toString());
            u uVar2 = new u();
            ag2.e eVar2 = eVar.f53466n;
            if (eVar2 != null) {
                String str4 = eVar2.f15164b;
                if (!z.j(str4)) {
                    uVar2.u(eVar2.f15163a, str4);
                }
            }
            Integer num = eVar.f53465m;
            if (num != null) {
                uVar2.s(num, "slot");
            }
            String str5 = eVar.f53468p;
            if (str5 != null) {
                uVar2.u("view_type", str5);
            }
            j6Var.d(uVar2.toString());
            j6Var.e(eVar.f53467o);
            u uVar3 = new u();
            if (w01Var2 != null && (c13 = w01Var2.c()) != null) {
                str = c13.b();
            }
            uVar3.u("session_internal", str);
            j6Var.c(uVar3.toString());
            k6 a14 = j6Var.a();
            Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
            eVar.f53453a.c(str2, h10, a14).l(tk2.e.f118017c).i(new b0(eVar, 4), new dv.a(5, cz.d.f53451l));
        }
        ((b) getView()).q6();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        b view = (b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.B1(this);
    }
}
