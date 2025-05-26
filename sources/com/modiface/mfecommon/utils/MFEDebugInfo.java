package com.modiface.mfecommon.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MFEDebugInfo {
    private static final String TAG = "MFEDebugInfo";
    public final String name;
    public ConcurrentSkipListMap<String, String> simpleDebugInfoMap = new ConcurrentSkipListMap<>();
    public ConcurrentSkipListMap<String, String> detailedDebugInfoMap = new ConcurrentSkipListMap<>();
    public ConcurrentSkipListMap<String, MFEDebugInfo> subDebugInfos = new ConcurrentSkipListMap<>();

    public MFEDebugInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("cannot have empty name for MFEDebugInfo");
        }
        this.name = str;
    }

    private static int getMinimumNumberOfDecimalPlaces(double d2) {
        double abs = Math.abs(d2);
        int i13 = 0;
        while (abs < 1.0d) {
            abs *= 10.0d;
            i13++;
            if (i13 > 5) {
                return 0;
            }
        }
        return i13;
    }

    private boolean hasSubDebugInfo(MFEDebugInfo mFEDebugInfo) {
        for (MFEDebugInfo mFEDebugInfo2 : this.subDebugInfos.values()) {
            if (mFEDebugInfo2 == mFEDebugInfo) {
                return true;
            }
            if (mFEDebugInfo2 != null && mFEDebugInfo2.hasSubDebugInfo(mFEDebugInfo)) {
                return true;
            }
        }
        return false;
    }

    public void addDetailedDebugInfo(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.detailedDebugInfoMap.put(str, str2);
    }

    public void addSimpleDebugInfo(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.simpleDebugInfoMap.put(str, str2);
        this.detailedDebugInfoMap.put(str, str2);
    }

    public void addSubDebugInfo(MFEDebugInfo mFEDebugInfo) {
        if (mFEDebugInfo == null || mFEDebugInfo == this || mFEDebugInfo.hasSubDebugInfo(this)) {
            return;
        }
        this.subDebugInfos.put(mFEDebugInfo.name, mFEDebugInfo);
    }

    public JSONObject getDetailedJson() {
        JSONObject jSONObject = new JSONObject();
        getDetailedJson(jSONObject);
        return jSONObject;
    }

    public String getDetailedStr() {
        return getDetailedStr(0);
    }

    public MFEDebugInfo getNewCopy() {
        return getNewCopy(this.name);
    }

    public JSONObject getSimpleJson() {
        JSONObject jSONObject = new JSONObject();
        getSimpleJson(jSONObject);
        return jSONObject;
    }

    public String getSimpleStr() {
        return getSimpleStr(0);
    }

    private String getDetailedStr(int i13) {
        MFEDebugInfo value;
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < i13; i14++) {
            sb3.append("    ");
        }
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(this.name);
        sb5.append(":");
        for (Map.Entry<String, String> entry : this.detailedDebugInfoMap.entrySet()) {
            if (entry != null) {
                sb5.append('\n');
                sb5.append(sb4);
                sb5.append("    ");
                sb5.append(entry.getKey());
                sb5.append(":  ");
                sb5.append(entry.getValue());
            }
        }
        for (Map.Entry<String, MFEDebugInfo> entry2 : this.subDebugInfos.entrySet()) {
            if (entry2 != null && (value = entry2.getValue()) != null) {
                sb5.append('\n');
                sb5.append(value.getDetailedStr(i13 + 1));
            }
        }
        return sb5.toString();
    }

    private static int getMinimumNumberOfDecimalPlaces(float f13) {
        float abs = Math.abs(f13);
        int i13 = 0;
        while (abs < 1.0f) {
            abs *= 10.0f;
            i13++;
            if (i13 > 5) {
                return 0;
            }
        }
        return i13;
    }

    private String getSimpleStr(int i13) {
        MFEDebugInfo value;
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < i13; i14++) {
            sb3.append("    ");
        }
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(this.name);
        sb5.append(":");
        for (Map.Entry<String, String> entry : this.simpleDebugInfoMap.entrySet()) {
            if (entry != null) {
                sb5.append('\n');
                sb5.append(sb4);
                sb5.append("    ");
                sb5.append(entry.getKey());
                sb5.append(":  ");
                sb5.append(entry.getValue());
            }
        }
        for (Map.Entry<String, MFEDebugInfo> entry2 : this.subDebugInfos.entrySet()) {
            if (entry2 != null && (value = entry2.getValue()) != null) {
                sb5.append('\n');
                sb5.append(value.getSimpleStr(i13 + 1));
            }
        }
        return sb5.toString();
    }

    public MFEDebugInfo getNewCopy(String str) {
        MFEDebugInfo mFEDebugInfo = new MFEDebugInfo(str);
        mFEDebugInfo.simpleDebugInfoMap.putAll(this.simpleDebugInfoMap);
        mFEDebugInfo.detailedDebugInfoMap.putAll(this.detailedDebugInfoMap);
        mFEDebugInfo.subDebugInfos.putAll(this.subDebugInfos);
        return mFEDebugInfo;
    }

    private void getDetailedJson(JSONObject jSONObject) {
        MFEDebugInfo value;
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.detailedDebugInfoMap.entrySet()) {
                if (entry != null) {
                    jSONObject2.putOpt(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry<String, MFEDebugInfo> entry2 : this.subDebugInfos.entrySet()) {
                if (entry2 != null && (value = entry2.getValue()) != null) {
                    value.getDetailedJson(jSONObject2);
                }
            }
            jSONObject.put(this.name, jSONObject2);
        } catch (JSONException e13) {
            Log.e(TAG, "error constructing json for detailed debug info with exception", e13);
        }
    }

    private void getSimpleJson(JSONObject jSONObject) {
        MFEDebugInfo value;
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.simpleDebugInfoMap.entrySet()) {
                if (entry != null) {
                    jSONObject2.putOpt(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry<String, MFEDebugInfo> entry2 : this.subDebugInfos.entrySet()) {
                if (entry2 != null && (value = entry2.getValue()) != null) {
                    value.getSimpleJson(jSONObject2);
                }
            }
            jSONObject.put(this.name, jSONObject2);
        } catch (JSONException e13) {
            Log.e(TAG, "error constructing json for detailed debug info with exception", e13);
        }
    }

    public void addDetailedDebugInfo(String str, boolean z13) {
        addDetailedDebugInfo(str, z13 ? "yes" : "no");
    }

    public void addDetailedDebugInfo(String str, double d2) {
        int minimumNumberOfDecimalPlaces = getMinimumNumberOfDecimalPlaces(d2) + 2;
        addDetailedDebugInfo(str, String.format(Locale.CANADA, "%." + minimumNumberOfDecimalPlaces + "f", Double.valueOf(d2)));
    }

    public void addSimpleDebugInfo(String str, boolean z13) {
        addSimpleDebugInfo(str, z13 ? "yes" : "no");
    }

    public void addSimpleDebugInfo(String str, double d2) {
        int minimumNumberOfDecimalPlaces = getMinimumNumberOfDecimalPlaces(d2) + 2;
        addSimpleDebugInfo(str, String.format(Locale.CANADA, "%." + minimumNumberOfDecimalPlaces + "f", Double.valueOf(d2)));
    }

    public void addDetailedDebugInfo(String str, float f13) {
        int minimumNumberOfDecimalPlaces = getMinimumNumberOfDecimalPlaces(f13) + 2;
        addDetailedDebugInfo(str, String.format(Locale.CANADA, "%." + minimumNumberOfDecimalPlaces + "f", Float.valueOf(f13)));
    }

    public void addSimpleDebugInfo(String str, float f13) {
        int minimumNumberOfDecimalPlaces = getMinimumNumberOfDecimalPlaces(f13) + 2;
        addSimpleDebugInfo(str, String.format(Locale.CANADA, "%." + minimumNumberOfDecimalPlaces + "f", Float.valueOf(f13)));
    }

    public void addDetailedDebugInfo(String str, int i13) {
        addDetailedDebugInfo(str, String.valueOf(i13));
    }

    public void addDetailedDebugInfo(String str, long j13) {
        addDetailedDebugInfo(str, String.valueOf(j13));
    }

    public void addSimpleDebugInfo(String str, int i13) {
        addSimpleDebugInfo(str, String.valueOf(i13));
    }

    public void addSimpleDebugInfo(String str, long j13) {
        addSimpleDebugInfo(str, String.valueOf(j13));
    }
}
