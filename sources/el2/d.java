package el2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f59568b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Class f59569a;

    public d(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        Intrinsics.f(componentType);
        this.f59569a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f59569a.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return l0.b0((Enum[]) enumConstants);
    }
}
