package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class wr1 {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f13193a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f13194b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f13195c = Resources.getSystem().getDisplayMetrics().density;

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!(optJSONArray == null && optJSONArray2 == null) && (optJSONArray == null || optJSONArray2 == null || optJSONArray.length() != optJSONArray2.length())) {
            return false;
        }
        for (int i13 = 0; i13 < optJSONArray.length(); i13++) {
            if (!c(optJSONArray.optJSONObject(i13), optJSONArray2.optJSONObject(i13))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f13194b;
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
                if (b(jSONObject, jSONObject2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e13) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + "]", e13);
        }
    }

    public static void a(JSONObject jSONObject) {
        float f13;
        float f14;
        if (f13193a != null) {
            Point point = new Point(0, 0);
            f13193a.getDefaultDisplay().getRealSize(point);
            float f15 = point.x;
            float f16 = f13195c;
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

    public static JSONObject a(int i13, int i14, int i15, int i16) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i13 / f13195c);
            jSONObject.put("y", i14 / f13195c);
            jSONObject.put("width", i15 / f13195c);
            jSONObject.put("height", i16 / f13195c);
        } catch (JSONException e13) {
            Log.e("OMIDLIB", "Error with creating viewStateObject", e13);
        }
        return jSONObject;
    }
}
