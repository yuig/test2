package kn;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f80207a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f80208b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f80209c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i13, int i14, int i15, int i16) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i13 / f80209c);
            jSONObject.put("y", i14 / f80209c);
            jSONObject.put("width", i15 / f80209c);
            jSONObject.put("height", i16 / f80209c);
        } catch (JSONException e13) {
            el.a.k("Error with creating viewStateObject", e13);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e13) {
            el.a.k("JSONException during JSONObject.put for name [" + str + "]", e13);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e13) {
            e13.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) {
        float f13;
        float f14;
        if (f80207a != null) {
            Point point = new Point(0, 0);
            f80207a.getDefaultDisplay().getRealSize(point);
            float f15 = point.x;
            float f16 = f80209c;
            f13 = f15 / f16;
            f14 = point.y / f16;
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        try {
            jSONObject.put("width", f13);
            jSONObject.put("height", f14);
        } catch (JSONException e13) {
            e13.printStackTrace();
        }
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!((optJSONArray == null && optJSONArray2 == null) || !(optJSONArray == null || optJSONArray2 == null || optJSONArray.length() != optJSONArray2.length()))) {
            return false;
        }
        for (int i13 = 0; i13 < optJSONArray.length(); i13++) {
            if (!f(optJSONArray.optJSONObject(i13), optJSONArray2.optJSONObject(i13))) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f80208b;
        int i13 = 0;
        while (true) {
            if (i13 < 4) {
                String str = strArr[i13];
                if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                    break;
                }
                i13++;
            } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (optJSONArray != null || optJSONArray2 != null) {
                    if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                        for (int i14 = 0; i14 < optJSONArray.length(); i14++) {
                            if (!optJSONArray.optString(i14, "").equals(optJSONArray2.optString(i14, ""))) {
                                break;
                            }
                        }
                    }
                }
                if (e(jSONObject, jSONObject2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
