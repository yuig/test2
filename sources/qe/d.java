package qe;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f103616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f103617b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f103618c;

    /* renamed from: d, reason: collision with root package name */
    public final String f103619d;

    public d(JSONObject component) {
        int length;
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f103616a = string;
        String optString = component.optString("value");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f103617b = optString;
        String optString2 = component.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f103619d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i13);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new f(jSONObject));
                if (i14 >= length) {
                    break;
                } else {
                    i13 = i14;
                }
            }
        }
        this.f103618c = arrayList;
    }
}
