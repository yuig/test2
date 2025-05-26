package sm2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private static final Map<Integer, b> entryById;

    /* renamed from: id, reason: collision with root package name */
    private final int f113273id;
    public static final b UNKNOWN = new b("UNKNOWN", 0, 0);
    public static final b CLASS = new b("CLASS", 1, 1);
    public static final b FILE_FACADE = new b("FILE_FACADE", 2, 2);
    public static final b SYNTHETIC_CLASS = new b("SYNTHETIC_CLASS", 3, 3);
    public static final b MULTIFILE_CLASS = new b("MULTIFILE_CLASS", 4, 4);
    public static final b MULTIFILE_CLASS_PART = new b("MULTIFILE_CLASS_PART", 5, 5);

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        b[] values = values();
        int a13 = y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (b bVar : values) {
            linkedHashMap.put(Integer.valueOf(bVar.f113273id), bVar);
        }
        entryById = linkedHashMap;
    }

    private b(String str, int i13, int i14) {
        this.f113273id = i14;
    }

    @NotNull
    public static final b getById(int i13) {
        Companion.getClass();
        b bVar = (b) entryById.get(Integer.valueOf(i13));
        return bVar == null ? UNKNOWN : bVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
