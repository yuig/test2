package j1;

import android.content.Context;

/* loaded from: classes.dex */
public final class j2 implements i2.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f74127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74128c;

    public /* synthetic */ j2(int i13, Object obj, Object obj2) {
        this.f74126a = i13;
        this.f74127b = obj;
        this.f74128c = obj2;
    }

    @Override // i2.s0
    public final void dispose() {
        b2 b2Var;
        int i13 = this.f74126a;
        Object obj = this.f74128c;
        Object obj2 = this.f74127b;
        switch (i13) {
            case 0:
                ((g2) obj2).f74084j.remove((g2) obj);
                break;
            case 1:
                g2 g2Var = (g2) obj2;
                g2Var.getClass();
                x1 x1Var = (x1) ((y1) obj).f74325b.getValue();
                if (x1Var != null && (b2Var = x1Var.f74308a) != null) {
                    g2Var.f74083i.remove(b2Var);
                    break;
                }
                break;
            case 2:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((t3.g1) obj);
                break;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((t3.h1) obj);
                break;
        }
    }
}
