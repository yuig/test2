package u5;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f120513c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f120514a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f120515b;

    public i(String type, Bundle data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f120514a = type;
        this.f120515b = data;
    }

    public final Bundle a() {
        return this.f120515b;
    }

    public final String b() {
        return this.f120514a;
    }
}
