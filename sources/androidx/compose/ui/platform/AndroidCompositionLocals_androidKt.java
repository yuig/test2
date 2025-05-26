package androidx.compose.ui.platform;

import am.d;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.f;
import bs1.c;
import i2.c2;
import i2.d2;
import i2.n;
import i2.o;
import i2.q1;
import i2.s;
import i2.u;
import i2.u0;
import i2.w3;
import i2.y3;
import java.util.LinkedHashMap;
import k1.s2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ma.g;
import ma.i;
import org.jetbrains.annotations.NotNull;
import r2.k;
import s6.b;
import t3.c0;
import t3.d1;
import t3.e1;
import t3.f1;
import t3.f2;
import t3.g1;
import t3.h1;
import t3.j2;
import t3.k2;
import t3.p;
import t3.t1;
import x3.e;
import y3.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Li2/c2;", "Landroidx/lifecycle/z;", "getLocalLifecycleOwner", "()Li2/c2;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f17454a = new u0(y3.f71400a, e1.f115950j);

    /* renamed from: b, reason: collision with root package name */
    public static final w3 f17455b = new w3(e1.f115951k);

    /* renamed from: c, reason: collision with root package name */
    public static final w3 f17456c = new w3(e1.f115952l);

    /* renamed from: d, reason: collision with root package name */
    public static final w3 f17457d = new w3(e1.f115953m);

    /* renamed from: e, reason: collision with root package name */
    public static final w3 f17458e = new w3(e1.f115954n);

    /* renamed from: f, reason: collision with root package name */
    public static final w3 f17459f = new w3(e1.f115955o);

    public static final void a(c0 c0Var, Function2 function2, o oVar, int i13) {
        int i14;
        m mVar;
        boolean z13;
        s sVar = (s) oVar;
        sVar.Y(1396852028);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(c0Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            Context context = c0Var.getContext();
            Object J2 = sVar.J();
            d dVar = n.f71185a;
            if (J2 == dVar) {
                J2 = c.u1(new Configuration(context.getResources().getConfiguration()), y3.f71400a);
                sVar.g0(J2);
            }
            q1 q1Var = (q1) J2;
            Object J3 = sVar.J();
            if (J3 == dVar) {
                J3 = new s2(q1Var, 14);
                sVar.g0(J3);
            }
            c0Var.f115913w = (Function1) J3;
            Object J4 = sVar.J();
            if (J4 == dVar) {
                J4 = new t1(context);
                sVar.g0(J4);
            }
            t1 t1Var = (t1) J4;
            t3.n l13 = c0Var.l();
            if (l13 == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object J5 = sVar.J();
            i iVar = l13.f116096b;
            if (J5 == dVar) {
                Object parent = c0Var.getParent();
                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(u2.s.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = k.class.getSimpleName() + ':' + str;
                g savedStateRegistry = iVar.getSavedStateRegistry();
                Bundle a13 = savedStateRegistry.a(str2);
                LinkedHashMap d2 = a13 != null ? d1.d(a13) : null;
                p pVar = p.f116118l;
                w3 w3Var = r2.o.f106060a;
                r2.m mVar2 = new r2.m(d2, pVar);
                try {
                    z13 = true;
                    savedStateRegistry.c(str2, new f(mVar2, 1));
                } catch (IllegalArgumentException unused) {
                    z13 = false;
                }
                j2 j2Var = new j2(mVar2, new k2(z13, savedStateRegistry, str2));
                sVar.g0(j2Var);
                J5 = j2Var;
            }
            j2 j2Var2 = (j2) J5;
            Unit unit = Unit.f80348a;
            boolean j13 = sVar.j(j2Var2);
            Object J6 = sVar.J();
            if (j13 || J6 == dVar) {
                J6 = new s2(j2Var2, 15);
                sVar.g0(J6);
            }
            u.b(unit, (Function1) J6, sVar);
            Configuration configuration = (Configuration) q1Var.getValue();
            Object J7 = sVar.J();
            if (J7 == dVar) {
                J7 = new x3.d();
                sVar.g0(J7);
            }
            x3.d dVar2 = (x3.d) J7;
            Object J8 = sVar.J();
            Object obj = J8;
            if (J8 == dVar) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                sVar.g0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object J9 = sVar.J();
            if (J9 == dVar) {
                J9 = new g1(configuration3, dVar2);
                sVar.g0(J9);
            }
            g1 g1Var = (g1) J9;
            boolean j14 = sVar.j(context);
            Object J10 = sVar.J();
            if (j14 || J10 == dVar) {
                J10 = new i2.i(5, context, g1Var);
                sVar.g0(J10);
            }
            u.b(dVar2, (Function1) J10, sVar);
            Object J11 = sVar.J();
            if (J11 == dVar) {
                J11 = new e();
                sVar.g0(J11);
            }
            e eVar = (e) J11;
            Object J12 = sVar.J();
            if (J12 == dVar) {
                J12 = new h1(eVar);
                sVar.g0(J12);
            }
            h1 h1Var = (h1) J12;
            boolean j15 = sVar.j(context);
            Object J13 = sVar.J();
            if (j15 || J13 == dVar) {
                J13 = new i2.i(6, context, h1Var);
                sVar.g0(J13);
            }
            u.b(eVar, (Function1) J13, sVar);
            u0 u0Var = f2.f115997t;
            com.bumptech.glide.d.b(new d2[]{f17454a.c((Configuration) q1Var.getValue()), f17455b.c(context), b.f111213a.c(l13.f116095a), f17458e.c(iVar), r2.o.f106060a.c(j2Var2), f17459f.c(c0Var), f17456c.c(dVar2), f17457d.c(eVar), u0Var.c(Boolean.valueOf(((Boolean) sVar.m(u0Var)).booleanValue() | ((Build.VERSION.SDK_INT < 31 || (mVar = c0Var.f115914w0) == null) ? false : ((Boolean) mVar.f136728a.getValue()).booleanValue())))}, q2.i.c(1471621628, new f1(c0Var, t1Var, function2), sVar), sVar, 56);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.f2(c0Var, function2, i13, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final c2 getLocalLifecycleOwner() {
        return b.f111213a;
    }
}
