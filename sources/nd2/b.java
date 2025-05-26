package nd2;

import java.util.List;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import pd2.q0;
import pd2.r0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f90426a;

    /* renamed from: b, reason: collision with root package name */
    public final List f90427b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90428c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f90429d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90430e;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f90431f;

    public b(String name, List shaders, String script, q0 settings, Map assets) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shaders, "shaders");
        Intrinsics.checkNotNullParameter(script, "script");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f90426a = name;
        this.f90427b = shaders;
        this.f90428c = script;
        this.f90429d = assets;
        this.f90431f = new r0(settings.f99868a, new a(this, 0));
    }

    public /* synthetic */ b(String str, List list, q0 q0Var) {
        this(str, list, "", q0Var, z0.d());
    }
}
