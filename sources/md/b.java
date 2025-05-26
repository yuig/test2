package md;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import td.c0;
import td.d0;
import td.i0;

/* loaded from: classes.dex */
public final class b implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile OkHttpClient f86952b;

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f86953a;

    public b(Call.Factory factory) {
        this.f86953a = factory;
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        return new c(this.f86953a);
    }
}
