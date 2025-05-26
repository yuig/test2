package x72;

import android.content.Context;
import android.view.ViewStub;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements k, ld2.b {

    /* renamed from: d, reason: collision with root package name */
    public static b f134124d;

    /* renamed from: a, reason: collision with root package name */
    public final e f134125a;

    /* renamed from: b, reason: collision with root package name */
    public final ld2.b f134126b;

    /* renamed from: c, reason: collision with root package name */
    public final k f134127c;

    public b(e type, String name, ld2.b effectFactory, k sceneViewProvider) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(effectFactory, "effectFactory");
        Intrinsics.checkNotNullParameter(sceneViewProvider, "sceneViewProvider");
        this.f134125a = type;
        this.f134126b = effectFactory;
        this.f134127c = sceneViewProvider;
    }

    public final od2.d a(Enum r43) {
        if (r43 instanceof ld2.c) {
            return y((ld2.c) r43);
        }
        if (r43 instanceof ld2.g) {
            return h((ld2.g) r43);
        }
        if (r43 instanceof ld2.d) {
            return z((ld2.d) r43);
        }
        throw new IllegalStateException(("Unknown effect type: " + r43).toString());
    }

    @Override // ld2.b
    public final od2.c h(ld2.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f134126b.h(type);
    }

    @Override // x72.k
    public final j n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f134127c.n(context);
    }

    @Override // x72.k
    public final j p(ViewStub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        return this.f134127c.p(stub);
    }

    @Override // ld2.b
    public final nd2.b t(ld2.e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f134126b.t(type);
    }

    @Override // ld2.b
    public final nd2.b v(od2.a effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        return this.f134126b.v(effect);
    }

    @Override // ld2.b
    public final od2.a y(ld2.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f134126b.y(type);
    }

    @Override // ld2.b
    public final od2.b z(ld2.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f134126b.z(type);
    }
}
