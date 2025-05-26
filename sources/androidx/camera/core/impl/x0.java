package androidx.camera.core.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f16990a = Collections.unmodifiableSet(EnumSet.of(v.PASSIVE_FOCUSED, v.PASSIVE_NOT_FOCUSED, v.LOCKED_FOCUSED, v.LOCKED_NOT_FOCUSED));

    /* renamed from: b, reason: collision with root package name */
    public static final Set f16991b = Collections.unmodifiableSet(EnumSet.of(x.CONVERGED, x.UNKNOWN));

    /* renamed from: c, reason: collision with root package name */
    public static final Set f16992c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f16993d;

    static {
        t tVar = t.CONVERGED;
        t tVar2 = t.FLASH_REQUIRED;
        t tVar3 = t.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(tVar, tVar2, tVar3));
        f16992c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(tVar2);
        copyOf.remove(tVar3);
        f16993d = Collections.unmodifiableSet(copyOf);
    }
}
