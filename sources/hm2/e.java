package hm2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e implements b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e FROM_IDE = new e("FROM_IDE", 0);
    public static final e FROM_BACKEND = new e("FROM_BACKEND", 1);
    public static final e FROM_TEST = new e("FROM_TEST", 2);
    public static final e FROM_BUILTINS = new e("FROM_BUILTINS", 3);
    public static final e WHEN_CHECK_DECLARATION_CONFLICTS = new e("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
    public static final e WHEN_CHECK_OVERRIDES = new e("WHEN_CHECK_OVERRIDES", 5);
    public static final e FOR_SCRIPT = new e("FOR_SCRIPT", 6);
    public static final e FROM_REFLECTION = new e("FROM_REFLECTION", 7);
    public static final e WHEN_RESOLVE_DECLARATION = new e("WHEN_RESOLVE_DECLARATION", 8);
    public static final e WHEN_GET_DECLARATION_SCOPE = new e("WHEN_GET_DECLARATION_SCOPE", 9);
    public static final e WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = new e("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
    public static final e FOR_ALREADY_TRACKED = new e("FOR_ALREADY_TRACKED", 11);
    public static final e WHEN_GET_ALL_DESCRIPTORS = new e("WHEN_GET_ALL_DESCRIPTORS", 12);
    public static final e WHEN_TYPING = new e("WHEN_TYPING", 13);
    public static final e WHEN_GET_SUPER_MEMBERS = new e("WHEN_GET_SUPER_MEMBERS", 14);
    public static final e FOR_NON_TRACKED_SCOPE = new e("FOR_NON_TRACKED_SCOPE", 15);
    public static final e FROM_SYNTHETIC_SCOPE = new e("FROM_SYNTHETIC_SCOPE", 16);
    public static final e FROM_DESERIALIZATION = new e("FROM_DESERIALIZATION", 17);
    public static final e FROM_JAVA_LOADER = new e("FROM_JAVA_LOADER", 18);
    public static final e WHEN_GET_LOCAL_VARIABLE = new e("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final e WHEN_FIND_BY_FQNAME = new e("WHEN_FIND_BY_FQNAME", 20);
    public static final e WHEN_GET_COMPANION_OBJECT = new e("WHEN_GET_COMPANION_OBJECT", 21);
    public static final e FOR_DEFAULT_IMPORTS = new e("FOR_DEFAULT_IMPORTS", 22);

    private static final /* synthetic */ e[] $values() {
        return new e[]{FROM_IDE, FROM_BACKEND, FROM_TEST, FROM_BUILTINS, WHEN_CHECK_DECLARATION_CONFLICTS, WHEN_CHECK_OVERRIDES, FOR_SCRIPT, FROM_REFLECTION, WHEN_RESOLVE_DECLARATION, WHEN_GET_DECLARATION_SCOPE, WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS, FOR_ALREADY_TRACKED, WHEN_GET_ALL_DESCRIPTORS, WHEN_TYPING, WHEN_GET_SUPER_MEMBERS, FOR_NON_TRACKED_SCOPE, FROM_SYNTHETIC_SCOPE, FROM_DESERIALIZATION, FROM_JAVA_LOADER, WHEN_GET_LOCAL_VARIABLE, WHEN_FIND_BY_FQNAME, WHEN_GET_COMPANION_OBJECT, FOR_DEFAULT_IMPORTS};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public a getLocation() {
        return null;
    }
}
