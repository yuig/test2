package gd;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f64791a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f64792b;

    public j(String str, Map payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f64791a = str;
        this.f64792b = payload;
    }

    @Override // gd.d
    public final String getId() {
        return this.f64791a;
    }
}
