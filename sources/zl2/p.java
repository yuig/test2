package zl2;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142139i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f142140j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i13) {
        super(1);
        this.f142139i = i13;
        this.f142140j = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142139i;
        boolean z13 = false;
        r rVar = this.f142140j;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                String str = (String) pair.f80346a;
                String str2 = (String) pair.f80347b;
                List annotations = e0.b(bm2.f.a(rVar.f142145a.f(), a.a.m("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), a.a.C(str2, "()"), "HIDDEN", false));
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return annotations.isEmpty() ? bm2.h.f23540a : new bm2.j(annotations, 0);
            default:
                am2.d dVar = (am2.d) obj;
                if (dVar.c() == am2.c.DECLARATION) {
                    rVar.getClass();
                    am2.m g13 = dVar.g();
                    Intrinsics.g(g13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    am2.g mutable = (am2.g) g13;
                    Intrinsics.checkNotNullParameter(mutable, "mutable");
                    String str3 = d.f142106a;
                    if (d.f142115j.containsKey(bn2.e.h(mutable))) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
        }
    }
}
