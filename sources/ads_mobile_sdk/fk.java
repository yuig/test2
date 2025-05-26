package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public enum fk implements a.w {
    NO_ERROR(0),
    ADAPTER_CREATION_FAILURE(1),
    SIGNAL_COLLECTION_FAILURE(2),
    SIGNAL_COLLECTION_TIMEOUT(3),
    UNKNOWN_ERROR(4),
    ADAPTER_PROTOCOL_CONFORMANCE_FAILURE(5),
    COLLECTOR_FUNCTION_TIMEDOUT(100),
    COLLECTOR_NOT_REGISTERED(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE),
    INVALID_COLLECTOR_ID(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE),
    UNKNOWN_COLLECTOR(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE),
    COLLECTOR_THROTTLED(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE),
    INVALID_COLLECTOR_FUNCTION(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE),
    COLLECTOR_FUNCTION_REJECTED(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID),
    COLLECTOR_FUNCTION_FAILED(RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER),
    SIGNAL_EXCEEDS_MAX_LENGTH(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE),
    COLLECTOR_SCRIPT_LOAD_FAILED(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL),
    UNDEFINED_PROVIDER(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL),
    INVALID_PROVIDER_TYPE(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER),
    SIGNAL_NULL_OR_UNDEFINED(RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE),
    SIGNAL_INVALID_TYPE(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL),
    URL_PARAM_SECURE_SIGNALS_PARSING_FAILED(200),
    URL_PARAM_SECURE_SIGNALS_JSON_PARSING_FAILED(201);


    /* renamed from: a, reason: collision with root package name */
    public final int f5188a;

    fk(int i13) {
        this.f5188a = i13;
    }

    public static fk a(int i13) {
        if (i13 == 200) {
            return URL_PARAM_SECURE_SIGNALS_PARSING_FAILED;
        }
        if (i13 == 201) {
            return URL_PARAM_SECURE_SIGNALS_JSON_PARSING_FAILED;
        }
        if (i13 == 0) {
            return NO_ERROR;
        }
        if (i13 == 1) {
            return ADAPTER_CREATION_FAILURE;
        }
        if (i13 == 2) {
            return SIGNAL_COLLECTION_FAILURE;
        }
        if (i13 == 3) {
            return SIGNAL_COLLECTION_TIMEOUT;
        }
        if (i13 == 4) {
            return UNKNOWN_ERROR;
        }
        if (i13 == 5) {
            return ADAPTER_PROTOCOL_CONFORMANCE_FAILURE;
        }
        switch (i13) {
            case 100:
                return COLLECTOR_FUNCTION_TIMEDOUT;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return COLLECTOR_NOT_REGISTERED;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return INVALID_COLLECTOR_ID;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return UNKNOWN_COLLECTOR;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return COLLECTOR_THROTTLED;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return INVALID_COLLECTOR_FUNCTION;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return COLLECTOR_FUNCTION_REJECTED;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return COLLECTOR_FUNCTION_FAILED;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return SIGNAL_EXCEEDS_MAX_LENGTH;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return COLLECTOR_SCRIPT_LOAD_FAILED;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return UNDEFINED_PROVIDER;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return SIGNAL_NULL_OR_UNDEFINED;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return INVALID_PROVIDER_TYPE;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return SIGNAL_INVALID_TYPE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + fk.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5188a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f5188a;
    }
}
