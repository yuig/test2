package xh2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import cd2.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kh2.n3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ln2.o;
import nn2.j;
import no2.f;
import oo2.g;
import oo2.m;
import pn2.d0;
import pn2.h;
import pn2.l;
import pn2.v1;
import qn2.i;
import qo2.w;
import ro2.x;
import tm2.v;
import vl2.e;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f134986j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f134987k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        super(0);
        this.f134985i = i13;
        this.f134986j = obj;
        this.f134987k = obj2;
    }

    public final String b() {
        int i13 = this.f134985i;
        Object obj = this.f134987k;
        Object obj2 = this.f134986j;
        switch (i13) {
            case 0:
                return ((b) obj2).f134988a.d(obj);
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append('@');
                sb3.append(((Class) obj2).getCanonicalName());
                CollectionsKt___CollectionsKt.H(((Map) obj).entrySet(), sb3, ", ", (r16 & 4) != 0 ? "" : "(", (r16 & 8) != 0 ? "" : ")", -1, "...", (r16 & 64) != 0 ? null : e.f126170j);
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                return sb4;
        }
    }

    public final List e() {
        int i13 = this.f134985i;
        Object obj = this.f134987k;
        Object obj2 = this.f134986j;
        switch (i13) {
            case 3:
                j jVar = (j) obj2;
                return CollectionsKt.F0(((o) jVar.f91601l.f82653b).f84112e.c(jVar.f91612w, (v) obj));
            case 4:
                ((h) obj2).getClass();
                List types = ((l) obj).c();
                fi.b bVar = qn2.j.f104499a;
                Intrinsics.checkNotNullParameter(null, "<this>");
                Intrinsics.checkNotNullParameter(types, "types");
                ArrayList arrayList = new ArrayList(g0.q(types, 10));
                Iterator it = types.iterator();
                if (!it.hasNext()) {
                    return arrayList;
                }
                throw null;
            default:
                Iterable iterable = (List) ((qn2.l) obj2).f104510e.getValue();
                if (iterable == null) {
                    iterable = q0.f80391a;
                }
                Iterable iterable2 = iterable;
                i iVar = (i) obj;
                ArrayList arrayList2 = new ArrayList(g0.q(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((v1) it2.next()).y0(iVar));
                }
                return arrayList2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [oo2.g] */
    /* JADX WARN: Type inference failed for: r0v5, types: [oo2.g] */
    /* JADX WARN: Type inference failed for: r0v6, types: [qo2.v, qo2.y0] */
    public final g f() {
        int i13 = this.f134985i;
        Object obj = this.f134987k;
        Object obj2 = this.f134986j;
        switch (i13) {
            case 7:
                return n3.o((String) obj2, oo2.c.f96873b, new g[0], new no2.e((f) obj, 1));
            case 8:
                w wVar = (w) obj2;
                ?? r03 = (g) wVar.f104645d;
                if (r03 == 0) {
                    Enum[] enumArr = (Enum[]) wVar.f104644c;
                    r03 = new qo2.v((String) obj, enumArr.length);
                    for (Enum r04 : enumArr) {
                        r03.k(r04.name(), false);
                    }
                }
                return r03;
            default:
                return n3.o((String) obj2, oo2.o.f96906d, new g[0], new n((w) obj, 19));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String[] names;
        int i13 = this.f134985i;
        Object obj = this.f134987k;
        Object obj2 = this.f134986j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
            default:
                g gVar = (g) obj2;
                int e13 = gVar.e();
                String[] strArr = new String[e13];
                if (e13 <= 0) {
                    return strArr;
                }
                gVar.f(0);
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                throw null;
            case 3:
                return e();
            case 4:
                return e();
            case 5:
                return ((i) obj2).a((sn2.f) ((d0) obj).f100779c.invoke());
            case 6:
                return e();
            case 7:
                return f();
            case 8:
                return f();
            case 9:
                return f();
            case 10:
                g gVar2 = (g) obj2;
                ro2.c cVar = (ro2.c) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z13 = cVar.f108976a.f109024m && Intrinsics.d(gVar2.c(), m.f96902a);
                so2.n.d(gVar2, cVar);
                int e14 = gVar2.e();
                for (int i14 = 0; i14 < e14; i14++) {
                    List g13 = gVar2.g(i14);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : g13) {
                        if (obj3 instanceof x) {
                            arrayList.add(obj3);
                        }
                    }
                    x xVar = (x) CollectionsKt.u0(arrayList);
                    if (xVar != null && (names = xVar.names()) != null) {
                        for (String str2 : names) {
                            if (z13) {
                                str2 = str2.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                            }
                            so2.n.a(linkedHashMap, gVar2, str2, i14);
                        }
                    }
                    if (z13) {
                        str = gVar2.f(i14).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        so2.n.a(linkedHashMap, gVar2, str, i14);
                    }
                }
                return linkedHashMap.isEmpty() ? z0.d() : linkedHashMap;
        }
    }
}
