package fi2;

import aa0.f;
import android.content.Context;
import df.f0;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62223a;

    /* renamed from: b, reason: collision with root package name */
    public final gi2.a f62224b;

    /* renamed from: c, reason: collision with root package name */
    public final f f62225c;

    /* renamed from: d, reason: collision with root package name */
    public final v f62226d;

    /* renamed from: e, reason: collision with root package name */
    public final v f62227e;

    public b(Context context, gi2.a telemetryService, f storageAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(telemetryService, "telemetryService");
        Intrinsics.checkNotNullParameter(storageAvailabilityChecker, "storageAvailabilityChecker");
        this.f62223a = context;
        this.f62224b = telemetryService;
        this.f62225c = storageAvailabilityChecker;
        this.f62226d = m.b(new a(this, 0));
        this.f62227e = m.b(new a(this, 1));
    }

    public final File a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        File file = new File((File) this.f62227e.getValue(), name);
        if (!file.exists()) {
            Object value = this.f62226d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-cacheDirectory>(...)");
            File file2 = new File((File) value, name);
            if (file2.exists()) {
                return file2;
            }
        }
        return file;
    }

    public final File b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new File((File) this.f62227e.getValue(), name);
    }

    public final ArrayList c(f0 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        File[] listFiles = ((File) this.f62227e.getValue()).listFiles(filter);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        Object value = this.f62226d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cacheDirectory>(...)");
        File[] listFiles2 = ((File) value).listFiles(filter);
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        return CollectionsKt.l0(c0.b0(listFiles2), c0.b0(listFiles));
    }
}
