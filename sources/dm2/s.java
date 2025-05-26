package dm2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import pn2.q1;

/* loaded from: classes4.dex */
public final class s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55521c;

    public /* synthetic */ s(int i13, Object obj, Object obj2) {
        this.f55519a = i13;
        this.f55521c = obj;
        this.f55520b = obj2;
    }

    public final Collection b() {
        int i13 = this.f55519a;
        Object obj = this.f55521c;
        switch (i13) {
            case 0:
                u uVar = (u) obj;
                uVar.getClass();
                HashSet hashSet = new HashSet();
                for (ym2.g gVar : (Set) uVar.f55532e.f55535j.invoke()) {
                    hm2.e eVar = hm2.e.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(uVar.a(gVar, eVar));
                    hashSet.addAll(uVar.d(gVar, eVar));
                }
                return hashSet;
            default:
                wn2.f fVar = new wn2.f();
                Iterator it = ((z) obj).h().iterator();
                while (it.hasNext()) {
                    fVar.add(((am2.x) it.next()).d((q1) this.f55520b));
                }
                return fVar;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f55519a) {
        }
        return b();
    }
}
