package td;

import android.content.res.AssetManager;

/* loaded from: classes.dex */
public final class b implements d0, a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117370a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f117371b;

    public /* synthetic */ b(AssetManager assetManager, int i13) {
        this.f117370a = i13;
        this.f117371b = assetManager;
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        int i13 = this.f117370a;
        AssetManager assetManager = this.f117371b;
        switch (i13) {
        }
        return new c(assetManager, this);
    }
}
