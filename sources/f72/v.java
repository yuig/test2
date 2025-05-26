package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import g72.v4;
import g72.x4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class v implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f61373a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61374b;

    static {
        v vVar = new v();
        f61373a = vVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleEntity", vVar, 27);
        y0Var.k("id", false);
        y0Var.k("is_draft", true);
        y0Var.k("images", true);
        y0Var.k("posted_comments_count", false);
        y0Var.k("is_compatible", true);
        y0Var.k("details", true);
        y0Var.k("updated_at", true);
        y0Var.k("comments_count", false);
        y0Var.k("private", true);
        y0Var.k("created_at", true);
        y0Var.k("type", false);
        y0Var.k("reaction_counts", false);
        y0Var.k("items", true);
        y0Var.k("link", true);
        y0Var.k("posted_at", true);
        y0Var.k("is_finished", true);
        y0Var.k("reaction_by_me", false);
        y0Var.k("descendants_count", false);
        y0Var.k("user", true);
        y0Var.k("effect_data", true);
        y0Var.k("parent", true);
        y0Var.k("root", true);
        y0Var.k("canonical_pin", true);
        y0Var.k("edge_score", true);
        y0Var.k("image_tracking_id", true);
        y0Var.k("source_app_type_detailed", true);
        y0Var.k("version", true);
        f61374b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61374b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61374b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61382a, y0Var);
        boolean j13 = b13.j(y0Var);
        Boolean bool = value.f61383b;
        if (j13 || !Intrinsics.d(bool, Boolean.FALSE)) {
            b13.A(y0Var, 1, qo2.g.f104555a, bool);
        }
        boolean j14 = b13.j(y0Var);
        i iVar = value.f61384c;
        if (j14 || iVar != null) {
            b13.A(y0Var, 2, g.f61249a, iVar);
        }
        b13.D(3, value.f61385d, y0Var);
        boolean j15 = b13.j(y0Var);
        boolean z13 = value.f61386e;
        if (j15 || !z13) {
            b13.E(y0Var, 4, z13);
        }
        boolean j16 = b13.j(y0Var);
        String str = value.f61387f;
        if (j16 || str != null) {
            b13.A(y0Var, 5, qo2.j1.f104576a, str);
        }
        boolean j17 = b13.j(y0Var);
        String str2 = value.f61388g;
        if (j17 || str2 != null) {
            b13.A(y0Var, 6, qo2.j1.f104576a, str2);
        }
        b13.D(7, value.f61389h, y0Var);
        boolean j18 = b13.j(y0Var);
        Boolean bool2 = value.f61390i;
        if (j18 || !Intrinsics.d(bool2, Boolean.FALSE)) {
            b13.A(y0Var, 8, qo2.g.f104555a, bool2);
        }
        boolean j19 = b13.j(y0Var);
        String str3 = value.f61391j;
        if (j19 || str3 != null) {
            b13.A(y0Var, 9, qo2.j1.f104576a, str3);
        }
        b13.m(10, value.f61392k, y0Var);
        b13.u(y0Var, 11, m.f61306a, value.f61393l);
        boolean j23 = b13.j(y0Var);
        List list = value.f61394m;
        if (j23 || list != null) {
            b13.A(y0Var, 12, x.B[12], list);
        }
        boolean j24 = b13.j(y0Var);
        String str4 = value.f61395n;
        if (j24 || str4 != null) {
            b13.A(y0Var, 13, qo2.j1.f104576a, str4);
        }
        boolean j25 = b13.j(y0Var);
        String str5 = value.f61396o;
        if (j25 || str5 != null) {
            b13.A(y0Var, 14, qo2.j1.f104576a, str5);
        }
        boolean j26 = b13.j(y0Var);
        Boolean bool3 = value.f61397p;
        if (j26 || !Intrinsics.d(bool3, Boolean.FALSE)) {
            b13.A(y0Var, 15, qo2.g.f104555a, bool3);
        }
        b13.D(16, value.f61398q, y0Var);
        b13.D(17, value.f61399r, y0Var);
        boolean j27 = b13.j(y0Var);
        d72.f fVar = value.f61400s;
        if (j27 || fVar != null) {
            b13.A(y0Var, 18, d72.d.f53917a, fVar);
        }
        boolean j28 = b13.j(y0Var);
        x4 x4Var = value.f61401t;
        if (j28 || x4Var != null) {
            b13.A(y0Var, 19, v4.f64131a, x4Var);
        }
        boolean j29 = b13.j(y0Var);
        x xVar = value.f61402u;
        if (j29 || xVar != null) {
            b13.A(y0Var, 20, u0.f61370b, xVar);
        }
        boolean j33 = b13.j(y0Var);
        x xVar2 = value.f61403v;
        if (j33 || xVar2 != null) {
            b13.A(y0Var, 21, y0.f61415b, xVar2);
        }
        boolean j34 = b13.j(y0Var);
        c cVar = value.f61404w;
        if (j34 || cVar != null) {
            b13.A(y0Var, 22, a.f61220a, cVar);
        }
        boolean j35 = b13.j(y0Var);
        Long l13 = value.f61405x;
        if (j35 || l13 != null) {
            b13.A(y0Var, 23, qo2.m0.f104592a, l13);
        }
        boolean j36 = b13.j(y0Var);
        String str6 = value.f61406y;
        if (j36 || str6 != null) {
            b13.A(y0Var, 24, qo2.j1.f104576a, str6);
        }
        boolean j37 = b13.j(y0Var);
        Integer num = value.f61407z;
        if (j37 || num != null) {
            b13.A(y0Var, 25, qo2.f0.f104550a, num);
        }
        boolean j38 = b13.j(y0Var);
        String str7 = value.A;
        if (j38 || str7 != null) {
            b13.A(y0Var, 26, qo2.j1.f104576a, str7);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b[] bVarArr = x.B;
        qo2.j1 j1Var = qo2.j1.f104576a;
        qo2.g gVar = qo2.g.f104555a;
        no2.b J2 = f0.h.J(gVar);
        no2.b J3 = f0.h.J(g.f61249a);
        qo2.f0 f0Var = qo2.f0.f104550a;
        return new no2.b[]{j1Var, J2, J3, f0Var, gVar, f0.h.J(j1Var), f0.h.J(j1Var), f0Var, f0.h.J(gVar), f0.h.J(j1Var), j1Var, m.f61306a, f0.h.J(bVarArr[12]), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(gVar), f0Var, f0Var, f0.h.J(d72.d.f53917a), f0.h.J(v4.f64131a), f0.h.J(u0.f61370b), f0.h.J(y0.f61415b), f0.h.J(a.f61220a), f0.h.J(qo2.m0.f104592a), f0.h.J(j1Var), f0.h.J(f0Var), f0.h.J(j1Var)};
    }

    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:372)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    @Override // no2.a
    public final Object e(po2.c decoder) {
        String str;
        int i13;
        String str2;
        Integer num;
        x4 x4Var;
        String str3;
        o oVar;
        List list;
        Long l13;
        String str4;
        Boolean bool;
        c cVar;
        String str5;
        x xVar;
        String str6;
        x xVar2;
        Integer num2;
        o oVar2;
        String str7;
        c cVar2;
        String str8;
        x xVar3;
        String str9;
        Integer num3;
        o oVar3;
        List list2;
        int i14;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61374b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = x.B;
        Long l14 = null;
        String str10 = null;
        Integer num4 = null;
        String str11 = null;
        d72.f fVar = null;
        x4 x4Var2 = null;
        x xVar4 = null;
        Boolean bool2 = null;
        String str12 = null;
        x xVar5 = null;
        c cVar3 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        Boolean bool3 = null;
        i iVar = null;
        String str16 = null;
        String str17 = null;
        Boolean bool4 = null;
        String str18 = null;
        o oVar4 = null;
        List list3 = null;
        int i15 = 0;
        int i16 = 0;
        boolean z13 = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z14 = true;
        while (z14) {
            no2.b[] bVarArr2 = bVarArr;
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    str2 = str10;
                    num = num4;
                    x4Var = x4Var2;
                    str3 = str13;
                    oVar = oVar4;
                    list = list3;
                    l13 = l14;
                    str4 = str11;
                    bool = bool4;
                    cVar = cVar3;
                    str5 = str17;
                    xVar = xVar5;
                    str6 = str16;
                    xVar2 = xVar4;
                    z14 = false;
                    x4Var2 = x4Var;
                    xVar4 = xVar2;
                    str11 = str4;
                    bVarArr = bVarArr2;
                    str13 = str3;
                    oVar4 = oVar;
                    str16 = str6;
                    xVar5 = xVar;
                    num4 = num;
                    str17 = str5;
                    cVar3 = cVar;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 0:
                    str2 = str10;
                    num = num4;
                    x4Var = x4Var2;
                    str3 = str13;
                    oVar = oVar4;
                    list = list3;
                    l13 = l14;
                    str4 = str11;
                    bool = bool4;
                    cVar = cVar3;
                    str5 = str17;
                    xVar = xVar5;
                    str6 = str16;
                    xVar2 = xVar4;
                    str15 = b13.k(y0Var, 0);
                    i15 |= 1;
                    x4Var2 = x4Var;
                    xVar4 = xVar2;
                    str11 = str4;
                    bVarArr = bVarArr2;
                    str13 = str3;
                    oVar4 = oVar;
                    str16 = str6;
                    xVar5 = xVar;
                    num4 = num;
                    str17 = str5;
                    cVar3 = cVar;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 1:
                    str2 = str10;
                    num = num4;
                    str3 = str13;
                    oVar = oVar4;
                    list = list3;
                    l13 = l14;
                    str4 = str11;
                    bool = bool4;
                    cVar = cVar3;
                    str5 = str17;
                    xVar = xVar5;
                    str6 = str16;
                    xVar2 = xVar4;
                    x4Var = x4Var2;
                    bool3 = (Boolean) b13.v(y0Var, 1, qo2.g.f104555a, bool3);
                    i15 |= 2;
                    x4Var2 = x4Var;
                    xVar4 = xVar2;
                    str11 = str4;
                    bVarArr = bVarArr2;
                    str13 = str3;
                    oVar4 = oVar;
                    str16 = str6;
                    xVar5 = xVar;
                    num4 = num;
                    str17 = str5;
                    cVar3 = cVar;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 2:
                    str2 = str10;
                    num = num4;
                    str3 = str13;
                    oVar = oVar4;
                    list = list3;
                    l13 = l14;
                    str4 = str11;
                    bool = bool4;
                    cVar = cVar3;
                    str5 = str17;
                    xVar = xVar5;
                    str6 = str16;
                    xVar2 = xVar4;
                    iVar = (i) b13.v(y0Var, 2, g.f61249a, iVar);
                    i15 |= 4;
                    xVar4 = xVar2;
                    str11 = str4;
                    bVarArr = bVarArr2;
                    str13 = str3;
                    oVar4 = oVar;
                    str16 = str6;
                    xVar5 = xVar;
                    num4 = num;
                    str17 = str5;
                    cVar3 = cVar;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 3:
                    str2 = str10;
                    num2 = num4;
                    oVar2 = oVar4;
                    list = list3;
                    l13 = l14;
                    str7 = str11;
                    bool = bool4;
                    cVar2 = cVar3;
                    str8 = str17;
                    xVar3 = xVar5;
                    i17 = b13.D(y0Var, 3);
                    i15 |= 8;
                    xVar5 = xVar3;
                    str11 = str7;
                    bVarArr = bVarArr2;
                    oVar4 = oVar2;
                    str17 = str8;
                    cVar3 = cVar2;
                    num4 = num2;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 4:
                    str2 = str10;
                    num2 = num4;
                    oVar2 = oVar4;
                    list = list3;
                    l13 = l14;
                    str7 = str11;
                    bool = bool4;
                    cVar2 = cVar3;
                    str8 = str17;
                    xVar3 = xVar5;
                    z13 = b13.h(y0Var, 4);
                    i15 |= 16;
                    xVar5 = xVar3;
                    str11 = str7;
                    bVarArr = bVarArr2;
                    oVar4 = oVar2;
                    str17 = str8;
                    cVar3 = cVar2;
                    num4 = num2;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 5:
                    str2 = str10;
                    num2 = num4;
                    oVar2 = oVar4;
                    list = list3;
                    l13 = l14;
                    bool = bool4;
                    cVar2 = cVar3;
                    str8 = str17;
                    str16 = (String) b13.v(y0Var, 5, qo2.j1.f104576a, str16);
                    i15 |= 32;
                    xVar5 = xVar5;
                    str11 = str11;
                    bVarArr = bVarArr2;
                    str13 = str13;
                    oVar4 = oVar2;
                    str17 = str8;
                    cVar3 = cVar2;
                    num4 = num2;
                    bool4 = bool;
                    l14 = l13;
                    list3 = list;
                    str10 = str2;
                case 6:
                    str2 = str10;
                    list = list3;
                    Long l15 = l14;
                    str17 = (String) b13.v(y0Var, 6, qo2.j1.f104576a, str17);
                    i15 |= 64;
                    cVar3 = cVar3;
                    str11 = str11;
                    bVarArr = bVarArr2;
                    str13 = str13;
                    oVar4 = oVar4;
                    bool4 = bool4;
                    l14 = l15;
                    num4 = num4;
                    list3 = list;
                    str10 = str2;
                case 7:
                    str9 = str10;
                    num3 = num4;
                    oVar3 = oVar4;
                    list2 = list3;
                    i16 = b13.D(y0Var, 7);
                    i15 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    str11 = str11;
                    l14 = l14;
                    bVarArr = bVarArr2;
                    list3 = list2;
                    oVar4 = oVar3;
                    str10 = str9;
                    num4 = num3;
                case 8:
                    str9 = str10;
                    num3 = num4;
                    oVar3 = oVar4;
                    list2 = list3;
                    bool4 = (Boolean) b13.v(y0Var, 8, qo2.g.f104555a, bool4);
                    i15 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    str11 = str11;
                    l14 = l14;
                    bVarArr = bVarArr2;
                    str13 = str13;
                    list3 = list2;
                    oVar4 = oVar3;
                    str10 = str9;
                    num4 = num3;
                case 9:
                    num3 = num4;
                    str18 = (String) b13.v(y0Var, 9, qo2.j1.f104576a, str18);
                    i15 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    str11 = str11;
                    bVarArr = bVarArr2;
                    str13 = str13;
                    str10 = str10;
                    oVar4 = oVar4;
                    num4 = num3;
                case 10:
                    str9 = str10;
                    num3 = num4;
                    str14 = b13.k(y0Var, 10);
                    i15 |= 1024;
                    bVarArr = bVarArr2;
                    str10 = str9;
                    num4 = num3;
                case 11:
                    str9 = str10;
                    num3 = num4;
                    oVar4 = (o) b13.C(y0Var, 11, m.f61306a, oVar4);
                    i15 |= 2048;
                    bVarArr = bVarArr2;
                    str13 = str13;
                    str10 = str9;
                    num4 = num3;
                case 12:
                    str2 = str10;
                    list3 = (List) b13.v(y0Var, 12, bVarArr2[12], list3);
                    i15 |= 4096;
                    bVarArr = bVarArr2;
                    str13 = str13;
                    str10 = str2;
                case 13:
                    str2 = str10;
                    str13 = (String) b13.v(y0Var, 13, qo2.j1.f104576a, str13);
                    i15 |= 8192;
                    bVarArr = bVarArr2;
                    str10 = str2;
                case 14:
                    str = str13;
                    str12 = (String) b13.v(y0Var, 14, qo2.j1.f104576a, str12);
                    i15 |= 16384;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 15:
                    str = str13;
                    bool2 = (Boolean) b13.v(y0Var, 15, qo2.g.f104555a, bool2);
                    i13 = 32768;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 16:
                    i18 = b13.D(y0Var, 16);
                    i14 = 65536;
                    i15 |= i14;
                    bVarArr = bVarArr2;
                case 17:
                    i19 = b13.D(y0Var, 17);
                    i14 = 131072;
                    i15 |= i14;
                    bVarArr = bVarArr2;
                case 18:
                    str = str13;
                    fVar = (d72.f) b13.v(y0Var, 18, d72.d.f53917a, fVar);
                    i13 = 262144;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 19:
                    str = str13;
                    x4Var2 = (x4) b13.v(y0Var, 19, v4.f64131a, x4Var2);
                    i13 = 524288;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 20:
                    str = str13;
                    xVar4 = (x) b13.v(y0Var, 20, u0.f61370b, xVar4);
                    i13 = 1048576;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 21:
                    str = str13;
                    xVar5 = (x) b13.v(y0Var, 21, y0.f61415b, xVar5);
                    i13 = 2097152;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 22:
                    str = str13;
                    cVar3 = (c) b13.v(y0Var, 22, a.f61220a, cVar3);
                    i13 = 4194304;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 23:
                    str = str13;
                    l14 = (Long) b13.v(y0Var, 23, qo2.m0.f104592a, l14);
                    i13 = 8388608;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 24:
                    str = str13;
                    str11 = (String) b13.v(y0Var, 24, qo2.j1.f104576a, str11);
                    i13 = 16777216;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 25:
                    str = str13;
                    num4 = (Integer) b13.v(y0Var, 25, qo2.f0.f104550a, num4);
                    i13 = 33554432;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                case 26:
                    str = str13;
                    str10 = (String) b13.v(y0Var, 26, qo2.j1.f104576a, str10);
                    i13 = 67108864;
                    i15 |= i13;
                    bVarArr = bVarArr2;
                    str13 = str;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        String str19 = str10;
        Integer num5 = num4;
        x4 x4Var3 = x4Var2;
        Boolean bool5 = bool3;
        o oVar5 = oVar4;
        List list4 = list3;
        Boolean bool6 = bool4;
        c cVar4 = cVar3;
        String str20 = str17;
        x xVar6 = xVar5;
        String str21 = str16;
        x xVar7 = xVar4;
        i iVar2 = iVar;
        b13.a(y0Var);
        return new x(i15, str15, bool5, iVar2, i17, z13, str21, str20, i16, bool6, str18, str14, oVar5, list4, str13, str12, bool2, i18, i19, fVar, x4Var3, xVar7, xVar6, cVar4, l14, str11, num5, str19);
    }
}
