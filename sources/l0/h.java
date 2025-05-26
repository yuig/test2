package l0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchView;
import q5.a2;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements r4.j, q5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81220c;

    public /* synthetic */ h(Object obj, int i13, int i14) {
        this.f81220c = obj;
        this.f81218a = i13;
        this.f81219b = i14;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        i iVar2 = (i) this.f81220c;
        iVar2.getClass();
        iVar2.f(new e(2, iVar2, new a(this.f81218a, this.f81219b, iVar)), new g0.j(iVar, 1));
        return "DefaultSurfaceProcessor#snapshot";
    }

    @Override // q5.v
    public final a2 k(View view, a2 a2Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f81220c;
        int i13 = SearchView.B;
        marginLayoutParams.leftMargin = a2Var.c() + this.f81218a;
        marginLayoutParams.rightMargin = a2Var.d() + this.f81219b;
        return a2Var;
    }
}
