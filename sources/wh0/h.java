package wh0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2;
import kotlin.jvm.internal.j0;
import yq0.a0;
import yq0.x;

/* loaded from: classes5.dex */
public final class h extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f129913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129914c;

    public h(j0 j0Var, Object obj, int i13) {
        this.f129912a = i13;
        this.f129913b = j0Var;
        this.f129914c = obj;
    }

    @Override // androidx.recyclerview.widget.d2
    public final void a() {
        int i13 = this.f129912a;
        Object obj = this.f129914c;
        j0 j0Var = this.f129913b;
        switch (i13) {
            case 0:
                ((View.OnClickListener) j0Var.f80434a).onClick((RecyclerView) obj);
                break;
            default:
                ((x) j0Var.f80434a).c((a0) obj);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void b(int i13, int i14) {
        switch (this.f129912a) {
            case 1:
                ((x) this.f129913b.f80434a).e((a0) this.f129914c);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void d(int i13, int i14) {
        switch (this.f129912a) {
            case 1:
                ((x) this.f129913b.f80434a).d((a0) this.f129914c, i14);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void e(int i13, int i14) {
        switch (this.f129912a) {
            case 1:
                ((x) this.f129913b.f80434a).f((a0) this.f129914c);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void f(int i13, int i14) {
        switch (this.f129912a) {
            case 1:
                ((x) this.f129913b.f80434a).g((a0) this.f129914c, i14);
                break;
        }
    }
}
