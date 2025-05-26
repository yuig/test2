package com.pinterest.analytics.kibana;

import com.pinterest.analytics.kibana.KibanaMetrics;

/* loaded from: classes3.dex */
public final class c implements ay.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KibanaMetrics.Log.Metadata f35485a;

    public c(KibanaMetrics.Log.Metadata metadata) {
        this.f35485a = metadata;
    }

    @Override // ay.a
    public final String a() {
        return this.f35485a.getCommonProperties().a();
    }

    @Override // ay.a
    public final String b() {
        return this.f35485a.getCommonProperties().b();
    }

    @Override // ay.a
    public final String c() {
        return this.f35485a.getCommonProperties().c();
    }

    @Override // ay.a
    public final String d() {
        return "Test Automation";
    }

    @Override // ay.a
    public final String e() {
        return this.f35485a.getCommonProperties().e();
    }
}
