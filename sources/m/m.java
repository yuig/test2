package m;

import android.view.View;
import androidx.appcompat.widget.h3;
import java.util.ArrayList;
import q5.e1;

/* loaded from: classes2.dex */
public final class m extends l3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85238a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f85239b;

    /* renamed from: c, reason: collision with root package name */
    public int f85240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f85241d;

    public m(n nVar) {
        this.f85238a = 0;
        this.f85241d = nVar;
        this.f85239b = false;
        this.f85240c = 0;
    }

    @Override // l3.c, q5.e1
    public final void a() {
        int i13 = this.f85238a;
        Object obj = this.f85241d;
        switch (i13) {
            case 0:
                if (!this.f85239b) {
                    this.f85239b = true;
                    e1 e1Var = (e1) ((n) obj).f85246e;
                    if (e1Var != null) {
                        e1Var.a();
                        break;
                    }
                }
                break;
            default:
                ((h3) obj).f16581a.setVisibility(0);
                break;
        }
    }

    @Override // l3.c, q5.e1
    public final void b() {
        switch (this.f85238a) {
            case 1:
                this.f85239b = true;
                break;
        }
    }

    @Override // q5.e1
    public final void d(View view) {
        int i13 = this.f85238a;
        Object obj = this.f85241d;
        switch (i13) {
            case 0:
                int i14 = this.f85240c + 1;
                this.f85240c = i14;
                n nVar = (n) obj;
                if (i14 == ((ArrayList) nVar.f85244c).size()) {
                    e1 e1Var = (e1) nVar.f85246e;
                    if (e1Var != null) {
                        e1Var.d(null);
                    }
                    this.f85240c = 0;
                    this.f85239b = false;
                    nVar.f85243b = false;
                    break;
                }
                break;
            default:
                if (!this.f85239b) {
                    ((h3) obj).f16581a.setVisibility(this.f85240c);
                    break;
                }
                break;
        }
    }

    public m(h3 h3Var, int i13) {
        this.f85238a = 1;
        this.f85241d = h3Var;
        this.f85240c = i13;
        this.f85239b = false;
    }
}
