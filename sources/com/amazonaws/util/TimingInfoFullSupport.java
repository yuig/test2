package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
class TimingInfoFullSupport extends TimingInfo {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f29051c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f29052d;

    public TimingInfoFullSupport(long j13) {
        super(j13, null);
        this.f29051c = new HashMap();
        this.f29052d = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    public final void a(String str, TimingInfo timingInfo) {
        HashMap hashMap = this.f29051c;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(str, list);
        }
        if (timingInfo.f29050b != null) {
            list.add(timingInfo);
            return;
        }
        LogFactory.a(getClass()).f("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public final void c(String str) {
        d((((Number) this.f29052d.get(str)) != null ? r0.intValue() : 0) + 1, str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public final void d(long j13, String str) {
        this.f29052d.put(str, Long.valueOf(j13));
    }
}
