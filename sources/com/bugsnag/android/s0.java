package com.bugsnag.android;

import java.util.Date;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class s0 extends h0 {

    /* renamed from: j, reason: collision with root package name */
    public final Long f29629j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f29630k;

    /* renamed from: l, reason: collision with root package name */
    public final String f29631l;

    /* renamed from: m, reason: collision with root package name */
    public final Date f29632m;

    public s0(i0 i0Var, Boolean bool, String str, String str2, Long l13, LinkedHashMap linkedHashMap, Long l14, Long l15, String str3, Date date) {
        super(i0Var, i0Var.f29270i, bool, str, str2, l13, linkedHashMap);
        this.f29629j = l14;
        this.f29630k = l15;
        this.f29631l = str3;
        this.f29632m = date;
    }

    @Override // com.bugsnag.android.h0
    public final void a(o1 o1Var) {
        super.a(o1Var);
        o1Var.K("freeDisk");
        o1Var.w(this.f29629j);
        o1Var.K("freeMemory");
        o1Var.w(this.f29630k);
        o1Var.K("orientation");
        o1Var.z(this.f29631l);
        Date date = this.f29632m;
        if (date != null) {
            o1Var.K("time");
            o1Var.M(date);
        }
    }
}
