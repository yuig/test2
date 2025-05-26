package androidx.appcompat.app;

import android.content.Context;

/* loaded from: classes.dex */
public final class m implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f16062b;

    public /* synthetic */ m(n nVar, int i13) {
        this.f16061a = i13;
        this.f16062b = nVar;
    }

    @Override // f.b
    public final void a(Context context) {
        int i13 = this.f16061a;
        n nVar = this.f16062b;
        switch (i13) {
            case 0:
                t delegate = nVar.getDelegate();
                delegate.c();
                delegate.f(nVar.getSavedStateRegistry().a("androidx:appcompat"));
                break;
            case 1:
                ((vo.g) nVar).inject();
                break;
            case 2:
                ((wo.c) nVar).inject();
                break;
            case 3:
                ((ir.e) nVar).inject();
                break;
            case 4:
                ((qr.i) nVar).inject();
                break;
            case 5:
                ((cp1.q) nVar).inject();
                break;
            default:
                ((vq1.a) nVar).inject();
                break;
        }
    }
}
