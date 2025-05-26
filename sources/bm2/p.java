package bm2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private static final Set<p> ALL_TARGET_SET;

    @NotNull
    private static final List<p> ANNOTATION_CLASS_LIST;
    public static final p BACKING_FIELD;

    @NotNull
    private static final List<p> CLASS_LIST;

    @NotNull
    private static final List<p> COMPANION_OBJECT_LIST;
    public static final p CONSTRUCTOR;

    @NotNull
    public static final o Companion;

    @NotNull
    private static final Set<p> DEFAULT_TARGET_SET;

    @NotNull
    private static final List<p> ENUM_ENTRY_LIST;

    @NotNull
    private static final List<p> ENUM_LIST;
    public static final p FIELD;

    @NotNull
    private static final List<p> FILE_LIST;
    public static final p FUNCTION;

    @NotNull
    private static final List<p> FUNCTION_LIST;

    @NotNull
    private static final List<p> INTERFACE_LIST;

    @NotNull
    private static final List<p> LOCAL_CLASS_LIST;
    public static final p LOCAL_VARIABLE;

    @NotNull
    private static final List<p> OBJECT_LIST;
    public static final p PROPERTY;
    public static final p PROPERTY_GETTER;

    @NotNull
    private static final List<p> PROPERTY_GETTER_LIST;
    public static final p PROPERTY_SETTER;

    @NotNull
    private static final List<p> PROPERTY_SETTER_LIST;

    @NotNull
    private static final Map<e, p> USE_SITE_MAPPING;
    public static final p VALUE_PARAMETER;

    @NotNull
    private static final HashMap<String, p> map;

    @NotNull
    private final String description;
    private final boolean isDefault;
    public static final p CLASS = new p("CLASS", 0, "class", 0 == true ? 1 : 0, 2, null);
    public static final p ANNOTATION_CLASS = new p("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final p TYPE_PARAMETER = new p("TYPE_PARAMETER", 2, "type parameter", false);
    public static final p TYPE = new p(CredentialProviderBaseController.TYPE_TAG, 11, "type usage", false);
    public static final p EXPRESSION = new p("EXPRESSION", 12, "expression", false);
    public static final p FILE = new p("FILE", 13, "file", false);
    public static final p TYPEALIAS = new p("TYPEALIAS", 14, "typealias", false);
    public static final p TYPE_PROJECTION = new p("TYPE_PROJECTION", 15, "type projection", false);
    public static final p STAR_PROJECTION = new p("STAR_PROJECTION", 16, "star projection", false);
    public static final p PROPERTY_PARAMETER = new p("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final p CLASS_ONLY = new p("CLASS_ONLY", 18, "class", false);
    public static final p OBJECT = new p("OBJECT", 19, "object", false);
    public static final p STANDALONE_OBJECT = new p("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final p COMPANION_OBJECT = new p("COMPANION_OBJECT", 21, "companion object", false);
    public static final p INTERFACE = new p("INTERFACE", 22, "interface", false);
    public static final p ENUM_CLASS = new p("ENUM_CLASS", 23, "enum class", false);
    public static final p ENUM_ENTRY = new p("ENUM_ENTRY", 24, "enum entry", false);
    public static final p LOCAL_CLASS = new p("LOCAL_CLASS", 25, "local class", false);
    public static final p LOCAL_FUNCTION = new p("LOCAL_FUNCTION", 26, "local function", false);
    public static final p MEMBER_FUNCTION = new p("MEMBER_FUNCTION", 27, "member function", false);
    public static final p TOP_LEVEL_FUNCTION = new p("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    public static final p MEMBER_PROPERTY = new p("MEMBER_PROPERTY", 29, "member property", false);
    public static final p MEMBER_PROPERTY_WITH_BACKING_FIELD = new p("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    public static final p MEMBER_PROPERTY_WITH_DELEGATE = new p("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    public static final p MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new p("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    public static final p TOP_LEVEL_PROPERTY = new p("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    public static final p TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new p("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    public static final p TOP_LEVEL_PROPERTY_WITH_DELEGATE = new p("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    public static final p TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new p("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    public static final p INITIALIZER = new p("INITIALIZER", 38, "initializer", false);
    public static final p DESTRUCTURING_DECLARATION = new p("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    public static final p LAMBDA_EXPRESSION = new p("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    public static final p ANONYMOUS_FUNCTION = new p("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    public static final p OBJECT_LITERAL = new p("OBJECT_LITERAL", 42, "object literal", false);

    private static final /* synthetic */ p[] $values() {
        return new p[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    static {
        boolean z13 = false;
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PROPERTY = new p("PROPERTY", 3, "property", z13, i13, defaultConstructorMarker);
        boolean z14 = false;
        int i14 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        FIELD = new p("FIELD", 4, "field", z14, i14, defaultConstructorMarker2);
        LOCAL_VARIABLE = new p("LOCAL_VARIABLE", 5, "local variable", z13, i13, defaultConstructorMarker);
        VALUE_PARAMETER = new p("VALUE_PARAMETER", 6, "value parameter", z14, i14, defaultConstructorMarker2);
        CONSTRUCTOR = new p("CONSTRUCTOR", 7, "constructor", z13, i13, defaultConstructorMarker);
        FUNCTION = new p("FUNCTION", 8, "function", z14, i14, defaultConstructorMarker2);
        PROPERTY_GETTER = new p("PROPERTY_GETTER", 9, "getter", z13, i13, defaultConstructorMarker);
        PROPERTY_SETTER = new p("PROPERTY_SETTER", 10, "setter", z14, i14, defaultConstructorMarker2);
        BACKING_FIELD = new p("BACKING_FIELD", 37, "backing field", z13, i13, defaultConstructorMarker);
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new o();
        map = new HashMap<>();
        for (p pVar : values()) {
            map.put(pVar.name(), pVar);
        }
        p[] values = values();
        ArrayList arrayList = new ArrayList();
        for (p pVar2 : values) {
            if (pVar2.isDefault) {
                arrayList.add(pVar2);
            }
        }
        DEFAULT_TARGET_SET = CollectionsKt.J0(arrayList);
        ALL_TARGET_SET = c0.f0(values());
        p pVar3 = ANNOTATION_CLASS;
        p pVar4 = CLASS;
        ANNOTATION_CLASS_LIST = f0.j(pVar3, pVar4);
        LOCAL_CLASS_LIST = f0.j(LOCAL_CLASS, pVar4);
        CLASS_LIST = f0.j(CLASS_ONLY, pVar4);
        p pVar5 = COMPANION_OBJECT;
        p pVar6 = OBJECT;
        COMPANION_OBJECT_LIST = f0.j(pVar5, pVar6, pVar4);
        OBJECT_LIST = f0.j(STANDALONE_OBJECT, pVar6, pVar4);
        INTERFACE_LIST = f0.j(INTERFACE, pVar4);
        ENUM_LIST = f0.j(ENUM_CLASS, pVar4);
        p pVar7 = ENUM_ENTRY;
        p pVar8 = PROPERTY;
        p pVar9 = FIELD;
        ENUM_ENTRY_LIST = f0.j(pVar7, pVar8, pVar9);
        p pVar10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = e0.b(pVar10);
        p pVar11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = e0.b(pVar11);
        FUNCTION_LIST = e0.b(FUNCTION);
        p pVar12 = FILE;
        FILE_LIST = e0.b(pVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        p pVar13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = z0.g(new Pair(eVar, pVar13), new Pair(e.FIELD, pVar9), new Pair(e.PROPERTY, pVar8), new Pair(e.FILE, pVar12), new Pair(e.PROPERTY_GETTER, pVar11), new Pair(e.PROPERTY_SETTER, pVar10), new Pair(e.RECEIVER, pVar13), new Pair(e.SETTER_PARAMETER, pVar13), new Pair(e.PROPERTY_DELEGATE_FIELD, pVar9));
    }

    public /* synthetic */ p(String str, int i13, String str2, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, (i14 & 2) != 0 ? true : z13);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    private p(String str, int i13, String str2, boolean z13) {
        this.description = str2;
        this.isDefault = z13;
    }
}
