package od2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd2.q0;
import pd2.r0;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f94185a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94186b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f94187c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f94188d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f94189e;

    public d(String str, String str2, q0 q0Var, Map map) {
        this.f94185a = str;
        this.f94186b = str2;
        this.f94187c = map;
        this.f94189e = new r0(q0Var.f99868a, new nd2.a(this, 1));
        if (!StringsKt.E(str2, "{{name}}", false)) {
            throw new IllegalArgumentException("Effect template doesn't contain `{{name}}` tag. Check the effect function definition in shader code".toString());
        }
    }

    public final Map a() {
        return this.f94187c;
    }

    public final String b() {
        return this.f94185a;
    }

    public final r0 c() {
        return this.f94189e;
    }

    public final String d() {
        return this.f94186b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.xrenderer.effects.motion_effects.MotionEffect");
        d dVar = (d) obj;
        if (Intrinsics.d(this.f94185a, dVar.f94185a)) {
            return Intrinsics.d(this.f94186b, dVar.f94186b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f94186b.hashCode() + (this.f94185a.hashCode() * 31);
    }
}
