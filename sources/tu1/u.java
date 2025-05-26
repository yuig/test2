package tu1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.net.ConnectivityManager;
import android.webkit.CookieManager;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.k4;
import lh0.z3;
import ul2.q1;
import ul2.v1;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119455i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f119456j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i13) {
        super(0);
        this.f119455i = i13;
        this.f119456j = obj;
    }

    public final Double b() {
        int i13 = this.f119455i;
        Object obj = this.f119456j;
        switch (i13) {
            case 2:
                return Double.valueOf(((jz1.a) obj).f77772d.a());
            default:
                double intValue = (((Number) r1.f81181a.f81187b.getValue()).intValue() - 6.617d) / 1.905d;
                kz1.c cVar = ((kz1.a) obj).f81181a;
                return Double.valueOf(Math.sqrt(1.45d - ((((((Number) cVar.f81188c.getValue()).longValue() - 2820529182L) / 1.535433518E9d) * (-0.195d)) + ((((((Number) cVar.f81189d.getValue()).intValue() - 1799707) / 432184.0d) * (-0.205d)) + (intValue * (-0.117d))))) * 50);
        }
    }

    public final Collection e() {
        int i13 = this.f119455i;
        Object obj = this.f119456j;
        switch (i13) {
            case 24:
                in2.s sVar = (in2.s) obj;
                return sVar.i(ue.c.s(sVar.f72883b, null, 3));
            default:
                Set keySet = ((ln2.s) obj).f84136j.f84064d.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : keySet) {
                    ym2.b bVar = (ym2.b) obj2;
                    if (!(!bVar.f139464b.e().d()) && !ln2.l.f84096c.contains(bVar)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ym2.b) it.next()).i());
                }
                return arrayList2;
        }
    }

    public final Set f() {
        int i13 = this.f119455i;
        Object obj = this.f119456j;
        switch (i13) {
            case 28:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) obj;
                qVar.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = ((nn2.j) qVar.f33806d).f91603n.c().iterator();
                while (it.hasNext()) {
                    for (am2.m mVar : ue.c.s(((pn2.b0) it.next()).w(), null, 3)) {
                        if ((mVar instanceof dm2.u0) || (mVar instanceof am2.r0)) {
                            hashSet.add(mVar.getName());
                        }
                    }
                }
                List list = ((nn2.j) qVar.f33806d).f91594e.f118363q;
                Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
                nn2.j jVar = (nn2.j) qVar.f33806d;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hashSet.add(bs1.c.L0((vm2.f) jVar.f91601l.f82654c, ((tm2.a0) it2.next()).f118148f));
                }
                List list2 = ((nn2.j) qVar.f33806d).f91594e.f118364r;
                Intrinsics.checkNotNullExpressionValue(list2, "getPropertyList(...)");
                nn2.j jVar2 = (nn2.j) qVar.f33806d;
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    hashSet.add(bs1.c.L0((vm2.f) jVar2.f91601l.f82654c, ((tm2.i0) it3.next()).f118328f));
                }
                return i1.i(hashSet, hashSet);
            default:
                nn2.q qVar2 = (nn2.q) obj;
                Set n13 = qVar2.n();
                if (n13 == null) {
                    return null;
                }
                return i1.i(i1.i(qVar2.m(), qVar2.f91631c.f91622c.keySet()), n13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f119455i;
        Object obj = this.f119456j;
        switch (i13) {
            case 1:
                return Boolean.valueOf(((f0) obj).f119374a.c(null, false, 0));
            default:
                k4 k4Var = ((hc2.d) obj).f68744d;
                z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                k4Var.getClass();
                Intrinsics.checkNotNullParameter("enabled", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                return Boolean.valueOf(((g1) k4Var.f83410a).o("android_video_unify_grid_prefetch", "enabled", activate));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119455i;
        boolean z13 = true;
        ?? r43 = 0;
        Object obj = this.f119456j;
        switch (i13) {
            case 0:
                Object obj2 = ((v) obj).f119459b.f119465b.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return new AtomicReference((n0) obj2);
            case 1:
                return invoke();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return Long.valueOf(bf.b.U(((kz1.c) obj).f81186a));
            case 5:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) obj;
                if (((z10.a) qVar.f33805c).l()) {
                    return (oc.c) qVar.f33803a;
                }
                return (oc.c) qVar.f33804b;
            case 6:
                ((e92.d) obj).getClass();
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                return cookieManager;
            case 7:
                BasePlaceholderLoadingLayout basePlaceholderLoadingLayout = (BasePlaceholderLoadingLayout) obj;
                return new LinearGradient(0.0f, basePlaceholderLoadingLayout.getF52380l(), basePlaceholderLoadingLayout.f52290b, basePlaceholderLoadingLayout.getF52380l(), new int[]{bs1.c.B(basePlaceholderLoadingLayout, m60.q0.grid_loading_shimmer_gradient_start), bs1.c.B(basePlaceholderLoadingLayout, m60.q0.grid_loading_shimmer_gradient_middle), bs1.c.B(basePlaceholderLoadingLayout, m60.q0.grid_loading_shimmer_gradient_end)}, (float[]) null, Shader.TileMode.CLAMP);
            case 8:
                return new ac2.a((ac2.b) obj);
            case 9:
                return new dc2.i((b60.a) obj);
            case 10:
                dc2.e eVar = (dc2.e) obj;
                Context context = eVar.f54393a;
                ac2.v vVar = ac2.w.f2066a;
                Intrinsics.checkNotNullParameter(context, "context");
                f7.b bVar = (f7.b) ac2.w.f2068c.a(new l5.a(context, 7));
                Context context2 = eVar.f54393a;
                Intrinsics.checkNotNullParameter(context2, "context");
                z7.i iVar = new z7.i(context, bVar, (h7.a) ac2.w.f2067b.a(new em1.k(context2, 17)), (g7.e) eVar.f54395c.get(), Executors.newSingleThreadExecutor());
                boolean z14 = iVar.f140947f;
                z7.g gVar = iVar.f140943b;
                if (!z14) {
                    iVar.f140947f = true;
                    iVar.f140946e++;
                    gVar.obtainMessage(2, 1, 0).sendToTarget();
                    boolean c13 = iVar.c();
                    Iterator it = iVar.f140945d.iterator();
                    if (it.hasNext()) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                        throw null;
                    }
                    if (c13) {
                        iVar.a();
                    }
                }
                Context context3 = kb0.a.f79058b;
                kb.w0.f79048a.a(m60.f0.j0().getApplicationContext());
                Requirements requirements = new Requirements(17);
                int i14 = p8.a.f99116a;
                int i15 = requirements.f18842a;
                int i16 = i14 & i15;
                if (i16 != i15) {
                    requirements = new Requirements(i16);
                }
                if (!requirements.equals((Requirements) iVar.f140952k.f26944d)) {
                    c8.d dVar = iVar.f140952k;
                    Context context4 = dVar.f26941a;
                    androidx.appcompat.app.i0 i0Var = (androidx.appcompat.app.i0) dVar.f26946f;
                    i0Var.getClass();
                    context4.unregisterReceiver(i0Var);
                    dVar.f26946f = null;
                    if (d7.n0.f53866a >= 24 && ((c8.c) dVar.f26947g) != null) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) dVar.f26941a.getSystemService("connectivity");
                        connectivityManager.getClass();
                        c8.c cVar = (c8.c) dVar.f26947g;
                        cVar.getClass();
                        connectivityManager.unregisterNetworkCallback(cVar);
                        dVar.f26947g = null;
                    }
                    c8.d dVar2 = new c8.d(iVar.f140942a, iVar.f140944c, requirements);
                    iVar.f140952k = dVar2;
                    iVar.b(iVar.f140952k, dVar2.b());
                }
                if (iVar.f140948g != 1) {
                    iVar.f140948g = 1;
                    iVar.f140946e++;
                    gVar.obtainMessage(5, 1, 0).sendToTarget();
                }
                return iVar;
            case 11:
                return invoke();
            case 12:
                kd2.i iVar2 = (kd2.i) obj;
                iVar2.getClass();
                return new kd2.e(iVar2);
            case 13:
                return v1.a(((ul2.i0) obj).c());
            case 14:
                return new ul2.n0((ul2.o0) obj);
            case 15:
                return new ul2.t0((ul2.v0) obj);
            case 16:
                q1 q1Var = (q1) obj;
                return q1Var.a(q1Var.f122585a);
            case 17:
                switch (i13) {
                    case 17:
                        return ((dm2.c0) ((am2.d0) obj).H(xl2.r.f135329i)).f55405g;
                    default:
                        am2.u0 u0Var = (am2.u0) obj;
                        return (in2.n) u0Var.f15596b.invoke(u0Var.f15597c);
                }
            case 18:
                zl2.k kVar = (zl2.k) obj;
                Function0 function0 = kVar.f142134f;
                if (function0 != null) {
                    zl2.i iVar3 = (zl2.i) function0.invoke();
                    kVar.f142134f = null;
                    return iVar3;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            case 19:
                switch (i13) {
                    case 17:
                        return ((dm2.c0) ((am2.d0) obj).H(xl2.r.f135329i)).f55405g;
                    default:
                        am2.u0 u0Var2 = (am2.u0) obj;
                        return (in2.n) u0Var2.f15596b.invoke(u0Var2.f15597c);
                }
            case 20:
                bm2.k kVar2 = (bm2.k) obj;
                return kVar2.f23543a.i(kVar2.f23544b).j();
            case 21:
                im2.b0 b0Var = (im2.b0) obj;
                yk2.b bVar2 = new yk2.b();
                bVar2.add(b0Var.f72687a.getDescription());
                im2.j0 j0Var = b0Var.f72688b;
                if (j0Var != null) {
                    bVar2.add("under-migration:" + j0Var.getDescription());
                }
                for (Map.Entry entry : b0Var.f72689c.entrySet()) {
                    bVar2.add("@" + entry.getKey() + ':' + ((im2.j0) entry.getValue()).getDescription());
                }
                return (String[]) kotlin.collections.e0.a(bVar2).toArray(new String[0]);
            case 22:
                mm2.d dVar3 = (mm2.d) obj;
                Collection values = ((Map) lb.l0.B0(dVar3.f87656c.f87725i, mm2.r.f87722m[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    nn2.r a13 = ((lm2.a) dVar3.f87655b.f107929a).f83934d.a(dVar3.f87656c, (rm2.f0) it2.next());
                    if (a13 != null) {
                        arrayList.add(a13);
                    }
                }
                return (in2.n[]) ue.c.z(arrayList).toArray(new in2.n[0]);
            case 23:
                an2.y yVar = (an2.y) obj;
                an2.v changeOptions = an2.v.f15815i;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
                an2.f0 f0Var = yVar.f15821a;
                f0Var.getClass();
                an2.f0 f0Var2 = new an2.f0();
                Field[] declaredFields = an2.f0.class.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                int i17 = 0;
                while (i17 < length) {
                    Field field = declaredFields[i17];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(z13);
                        Object obj3 = field.get(f0Var);
                        nl2.a aVar = obj3 instanceof nl2.a ? (nl2.a) obj3 : null;
                        if (aVar != null) {
                            String name = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            kotlin.text.z.p(name, "is", r43);
                            rl2.d b13 = kotlin.jvm.internal.k0.f80436a.b(an2.f0.class);
                            String name2 = field.getName();
                            StringBuilder sb3 = new StringBuilder("get");
                            String name3 = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                            int length2 = name3.length();
                            String str = name3;
                            if (length2 > 0) {
                                char upperCase = Character.toUpperCase(name3.charAt(r43));
                                String substring = name3.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                str = upperCase + substring;
                            }
                            sb3.append(str);
                            kotlin.jvm.internal.d0 property = new kotlin.jvm.internal.d0(b13, name2, sb3.toString());
                            Intrinsics.checkNotNullParameter(property, "property");
                            field.set(f0Var2, new an2.d0(aVar.f91309a, f0Var2));
                        }
                    }
                    i17++;
                    z13 = true;
                    r43 = 0;
                }
                changeOptions.invoke(f0Var2);
                f0Var2.f15771a = true;
                return new an2.y(f0Var2);
            case 24:
                return e();
            case 25:
                return ((pn2.q1) obj).h().c();
            case 26:
                return e();
            case 27:
                return (List) obj;
            case 28:
                return f();
            default:
                return f();
        }
    }
}
