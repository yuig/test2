package com.bugsnag.android;

import java.util.Date;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public String f29279a;

    /* renamed from: b, reason: collision with root package name */
    public BreadcrumbType f29280b;

    /* renamed from: c, reason: collision with root package name */
    public Map f29281c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f29282d;

    public j(String str, BreadcrumbType breadcrumbType, Map map, Date date) {
        this.f29279a = str;
        this.f29280b = breadcrumbType;
        this.f29281c = map;
        this.f29282d = date;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("timestamp");
        o1Var.M(this.f29282d);
        o1Var.K("name");
        o1Var.z(this.f29279a);
        o1Var.K("type");
        o1Var.z(this.f29280b.getType());
        o1Var.K("metaData");
        Map map = this.f29281c;
        if (map instanceof n1) {
            ((n1) map).toStream(o1Var);
        } else {
            o1Var.f29397h.a(map, o1Var, true);
        }
        o1Var.g();
    }
}
