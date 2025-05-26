package androidx.drawerlayout.widget;

import android.view.View;
import androidx.appcompat.app.z;
import androidx.drawerlayout.widget.DrawerLayout;
import bp1.h;
import y5.d;

/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f18212a;

    /* renamed from: b, reason: collision with root package name */
    public d f18213b;

    /* renamed from: c, reason: collision with root package name */
    public final z f18214c = new z(this, 11);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f18215d;

    public b(DrawerLayout drawerLayout, int i13) {
        this.f18215d = drawerLayout;
        this.f18212a = i13;
    }

    @Override // bp1.h
    public final void A(View view, int i13) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).f18205c = false;
        int i14 = this.f18212a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f18215d;
        View d2 = drawerLayout.d(i14);
        if (d2 != null) {
            drawerLayout.b(d2, true);
        }
    }

    @Override // bp1.h
    public final void B(int i13) {
        this.f18215d.r(this.f18213b.f137765t, i13);
    }

    @Override // bp1.h
    public final void C(View view, int i13, int i14) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f18215d;
        float width2 = (drawerLayout.a(view, 3) ? i13 + width : drawerLayout.getWidth() - i13) / width;
        drawerLayout.o(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // bp1.h
    public final void D(View view, float f13, float f14) {
        int i13;
        DrawerLayout drawerLayout = this.f18215d;
        drawerLayout.getClass();
        float f15 = ((DrawerLayout.LayoutParams) view.getLayoutParams()).f18204b;
        int width = view.getWidth();
        if (drawerLayout.a(view, 3)) {
            i13 = (f13 > 0.0f || (f13 == 0.0f && f15 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f13 < 0.0f || (f13 == 0.0f && f15 > 0.5f)) {
                width2 -= width;
            }
            i13 = width2;
        }
        this.f18213b.s(i13, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // bp1.h
    public final boolean I(View view, int i13) {
        DrawerLayout drawerLayout = this.f18215d;
        drawerLayout.getClass();
        return DrawerLayout.l(view) && drawerLayout.a(view, this.f18212a) && drawerLayout.g(view) == 0;
    }

    @Override // bp1.h
    public final int f(View view, int i13) {
        DrawerLayout drawerLayout = this.f18215d;
        if (drawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i13, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i13, width));
    }

    @Override // bp1.h
    public final int g(View view, int i13) {
        return view.getTop();
    }

    @Override // bp1.h
    public final int r(View view) {
        this.f18215d.getClass();
        if (DrawerLayout.l(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // bp1.h
    public final void y(int i13, int i14) {
        int i15 = i13 & 1;
        DrawerLayout drawerLayout = this.f18215d;
        View d2 = i15 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (d2 == null || drawerLayout.g(d2) != 0) {
            return;
        }
        this.f18213b.c(d2, i14);
    }

    @Override // bp1.h
    public final void z(int i13) {
        this.f18215d.postDelayed(this.f18214c, 160L);
    }
}
