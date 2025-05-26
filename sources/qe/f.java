package qe;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f103620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103622c;

    /* renamed from: d, reason: collision with root package name */
    public final String f103623d;

    /* renamed from: e, reason: collision with root package name */
    public final String f103624e;

    /* renamed from: f, reason: collision with root package name */
    public final String f103625f;

    /* renamed from: g, reason: collision with root package name */
    public final String f103626g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103627h;

    public f(JSONObject component) {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f103620a = string;
        this.f103621b = component.optInt("index", -1);
        this.f103622c = component.optInt("id");
        String optString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.f103623d = optString;
        String optString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.f103624e = optString2;
        String optString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f103625f = optString3;
        String optString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.f103626g = optString4;
        this.f103627h = component.optInt("match_bitmask");
    }
}
