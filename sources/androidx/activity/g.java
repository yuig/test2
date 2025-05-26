package androidx.activity;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f15895b;

    public /* synthetic */ g(o oVar, int i13) {
        this.f15894a = i13;
        this.f15895b = oVar;
    }

    @Override // f.b
    public final void a(Context context) {
        int i13 = this.f15894a;
        o oVar = this.f15895b;
        switch (i13) {
            case 0:
                o.j(oVar);
                break;
            default:
                ((FragmentActivity) oVar).lambda$init$3(context);
                break;
        }
    }
}
