package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* renamed from: b */
    public final HashMap f29032b;

    /* renamed from: c */
    public final HashMap f29033c;

    static {
        LogFactory.b("com.amazonaws.latency");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(System.nanoTime()));
        System.currentTimeMillis();
        this.f29032b = new HashMap();
        this.f29033c = new HashMap();
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void a(AWSRequestMetrics.Field field, Object obj) {
        String name = field.name();
        HashMap hashMap = this.f29032b;
        List list = (List) hashMap.get(name);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(name, list);
        }
        list.add(obj);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void b(AWSRequestMetrics.Field field) {
        String name = field.name();
        TimingInfo timingInfo = (TimingInfo) this.f29033c.get(name);
        if (timingInfo != null) {
            timingInfo.b();
            Long l13 = timingInfo.f29050b;
            this.f29031a.a(name, new TimingInfoUnmodifiable(timingInfo.f29049a, Long.valueOf(l13 == null ? -1L : l13.longValue())));
        } else {
            LogFactory.a(getClass()).h("Trying to end an event which was never started: " + name);
        }
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void c(AWSRequestMetrics.Field field) {
        this.f29031a.c(field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void d(AWSRequestMetrics.Field field, long j13) {
        this.f29031a.d(j13, field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void e(AWSRequestMetrics.Field field) {
        this.f29033c.put(field.name(), new TimingInfoFullSupport(System.nanoTime()));
    }
}
