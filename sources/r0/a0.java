package r0;

import androidx.camera.core.impl.t1;
import c0.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a0 implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105477b;

    public /* synthetic */ a0(Object obj, int i13) {
        this.f105476a = i13;
        this.f105477b = obj;
    }

    @Override // androidx.camera.core.impl.t1
    public final void a(Object obj) {
        int i13 = this.f105476a;
        Object obj2 = this.f105477b;
        switch (i13) {
            case 0:
                ((j0) obj2).f105557b.p((Boolean) obj);
                return;
            default:
                k kVar = (k) obj;
                if (kVar == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                v0 v0Var = (v0) obj2;
                if (v0Var.f105664u == b1.INACTIVE) {
                    return;
                }
                kh2.m0.p("VideoCapture", "Stream info update: old: " + v0Var.f105660q + " new: " + kVar);
                k kVar2 = v0Var.f105660q;
                v0Var.f105660q = kVar;
                androidx.camera.core.impl.k kVar3 = v0Var.f24340g;
                kVar3.getClass();
                int i14 = kVar2.f105589a;
                Set set = k.f105587e;
                boolean contains = set.contains(Integer.valueOf(i14));
                int i15 = kVar.f105589a;
                if ((!contains && !set.contains(Integer.valueOf(i15)) && i14 != i15) || (v0Var.f105668y && kVar2.f105591c != null && kVar.f105591c == null)) {
                    v0Var.J();
                    return;
                }
                int i16 = kVar2.f105589a;
                if ((i16 != -1 && i15 == -1) || (i16 == -1 && i15 != -1)) {
                    v0Var.D(v0Var.f105661r, kVar, kVar3);
                    Object[] objArr = {v0Var.f105661r.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    arrayList.add(obj3);
                    v0Var.A(Collections.unmodifiableList(arrayList));
                    v0Var.o();
                    return;
                }
                if (kVar2.f105590b != kVar.f105590b) {
                    v0Var.D(v0Var.f105661r, kVar, kVar3);
                    Object[] objArr2 = {v0Var.f105661r.c()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj4 = objArr2[0];
                    Objects.requireNonNull(obj4);
                    arrayList2.add(obj4);
                    v0Var.A(Collections.unmodifiableList(arrayList2));
                    Iterator it = v0Var.f24334a.iterator();
                    while (it.hasNext()) {
                        ((r1) it.next()).c(v0Var);
                    }
                    return;
                }
                return;
        }
    }

    @Override // androidx.camera.core.impl.t1
    public final void onError(Throwable th3) {
        switch (this.f105476a) {
            case 0:
                androidx.camera.core.impl.r1 r1Var = ((j0) this.f105477b).f105557b;
                r1Var.getClass();
                r1Var.p(new androidx.camera.core.impl.i(th3));
                break;
            default:
                kh2.m0.Y0("VideoCapture", "Receive onError from StreamState observer", th3);
                break;
        }
    }
}
