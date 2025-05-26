package com.pinterest.widget.configuration;

import df.j1;
import do2.f2;
import do2.g2;
import do2.z1;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f52837a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f52838b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f52839c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f52840d;

    public h() {
        f2 b13 = g2.b(1, 0, null, 6);
        this.f52837a = b13;
        this.f52838b = new z1(b13);
        f2 b14 = g2.b(1, 0, null, 6);
        this.f52839c = b14;
        this.f52840d = new z1(b14);
    }

    public final void a(int i13, long j13) {
        this.f52839c.b(Long.valueOf(j13));
        lb0.m c13 = ((lb0.b) lb0.n.f82725d.a()).c();
        c13.putLong(j1.U("widget_refresh_interval_id_%d", new Object[]{Integer.valueOf(i13)}), j13);
        c13.commit();
    }
}
