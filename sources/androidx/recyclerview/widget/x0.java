package androidx.recyclerview.widget;

import a.cb;
import android.view.View;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public l1 f19694a;

    /* renamed from: b, reason: collision with root package name */
    public int f19695b;

    /* renamed from: c, reason: collision with root package name */
    public int f19696c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19697d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19698e;

    public x0() {
        d();
    }

    public final void a() {
        this.f19696c = this.f19697d ? this.f19694a.g() : this.f19694a.k();
    }

    public final void b(View view, int i13) {
        if (this.f19697d) {
            this.f19696c = this.f19694a.m() + this.f19694a.b(view);
        } else {
            this.f19696c = this.f19694a.e(view);
        }
        this.f19695b = i13;
    }

    public final void c(View view, int i13) {
        int m13 = this.f19694a.m();
        if (m13 >= 0) {
            b(view, i13);
            return;
        }
        this.f19695b = i13;
        if (!this.f19697d) {
            int e13 = this.f19694a.e(view);
            int k13 = e13 - this.f19694a.k();
            this.f19696c = e13;
            if (k13 > 0) {
                int g13 = (this.f19694a.g() - Math.min(0, (this.f19694a.g() - m13) - this.f19694a.b(view))) - (this.f19694a.c(view) + e13);
                if (g13 < 0) {
                    this.f19696c -= Math.min(k13, -g13);
                    return;
                }
                return;
            }
            return;
        }
        int g14 = (this.f19694a.g() - m13) - this.f19694a.b(view);
        this.f19696c = this.f19694a.g() - g14;
        if (g14 > 0) {
            int c13 = this.f19696c - this.f19694a.c(view);
            int k14 = this.f19694a.k();
            int min = c13 - (Math.min(this.f19694a.e(view) - k14, 0) + k14);
            if (min < 0) {
                this.f19696c = Math.min(g14, -min) + this.f19696c;
            }
        }
    }

    public final void d() {
        this.f19695b = -1;
        this.f19696c = Integer.MIN_VALUE;
        this.f19697d = false;
        this.f19698e = false;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AnchorInfo{mPosition=");
        sb3.append(this.f19695b);
        sb3.append(", mCoordinate=");
        sb3.append(this.f19696c);
        sb3.append(", mLayoutFromEnd=");
        sb3.append(this.f19697d);
        sb3.append(", mValid=");
        return cb.m(sb3, this.f19698e, '}');
    }
}
