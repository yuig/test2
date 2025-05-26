package oi;

import android.content.Intent;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f95041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f95042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f95043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f95044e;

    public /* synthetic */ p6(RecyclerView recyclerView, Object obj, Object obj2, int i13, int i14) {
        this.f95040a = i14;
        this.f95042c = recyclerView;
        this.f95043d = obj;
        this.f95044e = obj2;
        this.f95041b = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f95040a) {
            case 0:
                m.a aVar = (m.a) this.f95042c;
                int i13 = this.f95041b;
                y3 y3Var = (y3) this.f95043d;
                Intent intent = (Intent) this.f95044e;
                r6 r6Var = (r6) aVar.f85180a;
                if (r6Var.zza(i13)) {
                    y3Var.f95276n.b(Integer.valueOf(i13), "Local AppMeasurementService processed last upload request. StartId");
                    aVar.a().f95276n.c("Completed wakeful intent.");
                    r6Var.a(intent);
                    break;
                }
                break;
            case 1:
                PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = (PinterestStaggeredGridLayoutManager) this.f95043d;
                q01.b bVar = (q01.b) this.f95044e;
                int i14 = this.f95041b;
                androidx.recyclerview.widget.m1 m1Var = new androidx.recyclerview.widget.m1(bVar, bVar.f101775c);
                m1Var.f19651a = i14;
                pinterestStaggeredGridLayoutManager.X0(m1Var);
                break;
            case 2:
                ((PinterestStaggeredGridLayoutManager) this.f95044e).e1(this.f95041b, ((q01.l) this.f95043d).b());
                q01.l lVar = (q01.l) this.f95043d;
                lVar.f101819w.postDelayed(new ne0.b(lVar, 5), 150L);
                break;
            default:
                ((PinterestStaggeredGridLayoutManager) this.f95044e).e1(this.f95041b, ((q01.y) this.f95043d).a());
                q01.y yVar = (q01.y) this.f95043d;
                yVar.f101855o.postDelayed(new ne0.b(yVar, 6), 150L);
                break;
        }
    }

    public /* synthetic */ p6(m.a aVar, int i13, y3 y3Var, Intent intent) {
        this.f95040a = 0;
        this.f95042c = aVar;
        this.f95041b = i13;
        this.f95043d = y3Var;
        this.f95044e = intent;
    }
}
