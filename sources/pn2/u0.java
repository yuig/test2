package pn2;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 extends vn2.d {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f100848b = new t0();

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f100849c = new u0(kotlin.collections.q0.f80391a);

    public u0(List list) {
        vn2.m arrayMap = vn2.m.f126336a;
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f126314a = arrayMap;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0 value = (r0) it.next();
            ((m) value).getClass();
            rl2.d tClass = kotlin.jvm.internal.k0.f80436a.b(m.class);
            Intrinsics.checkNotNullParameter(tClass, "tClass");
            Intrinsics.checkNotNullParameter(value, "value");
            String keyQualifiedName = tClass.e();
            Intrinsics.f(keyQualifiedName);
            Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
            Intrinsics.checkNotNullParameter(value, "value");
            int b13 = f100848b.b(keyQualifiedName);
            int b14 = this.f126314a.b();
            if (b14 != 0) {
                if (b14 == 1) {
                    vn2.a aVar = this.f126314a;
                    Intrinsics.g(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    vn2.v vVar = (vn2.v) aVar;
                    int i13 = vVar.f126347b;
                    if (i13 == b13) {
                        this.f126314a = new vn2.v(value, b13);
                    } else {
                        vn2.c cVar = new vn2.c();
                        cVar.f126311a = new Object[20];
                        cVar.f126312b = 0;
                        this.f126314a = cVar;
                        cVar.c(i13, vVar.f126346a);
                    }
                }
                this.f126314a.c(b13, value);
            } else {
                this.f126314a = new vn2.v(value, b13);
            }
        }
    }
}
