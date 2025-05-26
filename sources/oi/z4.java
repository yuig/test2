package oi;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class z4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f95297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f95298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w4 f95299e;

    public /* synthetic */ z4(w4 w4Var, String str, String str2, String str3, int i13) {
        this.f95295a = i13;
        this.f95299e = w4Var;
        this.f95296b = str;
        this.f95297c = str2;
        this.f95298d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f95295a;
        String str = this.f95296b;
        String str2 = this.f95298d;
        String str3 = this.f95297c;
        w4 w4Var = this.f95299e;
        switch (i13) {
            case 0:
                w4Var.f95246a.M();
                i iVar = w4Var.f95246a.f94657c;
                a7.p(iVar);
                return iVar.Y(str, str3, str2);
            case 1:
                w4Var.f95246a.M();
                i iVar2 = w4Var.f95246a.f94657c;
                a7.p(iVar2);
                return iVar2.F(str, str3, str2);
            case 2:
                w4Var.f95246a.M();
                i iVar3 = w4Var.f95246a.f94657c;
                a7.p(iVar3);
                return iVar3.Y(str, str3, str2);
            default:
                w4Var.f95246a.M();
                i iVar4 = w4Var.f95246a.f94657c;
                a7.p(iVar4);
                return iVar4.F(str, str3, str2);
        }
    }
}
