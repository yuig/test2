package kh2;

import android.app.usage.StorageStatsManager;
import android.os.PowerManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79747i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h3 f79748j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(h3 h3Var, int i13) {
        super(0);
        this.f79747i = i13;
        this.f79748j = h3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h3 h3Var = this.f79748j;
        int i13 = this.f79747i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        j3 j3Var = (j3) h3Var;
                        j3Var.getClass();
                        return (PowerManager) j3Var.f79578c.a(j3Var, j3.f79575g[1]);
                    default:
                        j3 j3Var2 = (j3) h3Var;
                        j3Var2.getClass();
                        return (PowerManager) j3Var2.f79578c.a(j3Var2, j3.f79575g[1]);
                }
            case 1:
                switch (i13) {
                    case 0:
                        j3 j3Var3 = (j3) h3Var;
                        j3Var3.getClass();
                        return (PowerManager) j3Var3.f79578c.a(j3Var3, j3.f79575g[1]);
                    default:
                        j3 j3Var4 = (j3) h3Var;
                        j3Var4.getClass();
                        return (PowerManager) j3Var4.f79578c.a(j3Var4, j3.f79575g[1]);
                }
            default:
                j3 j3Var5 = (j3) h3Var;
                return (StorageStatsManager) j3Var5.f79580e.a(j3Var5, j3.f79575g[3]);
        }
    }
}
