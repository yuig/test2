package kv0;

import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f80997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80998b;

    /* renamed from: c, reason: collision with root package name */
    public final ScreenLocation f80999c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f81000d;

    public q(int i13, int i14, ScreenLocation location, Bundle arguments) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f80997a = i13;
        this.f80998b = i14;
        this.f80999c = location;
        this.f81000d = arguments;
    }

    public final int a() {
        return this.f80997a;
    }

    public final int b() {
        return this.f80998b;
    }
}
