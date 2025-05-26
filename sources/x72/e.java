package x72;

import kotlin.jvm.functions.Function0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e LEGACY = new e("LEGACY", 0, "legacy", c.f134128j);
    public static final e XRENDERER_GLES = new e("XRENDERER_GLES", 1, "xrenderer_gles", c.f134129k);
    public static final e XRENDERER_VULKAN = new e("XRENDERER_VULKAN", 2, "xrenderer_vulkan", c.f134130l);

    @NotNull
    private final Function0<b> factory;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f134132id;

    private static final /* synthetic */ e[] $values() {
        return new e[]{LEGACY, XRENDERER_GLES, XRENDERER_VULKAN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private e(String str, int i13, String str2, Function0 function0) {
        this.f134132id = str2;
        this.factory = function0;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final Function0<b> getFactory$shuffles_scene_release() {
        return this.factory;
    }

    @NotNull
    public final String getId() {
        return this.f134132id;
    }
}
