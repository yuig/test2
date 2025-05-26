package ez0;

import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import yk1.m;

/* loaded from: classes5.dex */
public abstract class a extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final dz0.a f60665a;

    public a(dz0.a oneTapPinPresenterListener) {
        Intrinsics.checkNotNullParameter(oneTapPinPresenterListener, "oneTapPinPresenterListener");
        this.f60665a = oneTapPinPresenterListener;
    }

    @Override // vq0.h
    public final m f() {
        return new cz0.a(this.f60665a);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        s model = (s) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
