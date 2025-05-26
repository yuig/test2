package df;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f54754a;

    static {
        HashMap hashMap = new HashMap();
        f54754a = hashMap;
        hashMap.put(Boolean.class, new e(0));
        hashMap.put(Integer.class, new e(1));
        hashMap.put(Long.class, new e(2));
        hashMap.put(Double.class, new e(3));
        hashMap.put(String.class, new e(4));
        hashMap.put(String[].class, new e(5));
        hashMap.put(JSONArray.class, new e(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) value));
                } else {
                    f fVar = (f) f54754a.get(value.getClass());
                    if (fVar == null) {
                        throw new IllegalArgumentException(Intrinsics.n(value.getClass(), "Unsupported type: "));
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    switch (((e) fVar).f54742a) {
                        case 0:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            bundle.putBoolean(key, ((Boolean) value).booleanValue());
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            bundle.putInt(key, ((Integer) value).intValue());
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            bundle.putLong(key, ((Long) value).longValue());
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            bundle.putDouble(key, ((Double) value).doubleValue());
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            bundle.putString(key, (String) value);
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            JSONArray jSONArray = (JSONArray) value;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                if (length > 0) {
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = i13 + 1;
                                        Object obj = jSONArray.get(i13);
                                        if (!(obj instanceof String)) {
                                            throw new IllegalArgumentException(Intrinsics.n(obj.getClass(), "Unexpected type in an array: "));
                                        }
                                        arrayList.add(obj);
                                        if (i14 < length) {
                                            i13 = i14;
                                        }
                                    }
                                }
                                bundle.putStringArrayList(key, arrayList);
                                break;
                            } else {
                                bundle.putStringArrayList(key, arrayList);
                                break;
                            }
                    }
                }
            }
        }
        return bundle;
    }
}
