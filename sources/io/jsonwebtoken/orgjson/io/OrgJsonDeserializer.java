package io.jsonwebtoken.orgjson.io;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import io.jsonwebtoken.io.DeserializationException;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes4.dex */
public class OrgJsonDeserializer implements Deserializer<Object> {
    private Object convertIfNecessary(Object obj) {
        if (JSONObject.NULL.equals(obj)) {
            return null;
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj instanceof JSONObject ? toMap((JSONObject) obj) : obj;
    }

    private Object parse(String str) {
        JSONTokener jSONTokener = new JSONTokener(str);
        char nextClean = jSONTokener.nextClean();
        jSONTokener.back();
        return nextClean == '{' ? toMap(new JSONObject(jSONTokener)) : nextClean == '[' ? toList(new JSONArray(jSONTokener)) : convertIfNecessary(jSONTokener.nextValue());
    }

    private List<Object> toList(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(convertIfNecessary(jSONArray.get(i13)));
        }
        return arrayList;
    }

    private Map<String, Object> toMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, convertIfNecessary(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    @Override // io.jsonwebtoken.io.Deserializer
    public Object deserialize(byte[] bArr) {
        Assert.notNull(bArr, "JSON byte array cannot be null");
        if (bArr.length == 0) {
            throw new DeserializationException("Invalid JSON: zero length byte array.");
        }
        try {
            return parse(new String(bArr, Strings.UTF_8));
        } catch (Exception e13) {
            throw new DeserializationException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Invalid JSON: ")), e13);
        }
    }
}
