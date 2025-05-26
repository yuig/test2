package n3;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final List f89070a;

    /* renamed from: b */
    public final e f89071b;

    /* renamed from: c */
    public final int f89072c;

    /* renamed from: d */
    public int f89073d;

    public j(List list, e eVar) {
        this.f89070a = list;
        this.f89071b = eVar;
        MotionEvent c13 = eVar != null ? eVar.c() : null;
        int i13 = 0;
        this.f89072c = c13 != null ? c13.getButtonState() : 0;
        MotionEvent c14 = eVar != null ? eVar.c() : null;
        if (c14 != null) {
            c14.getMetaState();
        }
        MotionEvent c15 = eVar != null ? eVar.c() : null;
        int i14 = 1;
        if (c15 == null) {
            int size = list.size();
            while (true) {
                if (i13 >= size) {
                    i14 = 3;
                    break;
                }
                q qVar = (q) list.get(i13);
                if (c0.d.u(qVar)) {
                    i14 = 2;
                    break;
                } else if (c0.d.s(qVar)) {
                    break;
                } else {
                    i13++;
                }
            }
        } else {
            int actionMasked = c15.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i13 = 6;
                                break;
                            case 9:
                                i13 = 4;
                                break;
                            case 10:
                                i13 = 5;
                                break;
                        }
                        i14 = i13;
                    }
                    i13 = 3;
                    i14 = i13;
                }
                i13 = 2;
                i14 = i13;
            }
            i13 = 1;
            i14 = i13;
        }
        this.f89073d = i14;
    }
}
