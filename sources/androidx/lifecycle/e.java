package androidx.lifecycle;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18613a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18614b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f18613a = i13;
        this.f18614b = obj;
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        int i13;
        int i14 = this.f18613a;
        Object obj = null;
        Object obj2 = this.f18614b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                j[] jVarArr = (j[]) obj2;
                if (jVarArr.length > 0) {
                    j jVar = jVarArr[0];
                    throw null;
                }
                if (jVarArr.length <= 0) {
                    return;
                }
                j jVar2 = jVarArr[0];
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i15 = ca.c.f27035a[event.ordinal()];
                if (i15 == 1) {
                    androidx.fragment.app.q qVar = (androidx.fragment.app.q) source;
                    Iterable iterable = (Iterable) ((ca.d) obj2).b().f141227e.f55726a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.d(((z9.k) it.next()).f141215f, qVar.getTag())) {
                                return;
                            }
                        }
                    }
                    qVar.dismiss();
                    return;
                }
                if (i15 == 2) {
                    androidx.fragment.app.q qVar2 = (androidx.fragment.app.q) source;
                    ca.d dVar = (ca.d) obj2;
                    for (Object obj3 : (Iterable) dVar.b().f141228f.f55726a.getValue()) {
                        if (Intrinsics.d(((z9.k) obj3).f141215f, qVar2.getTag())) {
                            obj = obj3;
                        }
                    }
                    z9.k kVar = (z9.k) obj;
                    if (kVar != null) {
                        dVar.b().b(kVar);
                        return;
                    }
                    return;
                }
                if (i15 != 3) {
                    if (i15 != 4) {
                        return;
                    }
                    androidx.fragment.app.q qVar3 = (androidx.fragment.app.q) source;
                    ca.d dVar2 = (ca.d) obj2;
                    for (Object obj4 : (Iterable) dVar2.b().f141228f.f55726a.getValue()) {
                        if (Intrinsics.d(((z9.k) obj4).f141215f, qVar3.getTag())) {
                            obj = obj4;
                        }
                    }
                    z9.k kVar2 = (z9.k) obj;
                    if (kVar2 != null) {
                        dVar2.b().b(kVar2);
                    }
                    qVar3.getLifecycle().b(this);
                    return;
                }
                androidx.fragment.app.q qVar4 = (androidx.fragment.app.q) source;
                if (qVar4.P6().isShowing()) {
                    return;
                }
                ca.d dVar3 = (ca.d) obj2;
                List list = (List) dVar3.b().f141227e.f55726a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i13 = -1;
                    } else if (Intrinsics.d(((z9.k) listIterator.previous()).f141215f, qVar4.getTag())) {
                        i13 = listIterator.nextIndex();
                    }
                }
                z9.k kVar3 = (z9.k) CollectionsKt.U(i13, list);
                if (!Intrinsics.d(CollectionsKt.d0(list), kVar3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + qVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (kVar3 != null) {
                    dVar3.l(i13, kVar3, false);
                    return;
                }
                return;
            case 3:
                ((za.f) obj2).b(false);
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                ((ad0.b) obj2).f2083a.i(event);
                int i16 = ad0.a.f2082a[event.ordinal()];
                return;
        }
    }

    public e() {
        this.f18613a = 1;
        Intrinsics.checkNotNullParameter(null, "generatedAdapter");
        this.f18614b = null;
    }

    public e(j[] generatedAdapters) {
        this.f18613a = 0;
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f18614b = generatedAdapters;
    }
}
