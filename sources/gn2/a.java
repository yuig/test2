package gn2;

import am2.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: b */
    public final List f65811b;

    public a(q0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f65811b = inner;
    }

    public final void a(rg.a context_receiver_0, g thisDescriptor, ArrayList result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f65811b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).a(context_receiver_0, thisDescriptor, result);
        }
    }

    public final void b(rg.a context_receiver_0, g thisDescriptor, ym2.g name, ArrayList result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f65811b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).b(context_receiver_0, thisDescriptor, name, result);
        }
    }

    public final void c(rg.a context_receiver_0, g thisDescriptor, ym2.g name, yk2.b result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f65811b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).c(context_receiver_0, thisDescriptor, name, result);
        }
    }

    public final void d(rg.a context_receiver_0, km2.c thisDescriptor, ym2.g name, ArrayList result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f65811b.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).d(context_receiver_0, thisDescriptor, name, result);
        }
    }

    public final ArrayList e(rg.a context_receiver_0, g thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List list = this.f65811b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k0.u(((a) ((e) it.next())).e(context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    public final ArrayList f(rg.a context_receiver_0, g thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List list = this.f65811b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k0.u(((a) ((e) it.next())).f(context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    public final ArrayList g(rg.a context_receiver_0, km2.c thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List list = this.f65811b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k0.u(((a) ((e) it.next())).g(context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    public final dm2.q0 h(rg.a context_receiver_0, g thisDescriptor, dm2.q0 propertyDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(propertyDescriptor, "propertyDescriptor");
        Iterator it = this.f65811b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((a) ((e) it.next())).h(context_receiver_0, thisDescriptor, propertyDescriptor);
        }
        return propertyDescriptor;
    }
}
