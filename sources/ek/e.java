package ek;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Object f59124a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f59125b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f59126c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f59127d;

    /* renamed from: e, reason: collision with root package name */
    public int f59128e;

    /* renamed from: f, reason: collision with root package name */
    public View f59129f;

    /* renamed from: g, reason: collision with root package name */
    public TabLayout f59130g;

    /* renamed from: h, reason: collision with root package name */
    public h f59131h;

    /* renamed from: i, reason: collision with root package name */
    public int f59132i;

    public final void a() {
        this.f59130g = null;
        this.f59131h = null;
        this.f59124a = null;
        this.f59125b = null;
        this.f59132i = -1;
        this.f59126c = null;
        this.f59127d = null;
        this.f59128e = -1;
        this.f59129f = null;
    }

    public final void b() {
        TabLayout tabLayout = this.f59130g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.u(this, true);
    }

    public final void c() {
        h hVar = this.f59131h;
        if (hVar != null) {
            hVar.c();
        }
    }
}
