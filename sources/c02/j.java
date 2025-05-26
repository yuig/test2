package c02;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q5.c1;

/* loaded from: classes4.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f24444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f24445c;

    public /* synthetic */ j(u uVar, ArrayList arrayList, int i13) {
        this.f24443a = i13;
        this.f24445c = uVar;
        this.f24444b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f24443a;
        u uVar = this.f24445c;
        List<y2> list = this.f24444b;
        switch (i13) {
            case 0:
                for (y2 y2Var : list) {
                    uVar.f24470q.add(y2Var);
                    ViewPropertyAnimator animate = y2Var.f19717a.animate();
                    t tVar = uVar.f24461h;
                    ViewPropertyAnimator e13 = tVar.e(animate);
                    q7.s sVar = (q7.s) tVar;
                    e13.setDuration(sVar.f102678a).setStartDelay(sVar.f102679b).setInterpolator((Interpolator) sVar.f102680c).setListener(new c1(uVar, y2Var, e13, 6)).start();
                }
                list.clear();
                uVar.f24477x.remove(list);
                break;
            case 1:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    s sVar2 = (s) it.next();
                    y2 y2Var2 = sVar2.f24455a;
                    ArrayList arrayList = uVar.f24472s;
                    arrayList.add(y2Var2);
                    int i14 = sVar2.f24458d;
                    int i15 = sVar2.f24456b;
                    int i16 = i14 - i15;
                    int i17 = sVar2.f24459e;
                    int i18 = sVar2.f24457c;
                    int i19 = i17 - i18;
                    r rVar = uVar.f24464k;
                    if (i16 == 0 && i19 == 0) {
                        rVar.m(y2Var2, i16, i19, false);
                        uVar.h(y2Var2);
                        arrayList.remove(y2Var2);
                        uVar.q();
                    } else {
                        AnimatorSet x13 = rVar.x(y2Var2, i15, i18, i14, i17);
                        q7.s sVar3 = (q7.s) rVar;
                        x13.setStartDelay(sVar3.f102679b);
                        x13.setInterpolator((Interpolator) sVar3.f102680c);
                        x13.addListener(new com.google.android.material.textfield.p(uVar, y2Var2, x13, i16, i19));
                        x13.start();
                    }
                }
                list.clear();
                uVar.f24474u.remove(list);
                break;
            default:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    uVar.getClass();
                    y2 y2Var3 = qVar.f24449a;
                    View view = y2Var3 != null ? y2Var3.f19717a : null;
                    y2 y2Var4 = qVar.f24450b;
                    View view2 = y2Var4 != null ? y2Var4.f19717a : null;
                    if (y2Var3 != null && view != null) {
                        uVar.n(qVar, y2Var3, view, true);
                    }
                    if (y2Var4 != null && view2 != null) {
                        uVar.n(qVar, y2Var4, view2, false);
                    }
                }
                list.clear();
                uVar.f24475v.remove(list);
                break;
        }
    }
}
