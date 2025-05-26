package v;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f123616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f123617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f123618g;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        this.f123612a = i13;
        this.f123613b = obj;
        this.f123614c = obj2;
        this.f123615d = obj3;
        this.f123616e = obj4;
        this.f123617f = obj5;
        this.f123618g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f123612a) {
            case 0:
                d0 d0Var = (d0) this.f123613b;
                String str = (String) this.f123614c;
                androidx.camera.core.impl.o2 o2Var = (androidx.camera.core.impl.o2) this.f123615d;
                androidx.camera.core.impl.z2 z2Var = (androidx.camera.core.impl.z2) this.f123616e;
                androidx.camera.core.impl.k kVar = (androidx.camera.core.impl.k) this.f123617f;
                List list = (List) this.f123618g;
                d0Var.getClass();
                d0Var.t("Use case " + str + " UPDATED", null);
                d0Var.f123396a.g(str, o2Var, z2Var, kVar, list);
                d0Var.K();
                break;
            case 1:
                d0 d0Var2 = (d0) this.f123613b;
                String str2 = (String) this.f123614c;
                androidx.camera.core.impl.o2 o2Var2 = (androidx.camera.core.impl.o2) this.f123615d;
                androidx.camera.core.impl.z2 z2Var2 = (androidx.camera.core.impl.z2) this.f123616e;
                androidx.camera.core.impl.k kVar2 = (androidx.camera.core.impl.k) this.f123617f;
                List list2 = (List) this.f123618g;
                d0Var2.getClass();
                d0Var2.t("Use case " + str2 + " ACTIVE", null);
                androidx.camera.core.impl.x2 x2Var = d0Var2.f123396a;
                androidx.camera.core.impl.w2 w2Var = (androidx.camera.core.impl.w2) x2Var.f16995b.get(str2);
                if (w2Var == null) {
                    w2Var = new androidx.camera.core.impl.w2(o2Var2, z2Var2, kVar2, list2);
                    x2Var.f16995b.put(str2, w2Var);
                }
                w2Var.f16989f = true;
                d0Var2.f123396a.g(str2, o2Var2, z2Var2, kVar2, list2);
                d0Var2.K();
                break;
            case 2:
                d0 d0Var3 = (d0) this.f123613b;
                String str3 = (String) this.f123614c;
                androidx.camera.core.impl.o2 o2Var3 = (androidx.camera.core.impl.o2) this.f123615d;
                androidx.camera.core.impl.z2 z2Var3 = (androidx.camera.core.impl.z2) this.f123616e;
                androidx.camera.core.impl.k kVar3 = (androidx.camera.core.impl.k) this.f123617f;
                List list3 = (List) this.f123618g;
                d0Var3.getClass();
                d0Var3.t("Use case " + str3 + " RESET", null);
                d0Var3.f123396a.g(str3, o2Var3, z2Var3, kVar3, list3);
                d0Var3.p();
                d0Var3.D();
                d0Var3.K();
                if (d0Var3.f123400e == z.OPENED) {
                    d0Var3.B();
                    break;
                }
                break;
            default:
                ((androidx.camera.core.impl.j) this.f123613b).d((androidx.camera.core.impl.j0) this.f123614c, (androidx.camera.core.impl.j0) this.f123615d, (l0.s) this.f123616e, (l0.s) this.f123617f, (Map.Entry) this.f123618g);
                break;
        }
    }
}
