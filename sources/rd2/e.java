package rd2;

import com.pinterest.xrenderer.legacy.EffectValues;
import com.pinterest.xrenderer.legacy.FragmentShaderScope;
import com.pinterest.xrenderer.legacy.VertexShaderScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107522i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f107523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f107524k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, String str, int i13) {
        super(0);
        this.f107522i = i13;
        this.f107523j = fVar;
        this.f107524k = str;
    }

    public final zd2.d b() {
        String str;
        String str2;
        int i13 = 0;
        switch (this.f107522i) {
            case 0:
                f fVar = this.f107523j;
                ArrayList m03 = CollectionsKt.m0(fVar.f107529d, fVar.f107528c);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.f107526a);
                ArrayList arrayList = new ArrayList(g0.q(m03, 10));
                Iterator it = m03.iterator();
                while (it.hasNext()) {
                    ud2.d dVar = (ud2.d) it.next();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(dVar != null ? dVar.f121931a : null);
                    sb4.append(dVar != null ? dVar.f121932b : null);
                    arrayList.add(sb4.toString());
                }
                sb3.append(arrayList);
                String sb5 = sb3.toString();
                HashMap hashMap = f.f107525e;
                synchronized (hashMap) {
                    str = (String) hashMap.get(sb5);
                }
                if (str != null) {
                    return new zd2.d(zd2.c.FRAGMENT_SHADER, str);
                }
                ud2.c cVar = this.f107523j.f107529d;
                EffectValues a13 = cVar != null ? com.pinterest.xrenderer.legacy.a.a("kernelEffect", cVar.f121933c.f99868a, cVar.f121934d, cVar.f121932b) : null;
                List list = this.f107523j.f107528c;
                ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    ud2.a aVar = (ud2.a) obj;
                    HashMap hashMap2 = f.f107525e;
                    arrayList2.add(com.pinterest.xrenderer.legacy.a.a(a.a.d("colorEffect", i13), aVar.f121933c.f99868a, aVar.f121934d, aVar.f121932b));
                    i13 = i14;
                }
                FragmentShaderScope fragmentShaderScope = new FragmentShaderScope(this.f107523j.f107526a, a13, arrayList2, CollectionsKt.m0(a13, arrayList2), new a(2), new a(3));
                HashMap hashMap3 = f.f107525e;
                String b13 = com.pinterest.xrenderer.legacy.a.b(fragmentShaderScope, this.f107524k);
                HashMap hashMap4 = f.f107525e;
                synchronized (hashMap4) {
                }
                return new zd2.d(zd2.c.FRAGMENT_SHADER, b13);
            default:
                f fVar2 = this.f107523j;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(fVar2.f107526a);
                List<ud2.b> list2 = fVar2.f107527b;
                ArrayList arrayList3 = new ArrayList(g0.q(list2, 10));
                for (ud2.b bVar : list2) {
                    arrayList3.add(bVar.f121931a + bVar.f121932b);
                }
                sb6.append(arrayList3);
                String sb7 = sb6.toString();
                HashMap hashMap5 = f.f107525e;
                synchronized (hashMap5) {
                    str2 = (String) hashMap5.get(sb7);
                }
                if (str2 != null) {
                    return new zd2.d(zd2.c.VERTEX_SHADER, str2);
                }
                List list3 = this.f107523j.f107527b;
                ArrayList arrayList4 = new ArrayList(g0.q(list3, 10));
                for (Object obj2 : list3) {
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    ud2.b bVar2 = (ud2.b) obj2;
                    HashMap hashMap6 = f.f107525e;
                    arrayList4.add(com.pinterest.xrenderer.legacy.a.a(a.a.d("distortionEffect", i13), bVar2.f121933c.f99868a, bVar2.f121934d, bVar2.f121932b));
                    i13 = i15;
                }
                VertexShaderScope vertexShaderScope = new VertexShaderScope(this.f107523j.f107526a, arrayList4, new a(4), new a(5));
                HashMap hashMap7 = f.f107525e;
                String b14 = com.pinterest.xrenderer.legacy.a.b(vertexShaderScope, this.f107524k);
                HashMap hashMap8 = f.f107525e;
                synchronized (hashMap8) {
                }
                return new zd2.d(zd2.c.VERTEX_SHADER, b14);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f107522i) {
        }
        return b();
    }
}
