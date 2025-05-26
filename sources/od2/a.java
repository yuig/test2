package od2;

import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import pd2.q0;

/* loaded from: classes4.dex */
public final class a extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String name, String shader, q0 settings, Map assets) {
        super(name, shader, settings, assets);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shader, "shader");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(assets, "assets");
    }

    public /* synthetic */ a(String str, String str2, q0 q0Var) {
        this(str, str2, q0Var, z0.d());
    }
}
