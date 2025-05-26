package mn2;

import am2.d0;
import am2.j0;
import am2.m0;
import com.google.firebase.messaging.q;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import ln2.o;
import ln2.p;
import m60.f0;
import on2.u;
import xl2.r;

/* loaded from: classes2.dex */
public final class c implements xl2.c {

    /* renamed from: b, reason: collision with root package name */
    public final e f87797b = new e();

    public j0 a(u storageManager, d0 module, Iterable classDescriptorFactories, cm2.e platformDependentDeclarationFilter, cm2.b additionalClassPartsProvider, boolean z13) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set packageFqNames = r.f135337q;
        b loadResource = new b(1, this.f87797b);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        Set<ym2.c> set = packageFqNames;
        ArrayList arrayList = new ArrayList(g0.q(set, 10));
        for (ym2.c cVar : set) {
            a.f87796q.getClass();
            String a13 = a.a(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(a13);
            if (inputStream == null) {
                throw new IllegalStateException(a.a.j("Resource not found in classpath: ", a13));
            }
            arrayList.add(f0.Y(cVar, storageManager, module, inputStream));
        }
        m0 m0Var = new m0(arrayList);
        q qVar = new q(storageManager, module);
        ln2.r rVar = new ln2.r(m0Var);
        a aVar = a.f87796q;
        ln2.e eVar = new ln2.e(module, qVar, aVar);
        p DO_NOTHING = ln2.u.f84139a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        o oVar = new o(storageManager, module, rVar, eVar, m0Var, classDescriptorFactories, qVar, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f80276a, null, new hn2.a(storageManager, q0.f80391a), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).u0(oVar);
        }
        return m0Var;
    }
}
