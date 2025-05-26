package com.bugsnag.android;

import java.io.File;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class l2 extends l1 {

    /* renamed from: g, reason: collision with root package name */
    public final String f29330g;

    public l2(File file, int i13, String str, u1 u1Var) {
        super(new File(file, "sessions"), i13, u1Var, null);
        this.f29330g = str;
    }

    @Override // com.bugsnag.android.l1
    public final String e(Object obj) {
        eb.d dVar = k2.f29318a;
        String str = obj instanceof j2 ? ((j2) obj).f29299n : this.f29330g;
        long currentTimeMillis = System.currentTimeMillis();
        return str + '_' + UUID.randomUUID().toString() + currentTimeMillis + "_v3.json";
    }
}
