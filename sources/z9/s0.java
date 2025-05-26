package z9;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f141286b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f141287a = new LinkedHashMap();

    public final void a(r0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = g4.u.n0(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.f141287a;
        r0 r0Var = (r0) linkedHashMap.get(name);
        if (Intrinsics.d(r0Var, navigator)) {
            return;
        }
        boolean z13 = false;
        if (r0Var != null && r0Var.f141283b) {
            z13 = true;
        }
        if (!(!z13)) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + r0Var).toString());
        }
        if (!navigator.f141283b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final r0 b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        r0 r0Var = (r0) this.f141287a.get(name);
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalStateException(a.a.k("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
