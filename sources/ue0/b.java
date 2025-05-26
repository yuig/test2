package ue0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f121973a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f121974b;

    /* renamed from: c, reason: collision with root package name */
    public float f121975c;

    /* renamed from: d, reason: collision with root package name */
    public float f121976d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121977e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121978f;

    /* renamed from: g, reason: collision with root package name */
    public final a f121979g;

    public b(Context context, a aVar) {
        this.f121979g = aVar;
        this.f121974b = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final boolean a(float f13, boolean z13) {
        boolean z14 = this.f121977e;
        if (!z14) {
            return z14;
        }
        float f14 = z13 ? 0.0f : this.f121974b;
        float f15 = this.f121975c;
        if (f13 - f15 <= f14 || this.f121978f) {
            return z14;
        }
        this.f121976d = f15 + f14;
        this.f121978f = true;
        return false;
    }

    public final boolean b(MotionEvent motionEvent, float f13, boolean z13) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i13 = this.f121973a;
                    if (i13 == -1) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i13);
                    float y13 = findPointerIndex < 0 ? -2.1474836E9f : motionEvent.getY(findPointerIndex);
                    if (y13 == -2.1474836E9f) {
                        return false;
                    }
                    this.f121977e = a(y13, z13);
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f121973a) {
                            this.f121973a = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.f121978f = false;
            this.f121977e = false;
            this.f121973a = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.f121973a = pointerId;
            this.f121978f = false;
            this.f121977e = true;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            float y14 = findPointerIndex2 < 0 ? -2.1474836E9f : motionEvent.getY(findPointerIndex2);
            if (y14 != -2.1474836E9f) {
                int findPointerIndex3 = motionEvent.findPointerIndex(this.f121973a);
                if (findPointerIndex3 >= 0) {
                    motionEvent.getX(findPointerIndex3);
                }
                this.f121975c = y14 - f13;
                this.f121979g.g();
            }
        }
        return this.f121978f;
    }

    public final boolean c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            a aVar = this.f121979g;
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f121973a);
                if (findPointerIndex < 0) {
                    return false;
                }
                motionEvent.getY(findPointerIndex);
                this.f121978f = false;
                this.f121973a = -1;
                aVar.b();
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f121973a);
                float y13 = findPointerIndex2 < 0 ? -2.1474836E9f : motionEvent.getY(findPointerIndex2);
                if (y13 == -2.1474836E9f) {
                    return false;
                }
                if (this.f121977e) {
                    this.f121977e = a(y13, false);
                } else {
                    float f13 = y13 - this.f121976d;
                    if (this.f121978f) {
                        if (f13 <= 0.0f) {
                            return false;
                        }
                        int findPointerIndex3 = motionEvent.findPointerIndex(this.f121973a);
                        if (findPointerIndex3 >= 0) {
                            motionEvent.getX(findPointerIndex3);
                        }
                        aVar.e(f13, y13 - this.f121975c);
                    }
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f121973a = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f121973a) {
                        this.f121973a = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        } else {
            this.f121973a = motionEvent.getPointerId(0);
            this.f121978f = false;
        }
        return true;
    }
}
