package ads_mobile_sdk;

import a.zb;
import android.app.AppOpsManager$OnOpActiveChangedListener;

/* loaded from: classes2.dex */
public final class az2 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a */
    public final /* synthetic */ zb f2603a;

    /* renamed from: b */
    public final /* synthetic */ bz2 f2604b;

    public az2(bz2 bz2Var, zb zbVar) {
        this.f2604b = bz2Var;
        this.f2603a = zbVar;
    }

    public final void onOpActiveChanged(String str, int i13, String str2, boolean z13) {
        synchronized (this.f2604b) {
            try {
                if (z13) {
                    bz2 bz2Var = this.f2604b;
                    this.f2603a.getClass();
                    bz2Var.f3661b = System.currentTimeMillis();
                    this.f2604b.f3664e = true;
                } else {
                    this.f2603a.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    bz2 bz2Var2 = this.f2604b;
                    long j13 = bz2Var2.f3662c;
                    if (j13 > 0 && currentTimeMillis >= j13) {
                        bz2Var2.f3663d = currentTimeMillis - j13;
                    }
                    bz2Var2.f3664e = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
