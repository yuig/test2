package rz;

import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f110229a = new ConcurrentHashMap();

    public final void a(TypeToken token, d adapter) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f110229a.put(token, adapter);
    }
}
