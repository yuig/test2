package xl2;

import am2.d0;
import am2.j0;
import am2.r0;
import am2.t0;
import am2.x;
import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dm2.i0;
import dm2.k0;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.b0;
import pn2.b1;
import pn2.g1;
import pn2.h0;
import pn2.i1;
import pn2.t1;
import pn2.v1;
import pn2.w1;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: e */
    public static final ym2.g f135279e = ym2.g.g("<built-ins module>");

    /* renamed from: a */
    public i0 f135280a;

    /* renamed from: b */
    public final on2.l f135281b;

    /* renamed from: c */
    public final on2.n f135282c;

    /* renamed from: d */
    public final on2.u f135283d;

    public l(on2.q qVar) {
        this.f135283d = qVar;
        int i13 = 0;
        qVar.c(new h(this, i13));
        this.f135281b = new on2.l(qVar, new h(this, 1));
        this.f135282c = qVar.d(new i(this, i13));
    }

    public static boolean A(nn2.j jVar) {
        if (jVar != null) {
            return b(jVar, q.f135301g) || s(jVar) != null;
        }
        a(90);
        throw null;
    }

    public static boolean B(am2.m mVar) {
        if (mVar != null) {
            return bn2.e.k(mVar, d.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean C(b0 b0Var, ym2.e eVar) {
        if (b0Var == null) {
            a(98);
            throw null;
        }
        if (eVar != null) {
            return J(b0Var.w0(), eVar);
        }
        a(99);
        throw null;
    }

    public static boolean D(b0 b0Var, ym2.e eVar) {
        if (eVar != null) {
            return C(b0Var, eVar) && !b0Var.x0();
        }
        a(RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL);
        throw null;
    }

    public static boolean E(x xVar) {
        if (xVar.o0().getAnnotations().Q(q.f135307m)) {
            return true;
        }
        if (!(xVar instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) xVar;
        boolean C = r0Var.C();
        dm2.r0 getter = r0Var.getGetter();
        t0 setter = r0Var.getSetter();
        if (getter != null && E(getter)) {
            if (!C) {
                return true;
            }
            if (setter != null && E(setter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(b0 b0Var, ym2.e eVar) {
        if (b0Var == null) {
            a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
            throw null;
        }
        if (eVar != null) {
            return !b0Var.x0() && C(b0Var, eVar);
        }
        a(RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
        throw null;
    }

    public static boolean G(b0 b0Var) {
        if (b0Var == null) {
            a(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE);
            throw null;
        }
        if (b0Var != null) {
            return C(b0Var, q.f135294b) && !t1.g(b0Var);
        }
        a(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM);
        throw null;
    }

    public static boolean H(b0 b0Var) {
        if (b0Var == null) {
            a(95);
            throw null;
        }
        if (!b0Var.x0()) {
            am2.j b13 = b0Var.w0().b();
            if (b13 instanceof am2.g) {
                am2.g gVar = (am2.g) b13;
                if (gVar == null) {
                    a(97);
                    throw null;
                }
                if (u(gVar) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean I(b0 b0Var) {
        return b0Var != null && F(b0Var, q.f135300f);
    }

    public static boolean J(b1 b1Var, ym2.e eVar) {
        if (b1Var == null) {
            a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
            throw null;
        }
        if (eVar != null) {
            am2.j b13 = b1Var.b();
            return (b13 instanceof am2.g) && b(b13, eVar);
        }
        a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
        throw null;
    }

    public static boolean K(am2.m mVar) {
        if (mVar == null) {
            a(10);
            throw null;
        }
        while (mVar != null) {
            if (mVar instanceof am2.i0) {
                return ((k0) ((am2.i0) mVar)).f55454e.h(r.f135331k);
            }
            mVar = mVar.g();
        }
        return false;
    }

    public static /* synthetic */ void a(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i14 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
            case 160:
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                objArr[0] = "descriptor";
                break;
            case 12:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
            case 100:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                objArr[0] = "typeConstructor";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                objArr[0] = "classDescriptor";
                break;
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i13) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i13) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
            case 100:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                objArr[2] = "classFqNameEquals";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                objArr[2] = "isAny";
                break;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                objArr[2] = "isBoolean";
                break;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                objArr[2] = "isNumber";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                objArr[2] = "isChar";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                objArr[2] = "isCharOrNullableChar";
                break;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                objArr[2] = "isInt";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                objArr[2] = "isByte";
                break;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                objArr[2] = "isLong";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                objArr[2] = "isLongOrNullableLong";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                objArr[2] = "isShort";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                objArr[2] = "isFloat";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                objArr[2] = "isDouble";
                break;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                objArr[2] = "isUByte";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                objArr[2] = "isUShort";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                objArr[2] = "isUInt";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                objArr[2] = "isULong";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                objArr[2] = "isUByteArray";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                objArr[2] = "isUShortArray";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                objArr[2] = "isUIntArray";
                break;
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                objArr[2] = "isULongArray";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                objArr[2] = "isUnsignedArrayType";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                objArr[2] = "isNothing";
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                objArr[2] = "isNullableNothing";
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                objArr[2] = "isNullableAny";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                objArr[2] = "isDefaultBound";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                objArr[2] = "isUnit";
                break;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                objArr[2] = "isMemberOfAny";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                objArr[2] = "isEnum";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                objArr[2] = "isComparable";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                objArr[2] = "isListOrNullableList";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                objArr[2] = "isSetOrNullableSet";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                objArr[2] = "isMapOrNullableMap";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                objArr[2] = "isThrowable";
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                objArr[2] = "isCloneable";
                break;
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                objArr[2] = "isDeprecated";
                break;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(am2.j jVar, ym2.e eVar) {
        if (jVar == null) {
            a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
            throw null;
        }
        if (eVar != null) {
            return jVar.getName().equals(eVar.f()) && eVar.equals(bn2.e.h(jVar));
        }
        a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
        throw null;
    }

    public static h0 n(v1 v1Var, d0 d0Var) {
        ym2.b f13;
        ym2.b a13;
        am2.g c03;
        am2.j b13 = v1Var.w0().b();
        if (b13 == null) {
            return null;
        }
        Set set = v.f135339a;
        if (!v.b(b13.getName()) || (f13 = fn2.d.f(b13)) == null || (a13 = v.a(f13)) == null || (c03 = l0.c0(d0Var, a13)) == null) {
            return null;
        }
        return c03.j();
    }

    public static o s(am2.j jVar) {
        if (jVar == null) {
            a(78);
            throw null;
        }
        if (q.f135293a0.contains(jVar.getName())) {
            return (o) q.f135297c0.get(bn2.e.h(jVar));
        }
        return null;
    }

    public static o u(am2.m mVar) {
        if (mVar == null) {
            a(77);
            throw null;
        }
        if (q.Z.contains(mVar.getName())) {
            return (o) q.f135295b0.get(bn2.e.h(mVar));
        }
        return null;
    }

    public static boolean y(b0 b0Var) {
        if (b0Var != null) {
            return C(b0Var, q.f135292a);
        }
        a(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM);
        throw null;
    }

    public static boolean z(b0 b0Var) {
        if (b0Var != null) {
            return C(b0Var, q.f135301g);
        }
        a(89);
        throw null;
    }

    public final void c(boolean z13) {
        ym2.g moduleName = f135279e;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        on2.u storageManager = this.f135283d;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "builtIns");
        i0 i0Var = new i0(moduleName, storageManager, this, 48);
        this.f135280a = i0Var;
        c.f135264a.getClass();
        c cVar = (c) b.f135263b.getValue();
        j0 providerForModuleContent = ((mn2.c) cVar).a(this.f135283d, this.f135280a, l(), q(), d(), z13);
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        i0Var.f55436h = providerForModuleContent;
        i0 i0Var2 = this.f135280a;
        i0Var2.o0(i0Var2);
    }

    public cm2.b d() {
        return cm2.a.f28031a;
    }

    public final h0 e() {
        h0 j13 = j("Any").j();
        if (j13 != null) {
            return j13;
        }
        a(51);
        throw null;
    }

    public final b0 f(b0 b0Var) {
        h0 n13;
        if (b0Var == null) {
            a(68);
            throw null;
        }
        if (z(b0Var)) {
            if (b0Var.u0().size() != 1) {
                throw new IllegalStateException();
            }
            b0 type = ((g1) b0Var.u0().get(0)).getType();
            if (type != null) {
                return type;
            }
            a(69);
            throw null;
        }
        v1 i13 = t1.i(b0Var);
        b0 b0Var2 = (b0) ((k) this.f135281b.invoke()).f135278c.get(i13);
        if (b0Var2 != null) {
            return b0Var2;
        }
        d0 f13 = bn2.e.f(i13);
        if (f13 != null && (n13 = n(i13, f13)) != null) {
            return n13;
        }
        throw new IllegalStateException("not array: " + b0Var);
    }

    public final h0 g(v1 v1Var, w1 w1Var) {
        if (w1Var == null) {
            a(83);
            throw null;
        }
        if (v1Var != null) {
            return h(w1Var, v1Var, bm2.h.f23540a);
        }
        a(84);
        throw null;
    }

    public final h0 h(w1 w1Var, b0 b0Var, bm2.i iVar) {
        if (w1Var == null) {
            a(79);
            throw null;
        }
        if (b0Var == null) {
            a(80);
            throw null;
        }
        h0 p13 = pn2.g.p(bs1.c.n2(iVar), j("Array"), Collections.singletonList(new i1(b0Var, w1Var)));
        if (p13 != null) {
            return p13;
        }
        a(82);
        throw null;
    }

    public final am2.g i(ym2.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        am2.g g03 = m0.g0(k(), cVar, hm2.e.FROM_BUILTINS);
        if (g03 != null) {
            return g03;
        }
        a(13);
        throw null;
    }

    public final am2.g j(String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        am2.g gVar = (am2.g) this.f135282c.invoke(ym2.g.e(str));
        if (gVar != null) {
            return gVar;
        }
        a(15);
        throw null;
    }

    public final i0 k() {
        this.f135280a.getClass();
        i0 i0Var = this.f135280a;
        if (i0Var != null) {
            return i0Var;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List singletonList = Collections.singletonList(new yl2.a(this.f135283d, k()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final h0 m() {
        h0 p13 = p();
        if (p13 != null) {
            return p13;
        }
        a(53);
        throw null;
    }

    public final h0 o() {
        h0 j13 = j("Nothing").j();
        if (j13 != null) {
            return j13;
        }
        a(49);
        throw null;
    }

    public final h0 p() {
        h0 A0 = e().A0(true);
        if (A0 != null) {
            return A0;
        }
        a(52);
        throw null;
    }

    public cm2.e q() {
        return cm2.d.f28033a;
    }

    public final h0 r(o oVar) {
        if (oVar == null) {
            a(74);
            throw null;
        }
        h0 h0Var = (h0) ((k) this.f135281b.invoke()).f135276a.get(oVar);
        if (h0Var != null) {
            return h0Var;
        }
        a(75);
        throw null;
    }

    public final h0 t(o oVar) {
        if (oVar == null) {
            a(54);
            throw null;
        }
        if (oVar == null) {
            a(16);
            throw null;
        }
        h0 j13 = j(oVar.getTypeName().b()).j();
        if (j13 != null) {
            return j13;
        }
        a(55);
        throw null;
    }

    public final h0 v() {
        h0 j13 = j("String").j();
        if (j13 != null) {
            return j13;
        }
        a(66);
        throw null;
    }

    public final am2.g w(int i13) {
        return i(r.f135326f.c(ym2.g.e(yl2.k.f139375c.f139377b + i13)));
    }

    public final h0 x() {
        h0 j13 = j("Unit").j();
        if (j13 != null) {
            return j13;
        }
        a(65);
        throw null;
    }
}
