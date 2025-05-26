package td2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pd2.q0;
import pd2.r0;
import vd2.d;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f117472a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117473b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f117474c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f117475d;

    public a(String name, List shaders, r0 settings, LinkedHashMap resources) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shaders, "shaders");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f117472a = name;
        this.f117473b = shaders;
        this.f117474c = settings;
        this.f117475d = resources;
    }

    @Override // vd2.d
    public final Map a() {
        return this.f117475d;
    }
}
