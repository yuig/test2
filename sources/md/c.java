package md;

import nd.l;
import okhttp3.Call;
import td.b0;
import td.c0;
import td.t;

/* loaded from: classes.dex */
public final class c implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f86954a;

    public c(Call.Factory factory) {
        this.f86954a = factory;
    }

    @Override // td.c0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, l lVar) {
        t tVar = (t) obj;
        return new b0(tVar, new a(this.f86954a, tVar));
    }
}
