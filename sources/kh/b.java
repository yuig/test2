package kh;

import bb.p;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import jh.n;

/* loaded from: classes3.dex */
public final class b extends f implements n {

    /* renamed from: k, reason: collision with root package name */
    public static final x92.b f79407k = new x92.b("ClientTelemetry.API", new ch.c(5), new d());

    public final Task e(TelemetryData telemetryData) {
        q a13 = r.a();
        a13.f30860d = new Feature[]{bi.c.f22821a};
        a13.f30858b = false;
        a13.f30859c = new p((Object) telemetryData, 13);
        return d(2, a13.a());
    }
}
