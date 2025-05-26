package rd2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f107525e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f107526a;

    /* renamed from: b, reason: collision with root package name */
    public final List f107527b;

    /* renamed from: c, reason: collision with root package name */
    public final List f107528c;

    /* renamed from: d, reason: collision with root package name */
    public final ud2.c f107529d;

    public f(Object constantMapping, List distortionEffects, List colorEffects, ud2.c cVar) {
        Intrinsics.checkNotNullParameter(constantMapping, "constantMapping");
        Intrinsics.checkNotNullParameter(distortionEffects, "distortionEffects");
        Intrinsics.checkNotNullParameter(colorEffects, "colorEffects");
        this.f107526a = constantMapping;
        this.f107527b = distortionEffects;
        this.f107528c = colorEffects;
        this.f107529d = cVar;
    }

    public static androidx.appcompat.widget.a b(bn0.a aVar, String str, String str2) {
        String d2 = com.pinterest.xrenderer.legacy.a.d(str, str2);
        androidx.appcompat.widget.a m13 = aVar.m(d2);
        if (m13.f16503b) {
            return m13;
        }
        throw new IllegalStateException(a.a.p(a.a.w("\n                Can't find `", d2, "` uniform.\n                Seems like `", str2, "` parameter is not used in the effect shader code,\n                and thus the `"), str, "` effect won't react to this parameter value change.\n                This is an unexpected behavior.\n            ").toString());
    }

    public final zd2.d a(String template) {
        Intrinsics.checkNotNullParameter(template, "template");
        e block = new e(this, template, 0);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        return (zd2.d) block.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public final ArrayList c(bn0.a program) {
        ?? r43;
        Intrinsics.checkNotNullParameter(program, "program");
        program.a();
        List list = this.f107527b;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            ud2.b bVar = (ud2.b) obj;
            String d2 = a.a.d("distortionEffect", i14);
            Set<String> a13 = bVar.f121933c.a();
            ArrayList arrayList2 = new ArrayList(g0.q(a13, 10));
            for (String str : a13) {
                arrayList2.add(new c(bVar, b(program, d2, str), str));
            }
            k0.u(arrayList2, arrayList);
            i14 = i15;
        }
        ud2.c cVar = this.f107529d;
        if (cVar != null) {
            Set<String> a14 = cVar.f121933c.a();
            r43 = new ArrayList(g0.q(a14, 10));
            for (String str2 : a14) {
                r43.add(new c(cVar, b(program, "kernelEffect", str2), str2));
            }
        } else {
            r43 = q0.f80391a;
        }
        List list2 = this.f107528c;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            int i16 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            ud2.a aVar = (ud2.a) obj2;
            String d13 = a.a.d("colorEffect", i13);
            Set<String> a15 = aVar.f121933c.a();
            ArrayList arrayList4 = new ArrayList(g0.q(a15, 10));
            for (String str3 : a15) {
                arrayList4.add(new c(aVar, b(program, d13, str3), str3));
            }
            k0.u(arrayList4, arrayList3);
            i13 = i16;
        }
        return CollectionsKt.l0(arrayList3, CollectionsKt.l0((Iterable) r43, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public final ArrayList d(bn0.a program) {
        ?? r33;
        ae2.f b13;
        Map map;
        ae2.f b14;
        ae2.f b15;
        Intrinsics.checkNotNullParameter(program, "program");
        List list = this.f107527b;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            Map map2 = ((ud2.b) obj).f121934d;
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                vd2.c cVar = (vd2.c) entry.getValue();
                String c13 = com.pinterest.xrenderer.legacy.a.c("distortionEffect" + i14, str);
                if (cVar instanceof vd2.b) {
                    b15 = ((vd2.b) cVar).b();
                } else {
                    if (!(cVar instanceof vd2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b15 = ((vd2.a) cVar).b();
                }
                arrayList2.add(new d(b15, program.m(c13)));
            }
            k0.u(arrayList2, arrayList);
            i14 = i15;
        }
        ud2.c cVar2 = this.f107529d;
        if (cVar2 == null || (map = cVar2.f121934d) == null) {
            r33 = q0.f80391a;
        } else {
            r33 = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                String str2 = (String) entry2.getKey();
                vd2.c cVar3 = (vd2.c) entry2.getValue();
                String c14 = com.pinterest.xrenderer.legacy.a.c("kernelEffect", str2);
                if (cVar3 instanceof vd2.b) {
                    b14 = ((vd2.b) cVar3).b();
                } else {
                    if (!(cVar3 instanceof vd2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b14 = ((vd2.a) cVar3).b();
                }
                r33.add(new d(b14, program.m(c14)));
            }
        }
        List list2 = this.f107528c;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            int i16 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            Map map3 = ((ud2.a) obj2).f121934d;
            ArrayList arrayList4 = new ArrayList(map3.size());
            for (Map.Entry entry3 : map3.entrySet()) {
                String str3 = (String) entry3.getKey();
                vd2.c cVar4 = (vd2.c) entry3.getValue();
                String c15 = com.pinterest.xrenderer.legacy.a.c("colorEffect" + i13, str3);
                if (cVar4 instanceof vd2.b) {
                    b13 = ((vd2.b) cVar4).b();
                } else {
                    if (!(cVar4 instanceof vd2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b13 = ((vd2.a) cVar4).b();
                }
                arrayList4.add(new d(b13, program.m(c15)));
            }
            k0.u(arrayList4, arrayList3);
            i13 = i16;
        }
        return CollectionsKt.l0(arrayList3, CollectionsKt.l0((Iterable) r33, arrayList));
    }

    public final zd2.d e(String template) {
        Intrinsics.checkNotNullParameter(template, "template");
        e block = new e(this, template, 1);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        return (zd2.d) block.invoke();
    }
}
