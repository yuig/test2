package oi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95277a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f95278b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95279c;

    /* renamed from: d, reason: collision with root package name */
    public final long f95280d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f95281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f95282f;

    public /* synthetic */ y4(Object obj, Object obj2, Object obj3, Object obj4, long j13, int i13) {
        this.f95277a = i13;
        this.f95282f = obj;
        this.f95278b = obj2;
        this.f95279c = obj3;
        this.f95281e = obj4;
        this.f95280d = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f95277a) {
            case 0:
                String str = (String) this.f95278b;
                Object obj = this.f95282f;
                if (str != null) {
                    b6 b6Var = new b6(this.f95280d, (String) this.f95281e, str);
                    a7 a7Var = ((w4) obj).f95246a;
                    String str2 = (String) this.f95279c;
                    a7Var.zzl().p();
                    String str3 = a7Var.F;
                    if (str3 != null) {
                        str3.equals(str2);
                    }
                    a7Var.F = str2;
                    a7Var.E = b6Var;
                    break;
                } else {
                    a7 a7Var2 = ((w4) obj).f95246a;
                    String str4 = (String) this.f95279c;
                    a7Var2.zzl().p();
                    String str5 = a7Var2.F;
                    if (str5 == null || str5.equals(str4)) {
                        a7Var2.F = str4;
                        a7Var2.E = null;
                        break;
                    }
                }
                break;
            case 1:
                ((k5) this.f95282f).I((String) this.f95278b, (String) this.f95279c, this.f95281e, this.f95280d);
                break;
            default:
                a6 a6Var = (a6) this.f95282f;
                Bundle bundle = (Bundle) this.f95278b;
                b6 b6Var2 = (b6) this.f95279c;
                b6 b6Var3 = (b6) this.f95281e;
                long j13 = this.f95280d;
                if (bundle != null) {
                    bundle.remove("screen_name");
                    bundle.remove("screen_class");
                }
                a6Var.D(b6Var2, b6Var3, j13, true, a6Var.o().z("screen_view", bundle, null, false));
                break;
        }
    }
}
