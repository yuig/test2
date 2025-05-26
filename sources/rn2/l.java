package rn2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE;
    public static final l CANNOT_COMPUTE_ERASED_BOUND;
    public static final l CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
    public static final l CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME;
    public static final l CYCLIC_SUPERTYPES;
    public static final l CYCLIC_UPPER_BOUNDS;
    public static final l DONT_CARE;
    public static final l EMPTY_CALLABLE_REFERENCE;
    public static final l ERROR_CLASS;
    public static final l ERROR_CONSTANT_VALUE;
    public static final l ERROR_DATA_FLOW_TYPE;
    public static final l ERROR_ENUM_TYPE;
    public static final l ERROR_EXPECTED_TYPE;
    public static final l ERROR_EXPRESSION_TYPE;
    public static final l ERROR_FLEXIBLE_TYPE;
    public static final l ERROR_PROPERTY_TYPE;
    public static final l ERROR_RAW_TYPE;
    public static final l ERROR_RECEIVER_TYPE;
    public static final l ERROR_SUPER_TYPE;
    public static final l ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT;
    public static final l ERROR_TYPE_PARAMETER;
    public static final l ERROR_TYPE_PROJECTION;
    public static final l ERROR_WHILE_RECONSTRUCTING_BARE_TYPE;
    public static final l FUNCTION_PLACEHOLDER_TYPE;
    public static final l ILLEGAL_TYPE_RANGE_FOR_DYNAMIC;
    public static final l IMPLICIT_RETURN_TYPE_FOR_FUNCTION;
    public static final l IMPLICIT_RETURN_TYPE_FOR_PROPERTY;
    public static final l IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR;
    public static final l INCONSISTENT_SUSPEND_FUNCTION;
    public static final l INTERSECTION_OF_ERROR_TYPES;
    public static final l KAPT_ERROR_TYPE;
    public static final l MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
    public static final l MISSED_TYPE_FOR_PARAMETER;
    public static final l NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT;
    public static final l NOT_FOUND_DESCRIPTOR_FOR_CLASS;
    public static final l NOT_FOUND_DESCRIPTOR_FOR_FUNCTION;
    public static final l NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER;
    public static final l NOT_FOUND_FQNAME;
    public static final l NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION;
    public static final l NOT_FOUND_UNSIGNED_TYPE;
    public static final l NO_RECORDED_TYPE;
    public static final l NO_TYPE_FOR_LOOP_PARAMETER;
    public static final l NO_TYPE_FOR_LOOP_RANGE;
    public static final l NO_TYPE_SPECIFIED;
    public static final l PARSE_ERROR_ARGUMENT;
    public static final l PROHIBITED_DYNAMIC_TYPE;
    public static final l RECURSIVE_ANNOTATION_TYPE;
    public static final l RECURSIVE_TYPE;
    public static final l RECURSIVE_TYPE_ALIAS;
    public static final l RESOLUTION_ERROR_TYPE;
    public static final l RETURN_NOT_ALLOWED;
    public static final l RETURN_TYPE;
    public static final l RETURN_TYPE_FOR_CONSTRUCTOR;
    public static final l RETURN_TYPE_FOR_FUNCTION;
    public static final l RETURN_TYPE_FOR_PROPERTY;
    public static final l STAR_PROJECTION_IN_CALL;
    public static final l STUB_TYPE;
    public static final l SUPER_TYPE_FOR_ERROR_TYPE;
    public static final l SYNTHETIC_ELEMENT_ERROR_TYPE;
    public static final l TYPE_FOR_COMPILER_EXCEPTION;
    public static final l TYPE_FOR_DELEGATION;
    public static final l TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
    public static final l TYPE_FOR_GENERATED_ERROR_EXPRESSION;
    public static final l TYPE_FOR_RESULT;
    public static final l TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS;
    public static final l UNABLE_TO_SUBSTITUTE_TYPE;
    public static final l UNAVAILABLE_TYPE_FOR_DECLARATION;
    public static final l UNEXPECTED_FLEXIBLE_TYPE_ID;
    public static final l UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE;
    public static final l UNINFERRED_LAMBDA_PARAMETER_TYPE;
    public static final l UNINFERRED_TYPE_VARIABLE;
    public static final l UNIT_RETURN_TYPE_FOR_INC_DEC;
    public static final l UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT;
    public static final l UNKNOWN_TYPE;
    public static final l UNMAPPED_ANNOTATION_TARGET_TYPE;
    public static final l UNRESOLVED_TYPE_ALIAS;
    public static final l UNSUPPORTED_CALLABLE_REFERENCE_TYPE;

    @NotNull
    private final String debugMessage;
    private final boolean isUnresolved;
    public static final l UNRESOLVED_TYPE = new l("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
    public static final l UNRESOLVED_TYPE_PARAMETER_TYPE = new l("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
    public static final l UNRESOLVED_CLASS_TYPE = new l("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
    public static final l UNRESOLVED_JAVA_CLASS = new l("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
    public static final l UNRESOLVED_DECLARATION = new l("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
    public static final l UNRESOLVED_KCLASS_CONSTANT_VALUE = new l("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
    public static final l UNRESOLVED_PARCEL_TYPE = new l("UNRESOLVED_PARCEL_TYPE", 53, "Unresolved 'Parcel' type", true);

    private static final /* synthetic */ l[] $values() {
        return new l[]{UNRESOLVED_TYPE, UNRESOLVED_TYPE_PARAMETER_TYPE, UNRESOLVED_CLASS_TYPE, UNRESOLVED_JAVA_CLASS, UNRESOLVED_DECLARATION, UNRESOLVED_KCLASS_CONSTANT_VALUE, UNRESOLVED_TYPE_ALIAS, RETURN_TYPE, RETURN_TYPE_FOR_FUNCTION, RETURN_TYPE_FOR_PROPERTY, RETURN_TYPE_FOR_CONSTRUCTOR, IMPLICIT_RETURN_TYPE_FOR_FUNCTION, IMPLICIT_RETURN_TYPE_FOR_PROPERTY, IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, RECURSIVE_TYPE, RECURSIVE_TYPE_ALIAS, RECURSIVE_ANNOTATION_TYPE, CYCLIC_UPPER_BOUNDS, CYCLIC_SUPERTYPES, UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, UNINFERRED_LAMBDA_PARAMETER_TYPE, UNINFERRED_TYPE_VARIABLE, RESOLUTION_ERROR_TYPE, ERROR_EXPECTED_TYPE, ERROR_DATA_FLOW_TYPE, ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, UNABLE_TO_SUBSTITUTE_TYPE, DONT_CARE, STUB_TYPE, FUNCTION_PLACEHOLDER_TYPE, TYPE_FOR_RESULT, TYPE_FOR_COMPILER_EXCEPTION, ERROR_FLEXIBLE_TYPE, ERROR_RAW_TYPE, TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, INCONSISTENT_SUSPEND_FUNCTION, UNEXPECTED_FLEXIBLE_TYPE_ID, UNKNOWN_TYPE, NO_TYPE_SPECIFIED, NO_TYPE_FOR_LOOP_RANGE, NO_TYPE_FOR_LOOP_PARAMETER, MISSED_TYPE_FOR_PARAMETER, MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, PARSE_ERROR_ARGUMENT, STAR_PROJECTION_IN_CALL, PROHIBITED_DYNAMIC_TYPE, NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, UNIT_RETURN_TYPE_FOR_INC_DEC, RETURN_NOT_ALLOWED, UNRESOLVED_PARCEL_TYPE, KAPT_ERROR_TYPE, SYNTHETIC_ELEMENT_ERROR_TYPE, AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ERROR_EXPRESSION_TYPE, ERROR_RECEIVER_TYPE, ERROR_CONSTANT_VALUE, EMPTY_CALLABLE_REFERENCE, UNSUPPORTED_CALLABLE_REFERENCE_TYPE, TYPE_FOR_DELEGATION, UNAVAILABLE_TYPE_FOR_DECLARATION, ERROR_TYPE_PARAMETER, ERROR_TYPE_PROJECTION, ERROR_SUPER_TYPE, SUPER_TYPE_FOR_ERROR_TYPE, ERROR_PROPERTY_TYPE, ERROR_CLASS, TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, INTERSECTION_OF_ERROR_TYPES, CANNOT_COMPUTE_ERASED_BOUND, NOT_FOUND_UNSIGNED_TYPE, ERROR_ENUM_TYPE, NO_RECORDED_TYPE, NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, NOT_FOUND_DESCRIPTOR_FOR_CLASS, NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, UNMAPPED_ANNOTATION_TARGET_TYPE, UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, NOT_FOUND_FQNAME, TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    static {
        boolean z13 = false;
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        UNRESOLVED_TYPE_ALIAS = new l("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", z13, i13, defaultConstructorMarker);
        boolean z14 = false;
        int i14 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        RETURN_TYPE = new l("RETURN_TYPE", 7, "Return type for %s cannot be resolved", z14, i14, defaultConstructorMarker2);
        RETURN_TYPE_FOR_FUNCTION = new l("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", z13, i13, defaultConstructorMarker);
        RETURN_TYPE_FOR_PROPERTY = new l("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", z14, i14, defaultConstructorMarker2);
        RETURN_TYPE_FOR_CONSTRUCTOR = new l("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", z13, i13, defaultConstructorMarker);
        IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new l("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", z14, i14, defaultConstructorMarker2);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new l("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", z13, i13, defaultConstructorMarker);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new l("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", z14, i14, defaultConstructorMarker2);
        ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new l("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", z13, i13, defaultConstructorMarker);
        RECURSIVE_TYPE = new l("RECURSIVE_TYPE", 15, "Recursive type", z14, i14, defaultConstructorMarker2);
        RECURSIVE_TYPE_ALIAS = new l("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", z13, i13, defaultConstructorMarker);
        RECURSIVE_ANNOTATION_TYPE = new l("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", z14, i14, defaultConstructorMarker2);
        CYCLIC_UPPER_BOUNDS = new l("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", z13, i13, defaultConstructorMarker);
        CYCLIC_SUPERTYPES = new l("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", z14, i14, defaultConstructorMarker2);
        UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new l("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", z13, i13, defaultConstructorMarker);
        UNINFERRED_LAMBDA_PARAMETER_TYPE = new l("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", z14, i14, defaultConstructorMarker2);
        UNINFERRED_TYPE_VARIABLE = new l("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", z13, i13, defaultConstructorMarker);
        RESOLUTION_ERROR_TYPE = new l("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", z14, i14, defaultConstructorMarker2);
        ERROR_EXPECTED_TYPE = new l("ERROR_EXPECTED_TYPE", 24, "Error expected type", z13, i13, defaultConstructorMarker);
        ERROR_DATA_FLOW_TYPE = new l("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", z14, i14, defaultConstructorMarker2);
        ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new l("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", z13, i13, defaultConstructorMarker);
        UNABLE_TO_SUBSTITUTE_TYPE = new l("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", z14, i14, defaultConstructorMarker2);
        DONT_CARE = new l("DONT_CARE", 28, "Special DONT_CARE type", z13, i13, defaultConstructorMarker);
        STUB_TYPE = new l("STUB_TYPE", 29, "Stub type %s", z14, i14, defaultConstructorMarker2);
        FUNCTION_PLACEHOLDER_TYPE = new l("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", z13, i13, defaultConstructorMarker);
        TYPE_FOR_RESULT = new l("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", z14, i14, defaultConstructorMarker2);
        TYPE_FOR_COMPILER_EXCEPTION = new l("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", z13, i13, defaultConstructorMarker);
        ERROR_FLEXIBLE_TYPE = new l("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", z14, i14, defaultConstructorMarker2);
        ERROR_RAW_TYPE = new l("ERROR_RAW_TYPE", 34, "Error raw type %s", z13, i13, defaultConstructorMarker);
        TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new l("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", z14, i14, defaultConstructorMarker2);
        ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new l("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", z13, i13, defaultConstructorMarker);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new l("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", z14, i14, defaultConstructorMarker2);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new l("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", z13, i13, defaultConstructorMarker);
        INCONSISTENT_SUSPEND_FUNCTION = new l("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", z14, i14, defaultConstructorMarker2);
        UNEXPECTED_FLEXIBLE_TYPE_ID = new l("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", z13, i13, defaultConstructorMarker);
        UNKNOWN_TYPE = new l("UNKNOWN_TYPE", 41, "Unknown type", z14, i14, defaultConstructorMarker2);
        NO_TYPE_SPECIFIED = new l("NO_TYPE_SPECIFIED", 42, "No type specified for %s", z13, i13, defaultConstructorMarker);
        NO_TYPE_FOR_LOOP_RANGE = new l("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", z14, i14, defaultConstructorMarker2);
        NO_TYPE_FOR_LOOP_PARAMETER = new l("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", z13, i13, defaultConstructorMarker);
        MISSED_TYPE_FOR_PARAMETER = new l("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", z14, i14, defaultConstructorMarker2);
        MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new l("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", z13, i13, defaultConstructorMarker);
        PARSE_ERROR_ARGUMENT = new l("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", z14, i14, defaultConstructorMarker2);
        STAR_PROJECTION_IN_CALL = new l("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", z13, i13, defaultConstructorMarker);
        PROHIBITED_DYNAMIC_TYPE = new l("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", z14, i14, defaultConstructorMarker2);
        NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new l("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", z13, i13, defaultConstructorMarker);
        UNIT_RETURN_TYPE_FOR_INC_DEC = new l("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", z14, i14, defaultConstructorMarker2);
        RETURN_NOT_ALLOWED = new l("RETURN_NOT_ALLOWED", 52, "Return not allowed", z13, i13, defaultConstructorMarker);
        KAPT_ERROR_TYPE = new l("KAPT_ERROR_TYPE", 54, "Kapt error type", z13, i13, defaultConstructorMarker);
        SYNTHETIC_ELEMENT_ERROR_TYPE = new l("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", z14, i14, defaultConstructorMarker2);
        boolean z15 = false;
        int i15 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new l("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", z15, i15, defaultConstructorMarker3);
        boolean z16 = false;
        int i16 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        ERROR_EXPRESSION_TYPE = new l("ERROR_EXPRESSION_TYPE", 57, "Error expression type", z16, i16, defaultConstructorMarker4);
        ERROR_RECEIVER_TYPE = new l("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", z15, i15, defaultConstructorMarker3);
        ERROR_CONSTANT_VALUE = new l("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", z16, i16, defaultConstructorMarker4);
        EMPTY_CALLABLE_REFERENCE = new l("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", z15, i15, defaultConstructorMarker3);
        UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new l("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", z16, i16, defaultConstructorMarker4);
        TYPE_FOR_DELEGATION = new l("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", z15, i15, defaultConstructorMarker3);
        UNAVAILABLE_TYPE_FOR_DECLARATION = new l("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", z16, i16, defaultConstructorMarker4);
        ERROR_TYPE_PARAMETER = new l("ERROR_TYPE_PARAMETER", 64, "Error type parameter", z15, i15, defaultConstructorMarker3);
        ERROR_TYPE_PROJECTION = new l("ERROR_TYPE_PROJECTION", 65, "Error type projection", z16, i16, defaultConstructorMarker4);
        ERROR_SUPER_TYPE = new l("ERROR_SUPER_TYPE", 66, "Error super type", z15, i15, defaultConstructorMarker3);
        SUPER_TYPE_FOR_ERROR_TYPE = new l("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", z16, i16, defaultConstructorMarker4);
        ERROR_PROPERTY_TYPE = new l("ERROR_PROPERTY_TYPE", 68, "Error property type", z15, i15, defaultConstructorMarker3);
        ERROR_CLASS = new l("ERROR_CLASS", 69, "Error class", z16, i16, defaultConstructorMarker4);
        TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new l("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", z15, i15, defaultConstructorMarker3);
        INTERSECTION_OF_ERROR_TYPES = new l("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", z16, i16, defaultConstructorMarker4);
        CANNOT_COMPUTE_ERASED_BOUND = new l("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", z15, i15, defaultConstructorMarker3);
        NOT_FOUND_UNSIGNED_TYPE = new l("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", z16, i16, defaultConstructorMarker4);
        ERROR_ENUM_TYPE = new l("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", z15, i15, defaultConstructorMarker3);
        NO_RECORDED_TYPE = new l("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", z16, i16, defaultConstructorMarker4);
        NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new l("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", z15, i15, defaultConstructorMarker3);
        NOT_FOUND_DESCRIPTOR_FOR_CLASS = new l("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", z16, i16, defaultConstructorMarker4);
        NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new l("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", z15, i15, defaultConstructorMarker3);
        UNMAPPED_ANNOTATION_TARGET_TYPE = new l("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", z16, i16, defaultConstructorMarker4);
        UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new l("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", z15, i15, defaultConstructorMarker3);
        NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new l("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", z16, i16, defaultConstructorMarker4);
        NOT_FOUND_FQNAME = new l("NOT_FOUND_FQNAME", 82, "No fqName for %s", z15, i15, defaultConstructorMarker3);
        TYPE_FOR_GENERATED_ERROR_EXPRESSION = new l("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", z16, i16, defaultConstructorMarker4);
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ l(String str, int i13, String str2, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, (i14 & 2) != 0 ? false : z13);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final boolean isUnresolved() {
        return this.isUnresolved;
    }

    private l(String str, int i13, String str2, boolean z13) {
        this.debugMessage = str2;
        this.isUnresolved = z13;
    }
}
