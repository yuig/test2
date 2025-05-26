package vb0;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f125452j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f125453k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f125454i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f125454i) {
            case 0:
                Context context = kb0.a.f79058b;
                Object systemService = f0.X().getSystemService("connectivity");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return (ConnectivityManager) systemService;
            default:
                return new f();
        }
    }
}
