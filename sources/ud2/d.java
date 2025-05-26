package ud2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd2.q0;
import pd2.r0;

/* loaded from: classes4.dex */
public abstract class d implements vd2.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f121931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f121932b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f121933c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f121934d;

    public d(String str, String str2, r0 r0Var, LinkedHashMap linkedHashMap) {
        this.f121931a = str;
        this.f121932b = str2;
        this.f121933c = r0Var;
        this.f121934d = linkedHashMap;
        if (!StringsKt.E(str2, "{{name}}", false)) {
            throw new IllegalArgumentException("Effect template doesn't contain `{{name}}` tag. Check the effect function definition in shader code".toString());
        }
    }

    @Override // vd2.d
    public final Map a() {
        return this.f121934d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.xrenderer.legacy.effects.motion_effects.LegacyMotionEffect");
        d dVar = (d) obj;
        return Intrinsics.d(this.f121931a, dVar.f121931a) && Intrinsics.d(this.f121932b, dVar.f121932b);
    }

    public final int hashCode() {
        return this.f121932b.hashCode() + (this.f121931a.hashCode() * 31);
    }
}
