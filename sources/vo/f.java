package vo;

import android.content.Context;
import com.pinterest.activity.NavBaseActivity;
import com.pinterest.widget.configuration.WidgetConfigurationActivity;
import rh1.x0;

/* loaded from: classes3.dex */
public final class f implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.n f126359b;

    public /* synthetic */ f(androidx.appcompat.app.n nVar, int i13) {
        this.f126358a = i13;
        this.f126359b = nVar;
    }

    @Override // f.b
    public final void a(Context context) {
        int i13 = this.f126358a;
        androidx.appcompat.app.n nVar = this.f126359b;
        switch (i13) {
            case 0:
                ((g) nVar).inject();
                break;
            case 1:
                NavBaseActivity navBaseActivity = (NavBaseActivity) nVar;
                if (!navBaseActivity.f34809d) {
                    navBaseActivity.f34809d = true;
                    ((j) navBaseActivity.generatedComponent()).getClass();
                    break;
                }
                break;
            case 2:
                ((h) nVar).inject();
                break;
            case 3:
                ((np.i) nVar).inject();
                break;
            case 4:
                ((np.j) nVar).inject();
                break;
            case 5:
                ((np.k) nVar).inject();
                break;
            case 6:
                ((np.l) nVar).inject();
                break;
            case 7:
                ((hq.a) nVar).inject();
                break;
            case 8:
                ((nr.a) nVar).inject();
                break;
            case 9:
                ((pr.a) nVar).inject();
                break;
            case 10:
                ((g) nVar).inject();
                break;
            case 11:
                ((pw0.b) nVar).inject();
                break;
            case 12:
                ((m11.c) nVar).inject();
                break;
            case 13:
                ((x0) nVar).inject();
                break;
            case 14:
                ss1.a aVar = (ss1.a) nVar;
                if (!aVar.f115140d) {
                    aVar.f115140d = true;
                    ss1.b bVar = (ss1.b) aVar.generatedComponent();
                    bVar.getClass();
                    break;
                }
                break;
            case 15:
                ((mb2.a) nVar).inject();
                break;
            default:
                ((WidgetConfigurationActivity) nVar).inject();
                break;
        }
    }
}
