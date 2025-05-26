package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f19510c;

    public /* synthetic */ m(s sVar, ArrayList arrayList, int i13) {
        this.f19508a = i13;
        this.f19510c = sVar;
        this.f19509b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c13;
        int i13 = this.f19508a;
        s sVar = this.f19510c;
        ArrayList arrayList = this.f19509b;
        switch (i13) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    y2 y2Var = rVar.f19611a;
                    sVar.getClass();
                    View view = y2Var.f19717a;
                    int i14 = rVar.f19614d - rVar.f19612b;
                    int i15 = rVar.f19615e - rVar.f19613c;
                    if (i14 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i15 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    sVar.f19627p.add(y2Var);
                    animate.setDuration(sVar.f19423e).setListener(new o(sVar, y2Var, i14, view, i15, animate)).start();
                }
                arrayList.clear();
                sVar.f19624m.remove(arrayList);
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    sVar.getClass();
                    y2 y2Var2 = qVar.f19563a;
                    View view2 = y2Var2 == null ? null : y2Var2.f19717a;
                    y2 y2Var3 = qVar.f19564b;
                    View view3 = y2Var3 != null ? y2Var3.f19717a : null;
                    ArrayList arrayList2 = sVar.f19629r;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(sVar.f19424f);
                        arrayList2.add(qVar.f19563a);
                        duration.translationX(qVar.f19567e - qVar.f19565c);
                        duration.translationY(qVar.f19568f - qVar.f19566d);
                        duration.alpha(0.0f).setListener(new p(sVar, qVar, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList2.add(qVar.f19564b);
                        c13 = 0;
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(sVar.f19424f).alpha(1.0f).setListener(new p(sVar, qVar, animate2, view3, 1)).start();
                    } else {
                        c13 = 0;
                    }
                }
                arrayList.clear();
                sVar.f19625n.remove(arrayList);
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    y2 y2Var4 = (y2) it3.next();
                    sVar.getClass();
                    View view4 = y2Var4.f19717a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    sVar.f19626o.add(y2Var4);
                    animate3.alpha(1.0f).setDuration(sVar.f19421c).setListener(new n(sVar, y2Var4, view4, animate3)).start();
                }
                arrayList.clear();
                sVar.f19623l.remove(arrayList);
                break;
        }
    }
}
