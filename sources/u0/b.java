package u0;

import com.google.android.gms.internal.measurement.q4;
import kh2.m0;
import r0.j0;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q4 f119728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f119729c;

    public /* synthetic */ b(q4 q4Var, boolean z13, int i13) {
        this.f119727a = i13;
        this.f119728b = q4Var;
        this.f119729c = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f119727a;
        q4 q4Var = this.f119728b;
        switch (i13) {
            case 0:
                j0 j0Var = (j0) q4Var.f31595c;
                boolean z13 = j0Var.X;
                boolean z14 = this.f119729c;
                if (z13 == z14) {
                    m0.X0("Recorder", "Audio source silenced transitions to the same state " + z14);
                    break;
                } else {
                    j0Var.X = z14;
                    j0Var.J();
                    break;
                }
            default:
                q4Var.getClass();
                break;
        }
    }
}
