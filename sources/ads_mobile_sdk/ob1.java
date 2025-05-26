package ads_mobile_sdk;

import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ob1 {

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f9202b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f9201a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public mb1 f9203c = new mb1();

    public final synchronized void a(HashMap hashMap) {
        try {
            MotionEvent motionEvent = this.f9202b;
            if (motionEvent != null) {
                hashMap.put("nv", motionEvent);
            }
            hashMap.put("oe", this.f9203c);
            ArrayDeque arrayDeque = this.f9201a;
            hashMap.put("ro", arrayDeque.toArray(new nb1[arrayDeque.size()]));
            this.f9203c = new mb1();
            this.f9201a.clear();
            MotionEvent motionEvent2 = this.f9202b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.f9202b = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.f9202b = MotionEvent.obtain(motionEvent);
            }
            mb1 mb1Var = this.f9203c;
            mb1Var.getClass();
            int action = motionEvent.getAction();
            if (action == 0) {
                mb1Var.f8148a++;
                mb1Var.f8154g = 0.0d;
                mb1Var.f8152e = motionEvent.getRawX();
                mb1Var.f8153f = motionEvent.getRawY();
                mb1Var.f8155h = motionEvent.getX();
                mb1Var.f8156i = motionEvent.getY();
                mb1Var.f8157j = motionEvent.getRawX();
                mb1Var.f8158k = motionEvent.getRawY();
            } else if (action == 1) {
                mb1Var.f8150c++;
                mb1Var.f8154g = Math.hypot(motionEvent.getRawX() - mb1Var.f8152e, motionEvent.getRawY() - mb1Var.f8153f) + mb1Var.f8154g;
                mb1Var.f8152e = motionEvent.getRawX();
                mb1Var.f8153f = motionEvent.getRawY();
            } else if (action == 2) {
                mb1Var.f8149b += motionEvent.getHistorySize() + 1;
                mb1Var.f8154g = Math.hypot(motionEvent.getRawX() - mb1Var.f8152e, motionEvent.getRawY() - mb1Var.f8153f) + mb1Var.f8154g;
                mb1Var.f8152e = motionEvent.getRawX();
                mb1Var.f8153f = motionEvent.getRawY();
            } else if (action == 3) {
                mb1Var.f8151d++;
            }
            if (this.f9201a.size() >= 6) {
                this.f9201a.remove();
            }
            this.f9201a.add(new nb1(motionEvent));
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
